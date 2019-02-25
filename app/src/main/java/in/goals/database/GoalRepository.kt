package `in`.goals.database

import `in`.goals.GoalApp
import `in`.goals.IGoalListNetworkResponse
import `in`.goals.network.NetworkManager
import javax.inject.Inject

/**
 * Repository to provide goals from Database or web Service
 */

class GoalRepository @Inject constructor(var goalDao : GoalDao, var networkLayer :NetworkManager) {


    fun getGoals() = goalDao.getGoals()

    fun insertData(newList: List<Goal>) = goalDao.insertAll(newList)

    /**
     * Searches for Goal based on search query
     */
    fun fetchGoals(handler: IGoalListNetworkResponse<List<Goal>>) = networkLayer.getGoals(handler)

    fun isDataAvailable()=(goalDao.getNumberOfRows()>0)

    fun getStringResouce(id :Int)= GoalApp.instance.getString(id)

}