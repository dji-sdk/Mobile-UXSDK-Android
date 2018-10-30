<div class="article"><h1 ><font color="#AAA">class </font>FocusModeWidget</h1></div>

~~~java
 class FocusModeWidget extends FrameLayoutWidget implements ImageButton.OnClickListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>FrameLayoutWidget implements ImageButton.OnClickListener</code></td></tr></table></html>



##### Display:

![uilib_image](/assets/AFMF.gif)<br style="clear:both" />

<font color="#666">Shows the current focus mode of aircraft camera.
  - MF text highlighted (in green) indicates focus mode is MF.
  - AF text highlighted (in green) indicates focus mode is AF.



##### Interaction:



<font color="#666">Tapping will toggle between AF and MF mode.



##### Usage:



<font color="#666">Preferred Aspect Ratio: 1:1



##### Class Members:

<div class="api-row" id="manualfocuswidget"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Widgets/ManualFocusWidget.html">ManualFocusWidget</a></div></div><div class="api-row" id="focusmodewidget_onfocusmodechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#focusmodewidget_onfocusmodechange_inline">onFocusModeChange</a></div></div><div class="inline-doc" id="focusmodewidget_onfocusmodechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onFocusModeChange</h6></div>

~~~java
@MainThread
@Keep
 void onFocusModeChange(FocusMode focusMode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when FocusMode has changed



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">FocusMode <font color="#000">focusMode</td><td><font color="#666"><i>Camera focus mode enum</i></td></tr></table></html></div>

<div class="api-row" id="focusmodewidget_performfocusmodeaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#focusmodewidget_performfocusmodeaction_inline">performFocusModeAction</a></div></div><div class="inline-doc" id="focusmodewidget_performfocusmodeaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>performFocusModeAction</h6></div>

~~~java
@MainThread
@Keep
 void performFocusModeAction(FocusMode mode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Performs the FocusMode change action. @see #<code><a href="/Widgets/FocusModeWidget.html#focusmodewidget_onfocusmodeactionresult">onFocusModeActionResult</a></code> to listen on the action result by overridding



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">FocusMode <font color="#000">mode</td><td><font color="#666"><i>FocusMode enum value</i></td></tr></table></html></div>

<div class="api-row" id="focusmodewidget_onfocusmodeactionresult"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#focusmodewidget_onfocusmodeactionresult_inline">onFocusModeActionResult</a></div></div><div class="inline-doc" id="focusmodewidget_onfocusmodeactionresult_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onFocusModeActionResult</h6></div>

~~~java
@MainThread
@Keep
 void onFocusModeActionResult(@Nullable DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when focus mode action completes.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable DJIError <font color="#000">error</td><td><font color="#666"><i>error object, or null if no error has occurred</i></td></tr></table></html></div>


