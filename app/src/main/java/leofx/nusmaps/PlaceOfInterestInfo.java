package leofx.nusmaps;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by HFX on 27/6/15.
 */
public class PlaceOfInterestInfo {

    public String name;
    public LatLng coordinates;
    public String info;

    public PlaceOfInterestInfo(String name, LatLng coordinates, String info) {
        this.name = name;
        this.coordinates = coordinates;
        this.info = info;
    }
}
