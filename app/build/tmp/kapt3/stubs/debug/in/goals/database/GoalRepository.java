package in.goals.database;

import java.lang.System;

/**
 * * Repository to provide goals from Database or web Service
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0016J\u0016\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010\u001c\u001a\u00020\u00102\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0006\u0010\u001e\u001a\u00020\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lin/goals/database/GoalRepository;", "", "goalDao", "Lin/goals/database/GoalDao;", "networkLayer", "Lin/goals/network/NetworkManager;", "(Lin/goals/database/GoalDao;Lin/goals/network/NetworkManager;)V", "getGoalDao", "()Lin/goals/database/GoalDao;", "setGoalDao", "(Lin/goals/database/GoalDao;)V", "getNetworkLayer", "()Lin/goals/network/NetworkManager;", "setNetworkLayer", "(Lin/goals/network/NetworkManager;)V", "fetchGoals", "", "handler", "Lin/goals/IGoalListNetworkResponse;", "", "Lin/goals/database/Goal;", "getGoals", "Landroidx/lifecycle/LiveData;", "getStringResouce", "", "kotlin.jvm.PlatformType", "id", "", "insertData", "newList", "isDataAvailable", "", "app_debug"})
public final class GoalRepository {
    @org.jetbrains.annotations.NotNull()
    private in.goals.database.GoalDao goalDao;
    @org.jetbrains.annotations.NotNull()
    private in.goals.network.NetworkManager networkLayer;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<in.goals.database.Goal>> getGoals() {
        return null;
    }
    
    public final void insertData(@org.jetbrains.annotations.NotNull()
    java.util.List<in.goals.database.Goal> newList) {
    }
    
    /**
     * * Searches for Goal based on search query
     */
    public final void fetchGoals(@org.jetbrains.annotations.NotNull()
    in.goals.IGoalListNetworkResponse<java.util.List<in.goals.database.Goal>> handler) {
    }
    
    public final boolean isDataAvailable() {
        return false;
    }
    
    public final java.lang.String getStringResouce(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.goals.database.GoalDao getGoalDao() {
        return null;
    }
    
    public final void setGoalDao(@org.jetbrains.annotations.NotNull()
    in.goals.database.GoalDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.goals.network.NetworkManager getNetworkLayer() {
        return null;
    }
    
    public final void setNetworkLayer(@org.jetbrains.annotations.NotNull()
    in.goals.network.NetworkManager p0) {
    }
    
    @javax.inject.Inject()
    public GoalRepository(@org.jetbrains.annotations.NotNull()
    in.goals.database.GoalDao goalDao, @org.jetbrains.annotations.NotNull()
    in.goals.network.NetworkManager networkLayer) {
        super();
    }
}