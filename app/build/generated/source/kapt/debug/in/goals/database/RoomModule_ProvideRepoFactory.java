// Generated by Dagger (https://google.github.io/dagger).
package in.goals.database;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import in.goals.network.NetworkManager;
import javax.inject.Provider;

public final class RoomModule_ProvideRepoFactory implements Factory<GoalRepository> {
  private final RoomModule module;

  private final Provider<GoalDao> goalDaoProvider;

  private final Provider<NetworkManager> networkManagerProvider;

  public RoomModule_ProvideRepoFactory(
      RoomModule module,
      Provider<GoalDao> goalDaoProvider,
      Provider<NetworkManager> networkManagerProvider) {
    this.module = module;
    this.goalDaoProvider = goalDaoProvider;
    this.networkManagerProvider = networkManagerProvider;
  }

  @Override
  public GoalRepository get() {
    return provideInstance(module, goalDaoProvider, networkManagerProvider);
  }

  public static GoalRepository provideInstance(
      RoomModule module,
      Provider<GoalDao> goalDaoProvider,
      Provider<NetworkManager> networkManagerProvider) {
    return proxyProvideRepo(module, goalDaoProvider.get(), networkManagerProvider.get());
  }

  public static RoomModule_ProvideRepoFactory create(
      RoomModule module,
      Provider<GoalDao> goalDaoProvider,
      Provider<NetworkManager> networkManagerProvider) {
    return new RoomModule_ProvideRepoFactory(module, goalDaoProvider, networkManagerProvider);
  }

  public static GoalRepository proxyProvideRepo(
      RoomModule instance, GoalDao goalDao, NetworkManager networkManager) {
    return Preconditions.checkNotNull(
        instance.provideRepo(goalDao, networkManager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
