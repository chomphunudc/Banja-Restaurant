package uih.chaiyacupt.chomphunud.banja;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.security.spec.DSAPublicKeySpec;
import java.sql.SQLOutput;

/**
 * Created by chomphunud_c on 29/2/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    public static final String database_name = "benja.db";
    private static final int database_version =1;
    private static final String Create_table_user = "create table UserTABLE("+
            "_id interger primary key, "+
            "User text, "+
            "Password text, "+
            "Name Text);";
    private static final String Create_table_food = "create table foodTABLE (" +
            "_id integer primary key, " +
            "Food text, " +
            "Price text, "+
            "Source text);";

    public MyOpenHelper(Context context) {
    }   //Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Create_table_food);
        sqLiteDatabase.execSQL(Create_table_user);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}   //Main Class
