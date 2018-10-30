<div class="article"><h1 ><font color="#AAA">class </font>PreFlightStatusWidget</h1></div>

~~~java
 class PreFlightStatusWidget extends BaseFrameLayout 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>BaseFrameLayout</code></td></tr></table></html>



##### Display:

<br style="clear:both" />

<font color="#666">The text shows a summary of the preflight checklist situation of the aircraft. The color of the background changes depends on how severe the situation is. Green indicates everything is ok. Yellow indicates something is at warning level. Red indicates something is wrong and aircraft won't take off.



##### Interaction:



<font color="#666">Tapping on status text will toggle between show and hide <code><a href="/Widgets/PreFlightCheckListPanel.html#preflightchecklistpanel">PreFlightCheckListPanel</a></code>.



##### Usage:



<font color="#666">Preferred Aspect Ratio: 238:33.



##### Class Members:

<div class="api-row" id="preflightstatuswidget_statustype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#preflightstatuswidget_statustype_inline">StatusType</a></div></div><div class="inline-doc" id="preflightstatuswidget_statustype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>StatusType</h6></div>

~~~java
 enum StatusType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Pre-flight status types.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#preflightstatuswidget_statustype_offline_inline"></a>OFFLINE</td><td><font color="#666">The pre-flight status type is offline.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#preflightstatuswidget_statustype_good_inline"></a>GOOD</td><td><font color="#666">The pre-flight status type is good.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#preflightstatuswidget_statustype_warning_inline"></a>WARNING</td><td><font color="#666">The pre-flight status type is warning.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#preflightstatuswidget_statustype_error_inline"></a>ERROR</td><td><font color="#666">The pre-flight status type is error.</td></tr></table></html>

##### Class Members:

</div>


