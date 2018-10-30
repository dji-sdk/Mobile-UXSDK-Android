<div class="article"><h1 ><font color="#AAA">class </font>CompassCalibratingWorkFlow</h1></div>

~~~java
 class CompassCalibratingWorkFlow extends SimpleFrameLayoutWidget 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.workflow</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>SimpleFrameLayoutWidget</code></td></tr></table></html>



##### Display:

<br style="clear:both" />

<font color="#666">The progress of compas calibration.



##### Interaction:



<font color="#666">Depends on the step, there will be buttons at the bottom of the dialog for the user to interact. The user can either quit out of or continue with the process.



##### Usage:



<font color="#666">To step the user through the compass calibration process



##### Class Members:

<div class="api-row" id="compasscalibratingworkflow_startcalibration"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#compasscalibratingworkflow_startcalibration_inline">startCalibration</a></div></div><div class="inline-doc" id="compasscalibratingworkflow_startcalibration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startCalibration</h6></div>

~~~java
 static void startCalibration(final ActionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.workflow</td></tr></table></html>



##### Description:



<font color="#666">Call this to send the start calibration command to the aircraft. As soon as the aircraft sends back the progress data, a dialog will show up to guide the user through the process.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final ActionCallback <font color="#000">callback</td><td><font color="#666"><i>ActionCallback.</i></td></tr></table></html></div>

<div class="api-row" id="compasscalibratingworkflow_stopcalibration"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#compasscalibratingworkflow_stopcalibration_inline">stopCalibration</a></div></div><div class="inline-doc" id="compasscalibratingworkflow_stopcalibration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopCalibration</h6></div>

~~~java
 static void stopCalibration(final ActionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.workflow</td></tr></table></html>



##### Description:



<font color="#666">Call this to send the stop calibration command to the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final ActionCallback <font color="#000">callback</td><td><font color="#666"><i>ActionCallback.</i></td></tr></table></html></div>


