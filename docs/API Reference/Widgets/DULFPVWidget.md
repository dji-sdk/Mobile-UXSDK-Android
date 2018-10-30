<div class="article"><h1 ><font color="#AAA">class </font>FPVWidget</h1></div>

~~~java
 class FPVWidget extends TextureViewWidget implements SurfaceTextureListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>TextureViewWidget implements SurfaceTextureListener</code></td></tr></table></html>



##### Display:

<br style="clear:both" />

<font color="#666">The video feed from camera.



##### Usage:



<font color="#666">To allow user to interact with the video feed, use this widget in conjunction with <code></code>FPVOverlayWidget



##### Class Members:

<div class="api-row" id="dulfpvwidget_setvideosource"><div class="api-col left">Video Source</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulfpvwidget_setvideosource_inline">setVideoSource</a></div></div><div class="inline-doc" id="dulfpvwidget_setvideosource_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVideoSource</h6></div>

~~~java
 void setVideoSource(VideoSource videoSource) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">User can set video source to these three options: AUTO, PRIMARY, SECONDARY. By default, the video source is set to "AUTO" if user does not specify it.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DULFPVWidget.html#dulfpvwidget_videosource">VideoSource</a> <font color="#000">videoSource</td><td><font color="#666"><i>An enum value of <code><a href="/Widgets/DULFPVWidget.html#dulfpvwidget_videosource">VideoSource</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="dulfpvwidget_getvideosource"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulfpvwidget_getvideosource_inline">getVideoSource</a></div></div><div class="inline-doc" id="dulfpvwidget_getvideosource_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoSource</h6></div>

~~~java
 VideoSource getVideoSource() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Retrieves the type of the video feed selection.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/DULFPVWidget.html#dulfpvwidget_videosource">VideoSource</a></td><td><font color="#666"><i>An enum value of <code><a href="/Widgets/DULFPVWidget.html#dulfpvwidget_videosource">VideoSource</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="dulfpvwidget_setsourcecameranamevisibility"><div class="api-col left">Source Camera Name</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulfpvwidget_setsourcecameranamevisibility_inline">setSourceCameraNameVisibility</a></div></div><div class="inline-doc" id="dulfpvwidget_setsourcecameranamevisibility_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSourceCameraNameVisibility</h6></div>

~~~java
 void setSourceCameraNameVisibility(boolean isVisible) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Shows or Hides the video feed source's camera name on the video feed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isVisible</td><td><font color="#666"><i>A boolean value that determines whether to show the source camera name.</i></td></tr></table></html></div>

<div class="api-row" id="duxfpvwidget_setsourcecamerasidevisibility"><div class="api-col left">Source Camera Side</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxfpvwidget_setsourcecamerasidevisibility_inline">setSourceCameraSideVisibility</a></div></div><div class="inline-doc" id="duxfpvwidget_setsourcecamerasidevisibility_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSourceCameraSideVisibility</h6></div>

~~~java
 void setSourceCameraSideVisibility(boolean isVisible) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Flag to show/hide the side (starboard / port) of the camera on the video feed. Only works on aircrafts that support multiple gimbals.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isVisible</td><td><font color="#666"><i>A boolean value that determines whether to show the source camera side.</i></td></tr></table></html></div>

<div class="api-row" id="dulfpvwidget_videosource"><div class="api-col left">Video Source Enum</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#dulfpvwidget_videosource_inline">VideoSource</a></div></div><div class="inline-doc" id="dulfpvwidget_videosource_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VideoSource</h6></div>

~~~java
 enum VideoSource 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Options for the user to select the video feed to associate with the FPVWidget. Please  be aware that the video feed can only associate with one FPVWidget object. If several  FPVWidget objects are associated with the same VideoSource, only the last one can get the live video.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#dulfpvwidget_videosource_auto_inline"></a>AUTO</td><td><font color="#666">Auto switch from PRIMARY video feed to SECONDARY video feed to show the DJICamera live video when connecting with M600, M600Pro, A3, or N3 product. It is PRIMARY video feed by default when connecting with other products.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#dulfpvwidget_videosource_primary_inline"></a>PRIMARY</td><td><font color="#666">The first video feed of getVideoFeeds array list in VideoFeeder singleton object.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#dulfpvwidget_videosource_secondary_inline"></a>SECONDARY</td><td><font color="#666">The second video feed of getVideoFeeds array list in VideoFeeder singleton object.</td></tr></table></html>

##### Class Members:

</div>


