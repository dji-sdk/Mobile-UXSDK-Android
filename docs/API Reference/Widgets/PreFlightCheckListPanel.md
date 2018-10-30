<div class="article"><h1 ><font color="#AAA">class </font>PreFlightCheckListPanel</h1></div>

~~~java
 class PreFlightCheckListPanel extends ListViewWidget 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.panel</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>ListViewWidget</code></td></tr></table></html>



##### Description:



<font color="#666">To allow user to toggle hide and show this panel, use in conjunction with <code><a href="/Widgets/PreFlightStatusWidget.html#preflightstatuswidget">PreFlightStatusWidget</a></code>



##### Display:

<br style="clear:both" />

<font color="#666">Panel that shows the preflight checklist that includes a list of items (like IMU, GPS etc) and their state that roll up into an overall state. <p> This panel is configurable to hide some of the items. Use the attribute "excludeItem" with flags corresponding to each item to hide.  Here are all the flags: <p> <ul><code>overall, flightMode, compass, IMUStatus, ESCStatus, visionSensors, radioChannelQuality, remoteControllerMode, aircraftBattery, remoteControllerBattery, aircraftBatteryTemperature, remainingStorageCapacity, gimbalStatus</code></ul> <p> Note that multiple flags can be used simultaneously by logically OR'ing them. For example, if user wants to hide aircraft battery temperature item ad ESC Status item in the panel, it can be done by following two steps. <p> Define custom xmlns in its layout file:
    <ul><code>xmlns:custom="http://schemas.android.com/apk/res-auto"</code></ul>
<p> Then, add following attribute to the PreFlightCheckListPanel:
   <ul><code>custom:excludeItem="aircraftBatteryTemperature|ESCStatus"</code></ul>



##### Interaction:



<font color="#666">All the settings are presented in ListView hierarchy.


