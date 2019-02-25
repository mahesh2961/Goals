package in.goals.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile GoalDao _goalDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Goal` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `goalImageURL` TEXT NOT NULL, `targetAmount` REAL NOT NULL, `currentBalance` REAL NOT NULL, `userId` INTEGER NOT NULL, `status` TEXT NOT NULL, `created` TEXT NOT NULL, `connectedUsers` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"4ebb05c5d7e61f54c0ac6f92e1e7fa22\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Goal`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsGoal = new HashMap<String, TableInfo.Column>(9);
        _columnsGoal.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsGoal.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsGoal.put("goalImageURL", new TableInfo.Column("goalImageURL", "TEXT", true, 0));
        _columnsGoal.put("targetAmount", new TableInfo.Column("targetAmount", "REAL", true, 0));
        _columnsGoal.put("currentBalance", new TableInfo.Column("currentBalance", "REAL", true, 0));
        _columnsGoal.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0));
        _columnsGoal.put("status", new TableInfo.Column("status", "TEXT", true, 0));
        _columnsGoal.put("created", new TableInfo.Column("created", "TEXT", true, 0));
        _columnsGoal.put("connectedUsers", new TableInfo.Column("connectedUsers", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGoal = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGoal = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGoal = new TableInfo("Goal", _columnsGoal, _foreignKeysGoal, _indicesGoal);
        final TableInfo _existingGoal = TableInfo.read(_db, "Goal");
        if (! _infoGoal.equals(_existingGoal)) {
          throw new IllegalStateException("Migration didn't properly handle Goal(in.goals.database.Goal).\n"
                  + " Expected:\n" + _infoGoal + "\n"
                  + " Found:\n" + _existingGoal);
        }
      }
    }, "4ebb05c5d7e61f54c0ac6f92e1e7fa22", "421004e1fec51ddd30aa347cfa47dd50");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Goal");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Goal`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public GoalDao goalDao() {
    if (_goalDao != null) {
      return _goalDao;
    } else {
      synchronized(this) {
        if(_goalDao == null) {
          _goalDao = new GoalDao_Impl(this);
        }
        return _goalDao;
      }
    }
  }
}
