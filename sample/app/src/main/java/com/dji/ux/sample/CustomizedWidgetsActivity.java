package com.dji.ux.sample;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import dji.ux.widget.FPVWidget;

public class CustomizedWidgetsActivity extends Activity {
    private final static String TAG = "CustomizedWidgetsActivity";
    private FPVWidget fpvWidget;
    private FPVWidget secondaryFpvWidget;
    private boolean isOriginalSize = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customized_widgets);

        fpvWidget = (FPVWidget)findViewById(R.id.fpv_custom_widget);
        secondaryFpvWidget = (FPVWidget)findViewById(R.id.secondary_fpv_widtet);
    }

    // On click event for button
    public void onAutoClick(View v){
        fpvWidget.setVideoSource(FPVWidget.VideoSource.AUTO);
    }

    // On click event for button
    public void onPrimaryClick(View v){
        fpvWidget.setVideoSource(FPVWidget.VideoSource.PRIMARY);
        secondaryFpvWidget.setVideoSource(FPVWidget.VideoSource.SECONDARY);
    }

    // On click event for button
    public void onSecondaryClick(View v){
        fpvWidget.setVideoSource(FPVWidget.VideoSource.SECONDARY);
        secondaryFpvWidget.setVideoSource(FPVWidget.VideoSource.PRIMARY);
    }

    // On click event for button
    public void onResizeClick(View v){

        ViewGroup.LayoutParams params = fpvWidget.getLayoutParams();
        if (!isOriginalSize)
        {
            params.height = 2 * fpvWidget.getHeight();
            params.width = 2 * fpvWidget.getWidth();
        } else {
            params.height = fpvWidget.getHeight()/2;
            params.width = fpvWidget.getWidth()/2;
        }
        isOriginalSize = !isOriginalSize;
        fpvWidget.setLayoutParams(params);

    }


}
