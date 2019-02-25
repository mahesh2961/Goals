package `in`.goals.database

import `in`.goals.utils.Utils
import androidx.room.*

/**
 * Goal Table
 */
@Entity(tableName = "Goal")
data class Goal(
        @PrimaryKey @ColumnInfo(name = "id") val id: Int,
        var name: String = "",
        var goalImageURL: String,
        var targetAmount: Double,
        var currentBalance: Double,
        var userId: Int,
        var status: String = "",
        var created: List<Int> = emptyList(),
        var connectedUsers: List<Int> = emptyList()
) {

    //This logic could be shifted to ViewModel
    fun getGoalCompletion(): String {
        var str = ""
        if (Utils.isValid(currentBalance) && Utils.isValid(targetAmount))
            str = "$" + getCurrentBalanceStr() + " of " + getTargetAmountStr()
        else if (Utils.isValid(currentBalance))
            str = "Saved $" + getCurrentBalanceStr() + " till now"
        else if (Utils.isValid(targetAmount))
            str = "Target Amount: $" + getTargetAmountStr()
        else
            str = "Start Saving"
        return str;
    }


    private fun getCurrentBalanceStr(): String = Utils.formatDouble(currentBalance)

    private fun getTargetAmountStr(): String = Utils.formatDouble(targetAmount)

    override fun equals(other: Any?): Boolean {
        return ((other as Goal).id==this.id)
    }


}
