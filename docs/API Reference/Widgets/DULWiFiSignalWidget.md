<div class="article"><h1 ><font color="#AAA">class </font>WiFiSignalWidget</h1></div>

~~~java
 class WiFiSignalWidget extends DULFrameLayoutWidget 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>DULFrameLayoutWidget</code></td></tr></table></html>



##### Display:

<br style="clear:both" />

<font color="#666">Widget that displays the aircraft's WiFi signal strength and channel.



##### Usage:



<font color="#666">Preferred Aspect Ratio: 1:1



##### Class Members:

<div class="api-row" id="dulwifisignalwidget_onwifisignalchange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#dulwifisignalwidget_onwifisignalchange_inline">onWifiSignalChange</a></div></div><div class="inline-doc" id="dulwifisignalwidget_onwifisignalchange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onWifiSignalChange</h6></div>

~~~java
@MainThread
@Keep
 void onWifiSignalChange(@IntRange(from=0, to=100) int signalValue) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ui.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when WiFi signal changes.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from=0, to=100) int <font color="#000">signalValue</td><td><font color="#666"><i>0 - 100; 0 means no signal, 100 means the best of the signal strength.</i></td></tr></table></html></div>


