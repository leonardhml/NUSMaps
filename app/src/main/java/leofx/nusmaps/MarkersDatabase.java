package leofx.nusmaps;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leona_000 on 28/6/2015.
 */
public class MarkersDatabase {

    public static class Area1 {
        private static Map<String, PlaceOfInterestInfo> area1POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea1POIs() {
            area1POIs.put("Busstop: LT29", new PlaceOfInterestInfo("Busstop: LT29", new LatLng(1.297417, 103.781160), "A1, A1E, C, D2, FOS-UT Direct, 95"));
            area1POIs.put("Busstop: Blk S17", new PlaceOfInterestInfo("Busstop: Blk S17", new LatLng(1.297517, 103.781321), "A2, A2E, C, D2, 95"));
            area1POIs.put("Busstop: University Hall", new PlaceOfInterestInfo("Busstop: University Hall", new LatLng(1.297332, 103.778479), "A1, C, D2, 95"));
            return area1POIs;
        }

    }

    public static class Area2 {
        private static Map<String, PlaceOfInterestInfo> area2POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea2POIs() {
            area2POIs.put("Singapore Wind Tunnel Facility", new PlaceOfInterestInfo("Singapore Wind Tunnel Facility", new LatLng(1.30104923, 103.7753119), ""));
            area2POIs.put("Sports & Recreation Centre", new PlaceOfInterestInfo("Sports & Recreation Centre", new LatLng(1.29991494, 103.7763231), ""));
            area2POIs.put("Multi-Purpose Sports Hall 1~4", new PlaceOfInterestInfo("Multi-Purpose Sports Hall 1~4", new LatLng(1.30081861, 103.7760146), ""));
            area2POIs.put("Multi-Purpose Sports Hall 5", new PlaceOfInterestInfo("Multi-Purpose Sports Hall 5", new LatLng(1.30040834, 103.7763177), ""));
            area2POIs.put("Multi-Purpose Sports Hall 6", new PlaceOfInterestInfo("Multi-Purpose Sports Hall 6", new LatLng(1.3002689, 103.7756418), ""));
            area2POIs.put("Pool@SRC", new PlaceOfInterestInfo("Pool@SRC", new LatLng(1.29981573, 103.7758564), ""));
            area2POIs.put("University Health Centre", new PlaceOfInterestInfo("University Health Centre", new LatLng(1.29913462,103.7764116 ), ""));
            area2POIs.put("Busstop: UHC/Kent Ridge Hall", new PlaceOfInterestInfo("Busstop: UHC/Kent Ridge Hall", new LatLng(1.2988772, 103.776264), "A2, C, D1, 95"));
            area2POIs.put("Sun Asian Bistro@SRC (Restaurant)", new PlaceOfInterestInfo("Sun Asian Bistro@SRC (Restaurant)", new LatLng(1.29914267, 103.7757732), ""));
            area2POIs.put("NUS Archery", new PlaceOfInterestInfo("NUS Archery", new LatLng(1.29977014, 103.7753414), ""));
            area2POIs.put("Multi-purpose Courts", new PlaceOfInterestInfo("Multi-purpose Courts", new LatLng(1.29980232, 103.7778921), ""));
            area2POIs.put("Basketball Courts", new PlaceOfInterestInfo("Basketball Courts", new LatLng(1.29988276, 103.7771706), ""));
            area2POIs.put("Archery Corner/Volleyball Courts", new PlaceOfInterestInfo("Archery Corner/Volleyball Courts", new LatLng(1.30035471, 103.7770204), ""));
            area2POIs.put("Sepak Takraw", new PlaceOfInterestInfo("Sepak Takraw", new LatLng(1.30060409,103.7769292), ""));
            area2POIs.put("Tennis Courts", new PlaceOfInterestInfo("Tennis Courts", new LatLng(1.29871899,103.7772565), ""));
            area2POIs.put("NUS Field/Football Field", new PlaceOfInterestInfo("NUS Field/Football Field", new LatLng(1.29876457,103.7782301), ""));
            area2POIs.put("Multi-purpose Field", new PlaceOfInterestInfo("Multi-purpose Field", new LatLng(1.29808883,103.7795846), ""));
            area2POIs.put("Busstop: Opp ITE Dover", new PlaceOfInterestInfo("Busstop: Opp ITE Dover", new LatLng(1.29939205,103.7792306), "97, 197, 198, 963"));
            area2POIs.put("Busstop: ITE Dover", new PlaceOfInterestInfo("Busstop: ITE Dover", new LatLng(1.30062018,103.7781657), "97, 197, 198, 963, 963E"));
            area2POIs.put("Busstop: Opp University Hall", new PlaceOfInterestInfo("Busstop: Opp University Hall", new LatLng(1.2976142,103.7779324), "A2, C, D2, 95"));
            return area2POIs;
        }
    }

