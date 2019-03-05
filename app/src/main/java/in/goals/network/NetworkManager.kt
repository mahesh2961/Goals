package `in`.goals.network

import `in`.goals.IGoalListNetworkResponse
import `in`.goals.database.Goal
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Handles request and response to and from Webservice
 */
const val TAG = "NetworkManager"

class NetworkManager @Inject constructor(var apiHandler: `in`.goals.network.ApiHandler) {
    val compositeDisposable = CompositeDisposable()

    fun getGoals(responseHandler: IGoalListNetworkResponse<List<Goal>>) {
        compositeDisposable.clear()  //This is required to cancel previous requests for searching savingsGoals
            val subscription = apiHandler.goals
                    .subscribeOn(Schedulers.io())
                    .map { response -> response.savingsGoals }
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(responseHandler::sucessReponse, responseHandler::error)
            compositeDisposable.addAll(subscription)

    }

    fun clear()=compositeDisposable.clear()


}