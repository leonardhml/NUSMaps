package leofx.nusmaps;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.apache.http.entity.StringEntity;

import java.util.ArrayList;


public class FavouritesScreen extends ActionBarActivity {

    ListView favList;
    ArrayList<String> favourites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites_screen);

        favList = (ListView) findViewById(R.id.fav_list);
        favourites = new TinyDB(this).getListString("favourites");

        favList.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_item, favourites));

        favList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(FavouritesScreen.this, MainScreen.class);
                i.setAction("showMap");
                i.putExtra("leofx.nusmaps.marker", favourites.get(position));
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_favourites_screen, menu);
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

    public void clearFavourites(View v) {
        TinyDB tBD = new TinyDB(this);
        tBD.clear();
        finish();
        startActivity(getIntent());
        Toast.makeText(this, "Favourites list cleared", Toast.LENGTH_LONG).show();
    }
}
