package `in`.goals.di

import `in`.goals.activities.GoalsActivity
import `in`.goals.fragment.GoalsListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeGoalsActivity(): GoalsActivity

    @ContributesAndroidInjector
    abstract fun contributeGoalsFragment(): GoalsListFragment

}