package leofx.nusmaps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leona_000 on 2/8/2015.
 */
public class Favourites {

    private List<String> favourites;

    public Favourites() {
        favourites = new ArrayList<String>();
    }

    public boolean addFavourites(String name) {
        favourites.add(name);
        return true;
    }

    public List<String> getFavourites() {
        return favourites;
    }

}
