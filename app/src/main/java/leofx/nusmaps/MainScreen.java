package leofx.nusmaps;


import java.util.HashMap;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
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


public class MainScreen extends FragmentActivity implements OnMapReadyCallback {

    private String[] navigationItems;
    private DrawerLayout mDrawerlayout;
    private ListView mDrawerList;
    GoogleMap map;

    //added_fx
    private ArrayList<LatLng> mLocationPoints = null;
    PolylineOptions mPolylineOptions;
    private boolean checkClick = false;

    protected static List<Map<String, PlaceOfInterestInfo>> POIListByArea;

    // For bus directory uses
    private List<PolylineOptions> latLngList = null;
    private List<List<PlaceOfInterestInfo>> busMarkerList = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        navigationItems = getResources().getStringArray(R.array.navigation_items);
        mDrawerlayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        POIListByArea = initialisePOIList();

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



    }

    private List<Map<String, PlaceOfInterestInfo>> initialisePOIList() {
        // Initialise all the PoIs in all areas, arranged by area; e.g. if you want to retrieve a PoI from area 5, use POIListByArea.get(5).get("POI name")
        List<Map<String, PlaceOfInterestInfo>> POIListByArea = new ArrayList<Map<String, PlaceOfInterestInfo>>();
        POIListByArea.add(null);    //We don't have an area 0; so calling POIListByArea.get() we can just refer directly to the area we want
        POIListByArea.add(MarkersDatabase.Area1.getArea1POIs());
        POIListByArea.add(MarkersDatabase.Area2.getArea2POIs());
        POIListByArea.add(MarkersDatabase.Area3.getArea3POIs());
        POIListByArea.add(MarkersDatabase.Area4.getArea4POIs());
        POIListByArea.add(MarkersDatabase.Area5.getArea5POIs());
        POIListByArea.add(MarkersDatabase.Area6.getArea6POIs());
        POIListByArea.add(MarkersDatabase.Area7.getArea7POIs());
        POIListByArea.add(MarkersDatabase.Area8.getArea8POIs());
        POIListByArea.add(MarkersDatabase.Area9.getArea9POIs());
        POIListByArea.add(MarkersDatabase.Area10.getArea10POIs());
        POIListByArea.add(MarkersDatabase.Area11.getArea11POIs());
        POIListByArea.add(MarkersDatabase.Area12.getArea12POIs());
        POIListByArea.add(MarkersDatabase.Area13.getArea13POIs());
        POIListByArea.add(MarkersDatabase.Area14.getArea14POIs());
        POIListByArea.add(MarkersDatabase.Area15.getArea15POIs());
        return POIListByArea;
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


        Polygon polygon1 = map.addPolygon(new PolygonCoordinatesDatabase.Area1().getPoly());
        Polygon polygon2 = map.addPolygon(new PolygonCoordinatesDatabase.Area2().getPoly());
        Polygon polygon3 = map.addPolygon(new PolygonCoordinatesDatabase.Area3().getPoly());
        Polygon polygon4 = map.addPolygon(new PolygonCoordinatesDatabase.Area4().getPoly());
        Polygon polygon5 = map.addPolygon(new PolygonCoordinatesDatabase.Area5().getPoly());
        Polygon polygon6 = map.addPolygon(new PolygonCoordinatesDatabase.Area6().getPoly());
        Polygon polygon7 = map.addPolygon(new PolygonCoordinatesDatabase.Area7().getPoly());
        Polygon polygon8 = map.addPolygon(new PolygonCoordinatesDatabase.Area8().getPoly());
        Polygon polygon9 = map.addPolygon(new PolygonCoordinatesDatabase.Area9().getPoly());
        Polygon polygon10 = map.addPolygon(new PolygonCoordinatesDatabase.Area10().getPoly());
        //Polygon polygon11 = map.addPolygon(new PolygonCoordinatesDatabase.Area11().getPoly());
        //Polygon polygon12 = map.addPolygon(new PolygonCoordinatesDatabase.Area12().getPoly());
        //Polygon polygon13 = map.addPolygon(new PolygonCoordinatesDatabase.Area13().getPoly());
        //Polygon polygon14 = map.addPolygon(new PolygonCoordinatesDatabase.Area14().getPoly());
        //Polygon polygon15 = map.addPolygon(new PolygonCoordinatesDatabase.Area15().getPoly());
    }

    @Override
    public void onActivityResult(int reqCode, int resCode, Intent data) {
        if (reqCode == 2) {
            if (resCode == RESULT_OK) {
                mDrawerlayout.closeDrawers();
                map.clear();
                int position = data.getIntExtra("leofx.nusmaps.position", 0);
                if (latLngList == null) { latLngList = BusDirectoryDatabase.getLatLngList(); }
                if (busMarkerList == null) { busMarkerList = BusDirectoryDatabase.getBusMarkersList(); }
                Polyline line = map.addPolyline(latLngList.get(position).color(BusDirectoryDatabase.COLORS[position]));

                addMarkersForBusRoute(position);
            }
        }
    }

    private void addMarkersForBusRoute(int pos) {
        List<PlaceOfInterestInfo> markersToAdd = busMarkerList.get(pos);
        System.out.println(pos + " " + (markersToAdd.size()));
        for (PlaceOfInterestInfo p : markersToAdd) {
            map.addMarker(new MarkerOptions().position(p.coordinates).title(p.name));
        }
    }

}
