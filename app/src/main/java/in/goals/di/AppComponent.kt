package `in`.goals.di

import `in`.goals.GoalApp
import `in`.goals.database.RoomModule
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityModule::class,
        RoomModule::class
))
interface AppComponent : AndroidInjector<GoalApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<GoalApp>() {
        @BindsInstance abstract fun appContext(appContext: Context): Builder
    }
}