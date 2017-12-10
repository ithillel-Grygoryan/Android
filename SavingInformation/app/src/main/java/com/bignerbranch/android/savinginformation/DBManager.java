package com.bignerbranch.android.savinginformation;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.text.Selection;
import android.widget.Toast;

import static android.R.attr.id;

/**
 * Created by becha on 8/30/17.
 */

public class DBManager {
    private SQLiteDatabase sqlDB;
    static final String DBName = "Students";
    static final String TableName = "Logins";
    static final String ColUserName = "UserName";
    static final String ColPassword = "Password";
    static final String ID = "ID";
    static final int DBVersion = 1;

    static final String CreateTable = "Create table IF NOT EXISTs "+TableName+
            " (ID integer PRIMARY KEY AUTOINCREMENT, "+ColUserName+
            " text, "+ColPassword+" text);";


    static class DataBaseHelperUser extends SQLiteOpenHelper{
        Context context;
        DataBaseHelperUser (Context context){
            super(context, DBName, null, DBVersion);
            this.context = context;

        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CreateTable);
            Toast.makeText(context,"DataBase is created", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("Drop table IF EXISTS " + TableName);
            onCreate(db);
        }
    }
    public DBManager (Context context){
        DataBaseHelperUser db = new DataBaseHelperUser(context);
        sqlDB = db.getWritableDatabase();
    }

    public long Insert(ContentValues values){
        long ID = sqlDB.insert(TableName, "", values);
        return ID;

    }

    public Cursor query(String[] Projection, String Selection, String[] SelectionArgs,
                        String SortOrder){
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        qb.setTables(TableName);
        Cursor cursor = qb.query(sqlDB, Projection, Selection, SelectionArgs, null, null, SortOrder);
        return cursor;

    }

    public int Delete(String Selection, String[] SelectionArgs){
        int count = sqlDB.delete(TableName, Selection,SelectionArgs);
        return count;
    }

    public int Update(ContentValues values, String Selection, String[] SelectionArgs){
        int count = sqlDB.update(TableName, values, Selection, SelectionArgs);
        return count;
    }
}
