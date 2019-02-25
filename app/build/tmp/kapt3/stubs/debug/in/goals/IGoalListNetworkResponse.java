package in.goals;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H&J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lin/goals/IGoalListNetworkResponse;", "T", "", "error", "", "", "sucessReponse", "t", "(Ljava/lang/Object;)V", "app_debug"})
public abstract interface IGoalListNetworkResponse<T extends java.lang.Object> {
    
    public abstract void sucessReponse(T t);
    
    public abstract void error(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error);
}