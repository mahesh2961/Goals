package in.goals.database;

import java.lang.System;

/**
 * * Goal Table
 */
@androidx.room.Entity(tableName = "Goal")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\bH\u00c6\u0003J\t\u0010-\u001a\u00020\bH\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u00c6\u0003Jo\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u00c6\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00106\u001a\u00020\u0005H\u0002J\u0006\u00107\u001a\u00020\u0005J\b\u00108\u001a\u00020\u0005H\u0002J\t\u00109\u001a\u00020\u0003H\u00d6\u0001J\t\u0010:\u001a\u00020\u0005H\u00d6\u0001R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010(\u00a8\u0006;"}, d2 = {"Lin/goals/database/Goal;", "", "id", "", "name", "", "goalImageURL", "targetAmount", "", "currentBalance", "userId", "status", "created", "", "connectedUsers", "(ILjava/lang/String;Ljava/lang/String;DDILjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getConnectedUsers", "()Ljava/util/List;", "setConnectedUsers", "(Ljava/util/List;)V", "getCreated", "setCreated", "getCurrentBalance", "()D", "setCurrentBalance", "(D)V", "getGoalImageURL", "()Ljava/lang/String;", "setGoalImageURL", "(Ljava/lang/String;)V", "getId", "()I", "getName", "setName", "getStatus", "setStatus", "getTargetAmount", "setTargetAmount", "getUserId", "setUserId", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "getCurrentBalanceStr", "getGoalCompletion", "getTargetAmountStr", "hashCode", "toString", "app_debug"})
public final class Goal {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey()
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String goalImageURL;
    private double targetAmount;
    private double currentBalance;
    private int userId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> created;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> connectedUsers;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoalCompletion() {
        return null;
    }
    
    private final java.lang.String getCurrentBalanceStr() {
        return null;
    }
    
    private final java.lang.String getTargetAmountStr() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoalImageURL() {
        return null;
    }
    
    public final void setGoalImageURL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getTargetAmount() {
        return 0.0;
    }
    
    public final void setTargetAmount(double p0) {
    }
    
    public final double getCurrentBalance() {
        return 0.0;
    }
    
    public final void setCurrentBalance(double p0) {
    }
    
    public final int getUserId() {
        return 0;
    }
    
    public final void setUserId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getCreated() {
        return null;
    }
    
    public final void setCreated(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getConnectedUsers() {
        return null;
    }
    
    public final void setConnectedUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    public Goal(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String goalImageURL, double targetAmount, double currentBalance, int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> created, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> connectedUsers) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component9() {
        return null;
    }
    
    /**
     * * Goal Table
     */
    @org.jetbrains.annotations.NotNull()
    public final in.goals.database.Goal copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String goalImageURL, double targetAmount, double currentBalance, int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> created, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> connectedUsers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
}