    public static class Area3 {
        private static Map<String, PlaceOfInterestInfo> area3POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea3POIs() {
            area3POIs.put("National University of Singapore", new PlaceOfInterestInfo("National University of Singapore", new LatLng(1.296643,103.776394), ""));
            area3POIs.put("Yong Siew Toh Conservatory of Music", new PlaceOfInterestInfo("Yong Siew Toh Conservatory of Music", new LatLng(1.302272,103.7729073), ""));
            area3POIs.put("Music Library", new PlaceOfInterestInfo("Music Library", new LatLng(1.30232563,103.7724888), ""));
            area3POIs.put("NUS Museum/Museum NUS Centre for the Arts", new PlaceOfInterestInfo("NUS Museum/Museum NUS Centre for the Arts", new LatLng(1.3018939,103.7724513), ""));
            area3POIs.put("University Cultural Centre Theatre", new PlaceOfInterestInfo("University Cultural Centre Theatre", new LatLng(1.30174106,103.7722662), ""));
            area3POIs.put("Alcove@UCC (restaurant)", new PlaceOfInterestInfo("Alcove@UCC (restaurant)", new LatLng(1.3019663,103.772639), "\"Tucked away in a peaceful corner of the UCC and located next to the Yong Siew Toh Conservatory of Music, Alcove. Asian Restaurant. Bar offers visitors a variety of Chinese cuisine for a quick pre-show meal or a cosy gathering. All NUS staff and students enjoy a 10% discount when they present their staff or student card.\n" +
                    "\n" +
                    "Open Mondays to Sundays from 11am to 10pm. For more info, please contact (65) 6777 0050 (tel).\""));
            area3POIs.put("Dome@UCC (cafe)", new PlaceOfInterestInfo("Dome@UCC (cafe)", new LatLng(1.30200653,103.7716962), "\"Located at the UCC Main Foyer, Dome @ University Cultural Centre offers NUS community and visitors alike a restful spot for food and beverage on campus. All NUS staff and students enjoy a 10% discount when they present their staff or student card.\n" +
                    "\n" +
                    "Open Mondays to Fridays and eves of public holidays from 8.30 am to 5.30pm, the café is closed on weekends and public holidays. The café is also open on event days at UCC. For more info, please contact (65) 6778 3641 (tel) or www.dome.sg.\""));
            area3POIs.put("Lee Kong Chian Natural History Museum", new PlaceOfInterestInfo("Lee Kong Chian Natural History Museum", new LatLng(1.30155603,103.7736569), ""));
            area3POIs.put("Busstop: Museum", new PlaceOfInterestInfo("Busstop: Museum", new LatLng(1.30114844, 103.773547), "A2, B, C, BTC1, D1, D2, 151"));
            return area3POIs;
        }
    }

