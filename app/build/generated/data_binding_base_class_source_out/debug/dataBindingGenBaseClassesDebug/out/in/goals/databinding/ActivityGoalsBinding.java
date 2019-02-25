package in.goals.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class ActivityGoalsBinding extends ViewDataBinding {
  protected ActivityGoalsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  @NonNull
  public static ActivityGoalsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityGoalsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityGoalsBinding>inflate(inflater, in.goals.R.layout.activity_goals, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityGoalsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityGoalsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityGoalsBinding>inflate(inflater, in.goals.R.layout.activity_goals, null, false, component);
  }

  public static ActivityGoalsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityGoalsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityGoalsBinding)bind(component, view, in.goals.R.layout.activity_goals);
  }
}
