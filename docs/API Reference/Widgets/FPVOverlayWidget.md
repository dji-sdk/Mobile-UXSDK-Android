<div class="article"><h1 ><font color="#AAA">class </font>FPVOverlayWidget</h1></div>

~~~java
 class FPVOverlayWidget extends FrameLayoutWidget implements View.OnTouchListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>FrameLayoutWidget implements View.OnTouchListener</code></td></tr></table></html>



##### Display:

<br style="clear:both" />

<font color="#666">Single tap will show the selected target on top of the <code><a href="/Widgets/DULFPVWidget.html#dulfpvwidget">FPVWidget</a></code>. <br>Has two modes with two different icons.
  - Focus mode will have a green square icon.
  - Meter mode will have a yellow circle icon.

Press and hold will show the gimbal control.

  - Small white dot will stay at where user first taps the screen to indicate the anchor point.
  - Blue circle will follow user's drag. Together with the anchor point, this dictates the gimbal movement. <br>

When grid mode is turned on (using the <code><a href="/Widgets/CameraSettingAdvancedPanel.html#camerasettingadvancedpanel">CameraSettingAdvancedPanel</a></code>), this also shows the grid lines. When center  point is turned on  (using the <code><a href="/Widgets/CameraSettingAdvancedPanel.html#camerasettingadvancedpanel">CameraSettingAdvancedPanel</a></code>), this also shows the center point.



##### Interaction:



<font color="#666">Tapping in focus mode will select that point as focus target point. Tapping in meter mode will select that point as exposure meter target point. <br><br>Press and hold will activate gimbal control mode. Dragging gimbal control will move the gimbal accordingly.



##### Usage:



<font color="#666">Should be the same size and placed on top of <code><a href="/Widgets/FPVOverlayWidget.html#fpvoverlaywidget">FPVOverlayWidget</a></code>.



##### Class Members:

<div class="api-row" id="fpvoverlaywidget_setspotmeteringenabled"><div class="api-col left">Value</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#fpvoverlaywidget_setspotmeteringenabled_inline">setSpotMeteringEnabled</a></div></div><div class="inline-doc" id="fpvoverlaywidget_setspotmeteringenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSpotMeteringEnabled</h6></div>

