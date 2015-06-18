package leofx.nusmaps;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DirectoryScreen extends ActionBarActivity {

    HashMap<String, List<String>> parentDir;
    List<String> keyList;
    DirectoryAdapter adapter;
    ExpandableListView dirList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory_screen);
        dirList = (ExpandableListView) findViewById(R.id.dir_list);
        parentDir = DirectoryDatabase.getInfo();
        keyList = new ArrayList<String>(parentDir.keySet());
        adapter = new DirectoryAdapter(this, parentDir, keyList);
        dirList.setAdapter(adapter);

        dirList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                return false;
                // start activities to mainScreen with different extra values corresponding to where on the map the
                // marker should point to
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




}
