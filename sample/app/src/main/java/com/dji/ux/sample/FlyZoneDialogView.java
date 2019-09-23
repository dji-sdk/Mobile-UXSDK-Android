package com.dji.ux.sample;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;
import androidx.core.graphics.ColorUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.Switch;

import java.util.Random;

import dji.common.flightcontroller.flyzone.FlyZoneCategory;
import dji.ux.widget.MapWidget;

public class FlyZoneDialogView extends ScrollView {

    private CheckBox all;
    private CheckBox auth;
    private CheckBox warning;
    private CheckBox enhancedWarning;
    private CheckBox restricted;
    private Button btnCustomUnlockColor;
    private Button btnCustomUnlockSync;

    public FlyZoneDialogView(Context context) {
        super(context);
        inflate(context, R.layout.dialog_fly_zone, this);
    }

    public FlyZoneDialogView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.dialog_fly_zone, this);
    }

    public void init(MapWidget mapWidget) {
        initCheckboxes(mapWidget);
        initColors(mapWidget);
    }

    public void initCheckboxes(final MapWidget mapWidget) {
        all = findViewById(R.id.all);
        auth = findViewById(R.id.auth);
        warning = findViewById(R.id.warning);
        enhancedWarning = findViewById(R.id.enhanced_warning);
        restricted = findViewById(R.id.restricted);
        Switch switchCustomUnlock = findViewById(R.id.custom_unlock_switch);
        switchCustomUnlock.setChecked(mapWidget.isCustomUnlockZonesVisible());
        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                switch (compoundButton.getId()) {
                    case R.id.all:
                        auth.setChecked(isChecked);
                        warning.setChecked(isChecked);
                        enhancedWarning.setChecked(isChecked);
                        restricted.setChecked(isChecked);
                        break;
                    case R.id.custom_unlock_switch:
                        btnCustomUnlockColor.setEnabled(isChecked);
                        btnCustomUnlockSync.setEnabled(isChecked);
                        if (isChecked) {
                            mapWidget.showCustomUnlockZones(true);
                        } else {
                            mapWidget.showCustomUnlockZones(false);
                        }
                        break;
                    default:
                        all.setOnCheckedChangeListener(null);
                        all.setChecked(auth.isChecked()
                                           && warning.isChecked()
                                           && enhancedWarning.isChecked()
                                           && restricted.isChecked());
                        all.setOnCheckedChangeListener(this);
                        break;
                }
            }
        };
        auth.setChecked(mapWidget.isFlyZoneVisible(FlyZoneCategory.AUTHORIZATION));
        warning.setChecked(mapWidget.isFlyZoneVisible(FlyZoneCategory.WARNING));
        enhancedWarning.setChecked(mapWidget.isFlyZoneVisible(FlyZoneCategory.ENHANCED_WARNING));
        restricted.setChecked(mapWidget.isFlyZoneVisible(FlyZoneCategory.RESTRICTED));
        all.setChecked(auth.isChecked()
                           && warning.isChecked()
                           && enhancedWarning.isChecked()
                           && restricted.isChecked());

        all.setOnCheckedChangeListener(listener);
        auth.setOnCheckedChangeListener(listener);
        warning.setOnCheckedChangeListener(listener);
        enhancedWarning.setOnCheckedChangeListener(listener);
        restricted.setOnCheckedChangeListener(listener);
        switchCustomUnlock.setOnCheckedChangeListener(listener);
    }

    public void initColors(final MapWidget mapWidget) {
        Button authColor = findViewById(R.id.auth_color);
        Button warningColor = findViewById(R.id.warning_color);
        Button enhancedWarningColor = findViewById(R.id.enhanced_warning_color);
        Button restrictedColor = findViewById(R.id.restricted_color);
        Button maxHeightColor = findViewById(R.id.max_height_color);
        Button selfUnlockColor = findViewById(R.id.self_unlock_color);
        btnCustomUnlockColor = findViewById(R.id.custom_unlock_color);
        btnCustomUnlockSync = findViewById(R.id.custom_unlock_sync);
        btnCustomUnlockColor.setEnabled(mapWidget.isCustomUnlockZonesVisible());
        btnCustomUnlockSync.setEnabled(mapWidget.isCustomUnlockZonesVisible());


        final float STROKE_WIDTH = 15.0f;
        authColor.setBackground(getBackground(mapWidget.getFlyZoneColor(FlyZoneCategory.AUTHORIZATION),
                                              mapWidget.getFlyZoneAlpha(FlyZoneCategory.AUTHORIZATION),
                                              STROKE_WIDTH));
        warningColor.setBackground(getBackground(mapWidget.getFlyZoneColor(FlyZoneCategory.WARNING),
                                                 mapWidget.getFlyZoneAlpha(FlyZoneCategory.WARNING),
                                                 STROKE_WIDTH));
        enhancedWarningColor.setBackground(getBackground(mapWidget.getFlyZoneColor(FlyZoneCategory.ENHANCED_WARNING),
                                                         mapWidget.getFlyZoneAlpha(FlyZoneCategory.ENHANCED_WARNING),
                                                         STROKE_WIDTH));
        restrictedColor.setBackground(getBackground(mapWidget.getFlyZoneColor(FlyZoneCategory.RESTRICTED),
                                                    mapWidget.getFlyZoneAlpha(FlyZoneCategory.RESTRICTED),
                                                    STROKE_WIDTH));
        maxHeightColor.setBackground(getBackground(mapWidget.getMaximumHeightColor(),
                                                   mapWidget.getMaximumHeightAlpha(), STROKE_WIDTH));
        selfUnlockColor.setBackground(getBackground(mapWidget.getSelfUnlockColor(),
                                                    mapWidget.getSelfUnlockAlpha(), STROKE_WIDTH));

        OnClickListener onClickListener = new OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                @ColorInt int randomColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

                int alpha = 26;
                float strokeWidth = mapWidget.getFlyZoneBorderWidth();
                switch (view.getId()) {
                    case R.id.auth_color:
                        alpha = mapWidget.getFlyZoneAlpha(FlyZoneCategory.AUTHORIZATION);
                        mapWidget.setFlyZoneColor(FlyZoneCategory.AUTHORIZATION, randomColor);
                        break;
                    case R.id.warning_color:
                        alpha = mapWidget.getFlyZoneAlpha(FlyZoneCategory.WARNING);
                        mapWidget.setFlyZoneColor(FlyZoneCategory.WARNING, randomColor);
                        break;
                    case R.id.enhanced_warning_color:
                        alpha = mapWidget.getFlyZoneAlpha(FlyZoneCategory.ENHANCED_WARNING);
                        mapWidget.setFlyZoneColor(FlyZoneCategory.ENHANCED_WARNING, randomColor);
                        break;
                    case R.id.restricted_color:
                        alpha = mapWidget.getFlyZoneAlpha(FlyZoneCategory.RESTRICTED);
                        mapWidget.setFlyZoneColor(FlyZoneCategory.RESTRICTED, randomColor);
                        break;
                    case R.id.max_height_color:
                        alpha = mapWidget.getMaximumHeightAlpha();
                        mapWidget.setMaximumHeightColor(randomColor);
                        break;
                    case R.id.self_unlock_color:
                        alpha = mapWidget.getSelfUnlockAlpha();
                        mapWidget.setSelfUnlockColor(randomColor);
                        break;
                    case R.id.custom_unlock_color:
                        mapWidget.setCustomUnlockFlyZoneOverlayColor(randomColor);
                        randomColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                        mapWidget.setCustomUnlockFlyZoneSentToAircraftOverlayColor(randomColor);
                        randomColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                        mapWidget.setCustomUnlockFlyZoneEnabledOverlayColor(randomColor);
                        return;
                    case R.id.custom_unlock_sync:
                        mapWidget.syncCustomUnlockZones();
                        return;
                }
                view.setBackground(getBackground(randomColor, alpha, strokeWidth));
            }
        };
        authColor.setOnClickListener(onClickListener);
        warningColor.setOnClickListener(onClickListener);
        enhancedWarningColor.setOnClickListener(onClickListener);
        restrictedColor.setOnClickListener(onClickListener);
        maxHeightColor.setOnClickListener(onClickListener);
        selfUnlockColor.setOnClickListener(onClickListener);
        btnCustomUnlockColor.setOnClickListener(onClickListener);
        btnCustomUnlockSync.setOnClickListener(onClickListener);
    }

    private GradientDrawable getBackground(@ColorInt int color, int alpha, float strokeWidth) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.OVAL);
        drawable.setStroke((int)strokeWidth, color);
        drawable.setColor(ColorUtils.setAlphaComponent(color, alpha));
        return drawable;
    }

    public boolean isFlyZoneEnabled(FlyZoneCategory category) {
        switch (category) {
            case AUTHORIZATION:
                return auth.isChecked();
            case WARNING:
                return warning.isChecked();
            case ENHANCED_WARNING:
                return enhancedWarning.isChecked();
            case RESTRICTED:
                return restricted.isChecked();
        }
        return false;
    }
}
