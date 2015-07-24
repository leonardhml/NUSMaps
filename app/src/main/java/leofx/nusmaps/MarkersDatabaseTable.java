package leofx.nusmaps;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;
/**
 * Created by leona_000 on 14/7/2015.
 */
public class MarkersDatabaseTable extends SQLiteAssetHelper{



    private static final String DATABASE_NAME = "markers3.db";
    private static final int DATABASE_VERSION = 1;

    public MarkersDatabaseTable(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        // you can use an alternate constructor to specify a database location
        // (such as a folder on the sd card)
        // you must ensure that this folder is available and you have permission
        // to write to it
        //super(context, DATABASE_NAME, context.getExternalFilesDir(null).getAbsolutePath(), null, DATABASE_VERSION);

    }


    public Cursor doQuery(String query) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM Markers WHERE Name LIKE '%" + query + "%' ORDER BY Name ASC;", null);
       // Cursor c = qb.query(db, new String[]{"Name"}, "Name = '" + query + "'", new String[] {query+"*"}, null, null, null);
        return c;
    }

    public Cursor queryByTag(String query) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM Markers WHERE Tag='" + query + "' ORDER BY Name ASC;", null);
        // Cursor c = qb.query(db, new String[]{"Name"}, "Name = '" + query + "'", new String[] {query+"*"}, null, null, null);
        return c;
    }

    public Cursor queryForBusStops(String[] query) {
        SQLiteDatabase db = getReadableDatabase();
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("SELECT * FROM Markers WHERE Name IN (");
        for (int i = 0; i < query.length - 1; i++) {
            queryBuilder.append("'" + query[i] + "',");

        }

        queryBuilder.append("'" + query[query.length - 1] + "');");
        Cursor c = db.rawQuery(queryBuilder.toString(), null);
        return c;
    }

    public Cursor queryForArea(int area) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM Markers WHERE Area = '" + area +"'", null);
        return c;
    }
}
