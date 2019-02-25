package in.goals.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import in.goals.database.Goal;

public abstract class ListItemGoalBinding extends ViewDataBinding {
  @NonNull
  public final TextView goalBalance;

  @NonNull
  public final ImageView goalItemImage;

  @NonNull
  public final TextView goalItemTitle;

  @Bindable
  protected View.OnClickListener mClickListener;

  @Bindable
  protected Goal mGoal;

  protected ListItemGoalBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView goalBalance, ImageView goalItemImage, TextView goalItemTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.goalBalance = goalBalance;
    this.goalItemImage = goalItemImage;
    this.goalItemTitle = goalItemTitle;
  }

  public abstract void setClickListener(@Nullable View.OnClickListener clickListener);

  @Nullable
  public View.OnClickListener getClickListener() {
    return mClickListener;
  }

  public abstract void setGoal(@Nullable Goal goal);

  @Nullable
  public Goal getGoal() {
    return mGoal;
  }

  @NonNull
  public static ListItemGoalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ListItemGoalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ListItemGoalBinding>inflate(inflater, in.goals.R.layout.list_item_goal, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemGoalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ListItemGoalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ListItemGoalBinding>inflate(inflater, in.goals.R.layout.list_item_goal, null, false, component);
  }

  public static ListItemGoalBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ListItemGoalBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ListItemGoalBinding)bind(component, view, in.goals.R.layout.list_item_goal);
  }
}
