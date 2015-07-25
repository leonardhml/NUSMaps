package leofx.nusmaps;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DirectoryScreen extends ActionBarActivity {

    List<Pair> parentDir;
    DirectoryAdapter adapter;
    ExpandableListView dirList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory_screen);
        dirList = (ExpandableListView) findViewById(R.id.dir_list);
        parentDir = getInfo();
        adapter = new DirectoryAdapter(this, parentDir);
        dirList.setAdapter(adapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dirList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                PlaceOfInterestInfo selected = parentDir.get(groupPosition).childList.get(childPosition);
                String name = selected.name;
                LatLng latLng = selected.coordinates;
                String info = selected.info;
                String tag = selected.tag;
                Intent i = new Intent();
                i.putExtra("leofx.nusmaps.name", name);
                i.putExtra("leofx.nusmaps.latLng", latLng);
                i.putExtra("leofx.nusmaps.info", info);
                i.putExtra("leofx.nusmaps.tag", tag);
                setResult(RESULT_OK, i);
                finish();
                return true;
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_directory_screen, menu);
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


    public List<Pair> getInfo() {
        MarkersDatabaseTable db = new MarkersDatabaseTable(this);
        final String[] GROUP_NAMES = {"Administrative", "Bus Stops", "Cafes", "Canteens", "Cultural Facilities", "Fast Food", "Food Court", "General Stores", "Kiosks", "Lecture Theatres / Auditoriums",
                "Libraries", "Recreational Facilities", "Research Facilities", "Residences/Halls", "Restaurants", "Schools/Faculties"};
        final String[] GROUP_TAGS = {"Admin", "Busstop", "Cafe", "Canteen", "Cultural", "Fast Food", "Food Court", "General Stores", "Kiosk", "Lecture Theatre",
                "Library", "Recreation", "Research", "Residence", "Restaurant", "School"};

        List<Pair> data = new ArrayList<Pair>();

        for (int i = 0; i < GROUP_NAMES.length; i++) {
            Cursor c = db.queryByTag(GROUP_TAGS[i]);
            data.add(new Pair(GROUP_NAMES[i], getPOIFromCursor(c)));
        }

        db.close();
        return data;
    }

    private List<PlaceOfInterestInfo> getPOIFromCursor(Cursor c) {
        List<PlaceOfInterestInfo> lst = new ArrayList<PlaceOfInterestInfo>();
        c.moveToFirst();
        while(!c.isAfterLast()) {
            String name = c.getString(c.getColumnIndex("Name"));
            String coordinates = c.getString(c.getColumnIndex("Coordinates"));
            String[] latLngStrings = coordinates.split(",");
            Double lat = Double.parseDouble(latLngStrings[0].trim());
            Double lng = Double.parseDouble(latLngStrings[1].trim());
            LatLng latLng = new LatLng(lat, lng);
            String tag = c.getString(c.getColumnIndex("Tag"));
            String info = c.getString(c.getColumnIndex("Info"));
            lst.add(new PlaceOfInterestInfo(name, latLng, tag, info));
            c.moveToNext();
        }

        c.close();

        return lst;
    }

}
