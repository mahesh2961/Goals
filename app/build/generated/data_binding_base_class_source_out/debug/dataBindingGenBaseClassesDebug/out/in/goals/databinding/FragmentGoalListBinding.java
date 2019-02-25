package in.goals.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import in.goals.viewmodels.GoalListViewModel;

public abstract class FragmentGoalListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView goalList;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final AppBarLayout toolbarContainer;

  @Bindable
  protected GoalListViewModel mViewModel;

  protected FragmentGoalListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView goalList, Toolbar toolbar, AppBarLayout toolbarContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.goalList = goalList;
    this.toolbar = toolbar;
    this.toolbarContainer = toolbarContainer;
  }

  public abstract void setViewModel(@Nullable GoalListViewModel viewModel);

  @Nullable
  public GoalListViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentGoalListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentGoalListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentGoalListBinding>inflate(inflater, in.goals.R.layout.fragment_goal_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentGoalListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentGoalListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentGoalListBinding>inflate(inflater, in.goals.R.layout.fragment_goal_list, null, false, component);
  }

  public static FragmentGoalListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentGoalListBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentGoalListBinding)bind(component, view, in.goals.R.layout.fragment_goal_list);
  }
}
