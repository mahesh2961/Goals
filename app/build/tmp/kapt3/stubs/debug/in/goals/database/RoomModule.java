package in.goals.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lin/goals/database/RoomModule;", "", "()V", "database", "Lin/goals/database/AppDatabase;", "getDatabase", "()Lin/goals/database/AppDatabase;", "setDatabase", "(Lin/goals/database/AppDatabase;)V", "provideRepo", "Lin/goals/database/GoalRepository;", "goalDao", "Lin/goals/database/GoalDao;", "networkManager", "Lin/goals/network/NetworkManager;", "providesGoalsDao", "providesRoomDatabase", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class RoomModule {
    @org.jetbrains.annotations.NotNull()
    public in.goals.database.AppDatabase database;
    
    @org.jetbrains.annotations.NotNull()
    public final in.goals.database.AppDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    in.goals.database.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final in.goals.database.AppDatabase providesRoomDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final in.goals.database.GoalDao providesGoalsDao(@org.jetbrains.annotations.NotNull()
    in.goals.database.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.goals.database.GoalRepository provideRepo(@org.jetbrains.annotations.NotNull()
    in.goals.database.GoalDao goalDao, @org.jetbrains.annotations.NotNull()
    in.goals.network.NetworkManager networkManager) {
        return null;
    }
    
    public RoomModule() {
        super();
    }
}