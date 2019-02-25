// Generated by Dagger (https://google.github.io/dagger).
package in.goals.database;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class RoomModule_ProvidesRoomDatabaseFactory implements Factory<AppDatabase> {
  private final RoomModule module;

  private final Provider<Context> contextProvider;

  public RoomModule_ProvidesRoomDatabaseFactory(
      RoomModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideInstance(module, contextProvider);
  }

  public static AppDatabase provideInstance(RoomModule module, Provider<Context> contextProvider) {
    return proxyProvidesRoomDatabase(module, contextProvider.get());
  }

  public static RoomModule_ProvidesRoomDatabaseFactory create(
      RoomModule module, Provider<Context> contextProvider) {
    return new RoomModule_ProvidesRoomDatabaseFactory(module, contextProvider);
  }

  public static AppDatabase proxyProvidesRoomDatabase(RoomModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.providesRoomDatabase(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}