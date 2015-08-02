package leofx.nusmaps;


import java.util.HashMap;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.app.ActionBar;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.FragmentTransaction;
import android.util.Log;

import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
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
import com.google.android.gms.maps.model.VisibleRegion;


import com.facebook.FacebookSdk;


public class MainScreen extends ActionBarActivity implements OnMapReadyCallback, OnMarkerClickListener{

    private String[] navigationItems;
    private DrawerLayout mDrawerlayout;
    private ListView mDrawerList;
    private Marker marker1, marker2, marker3, marker4, marker5,
            marker6, marker7, marker8, marker9, marker10, marker11;
    private boolean[] isAreaMarkerExpanded = {false,false,false,false,false,false,false,false,false,false,false};
    private LatLng coordinates1 = new LatLng(1.29619031, 103.78018141);
    private LatLng coordinates2 = new LatLng(1.29965484, 103.77693594);
    private LatLng coordinates3 = new LatLng(1.30187513, 103.77277851);
    private LatLng coordinates4 = new LatLng(1.2990649, 103.77204895);
    private LatLng coordinates5 = new LatLng(1.29694114, 103.77531052);
    private LatLng coordinates6 = new LatLng(1.29385202, 103.7716037);
    private LatLng coordinates7 = new LatLng(1.29296176, 103.77562702);
    private LatLng coordinates8 = new LatLng(1.2938413, 103.77846479);
    private LatLng coordinates9 = new LatLng(1.29167462, 103.78122211);
    private LatLng coordinates10 = new LatLng(1.29445268, 103.78314257);
    private LatLng coordinates11 = new LatLng(1.30603684, 103.7729609);

  //  private final LatLngBounds BOUNDS = new LatLngBounds(new LatLng(1.289144, 103.764993), new LatLng(1.311097, 103.791564));
  private final LatLng SWBOUNDS = new LatLng(1.266729, 103.742421);
    private final LatLng NEBOUNDS = new LatLng(1.323040, 103.813505);
    private final LatLngBounds BOUNDS = new LatLngBounds(SWBOUNDS, NEBOUNDS);
    private final int MAX_ZOOM = 21;
    private final int MIN_ZOOM = 1;



    GoogleMap map;

    private OverscrollHandler mOverscrollHandler;

    // For bus directory uses
    private List<PolylineOptions> latLngList = null;


    private Map<String, BitmapDescriptor> tagIconMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        MapFragment mapFrag = ((MapFragment) getFragmentManager().findFragmentById(R.id.mapView));
        mapFrag.getMapAsync(this);

