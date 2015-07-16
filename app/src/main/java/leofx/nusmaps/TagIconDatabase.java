package leofx.nusmaps;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leona_000 on 30/6/2015.
 */

// Match up tags to marker icons, so locations with a specific tag will have a specific marker icon e.g. all bus stops can have an icon that resembles a bus or sth
public class TagIconDatabase {

    public static Map<String, BitmapDescriptor> getTagIconMatching() {
        Map<String, BitmapDescriptor> tagIconMap = new HashMap<String, BitmapDescriptor>();
        tagIconMap.put("Admin", BitmapDescriptorFactory.fromResource(R.drawable.administration));
        tagIconMap.put("Busstop",BitmapDescriptorFactory.fromResource(R.drawable.busstop));
        tagIconMap.put("Cafe",BitmapDescriptorFactory.fromResource(R.drawable.restaurant_breakfast));
        tagIconMap.put("Canteen",BitmapDescriptorFactory.fromResource(R.drawable.cafetaria));
        tagIconMap.put("Cultural",BitmapDescriptorFactory.fromResource(R.drawable.shintoshrine));
        tagIconMap.put("Fast Food", BitmapDescriptorFactory.fromResource(R.drawable.fastfood));
        tagIconMap.put("Food Court",BitmapDescriptorFactory.fromResource(R.drawable.restaurant_korean));
        tagIconMap.put("General Stores",BitmapDescriptorFactory.fromResource(R.drawable.supermarket));
        tagIconMap.put("Kiosk",BitmapDescriptorFactory.fromResource(R.drawable.kiosk));
        tagIconMap.put("Lecture Theatre", BitmapDescriptorFactory.fromResource(R.drawable.theater));
        tagIconMap.put("Library", BitmapDescriptorFactory.fromResource(R.drawable.library));
        tagIconMap.put("Recreation",BitmapDescriptorFactory.fromResource(R.drawable.tennis));
        tagIconMap.put("Research", BitmapDescriptorFactory.fromResource(R.drawable.museum_science));
        tagIconMap.put("Residence",BitmapDescriptorFactory.fromResource(R.drawable.hostel_0star));
        tagIconMap.put("Restaurant", BitmapDescriptorFactory.fromResource(R.drawable.restaurant));
        tagIconMap.put("School", BitmapDescriptorFactory.fromResource(R.drawable.school));

        return tagIconMap;
    }
}
