package com.example.midterm_2;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String dbname = "dbname.db";
    public static final Integer id = "id";
    public static final String name = "name";
    public static final String surname = "surname";
    public static final Integer nid = "nid";

    public DatabaseHelper (@Nullable Context context){
        super(context, dbname, null, 1);
    }
    public void on create(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL(
        "enter id " + id + "enter name" + name + "enter surname" + surname + "enter national id" + nid);
    }
}
