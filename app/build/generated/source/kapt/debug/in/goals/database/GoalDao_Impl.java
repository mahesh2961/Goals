package in.goals.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import in.goals.adapters.Converter;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class GoalDao_Impl implements GoalDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfGoal;

  private final Converter __converter = new Converter();

  public GoalDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGoal = new EntityInsertionAdapter<Goal>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Goal`(`id`,`name`,`goalImageURL`,`targetAmount`,`currentBalance`,`userId`,`status`,`created`,`connectedUsers`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Goal value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getGoalImageURL() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGoalImageURL());
        }
        stmt.bindDouble(4, value.getTargetAmount());
        stmt.bindDouble(5, value.getCurrentBalance());
        stmt.bindLong(6, value.getUserId());
        if (value.getStatus() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getStatus());
        }
        final String _tmp;
        _tmp = __converter.fromListToStr(value.getCreated());
        if (_tmp == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __converter.fromListToStr(value.getConnectedUsers());
        if (_tmp_1 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_1);
        }
      }
    };
  }

  @Override
  public void insertAll(final List<Goal> goals) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfGoal.insert(goals);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Goal>> getGoals() {
    final String _sql = "SELECT * FROM Goal";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Goal"}, new Callable<List<Goal>>() {
      @Override
      public List<Goal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfGoalImageURL = CursorUtil.getColumnIndexOrThrow(_cursor, "goalImageURL");
          final int _cursorIndexOfTargetAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "targetAmount");
          final int _cursorIndexOfCurrentBalance = CursorUtil.getColumnIndexOrThrow(_cursor, "currentBalance");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "created");
          final int _cursorIndexOfConnectedUsers = CursorUtil.getColumnIndexOrThrow(_cursor, "connectedUsers");
          final List<Goal> _result = new ArrayList<Goal>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Goal _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpGoalImageURL;
            _tmpGoalImageURL = _cursor.getString(_cursorIndexOfGoalImageURL);
            final double _tmpTargetAmount;
            _tmpTargetAmount = _cursor.getDouble(_cursorIndexOfTargetAmount);
            final double _tmpCurrentBalance;
            _tmpCurrentBalance = _cursor.getDouble(_cursorIndexOfCurrentBalance);
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final List<Integer> _tmpCreated;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfCreated);
            _tmpCreated = __converter.fromStrToList(_tmp);
            final List<Integer> _tmpConnectedUsers;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfConnectedUsers);
            _tmpConnectedUsers = __converter.fromStrToList(_tmp_1);
            _item = new Goal(_tmpId,_tmpName,_tmpGoalImageURL,_tmpTargetAmount,_tmpCurrentBalance,_tmpUserId,_tmpStatus,_tmpCreated,_tmpConnectedUsers);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public int getNumberOfRows() {
    final String _sql = "SELECT COUNT(id) FROM Goal";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
