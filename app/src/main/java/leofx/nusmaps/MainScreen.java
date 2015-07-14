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
import android.graphics.Color;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
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


public class MainScreen extends ActionBarActivity implements OnMapReadyCallback, OnMarkerClickListener{

    private String[] navigationItems;
    private DrawerLayout mDrawerlayout;
    private ListView mDrawerList;
    private Marker marker1, marker2, marker3, marker4, marker5,
            marker6, marker7, marker8, marker9, marker10, marker11;
    private LatLng coordinates1 = new LatLng(1.29619031, 103.78018141);
    private LatLng coordinates2 = new LatLng(1.29947249, 103.7774992);
    private LatLng coordinates3 = new LatLng(1.30187513, 103.77277851);
    private LatLng coordinates4 = new LatLng(1.2990649, 103.77204895);
    private LatLng coordinates5 = new LatLng(1.29694114, 103.77531052);
    private LatLng coordinates6 = new LatLng(1.29447414, 103.77131939);
    private LatLng coordinates7 = new LatLng(1.29272578, 103.77487063);
    private LatLng coordinates8 = new LatLng(1.2938413, 103.77846479);
    private LatLng coordinates9 = new LatLng(1.29167462, 103.78122211);
    private LatLng coordinates10 = new LatLng(1.29445268, 103.78314257);
    private LatLng coordinates11 = new LatLng(1.30603684, 103.7729609);
    GoogleMap map;

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
                        startActivityForResult(i, 0);
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

        return POIListByArea;
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


        constructPolygonsAndMarkers();

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

        marker1 = map.addMarker(new MarkerOptions()
                .position(coordinates1)
                .title("Area 1")
                .snippet("Faculty of Science - Faculty of Dentistry - Yong Loo Lin School of Medicine")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));
        marker2 = map.addMarker(new MarkerOptions()
                .position(coordinates2)
                .title("Area 2")
                .snippet("Sports & Recreation Centre - University Health Centre - NUS Field")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));
        marker3 = map.addMarker(new MarkerOptions()
                .position(coordinates3)
                .title("Area 3")
                .snippet("University Cultural Centre - Yong Siew Toh Conservatory of Music - Lee Kong Chian Natural History Museum")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));
        marker4 = map.addMarker(new MarkerOptions()
                .position(coordinates4)
                .title("Area 4")
                .snippet("Faculty of Engineering - School of Design and Environment - Computer Centre - Raffles Hall")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));
        marker5 = map.addMarker(new MarkerOptions()
                .position(coordinates5)
                .title("Area 5")
                .snippet("University Hall - Yusof Ishak House - Central Library - Ridge View Residence")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));
        marker6 = map.addMarker(new MarkerOptions()
                .position(coordinates6)
                .title("Area 6")
                .snippet("Faculty of Arts & Social Sciences - School of Computing - Temasek Hall - Eusoff Hall")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));
        marker7 = map.addMarker(new MarkerOptions()
                .position(coordinates7)
                .title("Area 7")
                .snippet("NUS Business School - Heng Mui Keng Terrace")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));
        marker8 = map.addMarker(new MarkerOptions()
                .position(coordinates8)
                .title("Area 8")
                .snippet("NUS Enterprise Incubator")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));
        marker9 = map.addMarker(new MarkerOptions()
                .position(coordinates9)
                .title("Area 9")
                .snippet("Prince George's Park Residence - King Edward VII Hall - ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));
        marker10 = map.addMarker(new MarkerOptions()
                .position(coordinates10)
                .title("Area 10")
                .snippet("NUH")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));
        marker11 = map.addMarker(new MarkerOptions()
                .position(coordinates11)
                .title("Area 11")
                .snippet("UTown")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school)));


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
                if (info == null || info.isEmpty()) {
                    map.addMarker(new MarkerOptions()
                    .position(latLng)
                    .title(name))
                    .showInfoWindow();
                } else {
                    map.addMarker(new MarkerOptions()
                            .position(latLng)
                            .title(name)
                            .snippet(info))
                            .showInfoWindow();
                }

                map.animateCamera(CameraUpdateFactory.newLatLng(latLng));

            }
        }

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

    @Override
    public boolean onMarkerClick(Marker marker) {

        if (marker.equals(marker1)) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates1, 12));
        } else if (marker.equals(marker2)) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates2, 12));
        } else if (marker.equals(marker3)) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates3, 12));
        } else if (marker.equals(marker4)) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates4, 12));
        } else if (marker.equals(marker5)) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates5, 12));
        } else if (marker.equals(marker6)) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates6, 12));
        } else if (marker.equals(marker7)) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates7, 12));
        } else if (marker.equals(marker8)) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates8, 12));
        } else if (marker.equals(marker9)) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates9, 12));
        } else if (marker.equals(marker10)) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates10, 12));
        } else if (marker.equals(marker11)) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates11, 12));
        }

        return false;
    }
}
