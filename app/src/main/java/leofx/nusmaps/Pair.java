package leofx.nusmaps;

import java.util.List;

/**
 * Created by leona_000 on 28/6/2015.
 */
public class Pair {
    public String groupName;
    public List<PlaceOfInterestInfo> childList;

    public Pair(String name, List<PlaceOfInterestInfo> cList) {
        groupName = name;
        childList = cList;
    }
}