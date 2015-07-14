package leofx.nusmaps;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

/**
 * Created by leona_000 on 13/7/2015.
 */
public class DatabaseCursorAdapter extends CursorAdapter{

    public DatabaseCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }


    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.drawer_list_item, parent, false);

    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        String name = cursor.getString(cursor.getColumnIndexOrThrow("_id"));

        TextView tv = (TextView) view;
        tv.setText(name);

    }
}
