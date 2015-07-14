package leofx.nusmaps;

import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;


public class SearchActivity extends ActionBarActivity {

    MarkersDatabaseTable db;
    private ListView searchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        db = new MarkersDatabaseTable(this);
        searchList = (ListView) findViewById(R.id.searchList);
        handleIntent(getIntent());


    }
    @Override
    protected void onNewIntent(Intent intent) {
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {

        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            final Cursor c = db.doQuery(query);
            List<String> namesList = getNamesFromCursor(c);
         //   DatabaseCursorAdapter dbAdapter = new DatabaseCursorAdapter(this, c);
            searchList.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_item, namesList));

            searchList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent i = getResultIntent(position, c);
                    setResult(RESULT_OK, i);
                    finish();

                }

                private Intent getResultIntent(int position, Cursor c) {
                    c.moveToPosition(position);
                    String name = c.getString(c.getColumnIndex("Name"));
                    String coordinates = c.getString(c.getColumnIndex("Coordinates"));
                    String[] latLngStrings = coordinates.split(",");
                    Double lat = Double.parseDouble(latLngStrings[0].trim());
                    Double lng = Double.parseDouble(latLngStrings[1].trim());
                    LatLng latLng = new LatLng(lat, lng);
                    String tag = c.getString(c.getColumnIndex("Tag"));
                    String info = c.getString(c.getColumnIndex("Info"));
                    Intent i = new Intent();
                    i.putExtra("leofx.nusmaps.name", name);
                    i.putExtra("leofx.nusmaps.latLng", latLng);
                    i.putExtra("leofx.nusmaps.info", info);
                    i.putExtra("leofx.nusmaps.tag", tag);
                    return i;
                }
            });
        }
    }

    private List<String> getNamesFromCursor(Cursor c) {
        List<String> nameList = new ArrayList<String>();
        c.moveToFirst();
        while(!c.isAfterLast()) {
            nameList.add(c.getString(0));
            c.moveToNext();
        }

        return nameList;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
