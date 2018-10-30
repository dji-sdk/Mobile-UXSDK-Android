<div class="article"><h1 ><font color="#AAA">class </font>MapWidget</h1></div>

~~~java
 class MapWidget extends FrameLayoutWidget implements View.OnTouchListener, View.OnClickListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>FrameLayoutWidget implements View.OnTouchListener, View.OnClickListener</code></td></tr></table></html>



##### Display:

<br style="clear:both" />

<font color="#666">Widget that displays the aircraft's state and information on the map this includes aircraft location, home location, aircraft trail path, aircraft heading, and No Fly Zones.



##### Usage:



<font color="#666">Preferred Aspect Ratio: 1:1



##### Class Members:

<div class="api-row" id="duxmapwidget_getflightpathwidth"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getflightpathwidth_inline">getFlightPathWidth</a></div></div><div class="inline-doc" id="duxmapwidget_getflightpathwidth_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightPathWidth</h6></div>

~~~java
 float getFlightPathWidth() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Gets the line width, in pixels, of the flight path. Valid range is 0-100.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The width in pixels of the flight path.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_initheremap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_initheremap_inline">initHereMap</a></div></div><div class="inline-doc" id="duxmapwidget_initheremap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>initHereMap</h6></div>

~~~java
 void initHereMap(final OnMapReadyListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Initializes the MapWidget with Here Maps. <br><br>Note: Here Maps currently only works on arm v7 devices,  and you must sign up for their premium package.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Widgets/DUXMapWidget.html#duxmapwidget_onmapreadylistener">OnMapReadyListener</a> <font color="#000">listener</td><td><font color="#666"><i>The OnMapReadyListener which will invoke the onMapReady method when the map has finished initializing.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_initgooglemap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_initgooglemap_inline">initGoogleMap</a></div></div><div class="inline-doc" id="duxmapwidget_initgooglemap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>initGoogleMap</h6></div>

~~~java
 void initGoogleMap(final OnMapReadyListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Initializes the MapWidget with Google Maps. <br><br> Note: Google Maps only works on devices with Google  Play Services (not Crystal Sky). <br> Important: The following lifecycle methods in your activity must call  the corresponding methods in MapWidget in order for the map to render correctly: {@link #onCreate(Bundle)},  {@link #onResume()}, {@link #onPause()}, {@link #onDestroy()}, {@link #onSaveInstanceState(Bundle)}, and {@link #onLowMemory()}.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Widgets/DUXMapWidget.html#duxmapwidget_onmapreadylistener">OnMapReadyListener</a> <font color="#000">listener</td><td><font color="#666"><i>The OnMapReadyListener which will invoke the onMapReady method when the map has finished initializing.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_initamap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_initamap_inline">initAMap</a></div></div><div class="inline-doc" id="duxmapwidget_initamap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>initAMap</h6></div>

~~~java
 void initAMap(final OnMapReadyListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Initializes the MapWidget with AMaps.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Widgets/DUXMapWidget.html#duxmapwidget_onmapreadylistener">OnMapReadyListener</a> <font color="#000">listener</td><td><font color="#666"><i>The OnMapReadyListener which will invoke the onMapReady method when the map has finished initializing.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_initmapboxmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_initmapboxmap_inline">initMapboxMap</a></div></div><div class="inline-doc" id="duxmapwidget_initmapboxmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>initMapboxMap</h6></div>

~~~java
 void initMapboxMap(final OnMapReadyListener listener, String mapboxAccessToken) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Initializes the MapWidget with Mapbox.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Widgets/DUXMapWidget.html#duxmapwidget_onmapreadylistener">OnMapReadyListener</a> <font color="#000">listener</td><td><font color="#666"><i>The OnMapReadyListener which will invoke the onMapReady method when the map has finished initializing.</i></td></tr><tr valign="top"><td><font color="#70BF41">String <font color="#000">mapboxAccessToken</td><td><font color="#666"><i>The API access token from Mapbox.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getmap_inline">getMap</a></div></div><div class="inline-doc" id="duxmapwidget_getmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMap</h6></div>

~~~java
 DJIMap getMap() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the DJIMap object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DUXMapWidget.html#djimap">DJIMap</a></td><td><font color="#666"><i>A DJIMap object.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_hideallflyzones"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_hideallflyzones_inline">hideAllFlyZones</a></div></div><div class="inline-doc" id="duxmapwidget_hideallflyzones_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hideAllFlyZones</h6></div>

~~~java
 void hideAllFlyZones() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Hides all fly zones.

</div>

<div class="api-row" id="duxmapwidget_clearflightpath"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_clearflightpath_inline">clearFlightPath</a></div></div><div class="inline-doc" id="duxmapwidget_clearflightpath_inline"

><div class="article"><h6 ><font color="#AAA">method </font>clearFlightPath</h6></div>

~~~java
 void clearFlightPath() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Clears the flight path up to the current location. The flight path is removed even if it is hidden.

</div>

<div class="api-row" id="duxmapwidget_setflightpathcolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setflightpathcolor_inline">setFlightPathColor</a></div></div><div class="inline-doc" id="duxmapwidget_setflightpathcolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlightPathColor</h6></div>

~~~java
 void setFlightPathColor(@ColorInt int color) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets the color of the flight path.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@ColorInt int <font color="#000">color</td><td><font color="#666"><i>The color of the flight path.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setmapcenterlock"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setmapcenterlock_inline">setMapCenterLock</a></div></div><div class="inline-doc" id="duxmapwidget_setmapcenterlock_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMapCenterLock</h6></div>

~~~java
 void setMapCenterLock(MapCenterLock mapCenterLock) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets the lock on the aircraft or the home location to be in center.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DUXMapWidget.html#duxmapwidget_mapcenterlock">MapCenterLock</a> <font color="#000">mapCenterLock</td><td><font color="#666"><i>Parameter to select the mode of centering.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setautoframemap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setautoframemap_inline">setAutoFrameMap</a></div></div><div class="inline-doc" id="duxmapwidget_setautoframemap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutoFrameMap</h6></div>

~~~java
 void setAutoFrameMap(boolean isEnabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Keeps the home location and the aircraft location visible and adjust the map bounds when set <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isEnabled</td><td><font color="#666"><i>Parameter to enable or disable the map bounds lock.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_sethomebitmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_sethomebitmap_inline">setHomeBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_sethomebitmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHomeBitmap</h6></div>

~~~java
 void setHomeBitmap(Bitmap bitmap) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the home marker.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set to.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_sethomebitmapwithposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_sethomebitmapwithposition_inline">setHomeBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_sethomebitmapwithposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHomeBitmap</h6></div>

~~~java
 void setHomeBitmap(Bitmap bitmap, float x, float y) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the home marker.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set to.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">x</td><td><font color="#666"><i>Specifies the x axis value of anchor to be at a particular point in the marker image.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">y</td><td><font color="#666"><i>Specifies the y axis value of anchor to be at a particular point in the marker image.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_gethomebitmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_gethomebitmap_inline">getHomeBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_gethomebitmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHomeBitmap</h6></div>

~~~java
 Bitmap getHomeBitmap() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Gets the icon of the home marker.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap</td><td><font color="#666"><i>The icon of the home marker.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setflyzonecolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setflyzonecolor_inline">setFlyZoneColor</a></div></div><div class="inline-doc" id="duxmapwidget_setflyzonecolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlyZoneColor</h6></div>

~~~java
 void setFlyZoneColor(FlyZoneCategory category, @ColorInt int color) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets the color of the given fly zone category.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">FlyZoneCategory <font color="#000">category</td><td><font color="#666"><i>The fly zone category.</i></td></tr><tr valign="top"><td><font color="#70BF41">@ColorInt int <font color="#000">color</td><td><font color="#666"><i>The new border color.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getflyzonecolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getflyzonecolor_inline">getFlyZoneColor</a></div></div><div class="inline-doc" id="duxmapwidget_getflyzonecolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlyZoneColor</h6></div>

~~~java
@ColorInt
 int getFlyZoneColor(FlyZoneCategory category) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the color of the given fly zone category.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">FlyZoneCategory <font color="#000">category</td><td><font color="#666"><i>The fly zone category.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>A color int.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setflyzonealpha"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setflyzonealpha_inline">setFlyZoneAlpha</a></div></div><div class="inline-doc" id="duxmapwidget_setflyzonealpha_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlyZoneAlpha</h6></div>

~~~java
 void setFlyZoneAlpha(FlyZoneCategory category, int alpha) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the alpha of the given fly zone category.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">FlyZoneCategory <font color="#000">category</td><td><font color="#666"><i>The fly zone category.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">alpha</td><td><font color="#666"><i>An alpha value from 0-255.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getflyzonealpha"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getflyzonealpha_inline">getFlyZoneAlpha</a></div></div><div class="inline-doc" id="duxmapwidget_getflyzonealpha_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlyZoneAlpha</h6></div>

~~~java
 int getFlyZoneAlpha(FlyZoneCategory category) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the alpha of the given fly zone category.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">FlyZoneCategory <font color="#000">category</td><td><font color="#666"><i>The fly zone category.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An alpha value from 0-255.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setflyzoneborderwidth"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setflyzoneborderwidth_inline">setFlyZoneBorderWidth</a></div></div><div class="inline-doc" id="duxmapwidget_setflyzoneborderwidth_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlyZoneBorderWidth</h6></div>

~~~java
 void setFlyZoneBorderWidth(float width) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the border width of all fly zones.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">width</td><td><font color="#666"><i>The width in pixels of the fly zone borders.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getflyzoneborderwidth"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getflyzoneborderwidth_inline">getFlyZoneBorderWidth</a></div></div><div class="inline-doc" id="duxmapwidget_getflyzoneborderwidth_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlyZoneBorderWidth</h6></div>

~~~java
 float getFlyZoneBorderWidth() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the border width of all fly zones.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The width in pixels of the fly zone borders.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getselfunlockedcolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getselfunlockedcolor_inline">getSelfUnlockColor</a></div></div><div class="inline-doc" id="duxmapwidget_getselfunlockedcolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSelfUnlockColor</h6></div>

~~~java
@ColorInt
 int getSelfUnlockColor() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the color of the self-unlock fly zones.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>A color int.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setselfunlockedcolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setselfunlockedcolor_inline">setSelfUnlockColor</a></div></div><div class="inline-doc" id="duxmapwidget_setselfunlockedcolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSelfUnlockColor</h6></div>

~~~java
 void setSelfUnlockColor(@ColorInt int selfUnlockColor) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the color of the self-unlock fly zones.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@ColorInt int <font color="#000">selfUnlockColor</td><td><font color="#666"><i>The new color.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getselfunlockedalpha"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getselfunlockedalpha_inline">getSelfUnlockAlpha</a></div></div><div class="inline-doc" id="duxmapwidget_getselfunlockedalpha_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSelfUnlockAlpha</h6></div>

~~~java
 int getSelfUnlockAlpha() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the alpha of the self-unlock fly zones.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The alpha of the self-unlock fly zones.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setselfunlockedalpha"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setselfunlockedalpha_inline">setSelfUnlockAlpha</a></div></div><div class="inline-doc" id="duxmapwidget_setselfunlockedalpha_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSelfUnlockAlpha</h6></div>

~~~java
 void setSelfUnlockAlpha(int selfUnlockAlpha) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the alpha of the self unlock fly zones.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">selfUnlockAlpha</td><td><font color="#666"><i>The new alpha.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setcustomunlockflyzoneoverlaycolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setcustomunlockflyzoneoverlaycolor_inline">setCustomUnlockFlyZoneOverlayColor</a></div></div><div class="inline-doc" id="duxmapwidget_setcustomunlockflyzoneoverlaycolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomUnlockFlyZoneOverlayColor</h6></div>

~~~java
 void setCustomUnlockFlyZoneOverlayColor(@ColorInt int customUnlockColor) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the color of the custom unlock fly zones.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@ColorInt int <font color="#000">customUnlockColor</td><td><font color="#666"><i>The new color.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setcustomunlockflyzonesenttoaircraftoverlaycolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setcustomunlockflyzonesenttoaircraftoverlaycolor_inline">setCustomUnlockFlyZoneSentToAircraftOverlayColor</a></div></div><div class="inline-doc" id="duxmapwidget_setcustomunlockflyzonesenttoaircraftoverlaycolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomUnlockFlyZoneSentToAircraftOverlayColor</h6></div>

~~~java
 void setCustomUnlockFlyZoneSentToAircraftOverlayColor(@ColorInt int customUnlockSentToAircraftColor) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the color of the custom unlock fly zones that have been sent to the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@ColorInt int <font color="#000">customUnlockSentToAircraftColor</td><td><font color="#666"><i>The new color.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setcustomunlockflyzoneenabledoverlaycolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setcustomunlockflyzoneenabledoverlaycolor_inline">setCustomUnlockFlyZoneEnabledOverlayColor</a></div></div><div class="inline-doc" id="duxmapwidget_setcustomunlockflyzoneenabledoverlaycolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomUnlockFlyZoneEnabledOverlayColor</h6></div>

~~~java
 void setCustomUnlockFlyZoneEnabledOverlayColor(@ColorInt int customUnlockEnabledColor) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the color of the currently enabled custom unlock fly zones.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@ColorInt int <font color="#000">customUnlockEnabledColor</td><td><font color="#666"><i>The new color.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getcustomunlockflyzoneoverlaycolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getcustomunlockflyzoneoverlaycolor_inline">getCustomUnlockFlyZoneOverlayColor</a></div></div><div class="inline-doc" id="duxmapwidget_getcustomunlockflyzoneoverlaycolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomUnlockFlyZoneOverlayColor</h6></div>

~~~java
@ColorInt
 int getCustomUnlockFlyZoneOverlayColor() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the color of the custom unlock zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>A color int.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getcustomunlockflyzonesenttoaircraftoverlaycolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getcustomunlockflyzonesenttoaircraftoverlaycolor_inline">getCustomUnlockFlyZoneSentToAircraftOverlayColor</a></div></div><div class="inline-doc" id="duxmapwidget_getcustomunlockflyzonesenttoaircraftoverlaycolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomUnlockFlyZoneSentToAircraftOverlayColor</h6></div>

~~~java
@ColorInt
 int getCustomUnlockFlyZoneSentToAircraftOverlayColor() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the color of the custom unlock zones sent to the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>A color int.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getcustomunlockflyzoneenabledoverlaycolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getcustomunlockflyzoneenabledoverlaycolor_inline">getCustomUnlockFlyZoneEnabledOverlayColor</a></div></div><div class="inline-doc" id="duxmapwidget_getcustomunlockflyzoneenabledoverlaycolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomUnlockFlyZoneEnabledOverlayColor</h6></div>

~~~java
@ColorInt
 int getCustomUnlockFlyZoneEnabledOverlayColor() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the color of the currently enabled custom unlock fly zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>A color int.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setcustomunlockflyzoneoverlayalpha"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setcustomunlockflyzoneoverlayalpha_inline">setCustomUnlockFlyZoneOverlayAlpha</a></div></div><div class="inline-doc" id="duxmapwidget_setcustomunlockflyzoneoverlayalpha_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomUnlockFlyZoneOverlayAlpha</h6></div>

~~~java
 void setCustomUnlockFlyZoneOverlayAlpha(int customUnlockColorAlpha) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the alpha of the custom unlock fly zones.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">customUnlockColorAlpha</td><td><font color="#666"><i>The new alpha.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setcustomunlockflyzonesenttoaircraftoverlayalpha"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setcustomunlockflyzonesenttoaircraftoverlayalpha_inline">setCustomUnlockFlyZoneSentToAircraftOverlayAlpha</a></div></div><div class="inline-doc" id="duxmapwidget_setcustomunlockflyzonesenttoaircraftoverlayalpha_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomUnlockFlyZoneSentToAircraftOverlayAlpha</h6></div>

~~~java
 void setCustomUnlockFlyZoneSentToAircraftOverlayAlpha(int customUnlockSentToAircraftColorAlpha) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the alpha of the custom unlock fly zones sent to the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">customUnlockSentToAircraftColorAlpha</td><td><font color="#666"><i>The new alpha.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setcustomunlockflyzoneenabledoverlayalpha"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setcustomunlockflyzoneenabledoverlayalpha_inline">setCustomUnlockFlyZoneEnabledOverlayAlpha</a></div></div><div class="inline-doc" id="duxmapwidget_setcustomunlockflyzoneenabledoverlayalpha_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomUnlockFlyZoneEnabledOverlayAlpha</h6></div>

~~~java
 void setCustomUnlockFlyZoneEnabledOverlayAlpha(int customUnlockEnabledColorAlpha) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the alpha of the currently enabled custom unlock fly zones.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">customUnlockEnabledColorAlpha</td><td><font color="#666"><i>The new alpha.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getcustomunlockflyzoneoverlayalpha"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getcustomunlockflyzoneoverlayalpha_inline">getCustomUnlockFlyZoneOverlayAlpha</a></div></div><div class="inline-doc" id="duxmapwidget_getcustomunlockflyzoneoverlayalpha_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomUnlockFlyZoneOverlayAlpha</h6></div>

~~~java
 int getCustomUnlockFlyZoneOverlayAlpha() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the alpha of the custom unlock fly zones.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The alpha.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getcustomunlockflyzonesenttoaircraftoverlayalpha"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getcustomunlockflyzonesenttoaircraftoverlayalpha_inline">getCustomUnlockFlyZoneSentToAircraftOverlayAlpha</a></div></div><div class="inline-doc" id="duxmapwidget_getcustomunlockflyzonesenttoaircraftoverlayalpha_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomUnlockFlyZoneSentToAircraftOverlayAlpha</h6></div>

~~~java
 int getCustomUnlockFlyZoneSentToAircraftOverlayAlpha() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the alpha of the custom unlock fly zones sent to the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The alpha.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getcustomunlockflyzoneenabledoverlayalpha"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getcustomunlockflyzoneenabledoverlayalpha_inline">getCustomUnlockFlyZoneEnabledOverlayAlpha</a></div></div><div class="inline-doc" id="duxmapwidget_getcustomunlockflyzoneenabledoverlayalpha_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomUnlockFlyZoneEnabledOverlayAlpha</h6></div>

~~~java
 int getCustomUnlockFlyZoneEnabledOverlayAlpha() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the alpha of the currently enabled custom unlock fly zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The alpha.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getmaximumheightcolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getmaximumheightcolor_inline">getMaximumHeightColor</a></div></div><div class="inline-doc" id="duxmapwidget_getmaximumheightcolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaximumHeightColor</h6></div>

~~~java
@ColorInt
 int getMaximumHeightColor() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the color of the maximum height fly zones.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The color of the maximum height fly zones.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setmaximumheightcolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setmaximumheightcolor_inline">setMaximumHeightColor</a></div></div><div class="inline-doc" id="duxmapwidget_setmaximumheightcolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMaximumHeightColor</h6></div>

~~~java
 void setMaximumHeightColor(@ColorInt int limitedHeightColor) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the color of the maximum height fly zones.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@ColorInt int <font color="#000">limitedHeightColor</td><td><font color="#666"><i>The new color.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getmaximumheightalpha"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getmaximumheightalpha_inline">getMaximumHeightAlpha</a></div></div><div class="inline-doc" id="duxmapwidget_getmaximumheightalpha_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaximumHeightAlpha</h6></div>

~~~java
 int getMaximumHeightAlpha() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get the alpha of the maximum height fly zones.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The alpha.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setmaximumheightalpha"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setmaximumheightalpha_inline">setMaximumHeightAlpha</a></div></div><div class="inline-doc" id="duxmapwidget_setmaximumheightalpha_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMaximumHeightAlpha</h6></div>

~~~java
 void setMaximumHeightAlpha(int maximumHeightAlpha) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the alpha of the maximum height fly zones.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">maximumHeightAlpha</td><td><font color="#666"><i>The new alpha.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setflyzonevisible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setflyzonevisible_inline">setFlyZoneVisible</a></div></div><div class="inline-doc" id="duxmapwidget_setflyzonevisible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlyZoneVisible</h6></div>

~~~java
 void setFlyZoneVisible(FlyZoneCategory flyZoneCategory, boolean isVisible) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set selected fly zone visibility on the map.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">FlyZoneCategory <font color="#000">flyZoneCategory</td><td><font color="#666"><i>Represents the category of fly zone to show/hide.</i></td></tr><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isVisible</td><td><font color="#666"><i><code>true</code> to show fly zones.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_isflyzonevisible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_isflyzonevisible_inline">isFlyZoneVisible</a></div></div><div class="inline-doc" id="duxmapwidget_isflyzonevisible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFlyZoneVisible</h6></div>

~~~java
 boolean isFlyZoneVisible(FlyZoneCategory flyZoneCategory) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get selected fly zone visibility on the map.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">FlyZoneCategory <font color="#000">flyZoneCategory</td><td><font color="#666"><i>The category of the fly zone.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>Whether the given fly zone category is visible on the map.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_settaptounlockenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_settaptounlockenabled_inline">setTapToUnlockEnabled</a></div></div><div class="inline-doc" id="duxmapwidget_settaptounlockenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTapToUnlockEnabled</h6></div>

~~~java
 void setTapToUnlockEnabled(boolean isFlyZonesUnlockingEnabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">This will enable the unlocking of fly zones by clicking on them.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isFlyZonesUnlockingEnabled</td><td><font color="#666"><i>A boolean value that determines whether to enable Fly Zones Unlocking.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_istaptounlockenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_istaptounlockenabled_inline">isTapToUnlockEnabled</a></div></div><div class="inline-doc" id="duxmapwidget_istaptounlockenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isTapToUnlockEnabled</h6></div>

~~~java
 boolean isTapToUnlockEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Gets whether tap to unlock is enabled.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if tapping to unlock select fly zones is enabled. </i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setselfunlockedbitmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setselfunlockedbitmap_inline">setSelfUnlockedBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_setselfunlockedbitmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSelfUnlockedBitmap</h6></div>

~~~java
 void setSelfUnlockedBitmap(Bitmap bitmap) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the unlocked self-unlock zones.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setselfunlockedbitmapwithposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setselfunlockedbitmapwithposition_inline">setSelfUnlockedBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_setselfunlockedbitmapwithposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSelfUnlockedBitmap</h6></div>

~~~java
 void setSelfUnlockedBitmap(Bitmap bitmap, float x, float y) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the unlocked self-unlock zones.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">x</td><td><font color="#666"><i>Specifies the x axis value of anchor to be at a particular point in the marker image.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">y</td><td><font color="#666"><i>Specifies the y axis value of anchor to be at a particular point in the marker image.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setselflockedbitmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setselflockedbitmap_inline">setSelfLockedBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_setselflockedbitmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSelfLockedBitmap</h6></div>

~~~java
 void setSelfLockedBitmap(Bitmap bitmap) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the locked self-unlock zones



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setselflockedbitmapwithposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setselflockedbitmapwithposition_inline">setSelfLockedBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_setselflockedbitmapwithposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSelfLockedBitmap</h6></div>

~~~java
 void setSelfLockedBitmap(Bitmap bitmap, float x, float y) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the locked self-unlock zones



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">x</td><td><font color="#666"><i>Specifies the x axis value of anchor to be at a particular point in the marker image.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">y</td><td><font color="#666"><i>Specifies the y axis value of anchor to be at a particular point in the marker image.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setcustomunlockenabledbitmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setcustomunlockenabledbitmap_inline">setCustomUnlockEnabledBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_setcustomunlockenabledbitmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomUnlockEnabledBitmap</h6></div>

~~~java
 void setCustomUnlockEnabledBitmap(Bitmap bitmap) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the custom unlock zone which is enabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setcustomunlockenabledbitmapwithposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setcustomunlockenabledbitmapwithposition_inline">setCustomUnlockEnabledBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_setcustomunlockenabledbitmapwithposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomUnlockEnabledBitmap</h6></div>

~~~java
 void setCustomUnlockEnabledBitmap(Bitmap bitmap, float x, float y) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the custom unlock zone which is enabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">x</td><td><font color="#666"><i>Specifies the x axis value of anchor to be at a particular point in the marker image.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">y</td><td><font color="#666"><i>Specifies the y axis value of anchor to be at a particular point in the marker image.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setcustomunlocksenttoaircraftbitmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setcustomunlocksenttoaircraftbitmap_inline">setCustomUnlockSentToAircraftBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_setcustomunlocksenttoaircraftbitmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomUnlockSentToAircraftBitmap</h6></div>

~~~java
 void setCustomUnlockSentToAircraftBitmap(Bitmap bitmap) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the custom unlock zone which is on aircraft but not enabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setcustomunlocksenttoaircraftbitmapwithposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setcustomunlocksenttoaircraftbitmapwithposition_inline">setCustomUnlockSentToAircraftBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_setcustomunlocksenttoaircraftbitmapwithposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomUnlockSentToAircraftBitmap</h6></div>

~~~java
 void setCustomUnlockSentToAircraftBitmap(Bitmap bitmap, float x, float y) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the custom unlock zone which is on aircraft but not enabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">x</td><td><font color="#666"><i>Specifies the x axis value of anchor to be at a particular point in the marker image.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">y</td><td><font color="#666"><i>Specifies the y axis value of anchor to be at a particular point in the marker image.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setdirectiontohomevisible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setdirectiontohomevisible_inline">setDirectionToHomeVisible</a></div></div><div class="inline-doc" id="duxmapwidget_setdirectiontohomevisible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDirectionToHomeVisible</h6></div>

~~~java
 void setDirectionToHomeVisible(boolean isVisible) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets the visibility of the path from aircraft to home point.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isVisible</td><td><font color="#666"><i>A boolean value that determines whether to show the path from aircraft to home point.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_isdirectiontohomevisible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_isdirectiontohomevisible_inline">isDirectionToHomeVisible</a></div></div><div class="inline-doc" id="duxmapwidget_isdirectiontohomevisible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isDirectionToHomeVisible</h6></div>

~~~java
 boolean isDirectionToHomeVisible() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Defaults to <code>false</code>. A Boolean value indicating whether the map displays a line showing
    the direction to home.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if direction to home is visible.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setdirectiontohomecolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setdirectiontohomecolor_inline">setDirectionToHomeColor</a></div></div><div class="inline-doc" id="duxmapwidget_setdirectiontohomecolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDirectionToHomeColor</h6></div>

~~~java
 void setDirectionToHomeColor(@ColorInt int color) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets the color of the path from aircraft to home point.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@ColorInt int <font color="#000">color</td><td><font color="#666"><i>The new color of the path.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getdirectiontohomecolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getdirectiontohomecolor_inline">getDirectionToHomeColor</a></div></div><div class="inline-doc" id="duxmapwidget_getdirectiontohomecolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDirectionToHomeColor</h6></div>

~~~java
@ColorInt
 int getDirectionToHomeColor() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Gets the color of the path from aircraft to home point.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The color of the path.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setdirectiontohomewidth"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setdirectiontohomewidth_inline">setDirectionToHomeWidth</a></div></div><div class="inline-doc" id="duxmapwidget_setdirectiontohomewidth_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDirectionToHomeWidth</h6></div>

~~~java
 void setDirectionToHomeWidth(float width) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets the width of the path from aircraft to home point.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">width</td><td><font color="#666"><i>The width of the path.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getdirectiontohomewidth"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getdirectiontohomewidth_inline">getDirectionToHomeWidth</a></div></div><div class="inline-doc" id="duxmapwidget_getdirectiontohomewidth_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDirectionToHomeWidth</h6></div>

~~~java
 float getDirectionToHomeWidth() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Gets the width of the path from aircraft to home point.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The width of the path.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setflightpathvisible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setflightpathvisible_inline">setFlightPathVisible</a></div></div><div class="inline-doc" id="duxmapwidget_setflightpathvisible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlightPathVisible</h6></div>

~~~java
 void setFlightPathVisible(boolean isVisible) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets the flight path visibility.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isVisible</td><td><font color="#666"><i>A boolean value that determines whether to show the flight path.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_isflightpathvisible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_isflightpathvisible_inline">isFlightPathVisible</a></div></div><div class="inline-doc" id="duxmapwidget_isflightpathvisible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFlightPathVisible</h6></div>

~~~java
 boolean isFlightPathVisible() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the flight path is visible. The default value is <code>false</code>



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value indicating if the flight path is visible.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getflightpathcolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getflightpathcolor_inline">getFlightPathColor</a></div></div><div class="inline-doc" id="duxmapwidget_getflightpathcolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightPathColor</h6></div>

~~~java
@ColorInt
 int getFlightPathColor() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Gets the color of the flight path.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The color of the flight path.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setflightpathwidth"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setflightpathwidth_inline">setFlightPathWidth</a></div></div><div class="inline-doc" id="duxmapwidget_setflightpathwidth_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlightPathWidth</h6></div>

~~~java
 void setFlightPathWidth(float width) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets a line width, in pixels, for the flight path. Valid range is 0-100.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">width</td><td><font color="#666"><i>The width in pixels of the flight path.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setgimbalattitudevisible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setgimbalattitudevisible_inline">setGimbalAttitudeVisible</a></div></div><div class="inline-doc" id="duxmapwidget_setgimbalattitudevisible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGimbalAttitudeVisible</h6></div>

~~~java
 void setGimbalAttitudeVisible(boolean isVisible) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets the visibility of the gimbal attitude marker.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isVisible</td><td><font color="#666"><i>A boolean value that determines whether to show the gimbal attitude marker.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_isgimbalattitudevisible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_isgimbalattitudevisible_inline">isGimbalAttitudeVisible</a></div></div><div class="inline-doc" id="duxmapwidget_isgimbalattitudevisible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isGimbalAttitudeVisible</h6></div>

~~~java
 boolean isGimbalAttitudeVisible() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Gets the visibility of the gimbal attitude marker.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the gimbal attitude marker is visible.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setaircraftbitmapwithposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setaircraftbitmapwithposition_inline">setAircraftBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_setaircraftbitmapwithposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAircraftBitmap</h6></div>

~~~java
 void setAircraftBitmap(Bitmap bitmap, float x, float y) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Set the icon of the aircraft marker.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">x</td><td><font color="#666"><i>Specifies the x axis value of anchor to be at a particular point in the marker image.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">y</td><td><font color="#666"><i>Specifies the y axis value of anchor to be at a particular point in the marker image.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setaircraftbitmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setaircraftbitmap_inline">setAircraftBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_setaircraftbitmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAircraftBitmap</h6></div>

~~~java
 void setAircraftBitmap(Bitmap bitmap) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the aircraft marker.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set to.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getaircraftbitmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getaircraftbitmap_inline">getAircraftBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_getaircraftbitmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAircraftBitmap</h6></div>

~~~java
 Bitmap getAircraftBitmap() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Gets the icon of the aircraft marker.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap</td><td><font color="#666"><i>The icon of the aircraft marker.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_setgimbalattitudebitmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_setgimbalattitudebitmap_inline">setGimbalAttitudeBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_setgimbalattitudebitmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGimbalAttitudeBitmap</h6></div>

~~~java
 void setGimbalAttitudeBitmap(Bitmap bitmap) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Changes the icon of the gimbal attitude marker.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap <font color="#000">bitmap</td><td><font color="#666"><i>The image to be set to.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_getgimbalattitudebitmap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_getgimbalattitudebitmap_inline">getGimbalAttitudeBitmap</a></div></div><div class="inline-doc" id="duxmapwidget_getgimbalattitudebitmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGimbalAttitudeBitmap</h6></div>

~~~java
 Bitmap getGimbalAttitudeBitmap() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Gets the icon of the gimbal attitude marker.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap</td><td><font color="#666"><i>The icon of the gimbal attitude marker.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_sethomevisible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_sethomevisible_inline">setHomeVisible</a></div></div><div class="inline-doc" id="duxmapwidget_sethomevisible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHomeVisible</h6></div>

~~~java
 void setHomeVisible(boolean isVisible) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets the visibility of the home marker if present on the map.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isVisible</td><td><font color="#666"><i>A boolean value to determine if the home marker is visible.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_ishomevisible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_ishomevisible_inline">isHomeVisible</a></div></div><div class="inline-doc" id="duxmapwidget_ishomevisible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isHomeVisible</h6></div>

~~~java
 boolean isHomeVisible() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the map displays the home point of the aircraft. The default value of this property is <code>true</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>The icon of the home point marker.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_mapcenterlock"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_mapcenterlock_inline">MapCenterLock</a></div></div><div class="inline-doc" id="duxmapwidget_mapcenterlock_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>MapCenterLock</h6></div>

~~~java
 enum MapCenterLock 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Map Centering Options.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#duxmapwidget_mapcenterlock_none_inline"></a>NONE</td><td><font color="#666">This will disable the centering of map on any markers.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#duxmapwidget_mapcenterlock_aircraft_inline"></a>AIRCRAFT</td><td><font color="#666">This will keep the aircraft icon always in center of the screen and keep following it during flight.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#duxmapwidget_mapcenterlock_home_inline"></a>HOME</td><td><font color="#666">This will keep the home icon always in center of the screen. The aircraft icon will disappear from view bounds if the aircraft travels that distance</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="duxmapwidget_showallflyzones"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_showallflyzones_inline">showAllFlyZones</a></div></div><div class="inline-doc" id="duxmapwidget_showallflyzones_inline"

><div class="article"><h6 ><font color="#AAA">method </font>showAllFlyZones</h6></div>

~~~java
 void showAllFlyZones() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Make all Fly zones visible on the map.

</div>

<div class="api-row" id="duxmapviewcontroller_showflyzonelegend"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapviewcontroller_showflyzonelegend_inline">showFlyZoneLegend</a></div></div><div class="inline-doc" id="duxmapviewcontroller_showflyzonelegend_inline"

><div class="article"><h6 ><font color="#AAA">method </font>showFlyZoneLegend</h6></div>

~~~java
 void showFlyZoneLegend(boolean showFlyZoneLegend) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Shows the fly zone legend. The fly zone legend indicates the color for all zone categories and self-unlock zones.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">showFlyZoneLegend</td><td><font color="#666"><i><code>true</code> to show the legend, <code>false</code> to hide.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_showdjiaccountloginindicator"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_showdjiaccountloginindicator_inline">showDJIAccountLoginIndicator</a></div></div><div class="inline-doc" id="duxmapwidget_showdjiaccountloginindicator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>showDJIAccountLoginIndicator</h6></div>

~~~java
 void showDJIAccountLoginIndicator(boolean isLoginIndicatorVisible) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Defaults to <code>false</code>. Show a small indicator displaying the latest DJI account login state.  Useful if using FlySafe features.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isLoginIndicatorVisible</td><td><font color="#666"><i><code>true</code> if visible, <code>false</code> if hidden.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_isdjiaccountloginindicatorvisible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_isdjiaccountloginindicatorvisible_inline">isDJIAccountLoginIndicatorVisible</a></div></div><div class="inline-doc" id="duxmapwidget_isdjiaccountloginindicatorvisible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isDJIAccountLoginIndicatorVisible</h6></div>

~~~java
 boolean isDJIAccountLoginIndicatorVisible() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Get current visibility of DJI Account Login Indicator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if visible, <code>false</code> if hidden.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_showcustomunlockzones"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_showcustomunlockzones_inline">showCustomUnlockZones</a></div></div><div class="inline-doc" id="duxmapwidget_showcustomunlockzones_inline"

><div class="article"><h6 ><font color="#AAA">method </font>showCustomUnlockZones</h6></div>

~~~java
 void showCustomUnlockZones(boolean isVisible) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Defaults to <code>false</code>. Shows custom unlock zones if any are available for the currently connected aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isVisible</td><td><font color="#666"><i><code>true</code> to show fly zones.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_iscustomunlockzonesvisible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_iscustomunlockzonesvisible_inline">isCustomUnlockZonesVisible</a></div></div><div class="inline-doc" id="duxmapwidget_iscustomunlockzonesvisible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isCustomUnlockZonesVisible</h6></div>

~~~java
 boolean isCustomUnlockZonesVisible() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Returns flag for the current visibility of Custom Unlock FlyZones



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if custom unlock fly zones are visible.</i></td></tr></table></html></div>

<div class="api-row" id="duxmapwidget_synccustomunlockzones"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_synccustomunlockzones_inline">syncCustomUnlockZones</a></div></div><div class="inline-doc" id="duxmapwidget_synccustomunlockzones_inline"

><div class="article"><h6 ><font color="#AAA">method </font>syncCustomUnlockZones</h6></div>

~~~java
 void syncCustomUnlockZones() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Call this to sync currently shown custom unlock zones to aircraft. They will still need to be manually enabled.

</div>



##### Related:

<div class="api-row" id="duxmapwidget_onmapreadylistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">interface</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_onmapreadylistener_inline">OnMapReadyListener</a></div></div><div class="inline-doc" id="duxmapwidget_onmapreadylistener_inline"

><div class="article"><h6 ><font color="#AAA">interface </font>OnMapReadyListener</h6></div>

~~~java
 interface OnMapReadyListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">When added to the MapWidget, the OnMapReadyListener can be used to  determine when the map is ready to modify. No modifications should  be done to the MapWidget before the map is initialized using one  of the initialization methods.



##### Interface Methods:

<div class="api-row" id="duxmapwidget_onmapreadycallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxmapwidget_onmapreadycallback_inline">onMapReady</a></div></div><div class="inline-doc" id="duxmapwidget_onmapreadycallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onMapReady</h6></div>

~~~java
        void onMapReady(@NonNull DJIMap map)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">A callback indicating that the map is finished initializing.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Widgets/DUXMapWidget.html#djimap">DJIMap</a> <font color="#000">map</td><td><font color="#666"><i>The object of <code><a href="/Widgets/DUXMapWidget.html#djimap">DJIMap</a></code>.</i></td></tr></table></html></div>

</div>

<div class="api-row" id="djimap"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">interface</div><div class="api-col right"><a class="trigger" href="#djimap_inline">DJIMap</a></div></div><div class="inline-doc" id="djimap_inline"

><div class="article"><h6 ><font color="#AAA">interface </font>DJIMap</h6></div>

~~~java
 interface DJIMap 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">The public interface of map object.



##### Interface Methods:

<div class="api-row" id="djimap_addmarker"><div class="api-col left">Add Marker</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_addmarker_inline">addMarker</a></div></div><div class="inline-doc" id="djimap_addmarker_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addMarker</h6></div>

~~~java
    DJIMarker addMarker(DJIMarkerOptions markerOptions)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Adds a marker to this map.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DJIMap_DJIMarkerOptions.html#djimap_djimarkeroptions">DJIMarkerOptions</a> <font color="#000">markerOptions</td><td><font color="#666"><i>Describes how to create the marker.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DJIMap_DJIMarker.html#djimap_djimarker">DJIMarker</a></td><td><font color="#666"><i>The marker that was added to the map.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_getmap"><div class="api-col left">Get Map</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_getmap_inline">getMap</a></div></div><div class="inline-doc" id="djimap_getmap_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMap</h6></div>

~~~java
    Object getMap()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Gets the base Map Object. This will enable all the features available by default in each Map Provider



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Object</td><td><font color="#666"><i>The DJIMap object.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_setoncamerachangelistener"><div class="api-col left">Set Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_setoncamerachangelistener_inline">setOnCameraChangeListener</a></div></div><div class="inline-doc" id="djimap_setoncamerachangelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setOnCameraChangeListener</h6></div>

~~~java
    void setOnCameraChangeListener(final OnCameraChangeListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Sets the <code><a href="/Widgets/DUXMapWidget.html#djimap_oncamerachangelistenerinterface">OnCameraChangeListener</a></code> which can listen to camera changes.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Widgets/DUXMapWidget.html#djimap_oncamerachangelistenerinterface">OnCameraChangeListener</a> <font color="#000">listener</td><td><font color="#666"><i>The listener that is added to this map.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_setonmarkerclicklistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_setonmarkerclicklistener_inline">setOnMarkerClickListener</a></div></div><div class="inline-doc" id="djimap_setonmarkerclicklistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setOnMarkerClickListener</h6></div>

~~~java
    void setOnMarkerClickListener(OnMarkerClickListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Sets the <code><a href="/Widgets/DUXMapWidget.html#djimap_onmarkerclicklistenerinterface"></a></code> which can listen click events on the map's markers.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">OnMarkerClickListener <font color="#000">listener</td><td><font color="#666"><i>The listener that is added to this map.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_setonmapclicklistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_setonmapclicklistener_inline">setOnMapClickListener</a></div></div><div class="inline-doc" id="djimap_setonmapclicklistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setOnMapClickListener</h6></div>

~~~java
    void setOnMapClickListener(OnMapClickListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Sets the <code><a href="/Widgets/DUXMapWidget.html#djimap_onmapclicklistenerinterface"></a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">OnMapClickListener <font color="#000">listener</td><td><font color="#666"><i>The listener that is added to this map.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_removealloncamerachangelisteners"><div class="api-col left">Remove Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_removealloncamerachangelisteners_inline">removeAllOnCameraChangeListeners</a></div></div><div class="inline-doc" id="djimap_removealloncamerachangelisteners_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllOnCameraChangeListeners</h6></div>

~~~java
    void removeAllOnCameraChangeListeners()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Removes all instances of <code><a href="/Widgets/DUXMapWidget.html#djimap_oncamerachangelistenerinterface">OnCameraChangeListener</a></code> from the map.

</div>

<div class="api-row" id="djimap_removeonmarkerclicklistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_removeonmarkerclicklistener_inline">removeOnMarkerClickListener</a></div></div><div class="inline-doc" id="djimap_removeonmarkerclicklistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeOnMarkerClickListener</h6></div>

~~~java
    void removeOnMarkerClickListener(OnMarkerClickListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Removes the <code><a href="/Widgets/DUXMapWidget.html#djimap_onmarkerclicklistenerinterface"></a></code> from the map.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">OnMarkerClickListener <font color="#000">listener</td><td><font color="#666"><i>The listener to remove.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_setcameraposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_setcameraposition_inline">setCameraPosition</a></div></div><div class="inline-doc" id="djimap_setcameraposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCameraPosition</h6></div>

~~~java
    void setCameraPosition(DJICameraPosition cameraPosition)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Sets the camera position.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DJIMap_DJICameraPosition.html#djimap_djicameraposition">DJICameraPosition</a> <font color="#000">cameraPosition</td><td><font color="#666"><i>The camera position.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_getcameraposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_getcameraposition_inline">getCameraPosition</a></div></div><div class="inline-doc" id="djimap_getcameraposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCameraPosition</h6></div>

~~~java
    DJICameraPosition getCameraPosition()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Gets the camera position.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DJIMap_DJICameraPosition.html#djimap_djicameraposition">DJICameraPosition</a></td><td><font color="#666"><i>The <code><a href="/Widgets/DJIMap_DJICameraPosition.html#djimap_djicameraposition">DJICameraPosition</a></code> object.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_setmaptype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_setmaptype_inline">setMapType</a></div></div><div class="inline-doc" id="djimap_setmaptype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMapType</h6></div>

~~~java
    void setMapType(MapType type)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Sets the map type of this map.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DUXMapWidget.html#djimap_maptype">MapType</a> <font color="#000">type</td><td><font color="#666"><i>The map type that the map will be set to.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_removeonmapclicklistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_removeonmapclicklistener_inline">removeOnMapClickListener</a></div></div><div class="inline-doc" id="djimap_removeonmapclicklistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeOnMapClickListener</h6></div>

~~~java
    void removeOnMapClickListener(OnMapClickListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Removes the <code><a href="/Widgets/DUXMapWidget.html#djimap_onmapclicklistenerinterface"></a></code> from the map.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">OnMapClickListener <font color="#000">listener</td><td><font color="#666"><i>The listener to remove.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_maptype"><div class="api-col left">Map Type</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djimap_maptype_inline">MapType</a></div></div><div class="inline-doc" id="djimap_maptype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>MapType</h6></div>

~~~java
 enum MapType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">The overall representation of the map.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djimap_maptype_normal_inline"></a>Normal</td><td><font color="#666">The overall representation of the map.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimap_maptype_satellite_inline"></a>Satellite</td><td><font color="#666">Satellite photograph data.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimap_maptype_hybrid_inline"></a>Hybrid</td><td><font color="#666">Satellite photograph data and roads</td></tr></table></html>

##### Class Members:

</div>



##### Related:

<div class="api-row" id="djimap_onmarkerclicklistenerinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">unknown</div><div class="api-col right"><a class="trigger" href="#djimap_onmarkerclicklistenerinterface_inline"></a></div></div><div class="inline-doc" id="djimap_onmarkerclicklistenerinterface_inline"

><div class="article"><h6 ><font color="#AAA">unknown </font></h6></div>

~~~java
    interface OnMarkerClickListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Listener on the marker click event.

</div>

<div class="api-row" id="djimap_onmapclicklistenerinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">unknown</div><div class="api-col right"><a class="trigger" href="#djimap_onmapclicklistenerinterface_inline"></a></div></div><div class="inline-doc" id="djimap_onmapclicklistenerinterface_inline"

><div class="article"><h6 ><font color="#AAA">unknown </font></h6></div>

~~~java
    interface OnMapClickListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Listener on the map click event.

</div>

<div class="api-row" id="djimap_oncamerachangelistenerinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">interface</div><div class="api-col right"><a class="trigger" href="#djimap_oncamerachangelistenerinterface_inline">OnCameraChangeListener</a></div></div><div class="inline-doc" id="djimap_oncamerachangelistenerinterface_inline"

><div class="article"><h6 ><font color="#AAA">interface </font>OnCameraChangeListener</h6></div>

~~~java
 interface OnCameraChangeListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.callback</td></tr></table></html>



##### Description:



<font color="#666">Listener on the camera change event.



##### Interface Methods:



#### Callback Method

<div class="api-row" id="djimap_oncamerachangecallback"><div class="api-col left">Camera Position Changed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_oncamerachangecallback_inline">onCameraChange</a></div></div><div class="inline-doc" id="djimap_oncamerachangecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onCameraChange</h6></div>

~~~java
    void onCameraChange(DJICameraPosition cameraPosition)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.callback</td></tr></table></html>



##### Description:



<font color="#666">A callback indicating that the camera position has changed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DJIMap_DJICameraPosition.html#djimap_djicameraposition">DJICameraPosition</a> <font color="#000">cameraPosition</td><td><font color="#666"><i>The new camera position.</i></td></tr></table></html></div>

</div>

<div class="api-row" id="djimap_djimarker"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Widgets/DJIMap_DJIMarker.html">DJIMarker</a></div></div><div class="api-row" id="djimap_djimarkeroptions"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Widgets/DJIMap_DJIMarkerOptions.html">DJIMarkerOptions</a></div></div><div class="api-row" id="djimap_djicameraposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Widgets/DJIMap_DJICameraPosition.html">DJICameraPosition</a></div></div><div class="api-row" id="djimap_djilatlng"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Widgets/DJIMap_DJILatLng.html">DJILatLng</a></div></div></div>


