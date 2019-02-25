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
import java.util.concurrent.Executors
import javax.inject.Inject


class GoalListViewModel @Inject constructor(
        private val goalRepository: GoalRepository
) : ViewModel(), IGoalListNetworkResponse<List<Goal>> {

     val goalList = MediatorLiveData<List<Goal>>()

    var  liveGoalList:LiveData<List<Goal>>

    var displayMessage=ObservableField<Boolean>()

    var message=ObservableField<String>()

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
        val executor = Executors.newSingleThreadExecutor()
        executor.execute {
            if(!goalRepository.isDataAvailable()) {
                fetchGoals()
            }
            else
                setShowMessage(false)
        }
    }

    public fun refresh() =fetchGoals()

    private fun setShowMessage(showMessage:Boolean?) {this.displayMessage.set(showMessage)}

    public fun postDisplayMessage(message:String?) {this.message.set(message) }


    override fun sucessReponse(list: List<Goal>) {
        val executor = Executors.newSingleThreadExecutor()
        setShowMessage(false)
        executor.execute {
            goalRepository.insertData(list)
            if (!list.isNullOrEmpty()) {
                goalList.postValue(list)
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
}


