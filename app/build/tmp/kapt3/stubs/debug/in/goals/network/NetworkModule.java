package in.goals.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lin/goals/network/NetworkModule;", "", "()V", "buildNetworkApi", "Lin/goals/network/ApiHandler;", "provideGoalsNetworkLayer", "Lin/goals/network/NetworkManager;", "apiHandler", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.goals.network.ApiHandler buildNetworkApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final in.goals.network.NetworkManager provideGoalsNetworkLayer(@org.jetbrains.annotations.NotNull()
    in.goals.network.ApiHandler apiHandler) {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}