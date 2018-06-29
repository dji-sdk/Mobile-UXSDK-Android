package com.dji.ux.sample;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import android.support.v4.graphics.ColorUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import dji.common.flightcontroller.flyzone.FlyZoneCategory;
import dji.ux.widget.MapWidget;
import java.util.Random;

public class FlyZoneDialogView extends ScrollView {

    CheckBox all;
    CheckBox auth;
    CheckBox warning;
    CheckBox enhancedWarning;
    CheckBox restricted;

    Button authColor;
    Button warningColor;
    Button enhancedWarningColor;
    Button restrictedColor;
    Button maxHeightColor;
    Button selfUnlockedColor;

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

    public void initCheckboxes(MapWidget mapWidget) {
        all = (CheckBox) findViewById(R.id.all);
        auth = (CheckBox) findViewById(R.id.auth);
        warning = (CheckBox) findViewById(R.id.warning);
        enhancedWarning = (CheckBox) findViewById(R.id.enhanced_warning);
        restricted = (CheckBox) findViewById(R.id.restricted);

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
    }

    public void initColors(final MapWidget mapWidget) {
        authColor = (Button) findViewById(R.id.auth_color);
        warningColor = (Button) findViewById(R.id.warning_color);
        enhancedWarningColor = (Button) findViewById(R.id.enhanced_warning_color);
        restrictedColor = (Button) findViewById(R.id.restricted_color);
        maxHeightColor = (Button) findViewById(R.id.max_height_color);
        selfUnlockedColor = (Button) findViewById(R.id.self_unlocked_color);

        float strokeWidth = mapWidget.getFlyZoneBorderWidth();
        authColor.setBackground(getBackground(mapWidget.getFlyZoneColor(FlyZoneCategory.AUTHORIZATION),
                                              mapWidget.getFlyZoneAlpha(FlyZoneCategory.AUTHORIZATION),
                                              strokeWidth));
        warningColor.setBackground(getBackground(mapWidget.getFlyZoneColor(FlyZoneCategory.WARNING),
                                                 mapWidget.getFlyZoneAlpha(FlyZoneCategory.WARNING),
                                                 strokeWidth));
        enhancedWarningColor.setBackground(getBackground(mapWidget.getFlyZoneColor(FlyZoneCategory.ENHANCED_WARNING),
                                                         mapWidget.getFlyZoneAlpha(FlyZoneCategory.ENHANCED_WARNING),
                                                         strokeWidth));
        restrictedColor.setBackground(getBackground(mapWidget.getFlyZoneColor(FlyZoneCategory.RESTRICTED),
                                                    mapWidget.getFlyZoneAlpha(FlyZoneCategory.RESTRICTED),
                                                    strokeWidth));
        maxHeightColor.setBackground(getBackground(mapWidget.getMaximumHeightColor(),
                                                   mapWidget.getMaximumHeightAlpha(), strokeWidth));
        selfUnlockedColor.setBackground(getBackground(mapWidget.getSelfUnlockedColor(),
                                                      mapWidget.getSelfUnlockedAlpha(), strokeWidth));

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
                    case R.id.self_unlocked_color:
                        alpha = mapWidget.getSelfUnlockedAlpha();
                        mapWidget.setSelfUnlockedColor(randomColor);
                        break;
                }
                view.setBackground(getBackground(randomColor, alpha, strokeWidth));
            }
        };
        authColor.setOnClickListener(onClickListener);
        warningColor.setOnClickListener(onClickListener);
        enhancedWarningColor.setOnClickListener(onClickListener);
        restrictedColor.setOnClickListener(onClickListener);
        maxHeightColor.setOnClickListener(onClickListener);
        selfUnlockedColor.setOnClickListener(onClickListener);
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
