package `in`.goals.pojos

import `in`.goals.database.Goal
import com.google.gson.annotations.SerializedName

class GoalsResponse {
    @SerializedName("savingsGoals")
    var savingsGoals: List<Goal> = emptyList();

}