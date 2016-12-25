package com.renegades.labs.socialnetworks;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Виталик on 24.12.2016.
 */

class DBHelper extends SQLiteOpenHelper {

    private static final String TAG = "MainActivity";

    public DBHelper(Context context) {
        super(context, "myDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG, "--- onCreate database ---");
        db.execSQL("create table history ("
                + "id integer primary key autoincrement,"
                + "flag integer,"
                + "date text,"
                + "name text" + ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
