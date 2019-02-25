package in.goals.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lin/goals/fragment/GoalsListFragment;", "Lin/goals/fragment/BaseFragment;", "()V", "viewModel", "Lin/goals/viewmodels/GoalListViewModel;", "getViewModel", "()Lin/goals/viewmodels/GoalListViewModel;", "setViewModel", "(Lin/goals/viewmodels/GoalListViewModel;)V", "vmFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getVmFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setVmFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getAdapter", "Lin/goals/adapters/GoalsAdapter;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setRecyclerView", "", "adapter", "binding", "Lin/goals/databinding/FragmentGoalListBinding;", "subscribeUi", "app_debug"})
public final class GoalsListFragment extends in.goals.fragment.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory vmFactory;
    @org.jetbrains.annotations.NotNull()
    public in.goals.viewmodels.GoalListViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getVmFactory() {
        return null;
    }
    
    public final void setVmFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.goals.viewmodels.GoalListViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    in.goals.viewmodels.GoalListViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setRecyclerView(in.goals.adapters.GoalsAdapter adapter, in.goals.databinding.FragmentGoalListBinding binding) {
    }
    
    private final in.goals.adapters.GoalsAdapter getAdapter() {
        return null;
    }
    
    /**
     * * Waits for updates to Model from ViewModel and applies changes accordingly
     */
    private final void subscribeUi(in.goals.adapters.GoalsAdapter adapter) {
    }
    
    public GoalsListFragment() {
        super();
    }
}