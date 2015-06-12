package leofx.nusmaps;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

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
        parentDir = getInfo();
        keyList = new ArrayList<String>(parentDir.keySet());
        adapter = new DirectoryAdapter(this, parentDir, keyList);
        dirList.setAdapter(adapter);

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



    private static HashMap<String, List<String>> getInfo() {
        HashMap<String, List<String>> data = new HashMap<String, List<String>>();

        List<String> childList1 = new ArrayList<String>();
        childList1.add("Science");
        childList1.add("Medicine");
        childList1.add("Engineering");
        childList1.add("SoC");
        childList1.add("FASS");

        List<String> childList2 = new ArrayList<String>();
        childList2.add("Frontier");
        childList2.add("Deck");
        childList2.add("Terrace");
        childList2.add("Reeds");
        childList2.add("Flavours");

        List<String> childList3 = new ArrayList<String>();
        childList3.add("Sci Library");
        childList3.add("Central Library");
        childList3.add("Medicine Library");
        childList3.add("UTown Library");

        data.put("Faculties", childList1);
        data.put("Canteens", childList2);
        data.put("Libraries", childList3);

        return data;

    }
}
