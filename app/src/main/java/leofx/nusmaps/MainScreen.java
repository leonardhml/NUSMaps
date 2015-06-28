package leofx.nusmaps;


import java.util.HashMap;
import java.util.Date;
import java.util.ArrayList;
import java.util.Map;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.FragmentTransaction;
import android.util.Log;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.GoogleMap.OnMapLongClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;


public class MainScreen extends FragmentActivity implements OnMapReadyCallback, OnMapClickListener, OnMapLongClickListener, OnMarkerClickListener {

    private String[] navigationItems;
    private DrawerLayout mDrawerlayout;
    private ListView mDrawerList;
    GoogleMap map;

    //added_fx
    private ArrayList<LatLng> mLocationPoints = null;
    PolylineOptions mPolylineOptions;
    private boolean checkClick = false;

    private Map<String, PlaceOfInterestInfo> area1POIs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        navigationItems = getResources().getStringArray(R.array.navigation_items);
        mDrawerlayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        mDrawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_item, navigationItems));

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainScreen.this, DirectoryScreen.class);
                switch (position) {
                    case 0:
                        i = new Intent(MainScreen.this, DirectoryScreen.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(MainScreen.this, BusDirectoryScreen.class);
                        startActivityForResult(i, 2);
                        break;
                }

            }
        });


        MapFragment mapFrag = ((MapFragment) getFragmentManager().findFragmentById(R.id.mapView));
        mapFrag.getMapAsync(this);

        //added!!!_fx
        mLocationPoints = new ArrayList<LatLng>();
        area1POIs = MarkersDatabase.Area1.getArea1POIs();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen, menu);
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


    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        map.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() {
            @Override
            public void onMapLoaded() {
                map.moveCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(1.292395, 103.768174), new LatLng(1.307562, 103.785920)), 1));
                map.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(map.getCameraPosition().target, map.getCameraPosition().zoom, map.getCameraPosition().tilt, 30)));
            }
        });
    //    LatLngBounds overlayBound = new LatLngBounds(new LatLng(1.291581, 103.766413), new LatLng(1.309472, 103.788708));
    //    GroundOverlayOptions nusOverlayOptions = new GroundOverlayOptions()
    //            .image(BitmapDescriptorFactory.fromResource(R.drawable.icon3))
    //            .positionFromBounds(overlayBound);

    //    map.addGroundOverlay(nusOverlayOptions);

        //added!!!_fx
        map.setMyLocationEnabled(true);

        map.setOnMapClickListener(this);
        map.setOnMapLongClickListener(this);
        map.setOnMarkerClickListener(this);

    }

    @Override
    public void onActivityResult(int reqCode, int resCode, Intent data) {
        if (reqCode == 2) {
            if (resCode == RESULT_OK) {
                mDrawerlayout.closeDrawers();
                map.clear();
                int position = data.getIntExtra("leofx.nusmaps.position", 0);
                Polyline line = map.addPolyline(BusDirectoryDatabase.getLatLngList().get(position).color(BusDirectoryDatabase.COLORS[position]));
            }
        }
    }

    // added_fx
    @Override
    public void onMapClick(LatLng latLng) {
        if (checkClick == false) {

            map.addMarker(new MarkerOptions().position(latLng).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.pin1)));
            mLocationPoints.add(latLng);
        }
    }

    @Override
    public void onMapLongClick(LatLng latLng) {
        map.clear();
        mLocationPoints.clear();
        checkClick = false;
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        System.out.println("Marker lat long = " + marker.getPosition());
        System.out.println("First position check " + mLocationPoints.get(0));
        System.out.println("**********All arrayPoints***********" + mLocationPoints);
        if (mLocationPoints.get(0).equals(marker.getPosition())) {
            System.out.println("********First Point choose************");
            countPolygonPoints();
        }

        return false;
    }

    private void countPolygonPoints() {

        if (mLocationPoints.size() >= 3) {
            checkClick = true;
            PolygonOptions polygonOptions = new PolygonOptions();
            polygonOptions.addAll(mLocationPoints);
            polygonOptions.strokeColor(Color.BLUE);
            polygonOptions.strokeWidth(7);
            polygonOptions.fillColor(Color.CYAN);
            Polygon polygon = map.addPolygon(polygonOptions);
        }
    }
}
