package com.dji.ux.sample;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

import com.secneo.sdk.Helper;

import static com.dji.ux.sample.DJIConnectionControlActivity.ACCESSORY_ATTACHED;

public class MApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BroadcastReceiver br = new OnDJIUSBAttachedReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(ACCESSORY_ATTACHED);
        registerReceiver(br, filter);
    }

    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MApplication.this);
    }
}