    public static class Area4 {
        private static Map<String, PlaceOfInterestInfo> area4POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea4POIs() {
            area4POIs.put("Busstop: Block E3A", new PlaceOfInterestInfo("Busstop: Block E3A", new LatLng(1.300344,103.771737), "B, C"));
            area4POIs.put("Busstop: Raffles Hall", new PlaceOfInterestInfo("Busstop: Raffles Hall", new LatLng(1.300984,103.77272), "B, C, 96, 151"));
            area4POIs.put("Busstop: Opposite YIH", new PlaceOfInterestInfo("Busstop: Opposite YIH", new LatLng(1.298921, 103.774149), "A2, B, D1, 95, 96, 151"));
            area4POIs.put("Busstop: Computer Centre", new PlaceOfInterestInfo("Busstop: Computer Centre", new LatLng(1.297425, 103.772877), "A2, A2E, B, D1, 95, 96, 151"));
            area4POIs.put("Busstop: The Japanese Primary School", new PlaceOfInterestInfo("Busstop: The Japanese Primary School", new LatLng(1.300678, 103.769935), "B, C, BTC1, 33, 183, 188"));
            area4POIs.put("Busstop: Opp Blk EA", new PlaceOfInterestInfo("Busstop: Opp Blk EA", new LatLng(1.300587, 103.770156), "B, C, BTC1, 33, 96, 183, 188"));
            area4POIs.put("Busstop: Fac of Architecture", new PlaceOfInterestInfo("Busstop: Fac of Architecture", new LatLng(1.297751, 103.769940), "33, 96, 183, 188, 188E"));
            area4POIs.put("Busstop: Tentera Diraja Mque", new PlaceOfInterestInfo("Busstop: Tentera Diraja Mque", new LatLng(1.297841, 103.769646), "33, 183, 188"));
            area4POIs.put("Busstop: NUS Fac of Design and Env", new PlaceOfInterestInfo("Busstop: NUS Fac of Design and Env", new LatLng(1.296396, 103.770695), "95, 96, 151"));
            return area4POIs;
        }
    }

    public static class Area5 {
        private static Map<String, PlaceOfInterestInfo> area5POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea5POIs() {
            area5POIs.put("Busstop: Yusof Ishak House", new PlaceOfInterestInfo("Busstop: Yusof Ishak House", new LatLng(1.298846, 103.774369), "A1, B, D1, BTC1, 95, 151"));
            area5POIs.put("Busstop: Central Library", new PlaceOfInterestInfo("Busstop: Central Library", new LatLng(1.296535, 103.772636), "A1, A1E, B, D1, BTC1, CLB-UT Direct, 95 & 151"));
            area5POIs.put("Busstop: Opp UHC", new PlaceOfInterestInfo("Busstop: Opp UHC", new LatLng(1.298789, 103.775661), "A1, C, D2, 95"));
            return area5POIs;
        }
    }

    public static class Area6 {
        private static Map<String, PlaceOfInterestInfo> area6POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea6POIs() {
            area6POIs.put("Busstop: LT13", new PlaceOfInterestInfo("Busstop: LT13", new LatLng(1.294907, 103.770850), "A1, B, D1, BTC1"));
            area6POIs.put("Busstop: Ventus", new PlaceOfInterestInfo("Busstop: Ventus", new LatLng(1.295401, 103.770630), "A2, B, D1"));
            area6POIs.put("Busstop: Eusoff Hall", new PlaceOfInterestInfo("Busstop: Eusoff Hall", new LatLng(1.293915, 103.770466), "A2, B"));
            area6POIs.put("Busstop: Temasek Hall", new PlaceOfInterestInfo("Busstop: Temasek Hall", new LatLng(1.293055, 103.771793), "A2, B"));
            area6POIs.put("Busstop: AS7", new PlaceOfInterestInfo("Busstop: AS7", new LatLng(1.293706, 103.772088), "A1, B, D1, BTC1"));
            area6POIs.put("Busstop: COM2", new PlaceOfInterestInfo("Busstop: COM2", new LatLng(1.294347, 103.773816), "A1, A2, B, D1"));
            area6POIs.put("Busstop: OPP NUS Fac of Architect", new PlaceOfInterestInfo("Busstop: OPP NUS Fac of Architect", new LatLng(1.296169, 103.770346), "95, 151, 151e"));
            area6POIs.put("Busstop: Bef Kent Ridge Ter", new PlaceOfInterestInfo("Busstop: Bef Kent Ridge Ter", new LatLng(1.295360, 103.769744), "183, 188, 188E"));
            area6POIs.put("Busstop: Opp Kent Ridge Ter", new PlaceOfInterestInfo("Busstop: Opp Kent Ridge Ter", new LatLng(1.294856, 103.769355), "33, 183, 188"));
            return area6POIs;
        }
    }

