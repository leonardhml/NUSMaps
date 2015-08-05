# NUSMaps
For Orbital 2015



Project Title: NUS Interactive Campus Map



Table of Contents
Overview
Ideation
Planned Features
Additional Features for the Next Sprint
Summary
References Used


Overview


Aimed Current Level of Achievement: Gemini

Our project aims to create a comprehensive and user-friendly NUS map mobile application targeted at NUS freshmen, exchange students and visitors who are unfamiliar with the campus layout. While the existing AroundNUS mobile app has been generally useful for guiding purposes, we would like to improve on it and create an app that is more interactive for users.

The following is our slide from the Ignition Session:




Click the following to watch our part during the Ignition Session:
https://youtu.be/osQjStOAci0?t=2h38m7s

Click the following to download our app:
https://goo.gl/4pslOZ


Ideation

From a high-level perspective, our map application aims to implement three key features:
An interactive map interface based on the Google Maps API specifically focusing on the main NUS campus (if time permits, we will extend the functionality of our app to cover other NUS campuses as well). 
A directory pointing to all places of interest (POIs)within the NUS campus (canteens, lecture halls, etc) directing users to their exact locations on the map
Support for user-generated content in the form of uploaded pictures and comments for POIs. If time permits, we hope to implement some form of social integration to support unanonymous posts.

Eval #1 May: Project ideation. We hope to present a clear and focused overview of what our project aims to do, the features it will have, and the general timeline of what the product should look like at each milestone.

Eval #2 June: Minimum Viable Project. At this stage, our aim is to complete features 1 and 2. The product at this stage will offer the user a satisfactory map application that will help him/her move around the NUS campus with ease.

Eval #3 July: Extensions. We will offer social integration and user-generated content to make our product more vibrant and useful for our target audience.


Planned Features

From personal experience, navigating through the huge and superb main campus of NUS could be daunting task, especially for freshmen and visitors to the university. As such, in hope to familiarise users with the NUS campus and guide them to their destinations, we would like to incorporate the following features in our app:

Interactive Map Directory

An interactive map interface based on the Google Maps API, where different zones in the campus, like UTown, Faculty of Science, Multi-Purpose Sports Halls etc, are shaded in different colours. Clicking the colour-shaded regions would allow the users to zoom in and have a more optimised view of that zone.

User Story 1:

As a student looking for some relaxation within the campus, I want to have a quick view of the UTown area where I can find many different facilities such as cafeteria, gym and swimming pool.

Go to the homepage which shows the interactive campus map.
Click on the shaded region indicated as “UTown”.
Places of interests such as restaurants and student facilities would be highlighted with small descriptive icons such as this: 
Click on the icons for more information on that facility.
		
		Progress:
		
		Feature has been fully implemented and ready for acceptance testing. Unique icons have been added, with every point of interest possessing the icon that best describes its purpose e.g. restaurants will be marked with the above icon. Quality of life improvements to this feature have also been implemented, which includes a zoom in feature upon clicking on an area marker as well as an overlay of shaded regions dividing the NUS campus into several separate areas.

Bus Route Map for Internal Shuttle Bus (ISB) Service

Bus routes of the NUS ISB services can be traced out on the interactive map if the user selects the “Bus Route Map” from the menu in the sidebar. The route of a specific bus service can also be highlighted by selecting the bus names like A1, D2 etc. The list of stops of that particular bus service line will also be shown in a corner. Moreover, user would also be able to key in their current location and destination to find a suitable route to take.

User Story 2:

As a visitor to the school, I want to know which shuttle bus to take from kent ridge to Business School

Go to the homepage.
Click “Menu”
Select “Bus Route Map”
Select “Location and Destination”
Key in the current location and intended destination, which are “Kent Ridge Bus Stop” and “NUS Business School” respectively.
The fastest bus route would be highlighted on the map, which shows the bus service D2.

		Progress:

		All bus routes for all internal shuttle buses have been implemented in the app. Upon selecting a bus service from a menu, the route travelled by the bus, together with its associated bus stops, will be displayed on the map. 


Pinpointing the Exact Locations for POIs

Users of the app may find places of interest such as lecture theatres, eateries, study areas and student lounges easily by simply browsing through the categories under the menu selection “Places of Interests”. The last option in the list of categories would be “suggest a new category”, where the users can give feedback and suggest new possible categories to be added to the list.

User Story 3:

I am a student who has an exam later, I want to find an air-conditioned and quiet place to study in school, so that I can do some last minute revision for my exam.

Go to the homepage
Click “Menu”
Select “Places of Interests”
Select category “Study Areas”
Possible locations to study will be pinpoint on the interactive map.
Tap the locations to know more about it.

Progress:

An SQLite database of all places of interest within the main Kent Ridge NUS campus have been implemented and is ready for acceptance testing. The database can be accessed by the user via either the directory screen or the search functionality located at the top of the main map screen. 

Additional Features for the Current Sprint
	
After completing the implementation of those features mentioned in the previous section, we proposed several planned features for the sprint from Milestone 2 to Milestone 3, which  are as follows:

Sheltered Route Map

As per a suggestion from our milestone one evaluation, we would like to highlight the linkways and sheltered walkways around NUS. This is to help students navigate themselves around the campus during wet weather.

User Story 4:

I am a student who would like to travel from SoC COM 1 to FoE LT5 on foot on a rainy day to attend a lecture.

Go to the homepage
Click “Menu”
Select “Sheltered Route Map”
Tap on “Where am I” button to see current location pinned on the map (SoC COM 1).
Follow the traced out route to go to the intended destination (FoE LT5).

