<div class="article"><h1 ><font color="#AAA">class </font>TakeOffWidget</h1></div>

~~~java
 class TakeOffWidget extends ButtonWidget 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>ButtonWidget</code></td></tr></table></html>



##### Display:

![uilib_image](/assets/TAKEOFF.gif)<br style="clear:both" />

<font color="#666">Widget has three states with three different interactions.
 - White icon with arrow up indicates the aircraft is not flying and the widget
interaction is to start taking off.
 - White icon with arrow down indicates the aircraft is flying and the widget
 interaction is to start landing.
 - Red icon indicates the aircraft is landing and the widget interaction is
 to cancel landing.



##### Interaction:



<font color="#666">Tapping the widget will open up a Dialog to confirm the desired action. Slide the dialog from left to right to start the action.



##### Usage:



<font color="#666">Preferred Aspect Ratio: 1:1 Widget needs to be in Activity context to show Dialog



##### Class Members:

<div class="api-row" id="takeofflandwidget_ontakeoffstatuschange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#takeofflandwidget_ontakeoffstatuschange_inline">onTakeOffStatusChange</a></div></div><div class="inline-doc" id="takeofflandwidget_ontakeoffstatuschange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onTakeOffStatusChange</h6></div>

~~~java
@MainThread
@Keep
 void onTakeOffStatusChange(boolean isTakingOff) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when take off status changes.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isTakingOff</td><td><font color="#666"><i><code>true</code> if taking off, <code>false</code> otherwise</i></td></tr></table></html></div>

<div class="api-row" id="takeofflandwidget_onlandingstatuschange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#takeofflandwidget_onlandingstatuschange_inline">onLandingStatusChange</a></div></div><div class="inline-doc" id="takeofflandwidget_onlandingstatuschange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onLandingStatusChange</h6></div>

~~~java
@MainThread
@Keep
 void onLandingStatusChange(boolean isLanding) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when landing status changes.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isLanding</td><td><font color="#666"><i><code>true</code> if in process of landing, <code>false</code> otherwise</i></td></tr></table></html></div>

<div class="api-row" id="takeofflandwidget_performtakeoffaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#takeofflandwidget_performtakeoffaction_inline">performTakeOffAction</a></div></div><div class="inline-doc" id="takeofflandwidget_performtakeoffaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>performTakeOffAction</h6></div>

~~~java
@MainThread
@Keep
 void performTakeOffAction() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Performs take off action @see #<code><a href="/Widgets/TakeOffLandWidget.html#takeofflandwidget_ontakeoffactionresult">onTakeOffActionResult</a></code> to listen on the action result by overridding

</div>

<div class="api-row" id="takeofflandwidget_performlandingaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#takeofflandwidget_performlandingaction_inline">performLandingAction</a></div></div><div class="inline-doc" id="takeofflandwidget_performlandingaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>performLandingAction</h6></div>

~~~java
@MainThread
@Keep
 void performLandingAction() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Performs landing action @see #<code><a href="/Widgets/TakeOffLandWidget.html#takeofflandwidget_onlandingactionresult">onLandingActionResult</a></code> to listen on the action result by overridding

</div>

<div class="api-row" id="takeofflandwidget_performcancellandingaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#takeofflandwidget_performcancellandingaction_inline">performCancelLandingAction</a></div></div><div class="inline-doc" id="takeofflandwidget_performcancellandingaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>performCancelLandingAction</h6></div>

~~~java
@MainThread
@Keep
 void performCancelLandingAction() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Performs cancel landing action @see #<code><a href="/Widgets/TakeOffLandWidget.html#takeofflandwidget_oncancellandingactionresult">onCancelLandingActionResult</a></code> to listen on the action result by overridding

</div>

<div class="api-row" id="takeofflandwidget_performlandingconfirmationaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#takeofflandwidget_performlandingconfirmationaction_inline">performLandingConfirmationAction</a></div></div><div class="inline-doc" id="takeofflandwidget_performlandingconfirmationaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>performLandingConfirmationAction</h6></div>

~~~java
 void performLandingConfirmationAction() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Performs the landing confirmation action. This allows aircraft to land when landing  confirmation is received.

</div>

<div class="api-row" id="takeofflandwidget_ontakeoffactionresult"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#takeofflandwidget_ontakeoffactionresult_inline">onTakeOffActionResult</a></div></div><div class="inline-doc" id="takeofflandwidget_ontakeoffactionresult_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onTakeOffActionResult</h6></div>

~~~java
@MainThread
@Keep
 void onTakeOffActionResult(@Nullable DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when take off action completes @see #<code><a href="/Widgets/TakeOffLandWidget.html#takeofflandwidget_performtakeoffaction">performTakeOffAction</a></code>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable DJIError <font color="#000">error</td><td><font color="#666"><i>error object, or null if no error has occurred</i></td></tr></table></html></div>

<div class="api-row" id="takeofflandwidget_onlandingactionresult"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#takeofflandwidget_onlandingactionresult_inline">onLandingActionResult</a></div></div><div class="inline-doc" id="takeofflandwidget_onlandingactionresult_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onLandingActionResult</h6></div>

~~~java
@MainThread
@Keep
 void onLandingActionResult(@Nullable DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when landing action completes @see #<code><a href="/Widgets/TakeOffLandWidget.html#takeofflandwidget_performlandingaction">performLandingAction</a></code>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable DJIError <font color="#000">error</td><td><font color="#666"><i>error object, or null if no error has occurred</i></td></tr></table></html></div>

<div class="api-row" id="takeofflandwidget_oncancellandingactionresult"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#takeofflandwidget_oncancellandingactionresult_inline">onCancelLandingActionResult</a></div></div><div class="inline-doc" id="takeofflandwidget_oncancellandingactionresult_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onCancelLandingActionResult</h6></div>

~~~java
@MainThread
@Keep
 void onCancelLandingActionResult(@Nullable DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when cancel landing action completes @see #<code><a href="/Widgets/TakeOffLandWidget.html#takeofflandwidget_performcancellandingaction">performCancelLandingAction</a></code>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable DJIError <font color="#000">error</td><td><font color="#666"><i>error object, or null if no error has occurred</i></td></tr></table></html></div>

<div class="api-row" id="takeofflandwidget_onlandingconfirmedresult"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#takeofflandwidget_onlandingconfirmedresult_inline">onLandingConfirmedResult</a></div></div><div class="inline-doc" id="takeofflandwidget_onlandingconfirmedresult_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onLandingConfirmedResult</h6></div>

~~~java
@MainThread
@Keep
 void onLandingConfirmedResult(DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when confirm landing action completes.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">DJIError <font color="#000">error</td><td><font color="#666"><i>error object, or null if no error has occurred.</i></td></tr></table></html></div>

<div class="api-row" id="takeofflandwidget_ontakeoffenable"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#takeofflandwidget_ontakeoffenable_inline">onTakeOffEnable</a></div></div><div class="inline-doc" id="takeofflandwidget_ontakeoffenable_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onTakeOffEnable</h6></div>

~~~java
@MainThread
 void onTakeOffEnable(boolean enabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when TakeOff Widget changes between being enabled or not.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>Current state that is <code>true</code> if button is enabled.</i></td></tr></table></html></div>


