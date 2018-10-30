<div class="article"><h1 ><font color="#AAA">class </font>DJICameraPosition</h1></div>

~~~java
 class DJICameraPosition 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.models</td></tr></table></html>



##### Description:



<font color="#666">The position of the camera.



##### Class Members:

<div class="api-row" id="djimap_djicameraposition_constructor1"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_djicameraposition_constructor1_inline">DJICameraPosition</a></div></div><div class="inline-doc" id="djimap_djicameraposition_constructor1_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJICameraPosition</h6></div>

~~~java
 DJICameraPosition(DJILatLng target, float zoom, float tilt, float bearing) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.models</td></tr></table></html>



##### Description:



<font color="#666">Creates a new camera position with the given coordinates, zoom level, tilt, and bearing.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DJIMap_DJILatLng.html#djimap_djilatlng">DJILatLng</a> <font color="#000">target</td><td><font color="#666"><i>The position of the center point.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">zoom</td><td><font color="#666"><i>The zoom level between 0 and 20. 0 is the lowest zoom level which will show  the entire map, and 20 is the highest zoom level.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">tilt</td><td><font color="#666"><i>The tilt of the camera.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">bearing</td><td><font color="#666"><i>The orientation of the camera.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_djicameraposition_constructor2"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_djicameraposition_constructor2_inline">DJICameraPosition</a></div></div><div class="inline-doc" id="djimap_djicameraposition_constructor2_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJICameraPosition</h6></div>

~~~java
 DJICameraPosition(DJILatLng position, float zoom)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.models</td></tr></table></html>



##### Description:



<font color="#666">Creates a new camera position with the given coordinates and zoom level.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DJIMap_DJILatLng.html#djimap_djilatlng">DJILatLng</a> <font color="#000">position</td><td><font color="#666"><i>The position of the center point.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">zoom</td><td><font color="#666"><i>The zoom level between 0 and 20. 0 is the lowest zoom level which will show  the entire map, and 20 is the highest zoom level.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_djicameraposition_getposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_djicameraposition_getposition_inline">getPosition</a></div></div><div class="inline-doc" id="djimap_djicameraposition_getposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPosition</h6></div>

~~~java
 DJILatLng getPosition() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.models</td></tr></table></html>



##### Description:



<font color="#666">Gets the position of the center point of the camera.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DJIMap_DJILatLng.html#djimap_djilatlng">DJILatLng</a></td><td><font color="#666"><i>The position of the center point of the camera.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_djicameraposition_getzoom"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_djicameraposition_getzoom_inline">getZoom</a></div></div><div class="inline-doc" id="djimap_djicameraposition_getzoom_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getZoom</h6></div>

~~~java
 float getZoom() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.models</td></tr></table></html>



##### Description:



<font color="#666">Gets the zoom level of the camera.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The zoom level of the camera.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_djicameraposition_gettilt"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_djicameraposition_gettilt_inline">getTilt</a></div></div><div class="inline-doc" id="djimap_djicameraposition_gettilt_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTilt</h6></div>

~~~java
 float getTilt() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.models</td></tr></table></html>



##### Description:



<font color="#666">Gets the tilt of the camera.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The tilt of the camera.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_djicameraposition_getbearing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_djicameraposition_getbearing_inline">getBearing</a></div></div><div class="inline-doc" id="djimap_djicameraposition_getbearing_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBearing</h6></div>

~~~java
 float getBearing() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.models</td></tr></table></html>



##### Description:



<font color="#666">Gets the orientation of the camera.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The orientation of the camera.</i></td></tr></table></html></div>


