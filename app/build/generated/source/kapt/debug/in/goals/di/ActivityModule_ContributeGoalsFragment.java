package in.goals.di;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import in.goals.fragment.GoalsListFragment;

@Module(subcomponents = ActivityModule_ContributeGoalsFragment.GoalsListFragmentSubcomponent.class)
public abstract class ActivityModule_ContributeGoalsFragment {
  private ActivityModule_ContributeGoalsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(GoalsListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      GoalsListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface GoalsListFragmentSubcomponent extends AndroidInjector<GoalsListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<GoalsListFragment> {}
  }
}
