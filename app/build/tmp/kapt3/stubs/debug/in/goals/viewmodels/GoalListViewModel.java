package in.goals.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0010J\u0016\u0010#\u001a\n $*\u0004\u0018\u00010\u001a0\u001a2\u0006\u0010%\u001a\u00020&J\u0010\u0010\'\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010(\u001a\u00020\u001eJ\u0017\u0010)\u001a\u00020\u001e2\b\u0010*\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020\u001e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000e\u00a8\u0006."}, d2 = {"Lin/goals/viewmodels/GoalListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lin/goals/IGoalListNetworkResponse;", "", "Lin/goals/database/Goal;", "goalRepository", "Lin/goals/database/GoalRepository;", "(Lin/goals/database/GoalRepository;)V", "displayMessage", "Landroidx/databinding/ObservableField;", "", "getDisplayMessage", "()Landroidx/databinding/ObservableField;", "setDisplayMessage", "(Landroidx/databinding/ObservableField;)V", "goalList", "Landroidx/lifecycle/MediatorLiveData;", "getGoalList", "()Landroidx/lifecycle/MediatorLiveData;", "liveGoalList", "Landroidx/lifecycle/LiveData;", "getLiveGoalList", "()Landroidx/lifecycle/LiveData;", "setLiveGoalList", "(Landroidx/lifecycle/LiveData;)V", "message", "", "getMessage", "setMessage", "error", "", "", "fetchGoals", "fetchGoalsIfNotAvailable", "getGoals", "getStringResouce", "kotlin.jvm.PlatformType", "id", "", "postDisplayMessage", "refresh", "setShowMessage", "showMessage", "(Ljava/lang/Boolean;)V", "sucessReponse", "list", "app_debug"})
public final class GoalListViewModel extends androidx.lifecycle.ViewModel implements in.goals.IGoalListNetworkResponse<java.util.List<? extends in.goals.database.Goal>> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<in.goals.database.Goal>> goalList = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<in.goals.database.Goal>> liveGoalList;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> displayMessage;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> message;
    private final in.goals.database.GoalRepository goalRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<in.goals.database.Goal>> getGoalList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<in.goals.database.Goal>> getLiveGoalList() {
        return null;
    }
    
    public final void setLiveGoalList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<in.goals.database.Goal>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getDisplayMessage() {
        return null;
    }
    
    public final void setDisplayMessage(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<in.goals.database.Goal>> getGoals() {
        return null;
    }
    
    private final void fetchGoals() {
    }
    
    private final void fetchGoalsIfNotAvailable() {
    }
    
    public final void refresh() {
    }
    
    private final void setShowMessage(java.lang.Boolean showMessage) {
    }
    
    public final void postDisplayMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void sucessReponse(@org.jetbrains.annotations.NotNull()
    java.util.List<in.goals.database.Goal> list) {
    }
    
    public final java.lang.String getStringResouce(int id) {
        return null;
    }
    
    @java.lang.Override()
    public void error(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    @javax.inject.Inject()
    public GoalListViewModel(@org.jetbrains.annotations.NotNull()
    in.goals.database.GoalRepository goalRepository) {
        super();
    }
}