package `in`.goals.viewmodels

import `in`.goals.GoalApp
import `in`.goals.IGoalListNetworkResponse
import `in`.goals.R
import `in`.goals.database.Goal
import `in`.goals.database.GoalRepository
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.util.concurrent.Executors
import javax.inject.Inject


class GoalListViewModel @Inject constructor(
        private val goalRepository: GoalRepository
) : ViewModel(), IGoalListNetworkResponse<List<Goal>> {

     val goalList = MediatorLiveData<List<Goal>>()

    var  liveGoalList:LiveData<List<Goal>>

    var displayMessage=ObservableField<Boolean>()

    var message=ObservableField<String>()



    private val viewModelJob = Job()

    private val viewModelScope = CoroutineScope(Dispatchers.IO+viewModelJob)


    init {
         liveGoalList = goalRepository.getGoals()
         goalList.addSource(liveGoalList, goalList::setValue)
         fetchGoalsIfNotAvailable()
    }

    fun getGoals() = goalList

    private fun fetchGoals() {
        setShowMessage(true)
        postDisplayMessage(getStringResouce(R.string.messgae_loading))
        goalRepository.fetchGoals(this)
    }

    private fun fetchGoalsIfNotAvailable() {
        viewModelScope.launch {
            if(!goalRepository.isDataAvailable()) {
                fetchGoals()
            }
            else
                setShowMessage(false)
        }
    }

     fun refresh() =fetchGoals()

    private fun setShowMessage(showMessage:Boolean?) {this.displayMessage.set(showMessage)}

     fun postDisplayMessage(message:String?) {this.message.set(message) }


    override fun sucessReponse(list: List<Goal>) {
        viewModelScope.launch {
            setShowMessage(false)
            goalRepository.insertData(list)
            if (!list.isNullOrEmpty()) {
                postDisplayMessage(null)
            }
            else postDisplayMessage(getStringResouce(R.string.no_goals_found))
        }

    }

    fun getStringResouce(id :Int)= goalRepository.getStringResouce(id)

    override fun error(error: Throwable) {
        setShowMessage(true)
        postDisplayMessage(getStringResouce(R.string.message_network_error))
    }

    override fun onCleared() {
        super.onCleared()
        goalRepository.clearSubscription()
        viewModelJob.cancel()
    }
}


