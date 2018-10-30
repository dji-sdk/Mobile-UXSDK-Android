<div class="article"><h1 ><font color="#AAA">class </font>RemainingFlightTimeWidget</h1></div>

~~~java
 class RemainingFlightTimeWidget extends FrameLayoutWidget 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>FrameLayoutWidget</code></td></tr></table></html>



##### Display:

![uilib_image](/assets/FlightTime.gif)<br style="clear:both" />

<font color="#666">Has the same behavior as DJIGO's element. 1. The text inside white bubble shows the remaining flight time in minutes and seconds. 2. The middle line stretches along the width of the widget represents remaining battery percentage of the aircraft. If remaining battery is 100%, the line will cover the whole width of widget. If remaining battery is 0%, the line will disappear.
  - Red part of the line represents the battery percentage needed
  to land aircraft immediately.
  - Yellow part of the line represents the battery percentage needed to
  return aircraft home.
  - Green part of the line represents the battery percentage left to fly safely.
3. The two white dots represent the two settable battery threshold.
  - The first one from the left represents the land immediately threshold.
  - The second one represents the go home threshold.
4. The <code>H</code> icon is an addition to yellow part of the line. It represents the battery percentage needed to go home.


