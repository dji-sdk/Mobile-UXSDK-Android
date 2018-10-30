<div class="article"><h1 ><font color="#AAA">class </font>BatteryWidget</h1></div>

~~~java
 class BatteryWidget extends DynamicFrameLayoutWidget 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>DynamicFrameLayoutWidget</code></td></tr></table></html>



##### Description:



<font color="#666"><p> This widget is configurable to hide some of the subviews. Use the attribute "excludeView" with flags corresponding to each subview to hide.  Here are all the flags: <p> <ul><code>batteryIcon, percentage, singleVoltage, doubleVoltage</code></ul> <p> Note that multiple flags can be used simultaneously by logically OR'ing them. For example, if user wants to hide voltage subviews in the widget, it can be done by following two steps. <p> Define custom xmlns in its layout file:
    <ul><code>xmlns:custom="http://schemas.android.com/apk/res-auto"</code></ul>
<p> Then, add following attribute to the BatteryWidget:
   <ul><code>custom:excludeView="singleVoltage|doubleVoltage"</code></ul>



##### Display:

![uilib_image](/assets/BATTERY.gif)<br style="clear:both" />

<font color="#666">Battery icon has two color states. White color indicates everything is ok. Icon will change into red color if aircraft needs to return home, land immediately, or battery connection is bad. Text shows percentage of charge remaining in battery. Text also has two color states. Green indicates the percentage is ok. Red indicates the percentage is either below or just enough for returning home or landing immediately.



##### Usage:



<font color="#666">Preferred Aspect Ratio: 28:11.



##### Class Members:

<div class="api-row" id="duxbatterywidget_onbatterypercentagechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxbatterywidget_onbatterypercentagechange_inline">onBatteryPercentageChange</a></div></div><div class="inline-doc" id="duxbatterywidget_onbatterypercentagechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onBatteryPercentageChange</h6></div>

~~~java
@MainThread
@Keep
 void onBatteryPercentageChange(@IntRange(from = 0, to = 100) int percentage) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when battery percentage changes



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">percentage</td><td><font color="#666"><i>from 0 - 100; 0 means empty, 100 means full.</i></td></tr></table></html></div>

<div class="api-row" id="duxbatterywidget_onbatteryconnectionstatechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxbatterywidget_onbatteryconnectionstatechange_inline">onBatteryConnectionStateChange</a></div></div><div class="inline-doc" id="duxbatterywidget_onbatteryconnectionstatechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onBatteryConnectionStateChange</h6></div>

~~~java
@MainThread
@Keep
 void onBatteryConnectionStateChange(@Nullable ConnectionState status) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when DJIBatteryConnectionState changes



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable ConnectionState <font color="#000">status</td><td><font color="#666"><i>Normal, means the battery status is good, other values mean the battery is in error state.</i></td></tr></table></html></div>

<div class="api-row" id="duxbatterywidget_onremainingbatterystatechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#duxbatterywidget_onremainingbatterystatechange_inline">onRemainingBatteryStateChange</a></div></div><div class="inline-doc" id="duxbatterywidget_onremainingbatterystatechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onRemainingBatteryStateChange</h6></div>

~~~java
@MainThread
@Keep
 void onRemainingBatteryStateChange(@Nullable BatteryThresholdBehavior warningLevel) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when warning level of battery changes



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable BatteryThresholdBehavior <font color="#000">warningLevel</td><td><font color="#666"><i>Normal, means the battery energy is good. Low, means the battery energy is OK to go home. VeryLow, means the battery energy is only for landing immediately.</i></td></tr></table></html></div>


