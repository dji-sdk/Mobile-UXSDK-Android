package com.dji.ux.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import dji.ux.widget.FPVOverlayWidget;
import dji.ux.widget.FPVWidget;

public class CustomizedWidgetsActivity extends Activity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private FPVWidget fpvWidget;
    private FPVOverlayWidget fpvOverlayWidget;
    private FPVWidget secondaryFpvWidget;
    private boolean isOriginalSize = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customized_widgets);
        initView();

    }

    private void initView() {
        fpvWidget = (FPVWidget)findViewById(R.id.fpv_custom_widget);
        fpvOverlayWidget = (FPVOverlayWidget) findViewById(R.id.fpv_overlay_widget);
        secondaryFpvWidget = (FPVWidget)findViewById(R.id.secondary_fpv_widget);
        ((CheckBox) findViewById(R.id.checkboxPrimaryCameraName)).setOnCheckedChangeListener(this);
        ((CheckBox) findViewById(R.id.checkboxSecondaryCameraName)).setOnCheckedChangeListener(this);
        ((CheckBox) findViewById(R.id.checkbox_touch_focus)).setOnCheckedChangeListener(this);
        ((CheckBox) findViewById(R.id.checkbox_touch_metering)).setOnCheckedChangeListener(this);
        ((CheckBox) findViewById(R.id.checkbox_gimbal_control)).setOnCheckedChangeListener(this);

        findViewById(R.id.primary_video_feed).setOnClickListener(this);
        findViewById(R.id.secondary_video_feed).setOnClickListener(this);
        findViewById(R.id.auto_video_feed).setOnClickListener(this);
        findViewById(R.id.change_size).setOnClickListener(this);
    }


    // On click event for button
    public void resizeView() {

        ViewGroup.LayoutParams params = fpvWidget.getLayoutParams();
        if (!isOriginalSize) {
            params.height = 2 * fpvWidget.getHeight();
            params.width = 2 * fpvWidget.getWidth();
        } else {
            params.height = fpvWidget.getHeight()/2;
            params.width = fpvWidget.getWidth()/2;
        }
        isOriginalSize = !isOriginalSize;
        fpvWidget.setLayoutParams(params);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.primary_video_feed:
                fpvWidget.setVideoSource(FPVWidget.VideoSource.PRIMARY);
                secondaryFpvWidget.setVideoSource(FPVWidget.VideoSource.SECONDARY);
                break;
            case R.id.secondary_video_feed:
                fpvWidget.setVideoSource(FPVWidget.VideoSource.SECONDARY);
                secondaryFpvWidget.setVideoSource(FPVWidget.VideoSource.PRIMARY);
                break;
            case R.id.auto_video_feed:
                fpvWidget.setVideoSource(FPVWidget.VideoSource.AUTO);
                break;
            case R.id.change_size:
                resizeView();
                break;
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.checkboxPrimaryCameraName:
                fpvWidget.setSourceCameraNameVisibility(isChecked);
                break;
            case R.id.checkboxSecondaryCameraName:
                secondaryFpvWidget.setSourceCameraNameVisibility(isChecked);
                break;
            case R.id.checkbox_touch_focus:
                fpvOverlayWidget.setTouchFocusEnabled(isChecked);
                break;
            case R.id.checkbox_touch_metering:
                fpvOverlayWidget.setSpotMeteringEnabled(isChecked);
                break;
            case R.id.checkbox_gimbal_control:
                fpvOverlayWidget.setGimbalControlEnabled(isChecked);
                break;
        }

    }
}
