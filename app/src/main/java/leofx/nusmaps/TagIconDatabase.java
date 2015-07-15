package leofx.nusmaps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leona_000 on 30/6/2015.
 */

// Match up tags to marker icons, so locations with a specific tag will have a specific marker icon e.g. all bus stops can have an icon that resembles a bus or sth
public class TagIconDatabase {

    public Map<String, String> getTagIconMatching() {
        Map<String, String> tagIconMap = new HashMap<String, String>();
        tagIconMap.put("Admin","administration");
        tagIconMap.put("Busstop","busstop");
        tagIconMap.put("Cafe","restaurant_breakfast");
        tagIconMap.put("Canteen","cafeteria");
        tagIconMap.put("Cultural","shintoshrine");
        tagIconMap.put("Fast Food","fastfood");
        tagIconMap.put("Food Court","restaurant_korean");
        tagIconMap.put("General Stores","supermarket");
        tagIconMap.put("Kiosk","kiosk");
        tagIconMap.put("Lecture Theatre","theatre");
        tagIconMap.put("Library","library");
        tagIconMap.put("Recreation","tennis");
        tagIconMap.put("Research","museum_science");
        tagIconMap.put("Residence","hostel_0star");
        tagIconMap.put("Restaurant","restaurant");
        tagIconMap.put("School","school");

        return tagIconMap;
    }
}
