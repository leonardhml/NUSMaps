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
            area1POIs.put("Dentistry", new PlaceOfInterestInfo("Dentistry", new LatLng(1.296886, 103.781890), ""));
            area1POIs.put("Integrative Sciences and Engineering", new PlaceOfInterestInfo("Integrative Sciences and Engineering", new LatLng(1.294424, 103.780917), "Centre for Life Sciences"));
            area1POIs.put("School of Medicine", new PlaceOfInterestInfo("School of Medicine", new LatLng(1.295958, 103.781314), "Centre for Translational Medicine"));
            area1POIs.put("Public Health", new PlaceOfInterestInfo("Public Health", new LatLng(1.295566, 103.780858), "MD3"));
            area1POIs.put("Faculty of Science", new PlaceOfInterestInfo("Faculty of Science", new LatLng(1.296127, 103.779364), ""));
            area1POIs.put("Cancer Science Institute of Singapore", new PlaceOfInterestInfo("Cancer Science Institute of Singapore", new LatLng(1.295233, 103.781543), "MD6"));
            area1POIs.put("Centre for Quantum Technologies", new PlaceOfInterestInfo("Centre for Quantum Technologies", new LatLng(1.297148, 103.780255), "S15"));
            area1POIs.put("Mechanobiology Institute", new PlaceOfInterestInfo("Mechanobiology Institute", new LatLng(1.299903, 103.772187), "T-Lab"));
            area1POIs.put("Centre for Remote Imaging, Sensing and Processing", new PlaceOfInterestInfo("Centre for Remote Imaging, Sensing and Processing", new LatLng(1.297735, 103.780511), "S17"));
            area1POIs.put("Global Asia Institute", new PlaceOfInterestInfo("Global Asia Institute", new LatLng(1.297735, 103.780511), "S17"));
            area1POIs.put("Life Sciences Institute", new PlaceOfInterestInfo("Life Sciences Institute", new LatLng(1.294507, 103.780602), "Centre for Life Sciences"));
            area1POIs.put("Singapore Institute for NeuroTechnology", new PlaceOfInterestInfo("Singapore Institute for NeuroTechnology", new LatLng(1.294503, 103.780483), "Centre for Life Sciences"));
            area1POIs.put("Alice Lee Centre for Nursing Studies", new PlaceOfInterestInfo("Alice Lee Centre for Nursing Studies", new LatLng(1.296508, 103.781955), "MD11"));
            area1POIs.put("National University Medical Institutes", new PlaceOfInterestInfo("National University Medical Institutes", new LatLng(1.295986, 103.781993), "MD11"));
            area1POIs.put("Singapore Institute for Clinical Sciences", new PlaceOfInterestInfo("Singapore Institute for Clinical Sciences", new LatLng(1.294667, 103.780385), "Centre for Life Sciences"));
            area1POIs.put("LT20", new PlaceOfInterestInfo("LT20", new LatLng(1.295857, 103.778914), ""));
            area1POIs.put("LT21", new PlaceOfInterestInfo("LT21", new LatLng(1.295396, 103.779606), ""));
            area1POIs.put("LT22", new PlaceOfInterestInfo("LT22", new LatLng(1.295885, 103.779738), ""));
            area1POIs.put("LT23", new PlaceOfInterestInfo("LT23", new LatLng(1.296383, 103.780024), ""));
            area1POIs.put("LT24", new PlaceOfInterestInfo("LT24", new LatLng(1.295821, 103.780619), ""));
            area1POIs.put("LT25", new PlaceOfInterestInfo("LT25", new LatLng(1.296157, 103.780652), ""));
            area1POIs.put("LT26", new PlaceOfInterestInfo("LT26", new LatLng(1.296476, 103.781096), ""));
            area1POIs.put("LT27", new PlaceOfInterestInfo("LT27", new LatLng(1.297015, 103.780882), "Lim Seng Tjoe Lecture Theatre"));
            area1POIs.put("LT28", new PlaceOfInterestInfo("LT28", new LatLng(1.297276, 103.781182), ""));
            area1POIs.put("LT29", new PlaceOfInterestInfo("LT29", new LatLng(1.297112, 103.781332), ""));
            area1POIs.put("LT31", new PlaceOfInterestInfo("LT31", new LatLng(1.296874, 103.780383), "Science Auditorium"));
            area1POIs.put("LT32", new PlaceOfInterestInfo("LT32", new LatLng(1.296141, 103.778327), ""));
            area1POIs.put("LT33", new PlaceOfInterestInfo("LT33", new LatLng(1.297796, 103.780878), ""));
            area1POIs.put("LT34", new PlaceOfInterestInfo("LT34", new LatLng(1.297809, 103.780643), ""));
            area1POIs.put("LT35", new PlaceOfInterestInfo("LT35", new LatLng(1.295481, 103.781994), "Peter and Mary Fu Lecture Theatre"));
            area1POIs.put("LT36", new PlaceOfInterestInfo("LT36", new LatLng(1.295278, 103.781887), "Alice and Peter Tan Lecture Theatre"));
            area1POIs.put("Food Fest", new PlaceOfInterestInfo("Food Fest", new LatLng(1.296717, 103.780274), ""));
            area1POIs.put("Just Acia", new PlaceOfInterestInfo("Just Acia", new LatLng(1.295530, 103.781745), "Centre for Translational Medicine"));
            area1POIs.put("Starbucks", new PlaceOfInterestInfo("Starbucks", new LatLng(1.296057, 103.781980), "MD11"));
            area1POIs.put("The Frontier", new PlaceOfInterestInfo("The Frontier", new LatLng(1.296668, 103.780556), ""));
            area1POIs.put("Subway Mobile Kiosk", new PlaceOfInterestInfo("Subway Mobile Kiosk", new LatLng(1.296107, 103.780588), ""));
            area1POIs.put("Dilys Creation", new PlaceOfInterestInfo("Dilys Creation", new LatLng(1.296802, 103.780730), ""));

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

            area3POIs.put("National University of Singapore", new PlaceOfInterestInfo("National University of Singapore", new LatLng(1.296643, 103.776394), ""));
            area3POIs.put("Yong Siew Toh Conservatory of Music", new PlaceOfInterestInfo("Yong Siew Toh Conservatory of Music", new LatLng(1.302272, 103.77290726), ""));
            area3POIs.put("Music Library", new PlaceOfInterestInfo("Music Library", new LatLng(1.30232563, 103.77248883), ""));
            area3POIs.put("NUS Museum/Museum NUS Centre for the Arts", new PlaceOfInterestInfo("NUS Museum/Museum NUS Centre for the Arts", new LatLng(1.3018939, 103.77245128), ""));
            area3POIs.put("University Cultural Centre Theatre", new PlaceOfInterestInfo("University Cultural Centre Theatre", new LatLng(1.30174106, 103.77226621), ""));
            area3POIs.put("Alcove@UCC (restaurant)", new PlaceOfInterestInfo("Alcove@UCC (restaurant)", new LatLng(1.3019663, 103.77263904), "Tucked away in a peaceful corner of the UCC and located next to the Yong Siew Toh Conservatory of Music, Alcove. Asian Restaurant. Bar offers visitors a variety of Chinese cuisine for a quick pre-show meal or a cosy gathering. All NUS staff and students enjoy a 10% discount when they present their staff or student card.Open Mondays to Sundays from 11am to 10pm. For more info, please contact (65) 6777 0050 (tel)."));
            area3POIs.put("Dome@UCC (cafe)", new PlaceOfInterestInfo("Dome@UCC (cafe)", new LatLng(1.30200653, 103.77169624), "Located at the UCC Main Foyer, Dome @ University Cultural Centre offers NUS community and visitors alike a restful spot for food and beverage on campus. All NUS staff and students enjoy a 10% discount when they present their staff or student card. Open Mondays to Fridays and eves of public holidays from 8.30 am to 5.30pm, the café is closed on weekends and public holidays. The café is also open on event days at UCC. For more info, please contact (65) 6778 3641 (tel) or www.dome.sg."));
            area3POIs.put("Lee Kong Chian Natural History Museum", new PlaceOfInterestInfo("Lee Kong Chian Natural History Museum", new LatLng(1.30155603, 103.77365693), ""));
            area3POIs.put("Busstop: Museum", new PlaceOfInterestInfo("Busstop: Museum", new LatLng(1.30114844, 103.77354696), "A2, B, C, BTC1, D1, D2, 151"));

            return area3POIs;
        }
    }

    public static class Area4 {
        private static Map<String, PlaceOfInterestInfo> area4POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea4POIs() {

            area4POIs.put("Busstop: Block E3A", new PlaceOfInterestInfo("Busstop: Block E3A", new LatLng(1.300344, 103.771737), "B, C"));
            area4POIs.put("Busstop: Raffles Hall", new PlaceOfInterestInfo("Busstop: Raffles Hall", new LatLng(1.300984, 103.77272), "B, C, 96, 151"));
            area4POIs.put("Busstop: Opposite YIH", new PlaceOfInterestInfo("Busstop: Opposite YIH", new LatLng(1.298921, 103.774149), "A2, B, D1, 95, 96, 151"));
            area4POIs.put("Busstop: Computer Centre", new PlaceOfInterestInfo("Busstop: Computer Centre", new LatLng(1.297425, 103.772877), "A2, A2E, B, D1, 95, 96 & 151"));
            area4POIs.put("Busstop: The Japanese Primary School", new PlaceOfInterestInfo("Busstop: The Japanese Primary School", new LatLng(1.300678, 103.769935), "B, C, BTC1, 33, 183, 188"));
            area4POIs.put("Busstop: Opp Blk EA", new PlaceOfInterestInfo("Busstop: Opp Blk EA", new LatLng(1.300587, 103.770156), "B, C, BTC1, 33, 96, 183, 188"));
            area4POIs.put("Busstop: Fac of Architecture", new PlaceOfInterestInfo("Busstop: Fac of Architecture", new LatLng(1.297751, 103.769940), "33, 96, 183, 188, 188E"));
            area4POIs.put("Busstop: Tentera Diraja Mque", new PlaceOfInterestInfo("Busstop: Tentera Diraja Mque", new LatLng(1.297841, 103.769646), "33, 183, 188"));
            area4POIs.put("Busstop: NUS Fac of Design and Env", new PlaceOfInterestInfo("Busstop: NUS Fac of Design and Env", new LatLng(1.296396, 103.770695), "95, 96, 151"));
            area4POIs.put("School of Design and Environment", new PlaceOfInterestInfo("School of Design and Environment", new LatLng(1.297374, 103.770520), ""));
            area4POIs.put("Faculty of Engineering", new PlaceOfInterestInfo("Faculty of Engineering", new LatLng(1.300087, 103.771121), ""));
            area4POIs.put("NUS Environmental Research Institute", new PlaceOfInterestInfo("NUS Environmental Research Institute", new LatLng(1.299867, 103.772131), "T-Lab"));
            area4POIs.put("NUS Nanoscience and Nanotechnology Initiative", new PlaceOfInterestInfo("NUS Nanoscience and Nanotechnology Initiative", new LatLng(1.299448, 103.771739), "E3"));
            area4POIs.put("Solar Energy Research Institute of Singapore", new PlaceOfInterestInfo("Solar Energy Research Institute of Singapore", new LatLng(1.300349, 103.771472), "E3A"));
            area4POIs.put("Temasek Laboratories", new PlaceOfInterestInfo("Temasek Laboratories", new LatLng(1.299952, 103.772062), "T-Lab"));
            area4POIs.put("Centre for English Language and Communication", new PlaceOfInterestInfo("Centre for English Language and Communication", new LatLng(1.296987, 103.771451), "CELC"));
            area4POIs.put("Computer Centre", new PlaceOfInterestInfo("Computer Centre", new LatLng(1.297520, 103.772644), ""));
            area4POIs.put("Data Storage Institute", new PlaceOfInterestInfo("Data Storage Institute", new LatLng(1.299284, 103.773100), ""));
            area4POIs.put("Design Incubation Centre", new PlaceOfInterestInfo("Design Incubation Centre", new LatLng(1.297263, 103.771166), "SDE2"));
            area4POIs.put("Information Resource Centre", new PlaceOfInterestInfo("Information Resource Centre", new LatLng(1.297349, 103.770621), "SDE1"));
            area4POIs.put("Office of Professional Engineering and Executive Education", new PlaceOfInterestInfo("Office of Professional Engineering and Executive Education", new LatLng(1.298752, 103.771091), "E1"));
            area4POIs.put("Temasek Defence Systems Institute", new PlaceOfInterestInfo("Temasek Defence Systems Institute", new LatLng(1.298580, 103.771327), "E1"));
            area4POIs.put("Singapore -MIT Alliance", new PlaceOfInterestInfo("Singapore -MIT Alliance", new LatLng(1.298521, 103.772454), "E4"));
            area4POIs.put("Raffles Hall", new PlaceOfInterestInfo("Raffles Hall", new LatLng(1.299716, 103.773634), ""));
            area4POIs.put("LT1", new PlaceOfInterestInfo("LT1", new LatLng(1.299686, 103.771227), ""));
            area4POIs.put("LT2", new PlaceOfInterestInfo("LT2", new LatLng(1.299310, 103.771361), ""));
            area4POIs.put("LT5", new PlaceOfInterestInfo("LT5", new LatLng(1.298356, 103.771265), ""));
            area4POIs.put("LT6", new PlaceOfInterestInfo("LT6", new LatLng(1.298774, 103.772005), ""));
            area4POIs.put("LT7", new PlaceOfInterestInfo("LT7", new LatLng(1.300104, 103.771056), ""));
            area4POIs.put("LT7A", new PlaceOfInterestInfo("LT7A", new LatLng(1.300555, 103.770777), ""));
            area4POIs.put("Engineering Auditorium", new PlaceOfInterestInfo("Engineering Auditorium", new LatLng(1.300641, 103.770560), ""));
            area4POIs.put("Foodgle Hub", new PlaceOfInterestInfo("Foodgle Hub", new LatLng(1.299469, 103.771122), ""));
            area4POIs.put("Good News Cafe", new PlaceOfInterestInfo("Good News Cafe", new LatLng(1.299994, 103.770854), ""));
            area4POIs.put("McDonald's", new PlaceOfInterestInfo("McDonald's", new LatLng(1.298113, 103.771533), ""));
            area4POIs.put("Subway Mobile Kiosk", new PlaceOfInterestInfo("Subway Mobile Kiosk", new LatLng(1.298429, 103.772313), ""));
            area4POIs.put("Dilys Creation", new PlaceOfInterestInfo("Dilys Creation", new LatLng(1.298429, 103.772431), ""));

            return area4POIs;
        }
    }

    public static class Area5 {
        private static Map<String, PlaceOfInterestInfo> area5POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea5POIs() {

            area5POIs.put("Busstop: Yusof Ishak House", new PlaceOfInterestInfo("Busstop: Yusof Ishak House", new LatLng(1.298846, 103.774369), "A1, B, D1, BTC1, 95, 151"));
            area5POIs.put("Busstop: Central Library", new PlaceOfInterestInfo("Busstop: Central Library", new LatLng(1.296535, 103.772636), "A1, A1E, B, D1, BTC1, CLB-UT Direct, 95 & 151"));
            area5POIs.put("Busstop: Opp UHC", new PlaceOfInterestInfo("Busstop: Opp UHC", new LatLng(1.298789, 103.775661), "A1, C, D2, 95"));
            area5POIs.put("Tropical Marine Science Institute", new PlaceOfInterestInfo("Tropical Marine Science Institute", new LatLng(1.297477, 103.774674), "S2S"));
            area5POIs.put("Singapore Synchrotron Light Source", new PlaceOfInterestInfo("Singapore Synchrotron Light Source", new LatLng(1.295548, 103.775164), ""));
            area5POIs.put("Centre for Development of Teaching and LEarning", new PlaceOfInterestInfo("Centre for Development of Teaching and LEarning", new LatLng(1.297072, 103.773863), "Central Library Annexe"));
            area5POIs.put("Centre for Instructional Technology", new PlaceOfInterestInfo("Centre for Instructional Technology", new LatLng(1.297137, 103.773742), "Computer Centre House 11/Central Library Annexe"));
            area5POIs.put("Investment Office", new PlaceOfInterestInfo("Investment Office", new LatLng(1.297219, 103.777863), "University Hall"));
            area5POIs.put("NUS(Suzhou) Research Institure Liaison Office", new PlaceOfInterestInfo("NUS(Suzhou) Research Institure Liaison Office", new LatLng(1.296933, 103.777869), "University Hall"));
            area5POIs.put("Office of Corporate Relations", new PlaceOfInterestInfo("Office of Corporate Relations", new LatLng(1.297132, 103.777734), "University Hall"));
            area5POIs.put("Office of the Deputy President (Admin/Research and Technology)", new PlaceOfInterestInfo("Office of the Deputy President (Admin/Research and Technology)", new LatLng(1.297148, 103.778024), "University Hall"));
            area5POIs.put("Office of Financial Services", new PlaceOfInterestInfo("Office of Financial Services", new LatLng(1.296794, 103.777922), "University Hall"));
            area5POIs.put("Office of Human Resources", new PlaceOfInterestInfo("Office of Human Resources", new LatLng(1.297008, 103.777493), "University Hall"));
            area5POIs.put("Office of Internal Audit", new PlaceOfInterestInfo("Office of Internal Audit", new LatLng(1.297266, 103.777890), "University Hall"));
            area5POIs.put("Office of Legal Affairs", new PlaceOfInterestInfo("Office of Legal Affairs", new LatLng(1.297212, 103.777552), "University Hall"));
            area5POIs.put("Office of the President", new PlaceOfInterestInfo("Office of the President", new LatLng(1.297480, 103.777665), "University Hall"));
            area5POIs.put("Office of the Provost", new PlaceOfInterestInfo("Office of the Provost", new LatLng(1.296890, 103.777633), "University Hall"));
            area5POIs.put("Office of Quality Management", new PlaceOfInterestInfo("Office of Quality Management", new LatLng(1.297089, 103.778019), "University Hall"));
            area5POIs.put("Office of Resource Planning", new PlaceOfInterestInfo("Office of Resource Planning", new LatLng(1.296789, 103.778019), "University Hall"));
            area5POIs.put("Office of Risk Management", new PlaceOfInterestInfo("Office of Risk Management", new LatLng(1.297014, 103.777332), "University Hall"));
            area5POIs.put("Office of the Vice President", new PlaceOfInterestInfo("Office of the Vice President", new LatLng(1.297051, 103.777976), "University Hall"));
            area5POIs.put("Registrar's Office", new PlaceOfInterestInfo("Registrar's Office", new LatLng(1.297202, 103.777498), "University Hall"));
            area5POIs.put("Spinelli", new PlaceOfInterestInfo("Spinelli", new LatLng(1.297110, 103.777767), "University Hall"));
            area5POIs.put("Office of Student Affairs", new PlaceOfInterestInfo("Office of Student Affairs", new LatLng(1.298567, 103.774518), "YIH"));
            area5POIs.put("Student Services Centre", new PlaceOfInterestInfo("Student Services Centre", new LatLng(1.298726, 103.774780), "YIH"));
            area5POIs.put("Ridge View Residences", new PlaceOfInterestInfo("Ridge View Residences", new LatLng(1.298226, 103.776418), ""));
            area5POIs.put("LT3", new PlaceOfInterestInfo("LT3", new LatLng(1.297653, 103.773287), ""));
            area5POIs.put("LT4", new PlaceOfInterestInfo("LT4", new LatLng(1.297535, 103.773539), ""));
            area5POIs.put("Eskimo Cafe", new PlaceOfInterestInfo("Eskimo Cafe", new LatLng(1.296770, 103.773773), ""));
            area5POIs.put("Starbucks", new PlaceOfInterestInfo("Starbucks", new LatLng(1.298290, 103.774456), ""));
            area5POIs.put("Food Junction", new PlaceOfInterestInfo("Food Junction", new LatLng(1.298509, 103.774559), ""));
            area5POIs.put("Subway", new PlaceOfInterestInfo("Subway", new LatLng(1.298525, 103.774349), ""));
            area5POIs.put("7-Eleven", new PlaceOfInterestInfo("7-Eleven", new LatLng(1.298557, 103.774427), ""));
            area5POIs.put("Old Change Kee", new PlaceOfInterestInfo("Old Change Kee", new LatLng(1.298520, 103.774502), ""));
            area5POIs.put("Sarpino's Express", new PlaceOfInterestInfo("Sarpino's Express", new LatLng(1.298599, 103.774500), ""));

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
            area6POIs.put("Arts and Social Sciences", new PlaceOfInterestInfo("Arts and Social Sciences", new LatLng(1.294784, 103.771646), ""));
            area6POIs.put("School of Computing", new PlaceOfInterestInfo("School of Computing", new LatLng(1.294829, 103.773631), ""));
            area6POIs.put("Association of Pacific Rim Universities", new PlaceOfInterestInfo("Association of Pacific Rim Universities", new LatLng(1.293262, 103.773707), "Shaw Foundation Alumni House"));
            area6POIs.put("Centre for Language Studies", new PlaceOfInterestInfo("Centre for Language Studies", new LatLng(1.294737, 103.772234), "AS4"));
            area6POIs.put("Development Office", new PlaceOfInterestInfo("Development Office", new LatLng(1.293275, 103.773807), "Shaw Foundation Alumni House"));
            area6POIs.put("Information Technology Unit", new PlaceOfInterestInfo("Information Technology Unit", new LatLng(1.293685, 103.774226), "COM2"));
            area6POIs.put("International Relations Office", new PlaceOfInterestInfo("International Relations Office", new LatLng(1.293320, 103.773757), "Shaw Foundation Alumni House"));
            area6POIs.put("Office of Alumni Relations", new PlaceOfInterestInfo("Office of Alumni Relations", new LatLng(1.294397, 103.771016), "Shaw Foundation Alumni House"));
            area6POIs.put("NUS Publishing", new PlaceOfInterestInfo("NUS Publishing", new LatLng(1.294830, 103.771031), "AS3"));
            area6POIs.put("Office of Campus Amenities", new PlaceOfInterestInfo("Office of Campus Amenities", new LatLng(1.295352, 103.770254), "Ventus"));
            area6POIs.put("Office of Environmental Sustainability", new PlaceOfInterestInfo("Office of Environmental Sustainability", new LatLng(1.295296, 103.770351), "Ventus"));
            area6POIs.put("Office of Facilities Management", new PlaceOfInterestInfo("Office of Facilities Management", new LatLng(1.295470, 103.770431), "Ventus"));
            area6POIs.put("Office of Estate Development", new PlaceOfInterestInfo("Office of Estate Development", new LatLng(1.295457, 103.770102), "Ventus"));
            area6POIs.put("Office of Safety, Health and Environment", new PlaceOfInterestInfo("Office of Safety, Health and Environment", new LatLng(1.295285, 103.770222), "Ventus"));
            area6POIs.put("Office of the Vice President (Campus Infrastructure)", new PlaceOfInterestInfo("Office of the Vice President (Campus Infrastructure)", new LatLng(1.295073, 103.770069), "Ventus"));
            area6POIs.put("Cafe@Ventus", new PlaceOfInterestInfo("Cafe@Ventus", new LatLng(1.295451, 103.770211), "Ventus"));
            area6POIs.put("Eusoff Hall", new PlaceOfInterestInfo("Eusoff Hall", new LatLng(1.293493, 103.770437), ""));
            area6POIs.put("Temasek Hall", new PlaceOfInterestInfo("Temasek Hall", new LatLng(1.292557, 103.771808), ""));
            area6POIs.put("LT8", new PlaceOfInterestInfo("LT8", new LatLng(1.294151, 103.772054), ""));
            area6POIs.put("LT9", new PlaceOfInterestInfo("LT9", new LatLng(1.294956, 103.772349), ""));
            area6POIs.put("LT10", new PlaceOfInterestInfo("LT10", new LatLng(1.294848, 103.772167), ""));
            area6POIs.put("LT11", new PlaceOfInterestInfo("LT11", new LatLng(1.295444, 103.771400), ""));
            area6POIs.put("LT12", new PlaceOfInterestInfo("LT12", new LatLng(1.295095, 103.771137), ""));
            area6POIs.put("LT13", new PlaceOfInterestInfo("LT13", new LatLng(1.295074, 103.770928), ""));
            area6POIs.put("LT14", new PlaceOfInterestInfo("LT14", new LatLng(1.295739, 103.773385), ""));
            area6POIs.put("LT15", new PlaceOfInterestInfo("LT15", new LatLng(1.295572, 103.773492), ""));
            area6POIs.put("LT16", new PlaceOfInterestInfo("LT16", new LatLng(1.294234, 103.774102), ""));
            area6POIs.put("LT17", new PlaceOfInterestInfo("LT17", new LatLng(1.294044, 103.774204), ""));
            area6POIs.put("Humble Origins", new PlaceOfInterestInfo("Humble Origins", new LatLng(1.295229, 103.771178), ""));
            area6POIs.put("The Deck", new PlaceOfInterestInfo("The Deck", new LatLng(1.294711, 103.772413), ""));
            area6POIs.put("Liang Ban Kung Fu", new PlaceOfInterestInfo("Liang Ban Kung Fu", new LatLng(1.294762, 103.772584), ""));
            area6POIs.put("Indonesian Express", new PlaceOfInterestInfo("Indonesian Express", new LatLng(1.294654, 103.772576), ""));
            area6POIs.put("Sapore Italiano", new PlaceOfInterestInfo("Sapore Italiano", new LatLng(1.294724, 103.772362), ""));
            area6POIs.put("The University Club", new PlaceOfInterestInfo("The University Club", new LatLng(1.293742, 103.773292), ""));

            return area6POIs;
        }
    }

    public static class Area7 {
        private static Map<String, PlaceOfInterestInfo> area7POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea7POIs() {

            area7POIs.put("Busstop: Opp Hon Sui Sen Memorial Lib", new PlaceOfInterestInfo("Busstop: Opp Hon Sui Sen Memorial Lib", new LatLng(1.293173, 103.775200), "A2, A2E, D1"));
            area7POIs.put("Busstop: BIZ2", new PlaceOfInterestInfo("Busstop: BIZ2", new LatLng(1.293489, 103.775125), "A1, A1E, D1, BTC1"));
            area7POIs.put("Business", new PlaceOfInterestInfo("Business", new LatLng(1.293808, 103.774597), ""));
            area7POIs.put("Energy Studies Institute", new PlaceOfInterestInfo("Energy Studies Institute", new LatLng(1.290625, 103.777430), "Block A, 29 Heng Mui Keng Terrace"));
            area7POIs.put("Institute for Real Estate Studies", new PlaceOfInterestInfo("Institute for Real Estate Studies", new LatLng(1.292328, 103.775705), "I3"));
            area7POIs.put("Institute of Southeast Asian Studies", new PlaceOfInterestInfo("Institute of Southeast Asian Studies", new LatLng(1.291376, 103.776670), "Block A, 29 Heng Mui Keng Terrace"));
            area7POIs.put("Interactive and Digital Media Institute", new PlaceOfInterestInfo("Interactive and Digital Media Institute", new LatLng(1.292390, 103.775648), "I3"));
            area7POIs.put("Middle East Institute", new PlaceOfInterestInfo("Middle East Institute", new LatLng(1.290743, 103.777396), "Block A, 29 Heng Mui Keng Terrace"));
            area7POIs.put("Risk Management Institute", new PlaceOfInterestInfo("Risk Management Institute", new LatLng(1.292448, 103.775555), "I3"));
            area7POIs.put("Human Resource Management Unit", new PlaceOfInterestInfo("Human Resource Management Unit", new LatLng(1.292546, 103.774186), "Mochtar Riady Building"));
            area7POIs.put("Institute of Systems Science", new PlaceOfInterestInfo("Institute of Systems Science", new LatLng(1.292108, 103.776661), ""));
            area7POIs.put("NUS Enterprise", new PlaceOfInterestInfo("NUS Enterprise", new LatLng(1.292377, 103.775594), "I3"));
            area7POIs.put("NUS Entrepreneurship Centre", new PlaceOfInterestInfo("NUS Entrepreneurship Centre", new LatLng(1.292449, 103.775513), "I3"));
            area7POIs.put("NUS Industry Liaison Office", new PlaceOfInterestInfo("NUS Industry Liaison Office", new LatLng(1.292559, 103.775596), "I3"));
            area7POIs.put("NUS Overseas Colleges", new PlaceOfInterestInfo("NUS Overseas Colleges", new LatLng(1.292661, 103.775382), "I3"));
            area7POIs.put("NUS Technology Holdings", new PlaceOfInterestInfo("NUS Technology Holdings", new LatLng(1.292462, 103.775806), ""));
            area7POIs.put("Sheares Hall", new PlaceOfInterestInfo("Sheares Hall", new LatLng(1.291581, 103.775547), ""));
            area7POIs.put("Kent Ridge Hall", new PlaceOfInterestInfo("Kent Ridge Hall", new LatLng(1.291828, 103.774496), ""));
            area7POIs.put("LT18", new PlaceOfInterestInfo("LT18", new LatLng(1.294175, 103.774534), ""));
            area7POIs.put("LT19", new PlaceOfInterestInfo("LT19", new LatLng(1.294326, 103.774421), ""));
            area7POIs.put("Hon Sui Sen Auditorium", new PlaceOfInterestInfo("Hon Sui Sen Auditorium", new LatLng(1.293462, 103.775000), ""));
            area7POIs.put("Late Plate", new PlaceOfInterestInfo("Late Plate", new LatLng(1.292849, 103.773453), ""));
            area7POIs.put("Reedz Cafe", new PlaceOfInterestInfo("Reedz Cafe", new LatLng(1.292426, 103.774176), ""));
            area7POIs.put("The Terrace", new PlaceOfInterestInfo("The Terrace", new LatLng(1.294547, 103.774556), ""));

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
            area8POIs.put("Centre for Maritime Studies", new PlaceOfInterestInfo("Centre for Maritime Studies", new LatLng(1.293593, 103.776972), "12 Prince George's Park"));
            area8POIs.put("Institute for Mathematical Sciences", new PlaceOfInterestInfo("Institute for Mathematical Sciences", new LatLng(1.292666, 103.779694), "3&4 Prince George's Park"));
            area8POIs.put("Office of Campus Security", new PlaceOfInterestInfo("Office of Campus Security", new LatLng(1.292482, 103.779369), "Houses 17 & 18"));
            area8POIs.put("Temasek Life Sciences Laboratory", new PlaceOfInterestInfo("Temasek Life Sciences Laboratory", new LatLng(1.294326, 103.776778), ""));

            return area8POIs;
        }
    }

    public static class Area9 {
        private static Map<String, PlaceOfInterestInfo> area9POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea9POIs() {

            area9POIs.put("Busstop: PGP Terminal", new PlaceOfInterestInfo("Busstop: PGP Terminal", new LatLng(1.292341, 103.780093), "A1, A2, D2, BTC1"));
            area9POIs.put("Prince George's Park Residences", new PlaceOfInterestInfo("Prince George's Park Residences", new LatLng(1.290734, 103.780772), ""));
            area9POIs.put("King Edward VII Hall", new PlaceOfInterestInfo("King Edward VII Hall", new LatLng(1.292549, 103.780884), ""));

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
            area10POIs.put("Bioinformatics Centre", new PlaceOfInterestInfo("Bioinformatics Centre", new LatLng(1.293688, 103.781897), "Centre for Translational Medicine"));
            area10POIs.put("Dental Centre", new PlaceOfInterestInfo("Dental Centre", new LatLng(1.294715, 103.783269), "NUH"));

            return area10POIs;
        }
    }

    public static class Area11 {
        private static Map<String, PlaceOfInterestInfo> area11POIs = new HashMap<String, PlaceOfInterestInfo>();

        public static Map<String, PlaceOfInterestInfo> getArea11POIs() {

            area11POIs.put("Busstop: U-Town", new PlaceOfInterestInfo("Busstop: U-Town", new LatLng(1.303479, 103.774408), "D1, D2, UT-FOS Direct, UT-CLB Direct"));
            area11POIs.put("University Scholars Programme", new PlaceOfInterestInfo("University Scholars Programme", new LatLng(1.306751, 103.773426), "Cinnamon College"));
            area11POIs.put("Yale-NUS College", new PlaceOfInterestInfo("Yale-NUS College", new LatLng(1.307334, 103.772370), "Residential College 4"));
            area11POIs.put("Colege of Alice and Peter Tan Office", new PlaceOfInterestInfo("Colege of Alice and Peter Tan Office", new LatLng(1.307677, 103.773312), "CAP, U-Town"));
            area11POIs.put("Office of Admissions", new PlaceOfInterestInfo("Office of Admissions", new LatLng(1.304678, 103.772644), "Stephen Riady Building"));
            area11POIs.put("Office of Financial Aid", new PlaceOfInterestInfo("Office of Financial Aid", new LatLng(1.305214, 103.772129), "Stephen Riady Building"));
            area11POIs.put("University Town Management Centre", new PlaceOfInterestInfo("University Town Management Centre", new LatLng(1.305176, 103.772510), "Stephen Riady Building"));
            area11POIs.put("Visitors' Centre", new PlaceOfInterestInfo("Visitors' Centre", new LatLng(1.304318, 103.772869), "Stephen Riady Building"));
            area11POIs.put("Fortune Village", new PlaceOfInterestInfo("Fortune Village", new LatLng(1.305117, 103.772070), "Stephen Riady Building"));
            area11POIs.put("Flavors@UTown", new PlaceOfInterestInfo("Flavors@UTown", new LatLng(1.304828, 103.772746), "Stephen Riady Building"));
            area11POIs.put("Sakae Express", new PlaceOfInterestInfo("Sakae Express", new LatLng(1.305192, 103.772086), "Stephen Riady Building"));
            area11POIs.put("The Ice Cream Gallery", new PlaceOfInterestInfo("The Ice Cream Gallery", new LatLng(1.304914, 103.772370), "Stephen Riady Building"));
            area11POIs.put("Food Clique", new PlaceOfInterestInfo("Food Clique", new LatLng(1.304275, 103.772767), "Stephen Riady Building"));
            area11POIs.put("Tembusu College Office", new PlaceOfInterestInfo("Tembusu College Office", new LatLng(1.306349, 103.773858), "UTown"));
            area11POIs.put("Tembusu College", new PlaceOfInterestInfo("Tembusu College", new LatLng(1.306350, 103.773695), "UTown"));
            area11POIs.put("UTown Residence", new PlaceOfInterestInfo("UTown Residence", new LatLng(1.305213, 103.773766), "UTown"));
            area11POIs.put("College of Alice and Peter Tan", new PlaceOfInterestInfo("College of Alice and Peter Tan", new LatLng(1.307726, 103.773213), "UTown"));
            area11POIs.put("Cinnamon College (USP)", new PlaceOfInterestInfo("Cinnamon College (USP)", new LatLng(1.306560, 103.773632), "UTown"));
            area11POIs.put("Residential College 4", new PlaceOfInterestInfo("Residential College 4", new LatLng(1.308260, 103.773291), "UTown"));
            area11POIs.put("LT50", new PlaceOfInterestInfo("LT50", new LatLng(1.304353, 103.773144), ""));
            area11POIs.put("LT51", new PlaceOfInterestInfo("LT51", new LatLng(1.304283, 103.773080), ""));
            area11POIs.put("LT52", new PlaceOfInterestInfo("LT52", new LatLng(1.304197, 103.773021), ""));
            area11POIs.put("LT53", new PlaceOfInterestInfo("LT53", new LatLng(1.304079, 103.772962), ""));
            area11POIs.put("Ngee Ann Kongsi Auditorium", new PlaceOfInterestInfo("Ngee Ann Kongsi Auditorium", new LatLng(1.305644, 103.773237), ""));
            area11POIs.put("UTown Auditorium 1", new PlaceOfInterestInfo("UTown Auditorium 1", new LatLng(1.304177, 103.773350), ""));
            area11POIs.put("UTown Auditorium 2", new PlaceOfInterestInfo("UTown Auditorium 2", new LatLng(1.304276, 103.772932), ""));
            area11POIs.put("UTown Auditorium 3", new PlaceOfInterestInfo("UTown Auditorium 3", new LatLng(1.307365, 103.773148), ""));
            area11POIs.put("Starbucks", new PlaceOfInterestInfo("Starbucks", new LatLng(1.305566, 103.772970), ""));
            area11POIs.put("Koufu", new PlaceOfInterestInfo("Koufu", new LatLng(1.304671, 103.772892), ""));
            area11POIs.put("Subway", new PlaceOfInterestInfo("Subway", new LatLng(1.303942, 103.774003), ""));
            area11POIs.put("Cheers", new PlaceOfInterestInfo("Cheers", new LatLng(1.303810, 103.774008), ""));
            area11POIs.put("Hwang's Restaurant", new PlaceOfInterestInfo("Hwang's Restaurant", new LatLng(1.304036, 103.774322), ""));
            area11POIs.put("Sapore Italiano", new PlaceOfInterestInfo("Sapore Italiano", new LatLng(1.304280, 103.774207), ""));
            area11POIs.put("Spice Table by Pines", new PlaceOfInterestInfo("Spice Table by Pines", new LatLng(1.303823, 103.774330), ""));

            return area11POIs;
        }
    }

}
