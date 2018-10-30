<div class="article"><h1 ><font color="#AAA">class </font>VisionWidget</h1></div>

~~~java
 class VisionWidget extends FrameLayoutWidget 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>FrameLayoutWidget</code></td></tr></table></html>



##### Display:

![uilib_image](/assets/VISION.gif)<br style="clear:both" />

<font color="#666">Widget has two visual states to show if Visual Positioning is being used.
  - White icon indicates Visual Positioning is being used.
  - Red icon indicates Visual Positioning is not being used.



##### Usage:



<font color="#666">Preferred Aspect Ratio: 1:1.



##### Class Members:

<div class="api-row" id="visionwidget_onisvisionusedchange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#visionwidget_onisvisionusedchange_inline">onIsVisionUsedChange</a></div></div><div class="inline-doc" id="visionwidget_onisvisionusedchange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onIsVisionUsedChange</h6></div>

~~~java
@MainThread
@Keep
 void onIsVisionUsedChange(VisionSystemStatus visionSystemStatus,
                                     AvoidanceSensorStatus avoidanceSensorStatus) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when the vision detection state changes



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/VisionWidget.html#visionwidget_visionsystemstatus">VisionSystemStatus</a> <font color="#000">visionSystemStatus</td><td><font color="#666"><i>The status of the vision system. NORMAL means the vision system is working and being used by flight controller. DISABLED or CLOSED means the vision sensor is not used.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Widgets/VisionWidget.html#visionwidget_avoidancesensorstatus">AvoidanceSensorStatus</a> <font color="#000">avoidanceSensorStatus</td><td><font color="#666"><i>The status of the omnidirectional obstacle avoidance sensors. ALL means all sensors are working. FRONT_BACK means only the front and back sensors are working. NONE or CLOSED means the avoidance sensors are not used.</i></td></tr></table></html></div>

<div class="api-row" id="visionwidget_visionsystemstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#visionwidget_visionsystemstatus_inline">VisionSystemStatus</a></div></div><div class="inline-doc" id="visionwidget_visionsystemstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VisionSystemStatus</h6></div>

~~~java
 enum VisionSystemStatus 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">The status of the vision system.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#visionwidget_visionsystemstatus_closed_inline"></a>CLOSED</td><td><font color="#666">User avoidance is disabled by the user.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#visionwidget_visionsystemstatus_disabled_inline"></a>DISABLED</td><td><font color="#666">The vision system is disabled. This could be due to the flight mode, tap mode,  tracking mode, or draw status.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#visionwidget_visionsystemstatus_normal_inline"></a>NORMAL</td><td><font color="#666">The vision system is functioning normally.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="visionwidget_avoidancesensorstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#visionwidget_avoidancesensorstatus_inline">AvoidanceSensorStatus</a></div></div><div class="inline-doc" id="visionwidget_avoidancesensorstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>AvoidanceSensorStatus</h6></div>

~~~java
 enum AvoidanceSensorStatus 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">The status of the omnidirectional obstacle avoidance sensors.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#visionwidget_avoidancesensorstatus_all_inline"></a>ALL</td><td><font color="#666">All vision systems are available.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#visionwidget_avoidancesensorstatus_front_back_inline"></a>FRONT_BACK</td><td><font color="#666">Only forward and backward vision systems are available. Left and right vision systems are only available in ActiveTrack mode and Tripod Mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#visionwidget_avoidancesensorstatus_none_inline"></a>NONE</td><td><font color="#666">Vision systems are not available. This could be due to the flight mode or hardware failure.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#visionwidget_avoidancesensorstatus_closed_inline"></a>CLOSED</td><td><font color="#666">Obstacle avoidance is disabled by the user.</td></tr></table></html>

##### Class Members:

</div>


