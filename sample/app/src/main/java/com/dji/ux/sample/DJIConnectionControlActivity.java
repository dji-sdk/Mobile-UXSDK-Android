package com.dji.ux.sample;

import android.app.Activity;
import android.content.Intent;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.view.View;

/**
 * This activity will launch when a USB accessory is attached and attempt to connect to the USB
 * accessory.
 */
public class DJIConnectionControlActivity extends Activity {

    public static final String ACCESSORY_ATTACHED = "com.dji.ux.sample.ACCESSORY_ATTACHED";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new View(this));

        Intent usbIntent = getIntent();
        if (usbIntent != null) {
            String action = usbIntent.getAction();
            if (UsbManager.ACTION_USB_ACCESSORY_ATTACHED.equals(action)) {
                Intent attachedIntent=new Intent();
                attachedIntent.setAction(ACCESSORY_ATTACHED);
                sendBroadcast(attachedIntent);
            }
        }

        finish();
    }
}