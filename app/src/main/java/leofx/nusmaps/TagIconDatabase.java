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
        tagIconMap.put("","");

        return tagIconMap;
    }
}
