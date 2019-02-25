package `in`.goals.database

import `in`.goals.adapters.Converter
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import dagger.Module

/**
 * Setting Rooms Database
 */
@Database(entities = [Goal::class], version = 1, exportSchema = false)
@TypeConverters(`in`.goals.adapters.Converter::class)
@Module
abstract class AppDatabase : RoomDatabase() {
    abstract fun goalDao(): GoalDao
}