    public static class Area7 {
        private static Map<String, PlaceOfInterestInfo> area7POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea7POIs() {
            area7POIs.put("Busstop: Opp Hon Sui Sen Memorial Lib", new PlaceOfInterestInfo("Busstop: Opp Hon Sui Sen Memorial Lib", new LatLng(1.293173, 103.775200), "A2, A2E, D1"));
            area7POIs.put("Busstop: BIZ2", new PlaceOfInterestInfo("Busstop: BIZ2", new LatLng(1.293489, 103.775125), "A1, A1E, D1, BTC1"));
            return area7POIs;
        }
    }

    public static class Area8 {
        private static Map<String, PlaceOfInterestInfo> area8POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea8POIs() {
            area8POIs.put("Busstop: House 12", new PlaceOfInterestInfo("Busstop: House 12", new LatLng(1.293508, 103.777088), "A2"));
            area8POIs.put("Busstop: Opp House 12", new PlaceOfInterestInfo("Busstop: Opp House 12", new LatLng(1.293698, 103.777074), "A1"));
            area8POIs.put("Busstop: Between Houses 14 & 15", new PlaceOfInterestInfo("Busstop: Between Houses 14 & 15", new LatLng(1.293056, 103.777930), "A2"));
            area8POIs.put("Busstop: House 7", new PlaceOfInterestInfo("Busstop: House 7", new LatLng(1.293252, 103.777752), "A1"));
            return area8POIs;
        }
    }

    public static class Area9 {
        private static Map<String, PlaceOfInterestInfo> area9POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea9POIs() {
            area9POIs.put("Busstop: PGP Terminal", new PlaceOfInterestInfo("Busstop: PGP Terminal", new LatLng(1.292341, 103.780093), "A1, A2, D2, BTC1"));
            return area9POIs;
        }
    }

    public static class Area10 {
        private static Map<String, PlaceOfInterestInfo> area10POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea10POIs() {
            area10POIs.put("Busstop: Kent Ridge MRT Station", new PlaceOfInterestInfo("Busstop: Kent Ridge MRT Station", new LatLng(1.293667, 103.784895), "A1, A1E, D2, 95"));
            area10POIs.put("Busstop: Opp Kent Ridge MRT Station", new PlaceOfInterestInfo("Busstop: Opp Kent Ridge MRT Station", new LatLng(1.293846, 103.785078), "A2, A2E, D2, 95"));
            area10POIs.put("Busstop: NUH", new PlaceOfInterestInfo("Busstop: NUH", new LatLng(1.296377, 103.783423), "A1, 95"));
            area10POIs.put("Busstop: Opp NUH", new PlaceOfInterestInfo("Busstop: Opp NUH", new LatLng(1.296835, 103.783165), "A2, 95"));
            area10POIs.put("Busstop: After Sci Park Drive/ Kent Ridge Stn", new PlaceOfInterestInfo("Busstop: After Sci Park Drive/ Kent Ridge Stn", new LatLng(1.292521, 103.784459), "A1, 92, 200"));
            area10POIs.put("Busstop: Opp Kent Ridge Stn", new PlaceOfInterestInfo("Busstop: Opp Kent Ridge Stn", new LatLng(1.292386, 103.784564), "92, 200"));
            return area10POIs;
        }
    }

    public static class Area11 {
        private static Map<String, PlaceOfInterestInfo> area11POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea11POIs() {
            area11POIs.put("Busstop: U-Town", new PlaceOfInterestInfo("Busstop: U-Town", new LatLng(1.303476, 103.774420), "D1, D2, UT-FOS Direct, UT-CLB Direct"));
            return area11POIs;
        }
    }

}
