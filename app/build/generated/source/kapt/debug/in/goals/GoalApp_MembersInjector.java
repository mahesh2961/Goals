// Generated by Dagger (https://google.github.io/dagger).
package in.goals;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class GoalApp_MembersInjector implements MembersInjector<GoalApp> {
  private final Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider;

  public GoalApp_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<GoalApp> create(
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    return new GoalApp_MembersInjector(dispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(GoalApp instance) {
    injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorProvider.get());
  }

  public static void injectDispatchingAndroidInjector(
      GoalApp instance, DispatchingAndroidInjector<Activity> dispatchingAndroidInjector) {
    instance.dispatchingAndroidInjector = dispatchingAndroidInjector;
  }
}