        tagIconMap = TagIconDatabase.getTagIconMatching();

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
                        startActivityForResult(i, 0);
                        break;
                    case 1:
                        map.clear();
                        constructPolygonsAndMarkers();
                        map.animateCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(1.292395, 103.768174), new LatLng(1.307562, 103.785920)), 1));
                        for (int j = 0; j < isAreaMarkerExpanded.length; j++) {
                            isAreaMarkerExpanded[j] = false;
                        }

                        mDrawerlayout.closeDrawers();
                        break;
                    case 2:
                        i = new Intent(MainScreen.this, BusDirectoryScreen.class);
                        startActivityForResult(i, 2);
                        break;
                }

            }
        });

        mOverscrollHandler = new OverscrollHandler();
        mOverscrollHandler.sendEmptyMessageDelayed(0,100);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen, menu);
        // Associate searchable configuration with the SearchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));
        searchView.setSubmitButtonEnabled(true);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Intent i = new Intent(MainScreen.this, SearchActivity.class);
                i.putExtra(SearchManager.QUERY, query);
                i.setAction(Intent.ACTION_SEARCH);
                startActivityForResult(i, 0);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        map.setMyLocationEnabled(true);
        map.setOnMyLocationButtonClickListener(new GoogleMap.OnMyLocationButtonClickListener() {
            @Override
            public boolean onMyLocationButtonClick() {
                LocationManager locationManager = (LocationManager)
                        getSystemService(Context.LOCATION_SERVICE);
                Criteria criteria = new Criteria();

                Location location = locationManager.getLastKnownLocation(locationManager
                        .getBestProvider(criteria, false));
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                if (latitude >= NEBOUNDS.latitude || latitude <= SWBOUNDS.latitude || longitude >= NEBOUNDS.longitude || longitude <= SWBOUNDS.longitude) {
                    return true;
                } else {
                    return false;
                }
            }
        });

        map.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() {
            @Override
            public void onMapLoaded() {
                map.moveCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(1.292395, 103.768174), new LatLng(1.307562, 103.785920)), 1));
                // map.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(map.getCameraPosition().target, map.getCameraPosition().zoom, map.getCameraPosition().tilt, 30)));
            }
        });
        map.setOnMarkerClickListener(this);
        constructPolygonsAndMarkers();

        map.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {

                Intent i = new Intent(MainScreen.this,InfoScreen.class);
                i.putExtra("leofx.nusmaps.marker", marker.getTitle());
                startActivity(i);
            }
        });


        Intent i = getIntent();

        if (i != null && i.getAction() != null && i.getAction().equals("showMap")) {
            map.clear();
            String name = i.getStringExtra("leofx.nusmaps.marker");
            MarkersDatabaseTable db = new MarkersDatabaseTable(this);
            Cursor c = db.queryForName(name);
            c.moveToFirst();

            addMarkersFromCursor(c);
            db.close();
        }


    }

    @Override
    protected void onResume() {
        super.onResume();

        // Logs 'install' and 'app activate' App Events.
    //    AppEventsLogger.activateApp(this);
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Logs 'app deactivate' App Event.
    //    AppEventsLogger.deactivateApp(this);
    }

    private void constructPolygonsAndMarkers() {
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
        Polygon polygon11 = map.addPolygon(new PolygonCoordinatesDatabase.Area11().getPoly());

        marker1 = markerAdder(coordinates1, "Area 1", "Faculty of Science - Faculty of Dentistry - Yong Loo Lin School of Medicine", false, BitmapDescriptorFactory.fromResource(R.drawable.pin_export));
        marker2 = markerAdder(coordinates2, "Area 2", "Sports & Recreation Centre - University Health Centre - NUS Field", false, BitmapDescriptorFactory.fromResource(R.drawable.pin_export));
        marker3 = markerAdder(coordinates3, "Area 3", "University Cultural Centre - Yong Siew Toh Conservatory of Music - Lee Kong Chian Natural History Museum", false, BitmapDescriptorFactory.fromResource(R.drawable.pin_export));
        marker4 = markerAdder(coordinates4, "Area 4", "Faculty of Engineering - School of Design and Environment - Computer Centre - Raffles Hall", false, BitmapDescriptorFactory.fromResource(R.drawable.pin_export));
        marker5 = markerAdder(coordinates5, "Area 5", "University Hall - Yusof Ishak House - Central Library - Ridge View Residence", false, BitmapDescriptorFactory.fromResource(R.drawable.pin_export));
        marker6 = markerAdder(coordinates6, "Area 6", "Faculty of Arts & Social Sciences - School of Computing - Temasek Hall - Eusoff Hall", false, BitmapDescriptorFactory.fromResource(R.drawable.pin_export));
        marker7 = markerAdder(coordinates7, "Area 7", "NUS Business School - Heng Mui Keng Terrace", false, BitmapDescriptorFactory.fromResource(R.drawable.pin_export));
        marker8 = markerAdder(coordinates8, "Area 8", "NUS Enterprise Incubator", false, BitmapDescriptorFactory.fromResource(R.drawable.pin_export));
        marker9 = markerAdder(coordinates9, "Area 9", "Prince George's Park Residence - King Edward VII Hall", false, BitmapDescriptorFactory.fromResource(R.drawable.pin_export));
        marker10 = markerAdder(coordinates10, "Area 10", "NUH", false, BitmapDescriptorFactory.fromResource(R.drawable.pin_export));
        marker11 = markerAdder(coordinates11, "Area 11", "UTown", false, BitmapDescriptorFactory.fromResource(R.drawable.pin_export));
    }

    @Override
    public void onActivityResult(int reqCode, int resCode, Intent data) {

        if (reqCode == 0) {
            if (resCode == RESULT_OK) {
                mDrawerlayout.closeDrawers();
                map.clear();
                String name = data.getStringExtra("leofx.nusmaps.name");
                LatLng latLng = data.getParcelableExtra("leofx.nusmaps.latLng");
                String info = data.getStringExtra("leofx.nusmaps.info");
                String tag = data.getStringExtra("leofx.nusmaps.tag");

                markerAdder(latLng, name, info, true, tagIconMap.get(tag));

                map.animateCamera(CameraUpdateFactory.newLatLng(latLng));

            }
        }

        if (reqCode == 2) {
            if (resCode == RESULT_OK) {
                mDrawerlayout.closeDrawers();
                map.clear();
                int position = data.getIntExtra("leofx.nusmaps.position", 0);
                if (latLngList == null) { latLngList = BusDirectoryDatabase.getLatLngList(); }
                Polyline line = map.addPolyline(latLngList.get(position).color(BusDirectoryDatabase.COLORS[position]));

                addMarkersForBusRoute(position);
            }
        }
    }

    private void addMarkersForBusRoute(int pos) {
        String[] busStopsToAdd = BusDirectoryDatabase.allBusStops[pos];
        MarkersDatabaseTable db = new MarkersDatabaseTable(this);
        Cursor c = db.queryForBusStops(busStopsToAdd);

        addMarkersFromCursor(c);

        db.close();


    }

    private void addMarkersFromCursor(Cursor c) {
        c.moveToFirst();
        while(!c.isAfterLast()) {
            String name = c.getString(c.getColumnIndex("Name"));
            String coordinates = c.getString(c.getColumnIndex("Coordinates"));
            String[] latLngStrings = coordinates.split(",");
            Double lat = Double.parseDouble(latLngStrings[0].trim());
            Double lng = Double.parseDouble(latLngStrings[1].trim());
            LatLng latLng = new LatLng(lat, lng);
            String info = c.getString(c.getColumnIndex("Info"));
            String tag = c.getString(c.getColumnIndex("Tag"));
            markerAdder(latLng, name, info, false, tagIconMap.get(tag));
            c.moveToNext();
        }

        c.close();
    }

    @Override
    public boolean onMarkerClick(Marker marker) {

        if (marker.equals(marker1)) {
            if (!isAreaMarkerExpanded[0]) {
                isAreaMarkerExpanded[0] = true;
                MarkersDatabaseTable db = new MarkersDatabaseTable(this);
                Cursor c = db.queryForArea(1);
                addMarkersFromCursor(c);
                db.close();
            }
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates1, 17));
            marker.showInfoWindow();
            return true;
        } else if (marker.equals(marker2)) {
            if (!isAreaMarkerExpanded[1]) {
                isAreaMarkerExpanded[1] = true;
                MarkersDatabaseTable db = new MarkersDatabaseTable(this);
                Cursor c = db.queryForArea(2);
                addMarkersFromCursor(c);
                db.close();
            }
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates2, 16));
            marker.showInfoWindow();
            return true;
        } else if (marker.equals(marker3)) {
            if (!isAreaMarkerExpanded[2]) {
                isAreaMarkerExpanded[2] = true;
                MarkersDatabaseTable db = new MarkersDatabaseTable(this);
                Cursor c = db.queryForArea(3);
                addMarkersFromCursor(c);
                db.close();
            }
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates3, 17));
            marker.showInfoWindow();
            return true;
        } else if (marker.equals(marker4)) {
            if (!isAreaMarkerExpanded[3]) {
                isAreaMarkerExpanded[3] = true;
                MarkersDatabaseTable db = new MarkersDatabaseTable(this);
                Cursor c = db.queryForArea(4);
                addMarkersFromCursor(c);
                db.close();
            }
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates4, 17));
            marker.showInfoWindow();
            return true;
        } else if (marker.equals(marker5)) {
            if (!isAreaMarkerExpanded[4]) {
                isAreaMarkerExpanded[4] = true;
                MarkersDatabaseTable db = new MarkersDatabaseTable(this);
                Cursor c = db.queryForArea(5);
                addMarkersFromCursor(c);
                db.close();
            }
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates5, 17));
            marker.showInfoWindow();
            return true;
        } else if (marker.equals(marker6)) {
            if (!isAreaMarkerExpanded[5]) {
                isAreaMarkerExpanded[5] = true;
                MarkersDatabaseTable db = new MarkersDatabaseTable(this);
                Cursor c = db.queryForArea(6);
                addMarkersFromCursor(c);
                db.close();
            }
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates6, 17));
            marker.showInfoWindow();
            return true;
        } else if (marker.equals(marker7)) {
            if (!isAreaMarkerExpanded[6]) {
                isAreaMarkerExpanded[6] = true;
                MarkersDatabaseTable db = new MarkersDatabaseTable(this);
                Cursor c = db.queryForArea(7);
                addMarkersFromCursor(c);
                db.close();
            }
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates7, 17));
            marker.showInfoWindow();
            return true;
        } else if (marker.equals(marker8)) {
            if (!isAreaMarkerExpanded[7]) {
                isAreaMarkerExpanded[7] = true;
                MarkersDatabaseTable db = new MarkersDatabaseTable(this);
                Cursor c = db.queryForArea(8);
                addMarkersFromCursor(c);
                db.close();
            }
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates8, 17));
            marker.showInfoWindow();
            return true;
        } else if (marker.equals(marker9)) {
            if (!isAreaMarkerExpanded[8]) {
                isAreaMarkerExpanded[8] = true;
                MarkersDatabaseTable db = new MarkersDatabaseTable(this);
                Cursor c = db.queryForArea(9);
                addMarkersFromCursor(c);
                db.close();
            }
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates9, 17));
            marker.showInfoWindow();
            return true;
        } else if (marker.equals(marker10)) {
            if (!isAreaMarkerExpanded[9]) {
                isAreaMarkerExpanded[9] = true;
                MarkersDatabaseTable db = new MarkersDatabaseTable(this);
                Cursor c = db.queryForArea(10);
                addMarkersFromCursor(c);
                db.close();
            }
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates10, 17));
            marker.showInfoWindow();
            return true;
        } else if (marker.equals(marker11)) {
            if (!isAreaMarkerExpanded[10]) {
                isAreaMarkerExpanded[10] = true;
                MarkersDatabaseTable db = new MarkersDatabaseTable(this);
                Cursor c = db.queryForArea(11);
                addMarkersFromCursor(c);
                db.close();
            }
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates11, 17));
            marker.showInfoWindow();
            return true;
        }

        return false;
    }

    private Marker markerAdder(LatLng position, String title, String snippet, boolean showInfoWindow, BitmapDescriptor icon) {

        Marker m;

        if (showInfoWindow) {
            if (snippet == null || snippet.isEmpty()) {
                m = map.addMarker(new MarkerOptions()
                        .position(position)
                        .title(title)
                        .icon(icon));
                m.showInfoWindow();
            } else {
                m = map.addMarker(new MarkerOptions()
                        .position(position)
                        .title(title)
                        .snippet(snippet)
                        .icon(icon));
                m.showInfoWindow();
            }
        } else {
            if (snippet == null || snippet.isEmpty()) {
                m = map.addMarker(new MarkerOptions()
                        .position(position)
                        .title(title)
                        .icon(icon));
            } else {
                m = map.addMarker(new MarkerOptions()
                        .position(position)
                        .title(title)
                        .snippet(snippet)
                        .icon(icon));

            }

        }

        return m;
    }

    /**
     * Returns the correction for Lat and Lng if camera is trying to get outside of visible map
     * @param cameraBounds Current camera bounds
     * @return Latitude and Longitude corrections to get back into bounds.
     */
    private LatLng getLatLngCorrection(LatLngBounds cameraBounds) {
        double latitude=0, longitude=0;
        if(cameraBounds.southwest.latitude < BOUNDS.southwest.latitude) {
            latitude = BOUNDS.southwest.latitude - cameraBounds.southwest.latitude;
        }
        if(cameraBounds.southwest.longitude < BOUNDS.southwest.longitude) {
            longitude = BOUNDS.southwest.longitude - cameraBounds.southwest.longitude;
        }
        if(cameraBounds.northeast.latitude > BOUNDS.northeast.latitude) {
            latitude = BOUNDS.northeast.latitude - cameraBounds.northeast.latitude;
        }
        if(cameraBounds.northeast.longitude > BOUNDS.northeast.longitude) {
            longitude = BOUNDS.northeast.longitude - cameraBounds.northeast.longitude;
        }
        return new LatLng(latitude, longitude);
    }

    /**
     * Bounds the user to the overlay.
     */
    private class OverscrollHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            CameraPosition position = map.getCameraPosition();
            VisibleRegion region = map.getProjection().getVisibleRegion();
            float zoom = 0;
            //if(position.zoom < MIN_ZOOM) zoom = MIN_ZOOM;
            //if(position.zoom > MAX_ZOOM) zoom = MAX_ZOOM;
            LatLng correction = getLatLngCorrection(region.latLngBounds);
            if(zoom != 0 || correction.latitude != 0 || correction.longitude != 0) {
                zoom = (zoom==0)?position.zoom:zoom;
                double lat = position.target.latitude + correction.latitude;
                double lon = position.target.longitude + correction.longitude;
                CameraPosition newPosition = new CameraPosition(new LatLng(lat,lon), zoom, position.tilt, position.bearing);
                CameraUpdate update = CameraUpdateFactory.newCameraPosition(newPosition);
                map.moveCamera(update);
            }
        /* Recursively call handler every 100ms */
            sendEmptyMessageDelayed(0,100);
        }
    }




}
