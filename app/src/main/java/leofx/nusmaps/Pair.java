package leofx.nusmaps;

import java.util.List;

/**
 * Created by leona_000 on 28/6/2015.
 */
public class Pair<E> {
    public String groupName;
    public List<E> childList;

    public Pair(String name, List<E> cList) {
        groupName = name;
        childList = cList;
    }
}