package in.goals.di;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import in.goals.activities.GoalsActivity;

@Module(subcomponents = ActivityModule_ContributeGoalsActivity.GoalsActivitySubcomponent.class)
public abstract class ActivityModule_ContributeGoalsActivity {
  private ActivityModule_ContributeGoalsActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(GoalsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      GoalsActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface GoalsActivitySubcomponent extends AndroidInjector<GoalsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<GoalsActivity> {}
  }
}
