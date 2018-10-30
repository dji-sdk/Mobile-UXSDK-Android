<div class="article"><h1 ><font color="#AAA">class </font>DJIMap</h1></div>

~~~java
 class DJIMap 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">The public interface of map object.



##### Class Members:

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

<div class="api-row" id="djimap_setoncamerachangelistener"><div class="api-col left">Set Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_setoncamerachangelistener_inline">setOnCameraChangeListener</a></div></div><div class="inline-doc" id="djimap_setoncamerachangelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setOnCameraChangeListener</h6></div>

~~~java
    void setOnCameraChangeListener(final OnCameraChangeListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Sets the <code>DJIMap_onCameraChangeListenerInterface</code> which can listen to camera changes.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final OnCameraChangeListener <font color="#000">listener</td><td><font color="#666"><i>The listener that is added to this map.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_setonmarkerclicklistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_setonmarkerclicklistener_inline">setOnMarkerClickListener</a></div></div><div class="inline-doc" id="djimap_setonmarkerclicklistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setOnMarkerClickListener</h6></div>

~~~java
    void setOnMarkerClickListener(OnMarkerClickListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Sets the <code><a href="/Widgets/DJIMap.html#djimap_onmarkerclicklistenerinterface"></a></code> which can listen click events on the map's markers.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">OnMarkerClickListener <font color="#000">listener</td><td><font color="#666"><i>The listener that is added to this map.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_setonmapclicklistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_setonmapclicklistener_inline">setOnMapClickListener</a></div></div><div class="inline-doc" id="djimap_setonmapclicklistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setOnMapClickListener</h6></div>

~~~java
    void setOnMapClickListener(OnMapClickListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Sets the <code><a href="/Widgets/DJIMap.html#djimap_onmapclicklistenerinterface"></a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">OnMapClickListener <font color="#000">listener</td><td><font color="#666"><i>The listener that is added to this map.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_removealloncamerachangelisteners"><div class="api-col left">Remove Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_removealloncamerachangelisteners_inline">removeAllOnCameraChangeListeners</a></div></div><div class="inline-doc" id="djimap_removealloncamerachangelisteners_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllOnCameraChangeListeners</h6></div>

~~~java
    void removeAllOnCameraChangeListeners()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Removes all instances of <code>DJIMap_onCameraChangeListenerInterface</code> from the map.

</div>

<div class="api-row" id="djimap_removeonmarkerclicklistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_removeonmarkerclicklistener_inline">removeOnMarkerClickListener</a></div></div><div class="inline-doc" id="djimap_removeonmarkerclicklistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeOnMarkerClickListener</h6></div>

~~~java
    void removeOnMarkerClickListener()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Removes the <code><a href="/Widgets/DJIMap.html#djimap_onmarkerclicklistenerinterface"></a></code> from the map.

</div>

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

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DJIMap.html#djimap_maptype">MapType</a> <font color="#000">type</td><td><font color="#666"><i>The map type that the map will be set to.</i></td></tr></table></html></div>

<div class="api-row" id="djimap_removeonmapclicklistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimap_removeonmapclicklistener_inline">removeOnMapClickListener</a></div></div><div class="inline-doc" id="djimap_removeonmapclicklistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeOnMapClickListener</h6></div>

~~~java
    void removeOnMapClickListener()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">com.dji.mapkit.core.maps</td></tr></table></html>



##### Description:



<font color="#666">Removes the <code><a href="/Widgets/DJIMap.html#djimap_onmapclicklistenerinterface"></a></code> from the map.

</div>

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

<div class="api-row" id="djimap_djimarker"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Widgets/DJIMap_DJIMarker.html">DJIMarker</a></div></div><div class="api-row" id="djimap_djimarkeroptions"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Widgets/DJIMap_DJIMarkerOptions.html">DJIMarkerOptions</a></div></div><div class="api-row" id="djimap_djicameraposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Widgets/DJIMap_DJICameraPosition.html">DJICameraPosition</a></div></div><div class="api-row" id="djimap_djilatlng"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Widgets/DJIMap_DJILatLng.html">DJILatLng</a></div></div>