Progress:

Due to time limitations, this feature will not be implemented in this current sprint.

Control Button on Home Screen to Toggle between Map View and Shaded Region Views

Given that the home screen of our app automatically shows the campus map with shaded regions, a button will be created to allow students to view the map without colour shadings and switch back if necessary.

User Story 5:

I am a user who feels that the shaded regions are obstructing my view of the whole map, hence I would like to clear them away for now.

Go to the homepage
Tap a colourful icon (will be designed) to rid the map of shaded regions.
Tap the icon again to use the shaded region features of the map.
		Progress:

		This feature has been fully implemented and is ready for acceptance testing.

	iii.	Facebook Integration
		
		We would like to implement a form of social media integration within our app. The main purpose of doing so is to allow users to post photos, reviews and ratings of places within NUS for other users to see and share as well.

		User Story 6:
		
		I am a user who strongly feels that the food at a certain food court within the school is extremely bad. I would like to warn other people about that place and get them to avoid eating there.
Login via Facebook through the app
Locate the food court in question through the search functionality or directory screen
Rate the food court 1 star out of 5
Leave a nasty comment on the area’s information screen

		Progress:

		Facebook login has been implemented and is ready for acceptance testing. However, the ability for users to rate, comment and share photos has yet to be implemented.

	iv.	Information Screen for all Places of Interest

		Users unfamiliar to the NUS KR campus may not know what some places are about. We plan to implement an information screen unique to every place of interest, which will depict the name, category, coordinates, and, most importantly, a short description of the place for the user better understand what the place is all about.

		User Story 7:

		I am a user who is curious as to what kind of food is served at Alcove@UCC.

Locate Alcove@UCC on the map (via area markers, directory, or search)
Click on the marker
An information screen will be displayed with a short description as to what kind of restaurant Alcove@UCC is.
	
		Progress:

		Feature is fully implemented and ready for acceptance testing.

	iv. 	Favourites Functionality
		
		For users who find themselves constantly revisiting the same area on the map again and again, we have implemented a favourites screen that lists all the locations saved by the user for easy access. Users can add as many locations into the list as they want, and can choose to clear the list of favourites at any time. Favourites are stored in the internal memory of the phone.

		User Story 7:
		
		I am a user who constantly gets lost in SoC and cannot seem to find my way to LT19. I always have to rely on NUSMap to locate the lecture theatre for me, but constantly looking it up via search or directory is rather annoying.

Look up LT19 via search or directory
Click on the marker labelled LT19 on the map
On the info screen, click the “Add to Favourites” button
Whenever I need to access the area, I simply go to the Favourites screen and select LT19 from the list of favourite locations and the map will instantly show the location of LT19 on the map.

		Progress:

		Feature has been fully implemented and is ready for acceptance testing.


Summary of Features

		The features listed below are all ready for acceptance testing.
	
Interactive map screen with unique marker icons
Map screen divided into different zones for users to easily see all Places of Interests (PoIs) in their immediate vicinity
SQLite Database of all PoIs within the Kent Ridge Campus
Directory Menu for locating PoIs within NUS Kent Ridge Campus
Bus Directory Menu for displaying bus routes within the main campus for all internal shuttle buses
Search functionality for locating PoIs directly
Ability for users to store PoIs in Favourites Screen for easy future access
GPS feature which allows users to find their exact location within KR campus
Information screens for all PoIs showing the name, description, tag, and coordinates of the PoI, together with “Add to Favourites” and “Show on Map” buttons

References Used

A site which provides web tutorials and references for programming languages like HTML, CSS, PHP, Javascript etc. : 
http://www.w3schools.com/

An introduction and guide to web map API done by Yos Raidy:
https://www.youtube.com/watch?v=TGStk3J-WOc
https://docs.google.com/document/d/1yevD_jsA8qtg2Vz16jJSkFUUmcPvhkGmXXiGvLhFfTc/edit

Google Map API:
https://developers.google.com/maps/

GitHub for Beginners:
http://readwrite.com/2013/09/30/understanding-github-a-journey-for-beginners-part-1
http://readwrite.com/2013/10/02/github-for-beginners-part-2

GitHub Mac:
https://mac.github.com/

Android app development for beginners:
http://www.sitepoint.com/12-android-tutorials-beginners/ (list of useful sites)
https://developer.android.com/training/basics/firstapp/index.html?hl=p
https://www.youtube.com/playlist?list=PLB03EA9545DD188C3 (list of videos)
http://www.xaviertobin.com/ (Good first introduction)

Getting started with Android Studio:
http://www.i-programmer.info/programming/android/5887-android-adventures-getting-started-with-android-studio.html

Web tool to create android app icons of various sizes:
https://romannurik.github.io/AndroidAssetStudio/icons-launcher.html#foreground.type=image&foreground.space.trim=0&foreground.space.pad=0&foreColor=607d8b%2C0&crop=0&backgroundShape=square&backColor=f44336%2C100&effects=shadow

Nice and “almost” free map icons:
http://www.webiconset.com/map-icons/

	NUS corporate colours:
	http://www.nus.edu.sg/identity/colours.php

	Creating a map application:
	http://glennsayers.com/android-mapping/

	Google Map API Tutorial:
	https://developers.google.com/maps/documentation/android/intro

	CS193A: Android Web Development:
	http://web.stanford.edu/class/cs193a/videos.shtml

	YouTube Android Video Tutorials:
	https://www.youtube.com/playlist?list=PLshdtb5UWjSqgZ1yaeyKMiLyY4x1egK3c





