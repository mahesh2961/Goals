// Generated by Dagger (https://google.github.io/dagger).
package in.goals.database;

import dagger.internal.Factory;
import in.goals.network.NetworkManager;
import javax.inject.Provider;

public final class GoalRepository_Factory implements Factory<GoalRepository> {
  private final Provider<GoalDao> goalDaoProvider;

  private final Provider<NetworkManager> networkLayerProvider;

  public GoalRepository_Factory(
      Provider<GoalDao> goalDaoProvider, Provider<NetworkManager> networkLayerProvider) {
    this.goalDaoProvider = goalDaoProvider;
    this.networkLayerProvider = networkLayerProvider;
  }

  @Override
  public GoalRepository get() {
    return provideInstance(goalDaoProvider, networkLayerProvider);
  }

  public static GoalRepository provideInstance(
      Provider<GoalDao> goalDaoProvider, Provider<NetworkManager> networkLayerProvider) {
    return new GoalRepository(goalDaoProvider.get(), networkLayerProvider.get());
  }

  public static GoalRepository_Factory create(
      Provider<GoalDao> goalDaoProvider, Provider<NetworkManager> networkLayerProvider) {
    return new GoalRepository_Factory(goalDaoProvider, networkLayerProvider);
  }

  public static GoalRepository newGoalRepository(GoalDao goalDao, NetworkManager networkLayer) {
    return new GoalRepository(goalDao, networkLayer);
  }
}