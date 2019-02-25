package in.goals;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lin/goals/GoalApp;", "Landroid/app/Application;", "Ldagger/android/HasActivityInjector;", "()V", "dispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "activityInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "Companion", "app_debug"})
public final class GoalApp extends android.app.Application implements dagger.android.HasActivityInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> dispatchingAndroidInjector;
    @org.jetbrains.annotations.NotNull()
    public static android.app.Application instance;
    public static final in.goals.GoalApp.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public GoalApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lin/goals/GoalApp$Companion;", "", "()V", "instance", "Landroid/app/Application;", "getInstance", "()Landroid/app/Application;", "setInstance", "(Landroid/app/Application;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Application getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        android.app.Application p0) {
        }
        
        private Companion() {
            super();
        }
    }
}