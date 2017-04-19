package com.dji.ui.sample;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import dji.common.error.DJIError;
import dji.common.error.DJISDKError;
import dji.sdk.base.BaseProduct;
import dji.sdk.sdkmanager.DJISDKManager;

/**
 * Register app
 */
public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DJISDKManager.getInstance().registerApp(this, mSDKManagerCallback);
    }

    private DJISDKManager.SDKManagerCallback mSDKManagerCallback = new DJISDKManager.SDKManagerCallback() {

        @Override
        public void onRegister(DJIError error) {
            if (error == DJISDKError.REGISTRATION_SUCCESS) {
                DJISDKManager.getInstance().startConnectionToProduct();
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                    }
                });

            } else {
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),
                                       "register sdk fails, check network is available",
                                       Toast.LENGTH_LONG).show();
                    }
                });

            }

        }

        @Override
        public void onProductChange(BaseProduct djiBaseProduct, BaseProduct djiBaseProduct1) {
        }
    };
}
