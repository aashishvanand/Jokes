# Tell me a joke
Udacity Android Nanodegree - Build it Bigger - Meets Specifications <br>
This is an Android app loads jokes from Google Cloud Endpoint and uses a separate java library to display the jokes. The app is divided into two Flavours Paid and the Free Version. Free Version loads banner ads and interstitial ads between activities. It has a dedicated Java library to supply jokes to the Google Cloud Endpoint (GCE).Project loads joke from GCE module via an AsyncTask.

#Screenshots
<img src="https://raw.githubusercontent.com/aashishvanand/Jokes/master/Screenshots/Screenshot_20160905-123906.png" height=480 width =270/>
<img src="https://raw.githubusercontent.com/aashishvanand/Jokes/master/Screenshots/Screenshot_20160905-123909.png" height=480 width =270/>
<img src="https://raw.githubusercontent.com/aashishvanand/Jokes/master/Screenshots/Screenshot_20160905-123914.png" height=480 width =270/>
<img src="https://raw.githubusercontent.com/aashishvanand/Jokes/master/Screenshots/Screenshot_20160905-123921.png" height=480 width =270/>
<img src="https://raw.githubusercontent.com/aashishvanand/Jokes/master/Screenshots/Screenshot_20160905-140200.png" height=480 width =270/>
<img src="https://raw.githubusercontent.com/aashishvanand/Jokes/master/Screenshots/Screenshot_20160905-140147.png" height=480 width =270/>

## Features
<ul style="list-style-type:disc">
<li>Tell Me a Joke contains a Java library for supplying jokes.</li><br>
<li>Tell Me a Joke contains an Android library with an activity that displays jokes passed to it as intent extras.</li><br>
<li>Tell Me a Joke contains a Google Cloud Endpoints module that supplies jokes from the Java library. Project loads jokes from GCE module via an AsyncTask.</li><br>
<li>Tell Me a Joke contains connected tests to verify that the AsyncTask is indeed loading jokes.</li><br>
<li>Tell Me a Joke contains paid/free flavors. The paid flavor has no ads and no unnecessary dependencies.</li><br>
<li>App retrieves jokes from Google Cloud Endpoints module and displays them via an Activity from the Android Library.</li><br>
<li>Free app variant displays interstitial ads between the main activity and the joke-displaying activity.</li><br>
<li>App display a loading indicator while the joke is being fetched from the server.</li><br>
<li>Gradle task that starts the GCE dev server, runs all the Android tests and shuts down the dev server.</li><br>
</ul>

## Android Version Targeting
Devices Running Lollipop (API 21) or above are supported

##App is now available on Google Play
<a href='https://play.google.com/store/apps/details?id=com.aashish.tellmeajoke.paid&utm_source=global_co&utm_medium=prtnr&utm_content=Mar2515&utm_campaign=PartBadge&pcampaignid=MKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1'><img alt='Get it on Google Play' src='https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png'/></a><br>
<a href='https://play.google.com/store/apps/details?id=com.aashish.tellmeajoke.free&utm_source=global_co&utm_medium=prtnr&utm_content=Mar2515&utm_campaign=PartBadge&pcampaignid=MKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1'><img alt='Get it on Google Play' src='https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png'/></a> <br>
Google Play and the Google Play logo are trademarks of Google Inc.
