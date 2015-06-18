package leofx.nusmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Stores all the locations to be found in the directory. Feel free to add in any locations or new categories you may want!
 */
public class DirectoryDatabase {

    public static HashMap<String, List<String>> getInfo() {
        HashMap<String, List<String>> data = new HashMap<String, List<String>>();

        List<String> FACULTY_LIST = new ArrayList<String>();
        List<String> CANTEEN_LIST = new ArrayList<String>();
        List<String> LIBRARY_LIST = new ArrayList<String>();

        FACULTY_LIST.add("Science");
        FACULTY_LIST.add("Medicine");
        FACULTY_LIST.add("Engineering");
        FACULTY_LIST.add("SoC");
        FACULTY_LIST.add("FASS");

        CANTEEN_LIST.add("Frontier");
        CANTEEN_LIST.add("Deck");
        CANTEEN_LIST.add("Terrace");
        CANTEEN_LIST.add("Reeds");
        CANTEEN_LIST.add("Flavours");

        LIBRARY_LIST.add("Sci Library");
        LIBRARY_LIST.add("Central Library");
        LIBRARY_LIST.add("Medicine Library");
        LIBRARY_LIST.add("UTown Library");

        data.put("Faculties", FACULTY_LIST);
        data.put("Canteens", CANTEEN_LIST);
        data.put("Libraries", LIBRARY_LIST);

        return data;

    }
}
