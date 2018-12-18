package com.dmitriy.eventkeeper;




import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "EventKeeeperSQL";
    public static final int VERSION = 1;
    public static final String TABLE_NAME = "EveTable";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_TIME = "timeE";
    public static final String COLUMN_DATE = "dateE";
    public static final String COLUMN_NAME= "nameE";



    public DBHelper(Context context) {
        super(context, DATABASE_NAME , null, VERSION);
    }

    public void onCreate(SQLiteDatabase db) {


        db.execSQL("CREATE TABLE "+ TABLE_NAME +"("+ COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_NAME + " TEXT," + COLUMN_DATE + " TEXT,"  +
                COLUMN_TIME + " TEXT"  + ");");


    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
}

