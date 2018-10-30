<div class="article"><h1 ><font color="#AAA">class </font>GPSSignalWidget</h1></div>

~~~java
 class GPSSignalWidget extends FrameLayoutWidget 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>FrameLayoutWidget</code></td></tr></table></html>



##### Display:

![uilib_image](/assets/GPS.gif)<br style="clear:both" />

<font color="#666">Small number on top of satellite icon shows the number of satellite available. 5 vertical bars represents the current GPS signal strength. Small 'R' letter shown or hidden indicates weather RTK is enabled or not.



##### Usage:



<font color="#666">Preferred Aspect Ratio: 21:11.



##### Class Members:

<div class="api-row" id="gpssignalwidget_ongpssignalstatuschange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#gpssignalwidget_ongpssignalstatuschange_inline">onGPSSignalStatusChange</a></div></div><div class="inline-doc" id="gpssignalwidget_ongpssignalstatuschange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onGPSSignalStatusChange</h6></div>

~~~java
@MainThread
@Keep
 void onGPSSignalStatusChange(@Nullable GPSSignalLevel status) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when GPSSignalLevel changes



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable GPSSignalLevel <font color="#000">status</td><td><font color="#666"><i>status of the GPS signal quality. Level0 ~ Level5; Level0 means no signal, Level5 means the best signal quality.</i></td></tr></table></html></div>

<div class="api-row" id="gpssignalwidget_onrtkenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#gpssignalwidget_onrtkenabled_inline">onRTKEnabled</a></div></div><div class="inline-doc" id="gpssignalwidget_onrtkenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onRTKEnabled</h6></div>

~~~java
@MainThread
@Keep
 void onRTKEnabled(boolean isRTKEnabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when RTK is enabled or disabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isRTKEnabled</td><td><font color="#666"><i><code>true</code> means the RTK is enabled, <code>false</code> otherwise</i></td></tr></table></html></div>

<div class="api-row" id="gpssignalwidget_onsatellitenumberchange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#gpssignalwidget_onsatellitenumberchange_inline">onSatelliteNumberChange</a></div></div><div class="inline-doc" id="gpssignalwidget_onsatellitenumberchange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onSatelliteNumberChange</h6></div>

~~~java
@MainThread
@Keep
 void onSatelliteNumberChange(int satelliteNum) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when the number of available satellites changes



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">satelliteNum</td><td><font color="#666"><i>current number of available satellites</i></td></tr></table></html></div>