~~~java
 void setSpotMeteringEnabled(boolean isSpotMeteringEnabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Enable or disable spot metering by this method.  Enabled by default.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isSpotMeteringEnabled</td><td><font color="#666"><i><code>true</code> to enable, <code>false</code> to disable.</i></td></tr></table></html></div>

<div class="api-row" id="fpvoverlaywidget_isspotmeteringenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#fpvoverlaywidget_isspotmeteringenabled_inline">isSpotMeteringEnabled</a></div></div><div class="inline-doc" id="fpvoverlaywidget_isspotmeteringenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isSpotMeteringEnabled</h6></div>

~~~java
 boolean isSpotMeteringEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Method to check if spot metering using touch is enabled.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if enabled, <code>false</code> if disabled.</i></td></tr></table></html></div>

<div class="api-row" id="fpvoverlaywidget_setgimbalcontrolenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#fpvoverlaywidget_setgimbalcontrolenabled_inline">setGimbalControlEnabled</a></div></div><div class="inline-doc" id="fpvoverlaywidget_setgimbalcontrolenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGimbalControlEnabled</h6></div>

~~~java
 void setGimbalControlEnabled(boolean isGimbalControlEnabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Enable or disable gimbal control by this method. Enabled by default.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isGimbalControlEnabled</td><td><font color="#666"><i><code>true</code> to enable, <code>false</code> to disable.</i></td></tr></table></html></div>

<div class="api-row" id="fpvoverlaywidget_isgimbalcontrolenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#fpvoverlaywidget_isgimbalcontrolenabled_inline">isGimbalControlEnabled</a></div></div><div class="inline-doc" id="fpvoverlaywidget_isgimbalcontrolenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isGimbalControlEnabled</h6></div>

~~~java
 boolean isGimbalControlEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Method to check if gimbal control using touch is enabled.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if enabled, <code>false</code> if disabled.</i></td></tr></table></html></div>

<div class="api-row" id="fpvoverlaywidget_settouchfocusenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#fpvoverlaywidget_settouchfocusenabled_inline">setTouchFocusEnabled</a></div></div><div class="inline-doc" id="fpvoverlaywidget_settouchfocusenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTouchFocusEnabled</h6></div>

~~~java
 void setTouchFocusEnabled(boolean isTouhFocusEnabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Enable or disable Touch to Focus by this method.  Enabled by default.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isTouhFocusEnabled</td><td><font color="#666"><i><code>true</code> to enable, <code>false</code> to disable.</i></td></tr></table></html></div>

<div class="api-row" id="fpvoverlaywidget_istouchfocusenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#fpvoverlaywidget_istouchfocusenabled_inline">isTouchFocusEnabled</a></div></div><div class="inline-doc" id="fpvoverlaywidget_istouchfocusenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isTouchFocusEnabled</h6></div>

~~~java
 boolean isTouchFocusEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Method to check if Touch to Focus is enabled.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if enabled, <code>false</code> if disabled.</i></td></tr></table></html></div>

<div class="api-row" id="fpvoverlaywidget_setgridoverlayvisibility"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#fpvoverlaywidget_setgridoverlayvisibility_inline">setGridOverlayEnabled</a></div></div><div class="inline-doc" id="fpvoverlaywidget_setgridoverlayvisibility_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGridOverlayEnabled</h6></div>

~~~java
 void setGridOverlayEnabled(boolean isGridOverlayEnabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Defaults to <code>true</code>. If <code>true</code>, FPVOverlayWidget will display grid setting if prompted by the user via the CameraGridListWidget. Setting this to <code>false</code> means the grid will never be displayed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isGridOverlayEnabled</td><td><font color="#666"><i><code>true</code> to enable, <code>false</code> to disable.</i></td></tr></table></html></div>

<div class="api-row" id="fpvoverlaywidget_isgridoverlayenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#fpvoverlaywidget_isgridoverlayenabled_inline">isGridOverlayEnabled</a></div></div><div class="inline-doc" id="fpvoverlaywidget_isgridoverlayenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isGridOverlayEnabled</h6></div>

~~~java
 boolean isGridOverlayEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">If <code>true</code>, FPVOverlayWidget will display grid setting if prompted by the user via the CameraGridListWidget. If <code>false</code>, the grid will never be displayed.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> to enable, <code>false</code> to disable.</i></td></tr></table></html></div>

<div class="api-row" id="fpvoverlaywidget_setcurrentgridoverlaytype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#fpvoverlaywidget_setcurrentgridoverlaytype_inline">setCurrentGridOverlayType</a></div></div><div class="inline-doc" id="fpvoverlaywidget_setcurrentgridoverlaytype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCurrentGridOverlayType</h6></div>

~~~java
 void setCurrentGridOverlayType(GridOverlayType type) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Sets the type of the grid overlay.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/FPVOverlayWidget.html#fpvoverlaywidget_gridoverlaytype">GridOverlayType</a> <font color="#000">type</td><td><font color="#666"><i>The grid overlay type.</i></td></tr></table></html></div>

<div class="api-row" id="fpvoverlaywidget_getcurrentgridoverlaytype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#fpvoverlaywidget_getcurrentgridoverlaytype_inline">getCurrentGridOverlayType</a></div></div><div class="inline-doc" id="fpvoverlaywidget_getcurrentgridoverlaytype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentGridOverlayType</h6></div>

~~~java
 GridOverlayType getCurrentGridOverlayType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Gets the current type of the grid overlay.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/FPVOverlayWidget.html#fpvoverlaywidget_gridoverlaytype">GridOverlayType</a></td><td><font color="#666"><i>The current grid overlay type.</i></td></tr></table></html></div>

<div class="api-row" id="fpvoverlaywidget_gridoverlaytype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#fpvoverlaywidget_gridoverlaytype_inline">GridOverlayType</a></div></div><div class="inline-doc" id="fpvoverlaywidget_gridoverlaytype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>GridOverlayType</h6></div>

~~~java
 enum GridOverlayType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Represents the types of grid lines that can be set to be on top of the FPV.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#fpvoverlaywidget_gridoverlaytype_none_inline"></a>NONE</td><td><font color="#666">No grid lines are visible.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#fpvoverlaywidget_gridoverlaytype_parallel_inline"></a>PARALLEL</td><td><font color="#666">Horizontal and vertical grid lines are visible using a 3x3 grid.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#fpvoverlaywidget_gridoverlaytype_parallel_diagonal_inline"></a>PARALLEL_DIAGONAL</td><td><font color="#666">Same as <code>FPVOverlayWidget_GridOverlayType_PARALLEL</code> with the addition of 2 diagonal lines running through the center.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#fpvoverlaywidget_gridoverlaytype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The type of grid is unknown.</td></tr></table></html>

##### Class Members:

</div>


