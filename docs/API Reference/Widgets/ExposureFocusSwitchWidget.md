<div class="article"><h1 ><font color="#AAA">class </font>FocusExposureSwitchWidget</h1></div>

~~~java
 class FocusExposureSwitchWidget extends FrameLayoutWidget implements ImageButton.OnClickListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>FrameLayoutWidget implements ImageButton.OnClickListener</code></td></tr></table></html>



##### Display:

<br style="clear:both" />

<font color="#666">Widget has two visual states to indicate the current tapping interaction mode with <code><a href="/Widgets/FPVOverlayWidget.html#fpvoverlaywidget">FPVOverlayWidget</a></code>.
  - Green square indicates focus mode. In this mode, tapping on
  <code><a href="/Widgets/FPVOverlayWidget.html#fpvoverlaywidget">FPVOverlayWidget</a></code> will select a target focus point.
  - Yellow circle indicates meter mode. In this mode, tapping on
  <code><a href="/Widgets/FPVOverlayWidget.html#fpvoverlaywidget">FPVOverlayWidget</a></code> will select a exposure metering target point.



##### Interaction:



<font color="#666">Tapping will toggle between Focus and Meter mode.



##### Usage:



<font color="#666">Preferred Aspect Ratio: 1:1


