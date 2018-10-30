<div class="article"><h1 ><font color="#AAA">class </font>AutoExposureLockWidget</h1></div>

~~~java
 class AutoExposureLockWidget extends FrameLayoutWidget implements ImageButton.OnClickListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>FrameLayoutWidget implements ImageButton.OnClickListener</code></td></tr></table></html>



##### Display:

![uilib_image](/assets/EV.gif)<br style="clear:both" />

<font color="#666">A lock icon with two states shows whether the camera's AE (auto exposure) is locked or not.



##### Interaction:



<font color="#666">Tapping the lock icon will toggle the value of AE lock.



##### Usage:



<font color="#666">Preferred Aspect Ratio: 1:1



##### Class Members:

<div class="api-row" id="autoexposurelockwidget_onaelockchange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#autoexposurelockwidget_onaelockchange_inline">onAELockChange</a></div></div><div class="inline-doc" id="autoexposurelockwidget_onaelockchange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onAELockChange</h6></div>

~~~java
@MainThread
@Keep
 void onAELockChange(boolean isLocked) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Updates when AE Lock status has changed



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isLocked</td><td><font color="#666"><i><code>true</code> means AE is locked, <code>false</code> otherwise.</i></td></tr></table></html></div>

<div class="api-row" id="autoexposurelockwidget_performaelockaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#autoexposurelockwidget_performaelockaction_inline">performAELockAction</a></div></div><div class="inline-doc" id="autoexposurelockwidget_performaelockaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>performAELockAction</h6></div>

~~~java
@MainThread
@Keep
 void performAELockAction(final boolean isLock) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Performs auto exposure lock action @see #<code><a href="/Widgets/AutoExposureLockWidget.html#autoexposurelockwidget_onaelockactionresult">onAELockActionResult</a></code> to listen on the action result by overridding



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final boolean <font color="#000">isLock</td><td><font color="#666"><i><code>true</code> if auto exposure is to be locked</i></td></tr></table></html></div>

<div class="api-row" id="autoexposurelockwidget_onaelockactionresult"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#autoexposurelockwidget_onaelockactionresult_inline">onAELockActionResult</a></div></div><div class="inline-doc" id="autoexposurelockwidget_onaelockactionresult_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onAELockActionResult</h6></div>

~~~java
@MainThread
@Keep
 void onAELockActionResult(@Nullable DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.ux.widget</td></tr></table></html>



##### Description:



<font color="#666">Triggers when AE Lock action finishes



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable DJIError <font color="#000">error</td><td><font color="#666"><i>error object, or null if no error has occurred</i></td></tr></table></html></div>


