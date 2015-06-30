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

        List<String> admin = new ArrayList<String>();
        List<String> schools = new ArrayList<String>();
        List<String> research_institutes_centres = new ArrayList<String>();
        List<String> LTs = new ArrayList<String>();
        List<String> libraries = new ArrayList<String>();
        List<String> cultural_recreational_social_fac = new ArrayList<String>();
        List<String> residences = new ArrayList<String>();
        List<String> cafes_restaurants = new ArrayList<String>();
        List<String> canteens = new ArrayList<String>();
        List<String> cafeteria = new ArrayList<String>();
        List<String> fast_food = new ArrayList<String>();
        List<String> food_courts = new ArrayList<String>();
        List<String> kiosks = new ArrayList<String>();
        List<String> c_stores = new ArrayList<String>();


        admin.add("Association of Pacific Rim Universities");
        admin.add("Centre for Development of Teaching and Learning");
        admin.add("Engineering");
        admin.add("SoC");
        admin.add("FASS");

        schools.add("FASS");
        schools.add("Business");
        schools.add("Computing");
        schools.add("Dentistry");
        schools.add("Design & Environment");
        schools.add("Engineering");
        schools.add("Integrative Sciences & Engineering");
        schools.add("Medicine");
        schools.add("Music");
        schools.add("Public Health");
        schools.add("Science");
        schools.add("University Scholars Programme");
        schools.add("Yale-NUS College");

        research_institutes_centres.add("");

        LTs.add("LT1");
        LTs.add("LT2");
        LTs.add("LT3");
        LTs.add("LT4");
        LTs.add("LT5");
        LTs.add("LT6");
        LTs.add("LT7");
        LTs.add("LT7A");
        LTs.add("LT8");
        LTs.add("LT9");
        LTs.add("LT10");
        LTs.add("LT11");
        LTs.add("LT12");
        LTs.add("LT13");
        LTs.add("LT14");
        LTs.add("LT15");
        LTs.add("LT16");
        LTs.add("LT17");
        LTs.add("LT18");
        LTs.add("LT19");
        LTs.add("LT20");
        LTs.add("LT21");
        LTs.add("LT22");
        LTs.add("LT23");
        LTs.add("LT24");
        LTs.add("LT25");
        LTs.add("LT26");
        LTs.add("LT27");
        LTs.add("LT28");
        LTs.add("LT29");
        LTs.add("LT30");
        LTs.add("LT31");
        LTs.add("LT32");
        LTs.add("LT33");
        LTs.add("LT34");
        LTs.add("LT35");
        LTs.add("LT36");
        LTs.add("LT37");

        libraries.add("Central Library");
        libraries.add("Chinese Library");
        libraries.add("Hon Sui Sen Memorial Library (Business)");
        libraries.add("Medical Library");
        libraries.add("Music Library");
        libraries.add("Science Library");

        cultural_recreational_social_fac.add("Health Wellness & Counselling Centre");
        cultural_recreational_social_fac.add("Kent Ridge Guild House");
        cultural_recreational_social_fac.add("Lee Kong Chian Art Collection");
        cultural_recreational_social_fac.add("Ng Eng Teng Gallery");
        cultural_recreational_social_fac.add("NUS Society");
        cultural_recreational_social_fac.add("NUS Staff Club");
        cultural_recreational_social_fac.add("NUS Centre for the Arts");
        cultural_recreational_social_fac.add("Raffles Museum of Biodiversity Research");
        cultural_recreational_social_fac.add("Shaw Foundation House");
        cultural_recreational_social_fac.add("South and Southeast Asian Art Gallery");
        cultural_recreational_social_fac.add("Sports and Recreation Centre");
        cultural_recreational_social_fac.add("Student Service Centre");
        cultural_recreational_social_fac.add("University Cultural Centre");

        residences.add("Cinnamon College");
        residences.add("College of Alice & Peter Tan");
        residences.add("Eusoff Hall");
        residences.add("Kent Ridge Hall");
        residences.add("King Edward VII Hall");
        residences.add("Kuok Foundation House");
        residences.add("Prince George's Park Residences");
        residences.add("Raffles Hall");
        residences.add("Residential College 4");
        residences.add("Ridge View Residences");
        residences.add("Ridge View Tower Block");
        residences.add("Sheares Hall");
        residences.add("Temasek Hall");
        residences.add("Tembusu College");
        residences.add("UTown Residence North Tower");
        residences.add("UTown Residence South Tower");

        cafes_restaurants.add("Alcove Asian Restaurant Bar");
        cafes_restaurants.add("Bing Bing Ice Cream Gallery");
        cafes_restaurants.add("Dome");
        cafes_restaurants.add("Eskimo Cafe");
        cafes_restaurants.add("Food Fest");
        cafes_restaurants.add("Good News Cafe");
        cafes_restaurants.add("Great Wall Restaurant");
        cafes_restaurants.add("Humble Origins");
        cafes_restaurants.add("Hwang's Korean Restaurant");
        cafes_restaurants.add("Just Acia");
        cafes_restaurants.add("Late Plate");
        cafes_restaurants.add("Platypus Food Bar");
        cafes_restaurants.add("Reedz Cafe - Mochtar Riady Building");
        cafes_restaurants.add("Sakae Express");
        cafes_restaurants.add("Sapore Italiano - FASS");
        cafes_restaurants.add("Sapore Italiano - UTown");
        cafes_restaurants.add("Spice Table");
        cafes_restaurants.add("Spinelli");
        cafes_restaurants.add("Starbucks - YIH");
        cafes_restaurants.add("Starbucks - MD11");
        cafes_restaurants.add("Starbucks - UTown");
        cafes_restaurants.add("The University Club");

        canteens.add("Frontier - Science Canteen");
        canteens.add("Techno Edge - Engineering Canteen");
        canteens.add("The Deck - FASS Canteen");
        canteens.add("The Terrace - SoC/Biz Canteen");

        cafeteria.add("Foodgle Hub");
        cafeteria.add("Fortune Village");

        fast_food.add("McDonald's");

        food_courts.add("Flavours");
        food_courts.add("Food Junction");
        food_courts.add("Koufu");

        kiosks.add("Dilys Creation - Engineering");
        kiosks.add("Dilys Creation - Science");
        kiosks.add("Liang Ban Kung Fu");
        kiosks.add("Old Chang Kee");
        kiosks.add("Subway - YIH");
        kiosks.add("Subway - UTown");

        c_stores.add("7-11");
        c_stores.add("Cheers");
        c_stores.add("Fairprice Xpress");
        c_stores.add("Guardian");

        data.add(new Pair("Administrative", admin));
        data.add(new Pair("Schools/Faculties", schools));
        data.add(new Pair("Research Institutes & Centres", research_institutes_centres));
        data.add(new Pair("Lecture Theatres", LTs));
        data.add(new Pair("Libraries", libraries));
        data.add(new Pair("Cultural/Recreational/Social Facilities", cultural_recreational_social_fac));
        data.add(new Pair("Residences", residences));
        data.add(new Pair("Cafes/Restaurants", cafes_restaurants));
        data.add(new Pair("Canteens", canteens));
        data.add(new Pair("Cafeterias", cafeteria));
        data.add(new Pair("Fast Food", fast_food));
        data.add(new Pair("Food Courts", food_courts));
        data.add(new Pair("Kiosks", kiosks));
        data.add(new Pair("Convenience Stores", c_stores));


        return data;

    }
}
