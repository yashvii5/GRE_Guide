package com.example.greguide;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    private static final String dbname="LoginInfo.db";
    public Database( Context context) {
        super(context, dbname ,null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String qry = "create table tb1 (id integer primary key autoincrement, fname text, lname text, dob text, phone text, email text)";
        db.execSQL(qry);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS tb1");
        onCreate(db);
    }

    public String addRecord(String p1, String p2, String p3, String p4, String p5){

        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues cv= new ContentValues();
        cv.put("fname",p1);
        cv.put("lname",p2);
        cv.put("dob",p3);
        cv.put("phone",p4);
        cv.put("email",p5);

        long res;
        res = db.insert("tb1",null,cv);
        if(res==-1){
            return "Failed";
        }
        else
            return "Inserted";
    }
}
