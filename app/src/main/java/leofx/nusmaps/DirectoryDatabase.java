package leofx.nusmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Stores all the locations to be found in the directory. Feel free to add in any locations or new categories you may want!
 */
public class DirectoryDatabase {


    public static List<Pair> getInfo() {
        List<Pair> data = new ArrayList<Pair>();

        List<PlaceOfInterestInfo> admin = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> busstop = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> cafe = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> canteen = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> cultural = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> fastfood = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> foodcourt = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> generalstores = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> kiosk = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> lecturetheatre = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> library = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> recreation = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> research = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> residence = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> restaurant = new ArrayList<PlaceOfInterestInfo>();
        List<PlaceOfInterestInfo> school = new ArrayList<PlaceOfInterestInfo>();

        admin.add(MainScreen.POIListByArea.get(6).get("Association of Pacific Rim Universities"));
        admin.add(MainScreen.POIListByArea.get(11).get("Colege of Alice and Peter Tan Office"));
        admin.add(MainScreen.POIListByArea.get(4).get("Computer Centre"));
        admin.add(MainScreen.POIListByArea.get(6).get("Development Office"));
        admin.add(MainScreen.POIListByArea.get(6).get("International Relations Office"));
        admin.add(MainScreen.POIListByArea.get(5).get("Investment Office"));
        admin.add(MainScreen.POIListByArea.get(7).get("NUS Entrepreneurship Centre"));
        admin.add(MainScreen.POIListByArea.get(7).get("NUS Industry Liaison Office"));
        admin.add(MainScreen.POIListByArea.get(7).get("NUS Overseas Colleges"));
        admin.add(MainScreen.POIListByArea.get(6).get("NUS Publishing"));
        admin.add(MainScreen.POIListByArea.get(7).get("NUS Technology Holdings"));
        admin.add(MainScreen.POIListByArea.get(5).get("NUS(Suzhou) Research Institure Liaison Office"));
        admin.add(MainScreen.POIListByArea.get(11).get("Office of Admissions"));
        admin.add(MainScreen.POIListByArea.get(6).get("Office of Alumni Relations"));
        admin.add(MainScreen.POIListByArea.get(6).get("Office of Campus Amenities"));
        admin.add(MainScreen.POIListByArea.get(8).get("Office of Campus Security"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of Corporate Relations"));
        admin.add(MainScreen.POIListByArea.get(6).get("Office of Environmental Sustainability"));
        admin.add(MainScreen.POIListByArea.get(6).get("Office of Estate Development"));
        admin.add(MainScreen.POIListByArea.get(6).get("Office of Facilities Management"));
        admin.add(MainScreen.POIListByArea.get(11).get("Office of Financial Aid"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of Financial Services"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of Human Resources"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of Internal Audit"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of Legal Affairs"));
        admin.add(MainScreen.POIListByArea.get(4).get("Office of Professional Engineering and Executive Education"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of Quality Management"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of Resource Planning"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of Risk Management"));
        admin.add(MainScreen.POIListByArea.get(6).get("Office of Safety, Health and Environment"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of Student Affairs"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of the Deputy President (Admin/Research and Technology)"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of the President"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of the Provost"));
        admin.add(MainScreen.POIListByArea.get(5).get("Office of the Vice President"));
        admin.add(MainScreen.POIListByArea.get(6).get("Office of the Vice President (Campus Infrastructure)"));
        admin.add(MainScreen.POIListByArea.get(5).get("Registrar's Office"));
        admin.add(MainScreen.POIListByArea.get(5).get("Student Services Centre"));
        admin.add(MainScreen.POIListByArea.get(11).get("Tembusu College Office"));
        admin.add(MainScreen.POIListByArea.get(2).get("University Health Centre"));
        admin.add(MainScreen.POIListByArea.get(11).get("University Town Management Centre"));
        admin.add(MainScreen.POIListByArea.get(11).get("Visitors' Centre"));

        busstop.add(MainScreen.POIListByArea.get(10).get("Busstop: After Sci Park Drive/ Kent Ridge Stn"));
        busstop.add(MainScreen.POIListByArea.get(6).get("Busstop: AS7"));
        busstop.add(MainScreen.POIListByArea.get(6).get("Busstop: Bef Kent Ridge Ter"));
        busstop.add(MainScreen.POIListByArea.get(8).get("Busstop: Between Houses 14 & 15"));
        busstop.add(MainScreen.POIListByArea.get(7).get("Busstop: BIZ2"));
        busstop.add(MainScreen.POIListByArea.get(1).get("Busstop: Blk S17"));
        busstop.add(MainScreen.POIListByArea.get(4).get("Busstop: Block E3A"));
        busstop.add(MainScreen.POIListByArea.get(5).get("Busstop: Central Library"));
        busstop.add(MainScreen.POIListByArea.get(6).get("Busstop: COM2"));
        busstop.add(MainScreen.POIListByArea.get(4).get("Busstop: Computer Centre"));
        busstop.add(MainScreen.POIListByArea.get(6).get("Busstop: Eusoff Hall"));
        busstop.add(MainScreen.POIListByArea.get(4).get("Busstop: Fac of Architecture"));
        busstop.add(MainScreen.POIListByArea.get(8).get("Busstop: House 12"));
        busstop.add(MainScreen.POIListByArea.get(8).get("Busstop: House 7"));
        busstop.add(MainScreen.POIListByArea.get(2).get("Busstop: ITE Dover"));
        busstop.add(MainScreen.POIListByArea.get(10).get("Busstop: Kent Ridge MRT Station"));
        busstop.add(MainScreen.POIListByArea.get(6).get("Busstop: LT13"));
        busstop.add(MainScreen.POIListByArea.get(1).get("Busstop: LT29"));
        busstop.add(MainScreen.POIListByArea.get(3).get("Busstop: Museum"));
        busstop.add(MainScreen.POIListByArea.get(10).get("Busstop: NUH"));
        busstop.add(MainScreen.POIListByArea.get(4).get("Busstop: NUS Fac of Design and Env"));
        busstop.add(MainScreen.POIListByArea.get(4).get("Busstop: Opp Blk EA"));
        busstop.add(MainScreen.POIListByArea.get(7).get("Busstop: Opp Hon Sui Sen Memorial Lib"));
        busstop.add(MainScreen.POIListByArea.get(8).get("Busstop: Opp House 12"));
        busstop.add(MainScreen.POIListByArea.get(2).get("Busstop: Opp ITE Dover"));
        busstop.add(MainScreen.POIListByArea.get(10).get("Busstop: Opp Kent Ridge MRT Station"));
        busstop.add(MainScreen.POIListByArea.get(10).get("Busstop: Opp Kent Ridge Stn"));
        busstop.add(MainScreen.POIListByArea.get(6).get("Busstop: Opp Kent Ridge Ter"));
        busstop.add(MainScreen.POIListByArea.get(10).get("Busstop: Opp NUH"));
        busstop.add(MainScreen.POIListByArea.get(6).get("Busstop: OPP NUS Fac of Architect"));
        busstop.add(MainScreen.POIListByArea.get(5).get("Busstop: Opp UHC"));
        busstop.add(MainScreen.POIListByArea.get(2).get("Busstop: Opp University Hall"));
        busstop.add(MainScreen.POIListByArea.get(4).get("Busstop: Opposite YIH"));
        busstop.add(MainScreen.POIListByArea.get(4).get("Busstop: Raffles Hall"));
        busstop.add(MainScreen.POIListByArea.get(6).get("Busstop: Temasek Hall"));
        busstop.add(MainScreen.POIListByArea.get(4).get("Busstop: Tentera Diraja Mque"));
        busstop.add(MainScreen.POIListByArea.get(4).get("Busstop: The Japanese Primary School"));
        busstop.add(MainScreen.POIListByArea.get(2).get("Busstop: UHC/Kent Ridge Hall"));
        busstop.add(MainScreen.POIListByArea.get(1).get("Busstop: University Hall"));
        busstop.add(MainScreen.POIListByArea.get(11).get("Busstop: U-Town"));
        busstop.add(MainScreen.POIListByArea.get(6).get("Busstop: Ventus"));
        busstop.add(MainScreen.POIListByArea.get(5).get("Busstop: Yusof Ishak House"));

        cafe.add(MainScreen.POIListByArea.get(6).get("Cafe@Ventus"));
        cafe.add(MainScreen.POIListByArea.get(1).get("Dilys Creation"));
        cafe.add(MainScreen.POIListByArea.get(4).get("Dilys Creation"));
        cafe.add(MainScreen.POIListByArea.get(3).get("Dome@UCC (cafe)"));
        cafe.add(MainScreen.POIListByArea.get(5).get("Eskimo Cafe"));
        cafe.add(MainScreen.POIListByArea.get(11).get("Food Clique"));
        cafe.add(MainScreen.POIListByArea.get(4).get("Foodgle Hub"));
        cafe.add(MainScreen.POIListByArea.get(4).get("Good News Cafe"));
        cafe.add(MainScreen.POIListByArea.get(6).get("Humble Origins"));
        cafe.add(MainScreen.POIListByArea.get(1).get("Just Acia"));
        cafe.add(MainScreen.POIListByArea.get(7).get("Late Plate"));
        cafe.add(MainScreen.POIListByArea.get(7).get("Reedz Cafe"));
        cafe.add(MainScreen.POIListByArea.get(1).get("Starbucks"));
        cafe.add(MainScreen.POIListByArea.get(5).get("Starbucks"));
        cafe.add(MainScreen.POIListByArea.get(11).get("Starbucks"));
        cafe.add(MainScreen.POIListByArea.get(11).get("The Ice Cream Gallery"));

        canteen.add(MainScreen.POIListByArea.get(6).get("The Deck"));
        canteen.add(MainScreen.POIListByArea.get(1).get("The Frontier"));
        canteen.add(MainScreen.POIListByArea.get(7).get("The Terrace"));

        cultural.add(MainScreen.POIListByArea.get(3).get("Lee Kong Chian Natural History Museum"));
        cultural.add(MainScreen.POIListByArea.get(3).get("NUS Museum/Museum NUS Centre for the Arts"));
        cultural.add(MainScreen.POIListByArea.get(3).get("University Cultural Centre Theatre"));

        fastfood.add(MainScreen.POIListByArea.get(4).get("McDonald's"));
        fastfood.add(MainScreen.POIListByArea.get(5).get("Subway"));
        fastfood.add(MainScreen.POIListByArea.get(11).get("Subway"));

        foodcourt.add(MainScreen.POIListByArea.get(11).get("Flavors@UTown"));
        foodcourt.add(MainScreen.POIListByArea.get(5).get("Food Junction"));
        foodcourt.add(MainScreen.POIListByArea.get(11).get("Koufu"));

        generalstores.add(MainScreen.POIListByArea.get(5).get("7-Eleven"));
        generalstores.add(MainScreen.POIListByArea.get(11).get("Bookhaven"));
        generalstores.add(MainScreen.POIListByArea.get(11).get("Cheers"));
        generalstores.add(MainScreen.POIListByArea.get(5).get("Coop - Central Forum"));
        generalstores.add(MainScreen.POIListByArea.get(4).get("Coop - SDE"));
        generalstores.add(MainScreen.POIListByArea.get(11).get("FairPrice Express"));
        generalstores.add(MainScreen.POIListByArea.get(11).get("Guardian"));
        generalstores.add(MainScreen.POIListByArea.get(11).get("Liang Seng Sports"));
        generalstores.add(MainScreen.POIListByArea.get(1).get("NUS Coop - Science"));

        kiosk.add(MainScreen.POIListByArea.get(5).get("Old Change Kee"));
        kiosk.add(MainScreen.POIListByArea.get(5).get("Sarpino's Express"));
        kiosk.add(MainScreen.POIListByArea.get(1).get("Subway Mobile Kiosk"));
        kiosk.add(MainScreen.POIListByArea.get(4).get("Subway Mobile Kiosk"));

        lecturetheatre.add(MainScreen.POIListByArea.get(4).get("Engineering Auditorium"));
        lecturetheatre.add(MainScreen.POIListByArea.get(7).get("Hon Sui Sen Auditorium"));
        lecturetheatre.add(MainScreen.POIListByArea.get(4).get("LT1"));
        lecturetheatre.add(MainScreen.POIListByArea.get(6).get("LT10"));
        lecturetheatre.add(MainScreen.POIListByArea.get(6).get("LT11"));
        lecturetheatre.add(MainScreen.POIListByArea.get(6).get("LT12"));
        lecturetheatre.add(MainScreen.POIListByArea.get(6).get("LT13"));
        lecturetheatre.add(MainScreen.POIListByArea.get(6).get("LT14"));
        lecturetheatre.add(MainScreen.POIListByArea.get(6).get("LT15"));
        lecturetheatre.add(MainScreen.POIListByArea.get(6).get("LT16"));
        lecturetheatre.add(MainScreen.POIListByArea.get(6).get("LT17"));
        lecturetheatre.add(MainScreen.POIListByArea.get(7).get("LT18"));
        lecturetheatre.add(MainScreen.POIListByArea.get(7).get("LT19"));
        lecturetheatre.add(MainScreen.POIListByArea.get(4).get("LT2"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT20"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT21"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT22"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT23"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT24"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT25"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT26"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT27"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT28"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT29"));
        lecturetheatre.add(MainScreen.POIListByArea.get(5).get("LT3"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT31"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT32"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT33"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT34"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT35"));
        lecturetheatre.add(MainScreen.POIListByArea.get(1).get("LT36"));
        lecturetheatre.add(MainScreen.POIListByArea.get(5).get("LT4"));
        lecturetheatre.add(MainScreen.POIListByArea.get(4).get("LT5"));
        lecturetheatre.add(MainScreen.POIListByArea.get(11).get("LT50"));
        lecturetheatre.add(MainScreen.POIListByArea.get(11).get("LT51"));
        lecturetheatre.add(MainScreen.POIListByArea.get(11).get("LT52"));
        lecturetheatre.add(MainScreen.POIListByArea.get(11).get("LT53"));
        lecturetheatre.add(MainScreen.POIListByArea.get(4).get("LT6"));
        lecturetheatre.add(MainScreen.POIListByArea.get(4).get("LT7"));
        lecturetheatre.add(MainScreen.POIListByArea.get(4).get("LT7A"));
        lecturetheatre.add(MainScreen.POIListByArea.get(6).get("LT8"));
        lecturetheatre.add(MainScreen.POIListByArea.get(6).get("LT9"));
        lecturetheatre.add(MainScreen.POIListByArea.get(11).get("Ngee Ann Kongsi Auditorium"));
        lecturetheatre.add(MainScreen.POIListByArea.get(11).get("UTown Auditorium 1"));
        lecturetheatre.add(MainScreen.POIListByArea.get(11).get("UTown Auditorium 2"));
        lecturetheatre.add(MainScreen.POIListByArea.get(11).get("UTown Auditorium 3"));

        library.add(MainScreen.POIListByArea.get(5).get("Central Library"));
        library.add(MainScreen.POIListByArea.get(5).get("Chinese Library"));
        library.add(MainScreen.POIListByArea.get(7).get("Hon Sui Sen Memorial Library"));
        library.add(MainScreen.POIListByArea.get(1).get("Medical Library"));
        library.add(MainScreen.POIListByArea.get(3).get("Music Library"));
        library.add(MainScreen.POIListByArea.get(1).get("Science Library"));

        recreation.add(MainScreen.POIListByArea.get(2).get("Archery Corner/Volleyball Courts"));
        recreation.add(MainScreen.POIListByArea.get(2).get("Basketball Courts"));
        recreation.add(MainScreen.POIListByArea.get(2).get("Multi-purpose Courts"));
        recreation.add(MainScreen.POIListByArea.get(2).get("Multi-purpose Field"));
        recreation.add(MainScreen.POIListByArea.get(2).get("Multi-Purpose Sports Hall 1~4"));
        recreation.add(MainScreen.POIListByArea.get(2).get("Multi-Purpose Sports Hall 5"));
        recreation.add(MainScreen.POIListByArea.get(2).get("Multi-Purpose Sports Hall 6"));
        recreation.add(MainScreen.POIListByArea.get(2).get("NUS Archery"));
        recreation.add(MainScreen.POIListByArea.get(2).get("NUS Field/Football Field"));
        recreation.add(MainScreen.POIListByArea.get(2).get("Pool@SRC"));
        recreation.add(MainScreen.POIListByArea.get(2).get("Sepak Takraw"));
        recreation.add(MainScreen.POIListByArea.get(2).get("Sports & Recreation Centre"));
        recreation.add(MainScreen.POIListByArea.get(11).get("Stephen Riady Building"));
        recreation.add(MainScreen.POIListByArea.get(2).get("Tennis Courts"));

        research.add(MainScreen.POIListByArea.get(1).get("Alice Lee Centre for Nursing Studies"));
        research.add(MainScreen.POIListByArea.get(10).get("Bioinformatics Centre"));
        research.add(MainScreen.POIListByArea.get(1).get("Cancer Science Institute of Singapore"));
        research.add(MainScreen.POIListByArea.get(5).get("Centre for Development of Teaching and Learning"));
        research.add(MainScreen.POIListByArea.get(4).get("Centre for English Language and Communication"));
        research.add(MainScreen.POIListByArea.get(5).get("Centre for Instructional Technology"));
        research.add(MainScreen.POIListByArea.get(6).get("Centre for Language Studies"));
        research.add(MainScreen.POIListByArea.get(8).get("Centre for Maritime Studies"));
        research.add(MainScreen.POIListByArea.get(1).get("Centre for Quantum Technologies"));
        research.add(MainScreen.POIListByArea.get(1).get("Centre for Remote Imaging, Sensing and Processing"));
        research.add(MainScreen.POIListByArea.get(4).get("Data Storage Institute"));
        research.add(MainScreen.POIListByArea.get(10).get("Dental Centre"));
        research.add(MainScreen.POIListByArea.get(4).get("Design Incubation Centre"));
        research.add(MainScreen.POIListByArea.get(7).get("Energy Studies Institute"));
        research.add(MainScreen.POIListByArea.get(1).get("Global Asia Institute"));
        research.add(MainScreen.POIListByArea.get(7).get("Human Resource Management Unit"));
        research.add(MainScreen.POIListByArea.get(4).get("Information Resource Centre"));
        research.add(MainScreen.POIListByArea.get(6).get("Information Technology Unit"));
        research.add(MainScreen.POIListByArea.get(8).get("Institute for Mathematical Sciences"));
        research.add(MainScreen.POIListByArea.get(7).get("Institute for Real Estate Studies"));
        research.add(MainScreen.POIListByArea.get(7).get("Institute of Southeast Asian Studies"));
        research.add(MainScreen.POIListByArea.get(7).get("Institute of Systems Science"));
        research.add(MainScreen.POIListByArea.get(7).get("Interactive and Digital Media Institute"));
        research.add(MainScreen.POIListByArea.get(1).get("Life Sciences Institute"));
        research.add(MainScreen.POIListByArea.get(1).get("Mechanobiology Institute"));
        research.add(MainScreen.POIListByArea.get(7).get("Middle East Institute"));
        research.add(MainScreen.POIListByArea.get(1).get("National University Medical Institutes"));
        research.add(MainScreen.POIListByArea.get(7).get("NUS Enterprise"));
        research.add(MainScreen.POIListByArea.get(4).get("NUS Environmental Research Institute"));
        research.add(MainScreen.POIListByArea.get(4).get("NUS Nanoscience and Nanotechnology Initiative"));
        research.add(MainScreen.POIListByArea.get(7).get("Risk Management Institute"));
        research.add(MainScreen.POIListByArea.get(1).get("Singapore Institute for Clinical Sciences"));
        research.add(MainScreen.POIListByArea.get(1).get("Singapore Institute for NeuroTechnology"));
        research.add(MainScreen.POIListByArea.get(4).get("Singapore -MIT Alliance"));
        research.add(MainScreen.POIListByArea.get(5).get("Singapore Synchrotron Light Source"));
        research.add(MainScreen.POIListByArea.get(2).get("Singapore Wind Tunnel Facility"));
        research.add(MainScreen.POIListByArea.get(4).get("Solar Energy Research Institute of Singapore"));
        research.add(MainScreen.POIListByArea.get(4).get("Temasek Defence Systems Institute"));
        research.add(MainScreen.POIListByArea.get(4).get("Temasek Laboratories"));
        research.add(MainScreen.POIListByArea.get(8).get("Temasek Life Sciences Laboratory"));
        research.add(MainScreen.POIListByArea.get(5).get("Tropical Marine Science Institute"));

        residence.add(MainScreen.POIListByArea.get(9).get("Busstop: PGP Terminal"));
        residence.add(MainScreen.POIListByArea.get(11).get("Cinnamon College (USP)"));
        residence.add(MainScreen.POIListByArea.get(11).get("College of Alice and Peter Tan"));
        residence.add(MainScreen.POIListByArea.get(6).get("Eusoff Hall"));
        residence.add(MainScreen.POIListByArea.get(7).get("Kent Ridge Hall"));
        residence.add(MainScreen.POIListByArea.get(9).get("King Edward VII Hall"));
        residence.add(MainScreen.POIListByArea.get(9).get("Prince George's Park Residences"));
        residence.add(MainScreen.POIListByArea.get(4).get("Raffles Hall"));
        residence.add(MainScreen.POIListByArea.get(11).get("Residential College 4"));
        residence.add(MainScreen.POIListByArea.get(5).get("Ridge View Residences"));
        residence.add(MainScreen.POIListByArea.get(7).get("Sheares Hall"));
        residence.add(MainScreen.POIListByArea.get(6).get("Temasek Hall"));
        residence.add(MainScreen.POIListByArea.get(11).get("Tembusu College"));
        residence.add(MainScreen.POIListByArea.get(11).get("UTown Residence"));

        restaurant.add(MainScreen.POIListByArea.get(3).get("Alcove@UCC (restaurant)"));
        restaurant.add(MainScreen.POIListByArea.get(1).get("Food Fest"));
        restaurant.add(MainScreen.POIListByArea.get(11).get("Fortune Village"));
        restaurant.add(MainScreen.POIListByArea.get(11).get("Hwang's Restaurant"));
        restaurant.add(MainScreen.POIListByArea.get(6).get("Indonesian Express"));
        restaurant.add(MainScreen.POIListByArea.get(6).get("Liang Ban Kung Fu"));
        restaurant.add(MainScreen.POIListByArea.get(11).get("Sakae Express"));
        restaurant.add(MainScreen.POIListByArea.get(6).get("Sapore Italiano"));
        restaurant.add(MainScreen.POIListByArea.get(11).get("Sapore Italiano"));
        restaurant.add(MainScreen.POIListByArea.get(11).get("Spice Table by Pines"));
        restaurant.add(MainScreen.POIListByArea.get(5).get("Spinelli"));
        restaurant.add(MainScreen.POIListByArea.get(2).get("Sun Asian Bistro@SRC (Restaurant)"));
        restaurant.add(MainScreen.POIListByArea.get(6).get("The University Club"));

        school.add(MainScreen.POIListByArea.get(6).get("Arts and Social Sciences"));
        school.add(MainScreen.POIListByArea.get(7).get("Business"));
        school.add(MainScreen.POIListByArea.get(1).get("Dentistry"));
        school.add(MainScreen.POIListByArea.get(4).get("Faculty of Engineering"));
        school.add(MainScreen.POIListByArea.get(1).get("Faculty of Science"));
        school.add(MainScreen.POIListByArea.get(1).get("Integrative Sciences and Engineering"));
        school.add(MainScreen.POIListByArea.get(3).get("National University of Singapore"));
        school.add(MainScreen.POIListByArea.get(1).get("Public Health"));
        school.add(MainScreen.POIListByArea.get(6).get("School of Computing"));
        school.add(MainScreen.POIListByArea.get(4).get("School of Design and Environment"));
        school.add(MainScreen.POIListByArea.get(1).get("School of Medicine"));
        school.add(MainScreen.POIListByArea.get(11).get("University Scholars Programme"));
        school.add(MainScreen.POIListByArea.get(11).get("Yale-NUS College"));
        school.add(MainScreen.POIListByArea.get(3).get("Yong Siew Toh Conservatory of Music"));




        data.add(new Pair("Administrative", admin));
        data.add(new Pair("Bus Stops", busstop));
        data.add(new Pair("Cafes", cafe));
        data.add(new Pair("Canteens", canteen));
        data.add(new Pair("Cultural Facilities", cultural));
        data.add(new Pair("Fast Food", fastfood));
        data.add(new Pair("Food Court", foodcourt));
        data.add(new Pair("General Stores", generalstores));
        data.add(new Pair("Kiosks", kiosk));
        data.add(new Pair("Lecture Theatres / Auditoriums", lecturetheatre));
        data.add(new Pair("Libraries", library));
        data.add(new Pair("Recreational Facilities", recreation));
        data.add(new Pair("Research Facilities", research));
        data.add(new Pair("Residences / Halls", residence));
        data.add(new Pair("Restaurants", restaurant));
        data.add(new Pair("Schools / Faculties", school));


        return data;

    }
}
