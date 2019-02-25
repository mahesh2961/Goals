package `in`.goals.di

import `in`.goals.database.AppDatabase
import `in`.goals.network.NetworkModule
import dagger.Module

@Module(includes = [ViewModelModule::class, NetworkModule::class,AppDatabase::class])
class AppModule {
    /* You can place something useful here
    @Provides
    fun providesResources(context: Context): Resources = context.resources
    */

}