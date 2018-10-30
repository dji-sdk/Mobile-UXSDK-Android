<div class="article"><h1 ><font color="#AAA">class </font>MapWidget</h1></div>

~~~java
 class MapWidget extends DULFrameLayoutWidget implements View.OnTouchListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>DULFrameLayoutWidget implements View.OnTouchListener</code></td></tr></table></html>



##### Display:

<br style="clear:both" />

<font color="#666">Widget that displays the aircraft's state and information on the map this includes aircraft location, home location, aircraft trail path, aircraft heading, and No Fly Zones.



##### Usage:



<font color="#666">Preferred Aspect Ratio: 1:1



##### Class Members:

<div class="api-row" id="dulmapwidget_initheremap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_initheremap_inline">initHereMap</a></div></div><div class="inline-doc" id="dulmapwidget_initheremap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>initHereMap</h6></div>

~~~java
 void initHereMap(final OnMapReadyListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Initializes the MapWidget with Here Maps. <br><br>Note: Here Maps currently only works on arm v7 devices,  and you must sign up for their premium package.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Widgets/DULMapWidget.html#dulmapwidget_onmapreadylistener">OnMapReadyListener</a> <font color="#000">listener</td><td><font color="#666"><i>The OnMapReadyListener which will invoke the onMapReady method when the map has finished initializing.</i></td></tr></table></html></div>

<div class="api-row" id="dulmapwidget_initgooglemap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_initgooglemap_inline">initGoogleMap</a></div></div><div class="inline-doc" id="dulmapwidget_initgooglemap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>initGoogleMap</h6></div>

~~~java
 void initGoogleMap(final OnMapReadyListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Initializes the MapWidget with Google Maps. <br><br> Note: Google Maps only works on devices with Google  Play Services (not Crystal Sky). <br> Important: The following lifecycle methods in your activity must call  the corresponding methods in MapWidget in order for the map to render correctly: {@link #onCreate(Bundle)},  {@link #onResume()}, {@link #onPause()}, {@link #onDestroy()}, {@link #onSaveInstanceState(Bundle)}, and {@link #onLowMemory()}.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Widgets/DULMapWidget.html#dulmapwidget_onmapreadylistener">OnMapReadyListener</a> <font color="#000">listener</td><td><font color="#666"><i>The OnMapReadyListener which will invoke the onMapReady method when the map has finished initializing.</i></td></tr></table></html></div>

<div class="api-row" id="dulmapwidget_initamap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_initamap_inline">initAMap</a></div></div><div class="inline-doc" id="dulmapwidget_initamap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>initAMap</h6></div>

~~~java
 void initAMap(final OnMapReadyListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Initializes the MapWidget with AMaps.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Widgets/DULMapWidget.html#dulmapwidget_onmapreadylistener">OnMapReadyListener</a> <font color="#000">listener</td><td><font color="#666"><i>The OnMapReadyListener which will invoke the onMapReady method when the map has finished initializing.</i></td></tr></table></html></div>

<div class="api-row" id="dulmapwidget_getmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_getmap_inline">getMap</a></div></div><div class="inline-doc" id="dulmapwidget_getmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMap</h6></div>

~~~java
 DJIMap getMap() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the DJIMap object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">DJIMap</td><td><font color="#666"><i>A DJIMap object.</i></td></tr></table></html></div>

<div class="api-row" id="dulmapwidget_setflyzonevisibility"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_setflyzonevisibility_inline">setFlyZoneVisibility</a></div></div><div class="inline-doc" id="dulmapwidget_setflyzonevisibility_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlyZoneVisibility</h6></div>

~~~java
 void setFlyZoneVisibility(FlyZoneCategory flyZoneCategory, boolean isVisible) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Set selected fly zone visibility on the map.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">FlyZoneCategory <font color="#000">flyZoneCategory</td><td><font color="#666"><i>Represents the category of flyzone to show/hide.</i></td></tr><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isVisible</td><td><font color="#666"><i><code>true</code> to show fly zones.</i></td></tr></table></html></div>

<div class="api-row" id="dulmapwidget_hideallflyzones"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_hideallflyzones_inline">hideAllFlyZones</a></div></div><div class="inline-doc" id="dulmapwidget_hideallflyzones_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hideAllFlyZones</h6></div>

~~~java
 void hideAllFlyZones() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Hides all fly zones.

</div>

<div class="api-row" id="dulmapwidget_clearflightpath"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_clearflightpath_inline">clearFlightPath</a></div></div><div class="inline-doc" id="dulmapwidget_clearflightpath_inline"

><div class="article"><h6 ><font color="#AAA">method </font>clearFlightPath</h6></div>

~~~java
 void clearFlightPath() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Clears the flight path up to the current location.

</div>

<div class="api-row" id="dulmapwidget_hideflightpath"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_hideflightpath_inline">hideFlightPath</a></div></div><div class="inline-doc" id="dulmapwidget_hideflightpath_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hideFlightPath</h6></div>

~~~java
 void hideFlightPath() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Hides the flight path if it is visible.

</div>

<div class="api-row" id="dulmapwidget_setflightpathcolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_setflightpathcolor_inline">setFlightPathColor</a></div></div><div class="inline-doc" id="dulmapwidget_setflightpathcolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlightPathColor</h6></div>

~~~java
 void setFlightPathColor(@ColorInt int color) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets the color of the flight path.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@ColorInt int <font color="#000">color</td><td><font color="#666"><i>The color of the flight path.</i></td></tr></table></html></div>

<div class="api-row" id="dulmapwidget_setmapcenterlock"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_setmapcenterlock_inline">setMapCenterLock</a></div></div><div class="inline-doc" id="dulmapwidget_setmapcenterlock_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMapCenterLock</h6></div>

~~~java
 void setMapCenterLock(MapCenterLock mapCenterLock) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets the lock on the aircraft or the home location to be in center.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DULMapWidget.html#dulmapwidget_mapcenterlock">MapCenterLock</a> <font color="#000">mapCenterLock</td><td><font color="#666"><i>Parameter to select the mode of centering.</i></td></tr></table></html></div>

<div class="api-row" id="dulmapwidget_setautoframemap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_setautoframemap_inline">setAutoFrameMap</a></div></div><div class="inline-doc" id="dulmapwidget_setautoframemap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutoFrameMap</h6></div>

~~~java
 void setAutoFrameMap(boolean isEnabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Keeps the home location and the aircraft location visible and adjust the map bounds when set true.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isEnabled</td><td><font color="#666"><i>Parameter to enable or disable the map bounds lock.</i></td></tr></table></html></div>

<div class="api-row" id="dulmapwidget_showhome"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_showhome_inline">showHome</a></div></div><div class="inline-doc" id="dulmapwidget_showhome_inline"

><div class="article"><h6 ><font color="#AAA">method </font>showHome</h6></div>

~~~java
 void showHome() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Shows the home marker if present on the map.

</div>

<div class="api-row" id="dulmapwidget_hidehome"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_hidehome_inline">hideHome</a></div></div><div class="inline-doc" id="dulmapwidget_hidehome_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hideHome</h6></div>

~~~java
 void hideHome() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Hides the home marker if present on the map.

</div>

<div class="api-row" id="dulmapwidget_showgimbalattitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_showgimbalattitude_inline">showGimbalAttitude</a></div></div><div class="inline-doc" id="dulmapwidget_showgimbalattitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>showGimbalAttitude</h6></div>

~~~java
 void showGimbalAttitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Show the gimbal attitude values.

</div>

<div class="api-row" id="dulmapwidget_hidegimbalattitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_hidegimbalattitude_inline">hideGimbalAttitude</a></div></div><div class="inline-doc" id="dulmapwidget_hidegimbalattitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hideGimbalAttitude</h6></div>

~~~java
 void hideGimbalAttitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Hide the gimbal attitude values.

</div>

<div class="api-row" id="dulmapwidget_hidedirectiontohome"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_hidedirectiontohome_inline">hideDirectionToHome</a></div></div><div class="inline-doc" id="dulmapwidget_hidedirectiontohome_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hideDirectionToHome</h6></div>

~~~java
 void hideDirectionToHome() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Hides the path from aircraft to home point if visible.

</div>

<div class="api-row" id="dulmapwidget_setaircraftbitmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_setaircraftbitmap_inline">setAircraftBitmap</a></div></div><div class="inline-doc" id="dulmapwidget_setaircraftbitmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAircraftBitmap</h6></div>

~~~java
 void setAircraftBitmap(Bitmap bitmap) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the aircraft marker.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set to.</i></td></tr></table></html></div>

<div class="api-row" id="dulmapwidget_sethomebitmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_sethomebitmap_inline">setHomeBitmap</a></div></div><div class="inline-doc" id="dulmapwidget_sethomebitmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHomeBitmap</h6></div>

~~~java
 void setHomeBitmap(Bitmap bitmap) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the home marker.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set to.</i></td></tr></table></html></div>

<div class="api-row" id="dulmapwidget_onsaveinstancestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_onsaveinstancestate_inline">onSaveInstanceState</a></div></div><div class="inline-doc" id="dulmapwidget_onsaveinstancestate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onSaveInstanceState</h6></div>

~~~java
 void onSaveInstanceState(Bundle outState) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Calling this method from the corresponding method in your  activity is required for Google Maps.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bundle <font color="#000">outState</td><td><font color="#666"><i>An object of Bundle.</i></td></tr></table></html></div>

<div class="api-row" id="dulmapwidget_onlowmemory"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_onlowmemory_inline">onLowMemory</a></div></div><div class="inline-doc" id="dulmapwidget_onlowmemory_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onLowMemory</h6></div>

~~~java
 void onLowMemory() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Calling this method from the corresponding method in your activity is  required for Google Maps.

</div>

<div class="api-row" id="dulmapwidget_mapcenterlock"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_mapcenterlock_inline">MapCenterLock</a></div></div><div class="inline-doc" id="dulmapwidget_mapcenterlock_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>MapCenterLock</h6></div>

~~~java
 enum MapCenterLock 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Map Centering Options.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#dulmapwidget_mapcenterlock_none_inline"></a>NONE</td><td><font color="#666">This will disable the centering of map on any markers.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#dulmapwidget_mapcenterlock_aircraft_inline"></a>AIRCRAFT</td><td><font color="#666">This will keep the aircraft icon always in center of the screen and keep following it during flight.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#dulmapwidget_mapcenterlock_home_inline"></a>HOME</td><td><font color="#666">This will keep the home icon always in center of the screen. The aircraft icon will disappear from view bounds if the aircraft travels that distance</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="dulmapwidget_showdirectiontohome"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_showdirectiontohome_inline">showDirectionToHome</a></div></div><div class="inline-doc" id="dulmapwidget_showdirectiontohome_inline"

><div class="article"><h6 ><font color="#AAA">method </font>showDirectionToHome</h6></div>

~~~java
 void showDirectionToHome() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Shows the path from aircraft to home point if not already visible.

</div>

<div class="api-row" id="dulmapwidget_showallflyzones"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_showallflyzones_inline">showAllFlyZones</a></div></div><div class="inline-doc" id="dulmapwidget_showallflyzones_inline"

><div class="article"><h6 ><font color="#AAA">method </font>showAllFlyZones</h6></div>

~~~java
 void showAllFlyZones() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Make all Fly zones visible on the map.

</div>

<div class="api-row" id="dulmapwidget_showflightpath"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_showflightpath_inline">showFlightPath</a></div></div><div class="inline-doc" id="dulmapwidget_showflightpath_inline"

><div class="article"><h6 ><font color="#AAA">method </font>showFlightPath</h6></div>

~~~java
 void showFlightPath() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Makes flight path visible if it's not visible.

</div>



##### Related:

<div class="api-row" id="dulmapwidget_onmapreadylistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">interface</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_onmapreadylistener_inline">OnMapReadyListener</a></div></div><div class="inline-doc" id="dulmapwidget_onmapreadylistener_inline"

><div class="article"><h6 ><font color="#AAA">interface </font>OnMapReadyListener</h6></div>

~~~java
 interface OnMapReadyListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">When added to the MapWidget, the OnMapReadyListener can be used to  determine when the map is ready to modify. No modifications should  be done to the MapWidget before the map is initialized using one  of the initialization methods.



##### Interface Methods:

<div class="api-row" id="dulmapwidget_onmapreadycallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulmapwidget_onmapreadycallback_inline">onMapReady</a></div></div><div class="inline-doc" id="dulmapwidget_onmapreadycallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onMapReady</h6></div>

~~~java
        void onMapReady(@NonNull DJIMap map)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">A callback indicating that the map is finished initializing.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull DJIMap <font color="#000">map</td><td><font color="#666"><i>The object of <code>DJIMap</code>.</i></td></tr></table></html></div>

</div>


