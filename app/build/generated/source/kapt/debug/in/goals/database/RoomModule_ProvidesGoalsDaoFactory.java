// Generated by Dagger (https://google.github.io/dagger).
package in.goals.database;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class RoomModule_ProvidesGoalsDaoFactory implements Factory<GoalDao> {
  private final RoomModule module;

  private final Provider<AppDatabase> databaseProvider;

  public RoomModule_ProvidesGoalsDaoFactory(
      RoomModule module, Provider<AppDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public GoalDao get() {
    return provideInstance(module, databaseProvider);
  }

  public static GoalDao provideInstance(RoomModule module, Provider<AppDatabase> databaseProvider) {
    return proxyProvidesGoalsDao(module, databaseProvider.get());
  }

  public static RoomModule_ProvidesGoalsDaoFactory create(
      RoomModule module, Provider<AppDatabase> databaseProvider) {
    return new RoomModule_ProvidesGoalsDaoFactory(module, databaseProvider);
  }

  public static GoalDao proxyProvidesGoalsDao(RoomModule instance, AppDatabase database) {
    return Preconditions.checkNotNull(
        instance.providesGoalsDao(database),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
