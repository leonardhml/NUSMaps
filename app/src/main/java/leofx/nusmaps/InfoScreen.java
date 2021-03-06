package leofx.nusmaps;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InfoScreen extends ActionBarActivity {

    ListView infoList;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent i = getIntent();
        name = i.getStringExtra("leofx.nusmaps.marker");

        MarkersDatabaseTable db = new MarkersDatabaseTable(this);
        Cursor c = db.queryForName(name);
        List<String> infoFromCursor = processCursor(c);

        db.close();

        List<Map<String, String>> list = getList(infoFromCursor);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_screen);

        infoList = (ListView) findViewById(R.id.infoListView);
        infoList.setAdapter(new SimpleAdapter(this,
                list,
                R.layout.info_list_row,
                new String[]{"category", "value"},
                new int[]{R.id.text1, R.id.text2}));

    }

    private List<String> processCursor(Cursor c) {
        List<String> res = new ArrayList<String>();
        c.moveToFirst();
        String name = c.getString(c.getColumnIndex("Name"));
        String tag = c.getString(c.getColumnIndex("Tag"));
        String info = c.getString(c.getColumnIndex("Info"));
        String coordinates = c.getString(c.getColumnIndex("Coordinates"));
        res.add(name);
        res.add(tag);
        res.add(info);
        res.add(coordinates);

        c.close();
        return res;
    }

    private List<Map<String, String>> getList(List<String> lst) {
        List<Map<String, String>> res = new ArrayList<>();
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("category", "Title");
        nameMap.put("value", lst.get(0));
        Map<String, String> tagMap = new HashMap<>();
        tagMap.put("category", "Tag");
        tagMap.put("value", lst.get(1));
        Map<String, String> infoMap = new HashMap<>();
        infoMap.put("category", "Info");
        infoMap.put("value", lst.get(2));
        Map<String, String> coordMap = new HashMap<>();
        coordMap.put("category", "Coordinates");
        coordMap.put("value", lst.get(3));

        res.add(nameMap);
        res.add(tagMap);
        res.add(infoMap);
        res.add(coordMap);

        return res;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_info_screen, menu);
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

    public void addFavourites(View v) {

        TinyDB tDB = new TinyDB(getBaseContext());
        ArrayList<String> fav = tDB.getListString("favourites");
        if (fav == null || fav.isEmpty()) {
            fav = new ArrayList<String>();
        }

        if (!fav.contains(name)) {
            fav.add(name);

            tDB.clear();
            tDB.putListString("favourites", fav);
            Toast.makeText(this, "Added", Toast.LENGTH_LONG).show();
            finish();
        } else {

            Toast.makeText(this, "Place has already been added", Toast.LENGTH_LONG).show();
            finish();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void showMap(View v){

        Intent i = new Intent(InfoScreen.this, MainScreen.class);
        i.setAction("showMap");
        i.putExtra("leofx.nusmaps.marker", name);
        startActivity(i);
        finish();

    }
}
