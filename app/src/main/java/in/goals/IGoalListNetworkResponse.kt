package `in`.goals

interface IGoalListNetworkResponse<T> {
    fun sucessReponse(t:T)
    fun error(error: Throwable)
}