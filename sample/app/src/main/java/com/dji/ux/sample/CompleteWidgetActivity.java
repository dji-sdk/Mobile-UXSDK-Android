package com.dji.ux.sample;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.dji.mapkit.core.maps.DJIMap;

import dji.keysdk.CameraKey;
import dji.keysdk.KeyManager;
import dji.ux.panel.CameraSettingAdvancedPanel;
import dji.ux.panel.CameraSettingExposurePanel;
import dji.ux.utils.DJIProductUtil;
import dji.ux.widget.FPVOverlayWidget;
import dji.ux.widget.FPVWidget;
import dji.ux.widget.MapWidget;
import dji.ux.widget.ThermalPaletteWidget;
import dji.ux.widget.config.CameraConfigApertureWidget;
import dji.ux.widget.config.CameraConfigEVWidget;
import dji.ux.widget.config.CameraConfigISOAndEIWidget;
import dji.ux.widget.config.CameraConfigSSDWidget;
import dji.ux.widget.config.CameraConfigShutterWidget;
import dji.ux.widget.config.CameraConfigStorageWidget;
import dji.ux.widget.config.CameraConfigWBWidget;
import dji.ux.widget.controls.CameraControlsWidget;
import dji.ux.widget.controls.LensControlWidget;

/**
 * Activity that shows all the UI elements together
 */
public class CompleteWidgetActivity extends Activity {

    private MapWidget mapWidget;
    private ViewGroup parentView;
    private FPVWidget fpvWidget;
    private FPVWidget secondaryFPVWidget;
    private FPVOverlayWidget fpvOverlayWidget;
    private RelativeLayout primaryVideoView;
    private FrameLayout secondaryVideoView;
    private boolean isMapMini = true;

    private CameraSettingExposurePanel cameraSettingExposurePanel;
    private CameraSettingAdvancedPanel cameraSettingAdvancedPanel;
    private CameraConfigISOAndEIWidget cameraConfigISOAndEIWidget;
    private CameraConfigShutterWidget cameraConfigShutterWidget;
    private CameraConfigApertureWidget cameraConfigApertureWidget;
    private CameraConfigEVWidget cameraConfigEVWidget;
    private CameraConfigWBWidget cameraConfigWBWidget;
    private CameraConfigStorageWidget cameraConfigStorageWidget;
    private CameraConfigSSDWidget cameraConfigSSDWidget;
    private CameraControlsWidget controlsWidget;
    private LensControlWidget lensControlWidget;
    private ThermalPaletteWidget thermalPaletteWidget;


