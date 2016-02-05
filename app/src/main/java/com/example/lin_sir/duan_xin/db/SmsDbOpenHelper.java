package com.example.lin_sir.duan_xin.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.lin_sir.duan_xin.Bean.SendedMsg;

/**
 * Created by lin_sir on 2016/1/31.
 */
public class SmsDbOpenHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "sms.db";
    private static final int DB_VERSION = 1;


    private SmsDbOpenHelper(Context context) {
        super(context.getApplicationContext(), DB_NAME, null, DB_VERSION);
    }

    private static SmsDbOpenHelper mHelper;

    public static SmsDbOpenHelper getInstance(Context context) {

        if (mHelper == null) {
            synchronized (SmsDbOpenHelper.class) {
                if (mHelper == null) {
                    mHelper = new SmsDbOpenHelper(context);
                }
            }

        }
        return mHelper;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table " + SendedMsg.TABLE_NAME + " ( " +
                " _id integer primary key autoincrement , " +
                SendedMsg.COLUMN_DATE + " integer , " +
                SendedMsg.COLUMN_FES_NAME + " text , " +
                SendedMsg.COLUMN_MSG + " text , " +
                SendedMsg.COLUMN_NAMES + " text , " +
                SendedMsg.COLUMN_NUMBERS + " text  " +
                ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
