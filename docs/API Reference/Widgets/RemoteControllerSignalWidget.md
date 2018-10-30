<div class="article"><h1 ><font color="#AAA">class </font>RemoteControlSignalWidget</h1></div>

~~~java
 class RemoteControlSignalWidget extends FrameLayoutWidget 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>FrameLayoutWidget</code></td></tr></table></html>



##### Display:

![uilib_image](/assets/RC.gif)<br style="clear:both" />

<font color="#666">Icon with 5 vertical bars total represents the current signal strength between RC and aircraft.



##### Usage:



<font color="#666">Preferred Aspect Ratio: 19:11.



##### Class Members:

<div class="api-row" id="remotecontrollersignalwidget_onremotecontrollersignalstrengthchange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#remotecontrollersignalwidget_onremotecontrollersignalstrengthchange_inline">onRemoteControllerSignalStrengthChange</a></div></div><div class="inline-doc" id="remotecontrollersignalwidget_onremotecontrollersignalstrengthchange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onRemoteControllerSignalStrengthChange</h6></div>

~~~java
@MainThread
@Keep
 void onRemoteControllerSignalStrengthChange(@IntRange(from = 0, to = 100) int signalValue) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when the value of remote controller signal strength changes



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">signalValue</td><td><font color="#666"><i>0 - 100; 0 means no signal, 100 means the best signal strength.</i></td></tr></table></html></div>