    private int height;
    private int width;
    private int margin;
    private int deviceWidth;
    private int deviceHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_widgets);

        height = DensityUtil.dip2px(this, 100);
        width = DensityUtil.dip2px(this, 150);
        margin = DensityUtil.dip2px(this, 12);

        WindowManager windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        final Display display = windowManager.getDefaultDisplay();
        Point outPoint = new Point();
        display.getRealSize(outPoint);
        deviceHeight = outPoint.y;
        deviceWidth = outPoint.x;

        mapWidget = (MapWidget) findViewById(R.id.map_widget);
        mapWidget.initAMap(map -> map.setOnMapClickListener((DJIMap.OnMapClickListener) latLng -> onViewClick(mapWidget)));
        mapWidget.onCreate(savedInstanceState);

        initCameraView();
        parentView = (ViewGroup) findViewById(R.id.root_view);

        fpvWidget = findViewById(R.id.fpv_widget);
        fpvWidget.setOnClickListener(view -> onViewClick(fpvWidget));
        fpvOverlayWidget = findViewById(R.id.fpv_overlay_widget);
        primaryVideoView = findViewById(R.id.fpv_container);
        secondaryVideoView = findViewById(R.id.secondary_video_view);
        secondaryFPVWidget = findViewById(R.id.secondary_fpv_widget);
        secondaryFPVWidget.setOnClickListener(view -> swapVideoSource());

        fpvWidget.setCameraIndexListener((cameraIndex, lensIndex) -> cameraWidgetKeyIndexUpdated(fpvWidget.getCameraKeyIndex(), fpvWidget.getLensKeyIndex()));
        updateSecondaryVideoVisibility();
    }

    private void initCameraView() {
        cameraSettingExposurePanel = findViewById(R.id.camera_setting_exposure_panel);
        cameraSettingAdvancedPanel = findViewById(R.id.camera_setting_advanced_panel);
        cameraConfigISOAndEIWidget = findViewById(R.id.camera_config_iso_and_ei_widget);
        cameraConfigShutterWidget = findViewById(R.id.camera_config_shutter_widget);
        cameraConfigApertureWidget = findViewById(R.id.camera_config_aperture_widget);
        cameraConfigEVWidget = findViewById(R.id.camera_config_ev_widget);
        cameraConfigWBWidget = findViewById(R.id.camera_config_wb_widget);
        cameraConfigStorageWidget = findViewById(R.id.camera_config_storage_widget);
        cameraConfigSSDWidget = findViewById(R.id.camera_config_ssd_widget);
        lensControlWidget = findViewById(R.id.camera_lens_control);
        controlsWidget = findViewById(R.id.CameraCapturePanel);
        thermalPaletteWidget = findViewById(R.id.thermal_pallette_widget);
    }

    private void onViewClick(View view) {
        if (view == fpvWidget && !isMapMini) {
            resizeFPVWidget(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT, 0, 0);
            reorderCameraCapturePanel();
            ResizeAnimation mapViewAnimation = new ResizeAnimation(mapWidget, deviceWidth, deviceHeight, width, height, margin);
            mapWidget.startAnimation(mapViewAnimation);
            isMapMini = true;
        } else if (view == mapWidget && isMapMini) {
            hidePanels();
            resizeFPVWidget(width, height, margin, 12);
            reorderCameraCapturePanel();
            ResizeAnimation mapViewAnimation = new ResizeAnimation(mapWidget, width, height, deviceWidth, deviceHeight, 0);
            mapWidget.startAnimation(mapViewAnimation);
            isMapMini = false;
        }
    }

    private void resizeFPVWidget(int width, int height, int margin, int fpvInsertPosition) {
        RelativeLayout.LayoutParams fpvParams = (RelativeLayout.LayoutParams) primaryVideoView.getLayoutParams();
        fpvParams.height = height;
        fpvParams.width = width;
        fpvParams.rightMargin = margin;
        fpvParams.bottomMargin = margin;
        if (isMapMini) {
            fpvParams.addRule(RelativeLayout.CENTER_IN_PARENT, 0);
            fpvParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
            fpvParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        } else {
            fpvParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);
            fpvParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, 0);
            fpvParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
        }
        primaryVideoView.setLayoutParams(fpvParams);

        parentView.removeView(primaryVideoView);
        parentView.addView(primaryVideoView, fpvInsertPosition);
    }

    private void reorderCameraCapturePanel() {
        View cameraCapturePanel = findViewById(R.id.CameraCapturePanel);
        parentView.removeView(cameraCapturePanel);
        parentView.addView(cameraCapturePanel, isMapMini ? 9 : 13);
    }

    private void swapVideoSource() {
        if (secondaryFPVWidget.getVideoSource() == FPVWidget.VideoSource.SECONDARY) {
            fpvWidget.setVideoSource(FPVWidget.VideoSource.SECONDARY);
            secondaryFPVWidget.setVideoSource(FPVWidget.VideoSource.PRIMARY);
        } else {
            fpvWidget.setVideoSource(FPVWidget.VideoSource.PRIMARY);
            secondaryFPVWidget.setVideoSource(FPVWidget.VideoSource.SECONDARY);
        }
    }

    private void cameraWidgetKeyIndexUpdated(int keyIndex, int subKeyIndex) {
        controlsWidget.updateKeyOnIndex(keyIndex, subKeyIndex);
        cameraSettingExposurePanel.updateKeyOnIndex(keyIndex, subKeyIndex);
        cameraSettingAdvancedPanel.updateKeyOnIndex(keyIndex, subKeyIndex);
        cameraConfigISOAndEIWidget.updateKeyOnIndex(keyIndex, subKeyIndex);
        cameraConfigShutterWidget.updateKeyOnIndex(keyIndex, subKeyIndex);
        cameraConfigApertureWidget.updateKeyOnIndex(keyIndex, subKeyIndex);
        cameraConfigEVWidget.updateKeyOnIndex(keyIndex, subKeyIndex);
        cameraConfigWBWidget.updateKeyOnIndex(keyIndex, subKeyIndex);
        cameraConfigStorageWidget.updateKeyOnIndex(keyIndex, subKeyIndex);
        cameraConfigSSDWidget.updateKeyOnIndex(keyIndex, subKeyIndex);
        controlsWidget.updateKeyOnIndex(keyIndex, subKeyIndex);
        lensControlWidget.updateKeyOnIndex(keyIndex, subKeyIndex);
        thermalPaletteWidget.updateKeyOnIndex(keyIndex, subKeyIndex);

        fpvOverlayWidget.updateKeyOnIndex(keyIndex, subKeyIndex);
    }

    private void updateSecondaryVideoVisibility() {
        if (secondaryFPVWidget.getVideoSource() == null || !DJIProductUtil.isSupportMultiCamera()) {
            secondaryVideoView.setVisibility(View.GONE);
        } else {
            secondaryVideoView.setVisibility(View.VISIBLE);
        }
    }

    private void hidePanels() {
        //These panels appear based on keys from the drone itself.
        if (KeyManager.getInstance() != null) {
            KeyManager.getInstance().setValue(CameraKey.create(CameraKey.HISTOGRAM_ENABLED, fpvWidget.getCameraKeyIndex()), false, null);
            KeyManager.getInstance().setValue(CameraKey.create(CameraKey.COLOR_WAVEFORM_ENABLED, fpvWidget.getCameraKeyIndex()), false, null);
        }

        //These panels have buttons that toggle them, so call the methods to make sure the button state is correct.
        controlsWidget.setAdvancedPanelVisibility(false);
        controlsWidget.setExposurePanelVisibility(false);

        //These panels don't have a button state, so we can just hide them.
        findViewById(R.id.pre_flight_check_list).setVisibility(View.GONE);
        findViewById(R.id.rtk_panel).setVisibility(View.GONE);
        //findViewById(R.id.simulator_panel).setVisibility(View.GONE);
        findViewById(R.id.spotlight_panel).setVisibility(View.GONE);
        findViewById(R.id.speaker_panel).setVisibility(View.GONE);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Hide both the navigation bar and the status bar.
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        mapWidget.onResume();
    }

    @Override
    protected void onPause() {
        mapWidget.onPause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        mapWidget.onDestroy();
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapWidget.onSaveInstanceState(outState);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapWidget.onLowMemory();
    }

    private class ResizeAnimation extends Animation {

        private View mView;
        private int mToHeight;
        private int mFromHeight;

        private int mToWidth;
        private int mFromWidth;
        private int mMargin;

        private ResizeAnimation(View v, int fromWidth, int fromHeight, int toWidth, int toHeight, int margin) {
            mToHeight = toHeight;
            mToWidth = toWidth;
            mFromHeight = fromHeight;
            mFromWidth = fromWidth;
            mView = v;
            mMargin = margin;
            setDuration(300);
        }

        @Override
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            float height = (mToHeight - mFromHeight) * interpolatedTime + mFromHeight;
            float width = (mToWidth - mFromWidth) * interpolatedTime + mFromWidth;
            RelativeLayout.LayoutParams p = (RelativeLayout.LayoutParams) mView.getLayoutParams();
            p.height = (int) height;
            p.width = (int) width;
            p.rightMargin = mMargin;
            p.bottomMargin = mMargin;
            mView.requestLayout();
        }
    }
}
