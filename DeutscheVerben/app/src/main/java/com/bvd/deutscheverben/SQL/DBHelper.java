package com.bvd.deutcheverben.SQL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Vadim on 28.09.2015.
 */
public class DBHelper extends SQLiteOpenHelper {

    static private final int DB_CURRENT_VERSION = 1;
    static private final String DB_NAME = "DeVerben";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_CURRENT_VERSION );

        // super(context, Environment.getExternalStorageDirectory()
        //                + File.separator + "/DataBase/" + File.separator
        //                + DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private boolean CreateDB() {
        // get name

        // проверить не существует ли уже база, иначе удалить базу (?)

        // создать базу

        return true;
    }
}

/*
SQLiteOpenHelper - creating database on SD card

public static final String  DATABASE_FILE_PATH = "/sdcard";

public class DatabaseHelper
{
   private static final String TAG                  = "DatabaseHelper";

  public static final String  DATABASE_FILE_PATH      = Environment.getExternalStorageDirectory();
  public static final String  DATABASE_NAME      = "mydb";
  public static final String  TRACKS_TABLE        = "tracks";
  public static final String  TRACK_INFO_TABLE        = "track_info";

  private static final String TRACKS_TABLE_CREATE     = "create table "
           + TRACKS_TABLE
           + " (_id integer primary key autoincrement, title text not null, description text null, created_at date not null);";

  private static final String TRACK_INFO_TABLE_CREATE = "create table "
           + TRACK_INFO_TABLE
           + " (_id integer primary key autoincrement, track_id integer not null, latitude real not null, longitude real not null, altitude real not null, created_at date not null);";

private SQLiteDatabase      database;

public DatabaseHelper()
{
    try
    {
        database = SQLiteDatabase.openDatabase(DATABASE_FILE_PATH
            + File.separator + DATABASE_NAME, null,SQLiteDatabase.OPEN_READWRITE);
    }
    catch (SQLiteException ex)
    {
        Log.e(TAG, "error -- " + ex.getMessage(), ex);
        // error means tables does not exits
        createTables();
    }
    finally
    {
        DBUtil.safeCloseDataBase(database);
    }
}

private void createTables()
{
    database.execSQL(TRACKS_TABLE_CREATE);
    database.execSQL(TRACK_INFO_TABLE_CREATE);
}

public void close()
{
    DBUtil.safeCloseDataBase(database);
}

public SQLiteDatabase getReadableDatabase()
{
    database = SQLiteDatabase.openDatabase(DATABASE_FILE_PATH
            + File.separator + DATABASE_NAME, null,
            SQLiteDatabase.OPEN_READONLY);
    return database;
}

public SQLiteDatabase getWritableDatabase()
{
    database = SQLiteDatabase.openDatabase(DATABASE_FILE_PATH
            + File.separator + DATABASE_NAME, null,
            SQLiteDatabase.OPEN_READWRITE);
    return database;
}
 */

