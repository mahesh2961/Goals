package `in`.goals.database

import `in`.goals.network.NetworkManager
import dagger.Provides
import javax.inject.Singleton
import androidx.room.Room
import `in`.goals.utils.DATABASE_NAME
import android.content.Context
import dagger.Module


@Module
class RoomModule
{
    lateinit var database: AppDatabase

    @Singleton
    @Provides
    fun providesRoomDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()
    }

    @Singleton
    @Provides
    fun providesGoalsDao(database: AppDatabase): GoalDao {
        return database.goalDao()
    }

    @Provides
    @Singleton
    fun provideRepo(goalDao: GoalDao, networkManager: NetworkManager) :GoalRepository= GoalRepository(goalDao,networkManager)
}