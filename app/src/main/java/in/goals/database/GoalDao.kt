package `in`.goals.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*

/**
 * DAO TO handle data access
 */
@Dao
interface GoalDao {
    @Query("SELECT * FROM Goal")
    fun getGoals() : LiveData<List<Goal>>

    /**
     * Inserting with onConflict = OnConflictStrategy.IGNORE will not insert a Goal if already available in DB
     * This will prevent duplication and will also make sure fully fetched Goal is not overwritten
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAll(goals: List<Goal>)


    @Query("SELECT COUNT(id) FROM Goal")
    fun getNumberOfRows(): Int

}