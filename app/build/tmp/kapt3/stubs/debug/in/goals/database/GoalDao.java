package in.goals.database;

import java.lang.System;

/**
 * * DAO TO handle data access
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'\u00a8\u0006\u000b"}, d2 = {"Lin/goals/database/GoalDao;", "", "getGoals", "Landroidx/lifecycle/LiveData;", "", "Lin/goals/database/Goal;", "getNumberOfRows", "", "insertAll", "", "goals", "app_debug"})
public abstract interface GoalDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Goal")
    public abstract androidx.lifecycle.LiveData<java.util.List<in.goals.database.Goal>> getGoals();
    
    /**
     * * Inserting with onConflict = OnConflictStrategy.IGNORE will not insert a Goal if already available in DB
     *     * This will prevent duplication and will also make sure fully fetched Goal is not overwritten
     */
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<in.goals.database.Goal> goals);
    
    @androidx.room.Query(value = "SELECT COUNT(id) FROM Goal")
    public abstract int getNumberOfRows();
}