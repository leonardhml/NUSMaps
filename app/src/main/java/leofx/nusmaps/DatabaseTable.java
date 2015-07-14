package leofx.nusmaps;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.*;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by leona_000 on 13/7/2015.
 */
public class DatabaseTable {

    public static final String COL_NAME = "NAME";
    public static final String COL_COORDINATES = "COORDINATES";
    public static final String COL_TAG = "TAG";
    public static final String COL_INFO = "INFO";
    public static final String COL_AREA = "AREA";

    private static final String TAG = "MarkersDatabase";
    private static final String DATABASE_NAME = "markers";
    private static final String FTS_VIRTUAL_TABLE = "FTS";
    private static final int DATABASE_VERSION = 1;


    private final DatabaseOpenHelper mDatabaseOpenHelper;

    public DatabaseTable(Context context) {
        mDatabaseOpenHelper = new DatabaseOpenHelper(context);
    }

    private static class DatabaseOpenHelper extends SQLiteOpenHelper {

        private final Context mHelperContext;
        private SQLiteDatabase mDatabase;


        private static final String FTS_TABLE_CREATE =
                "CREATE VIRTUAL TABLE " + FTS_VIRTUAL_TABLE +
                        " USING fts3 (" +
                        COL_NAME + ", " +
                        COL_COORDINATES + ", " +
                        COL_TAG + ", " +
                        COL_INFO + ", " +
                        COL_AREA + ")";

        DatabaseOpenHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            mHelperContext = context;
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            mDatabase = db;
            mDatabase.execSQL(FTS_TABLE_CREATE);
            loadDatabase();
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w(TAG, "Upgrading database from version " + oldVersion + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS " + FTS_VIRTUAL_TABLE);
            onCreate(db);
        }

        private void loadDatabase() {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        loadWords();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }

        private void loadWords() throws IOException {
            final Resources resources = mHelperContext.getResources();
            InputStream inputStream = resources.openRawResource(R.raw.markerinfo);

            try {
                Workbook w = Workbook.getWorkbook(inputStream);
                Sheet sheet = w.getSheet(0);
                int rows = sheet.getRows();
                for (int row = 0; row <= rows; row++) {
                    Cell nameCell = sheet.getCell(0, row);
                    String name = nameCell.getContents();

                    Cell latLngCell = sheet.getCell(1, row);
                    String latLng = latLngCell.getContents();

                    Cell tagCell = sheet.getCell(2, row);
                    String tag;
                    if (tagCell != null) {
                        tag = tagCell.getContents().replaceAll("\\s+", "").toLowerCase();
                    } else {
                        tag = "";
                    }

                    Cell dataCell = sheet.getCell(3, row);
                    String data;
                    if (dataCell != null) {
                        data = dataCell.getContents();
                    } else {
                        data = "";
                    }


                    Cell areaCell = sheet.getCell(4, row);
                    int a;
                    if (areaCell != null) {
                        a = Integer.parseInt(areaCell.getContents());
                    } else {
                        a = -10000;
                    }


                    addEntry(name, latLng, data, tag, a);

                }
                w.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(true);
        }

        public long addEntry(String name, String coordinates, String info, String tag, int area) {
            ContentValues initialValues = new ContentValues();
            initialValues.put(COL_NAME, name);
            initialValues.put(COL_COORDINATES, coordinates);
            initialValues.put(COL_INFO, info);
            initialValues.put(COL_TAG, tag);
            initialValues.put(COL_AREA, area);

            return mDatabase.insert(FTS_VIRTUAL_TABLE, null, initialValues);
        }
    }

    public Cursor getWordMatches(String query, String[] columns) {
        String selection = COL_NAME + " MATCH ?";
        String[] selectionArgs = new String[] {query+"*"};

        return query(selection, selectionArgs, columns);
    }

    private Cursor query(String selection, String[] selectionArgs, String[] columns) {
        SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
        builder.setTables(FTS_VIRTUAL_TABLE);

        Cursor cursor = builder.query(mDatabaseOpenHelper.getReadableDatabase(),
                columns, selection, selectionArgs, null, null, null);

        if (cursor == null) {
            return null;
        } else if (!cursor.moveToFirst()) {
            cursor.close();
            return null;
        }
        return cursor;
    }
}
