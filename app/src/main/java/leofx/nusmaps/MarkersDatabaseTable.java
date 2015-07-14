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



    private static final String DATABASE_NAME = "markers.db";
    private static final int DATABASE_VERSION = 1;

    public MarkersDatabaseTable(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        // you can use an alternate constructor to specify a database location
        // (such as a folder on the sd card)
        // you must ensure that this folder is available and you have permission
        // to write to it
        //super(context, DATABASE_NAME, context.getExternalFilesDir(null).getAbsolutePath(), null, DATABASE_VERSION);

    }

    public Cursor getEmployees() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlSelect = {"0 _id", "FirstName", "LastName"};
        String sqlTables = "Employees";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlSelect, null, null,
                null, null, null);

        c.moveToFirst();
        return c;

    }

    public Cursor doQuery(String query) {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        qb.setTables("Markers");
        Cursor c = db.rawQuery("SELECT Name as _id FROM Markers WHERE _id LIKE '%" + query + "%';", null);
       // Cursor c = qb.query(db, new String[]{"Name"}, "Name = '" + query + "'", new String[] {query+"*"}, null, null, null);
        return c;
    }
}
