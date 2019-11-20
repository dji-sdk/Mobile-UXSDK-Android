package com.dji.ux.sample.custom;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dji.ux.sample.R;

import dji.ux.model.base.BaseDynamicWidgetAppearances;
import dji.ux.widget.BatteryWidget;
import dji.common.battery.ConnectionState;

/**
 * Override default battery widget with custom UI resources and logic
 */
public class CustomizedBatteryWidget extends BatteryWidget {

    private TextView batteryValue;
    private ImageView batteryIcon;
    private int batteryIconRes;
    private int batteryIconErrorRes;

    public CustomizedBatteryWidget(Context context) {
        this(context, null, 0);
    }

    public CustomizedBatteryWidget(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomizedBatteryWidget(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /** Inflate custom layout for this widget */
    @Override
    public void initView(Context context, AttributeSet attrs, int defStyle) {
        final LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.customized_battery_widget, this);
        batteryValue = (TextView) view.findViewById(R.id.textview_battery_value);
        batteryIcon = (ImageView) view.findViewById(R.id.imageview_battery_icon);
        batteryValue.setText("0%");
        batteryIcon.setImageResource(R.mipmap.battery_error);
    }

    @Override
    protected BaseDynamicWidgetAppearances getWidgetAppearances() {
        return null;
    }

    /** Called when battery percentage changes */
    @Override
    public void onBatteryPercentageChange(int percentage) {
        batteryValue.setText(percentage + "%");

        if (percentage > 0 && percentage < 5) {
            batteryIconRes = R.mipmap.battery0;
        } else if (percentage >= 5 && percentage < 15) {
            batteryIconRes = R.mipmap.battery1;
        } else if (percentage >= 15 && percentage < 25) {
            batteryIconRes = R.mipmap.battery2;
        } else if (percentage >= 25 && percentage < 35) {
            batteryIconRes = R.mipmap.battery3;
        } else if (percentage >= 35 && percentage < 45) {
            batteryIconRes = R.mipmap.battery4;
        } else if (percentage >= 45 && percentage < 55) {
            batteryIconRes = R.mipmap.battery5;
        } else if (percentage >= 55 && percentage < 65) {
            batteryIconRes = R.mipmap.battery6;
        } else if (percentage >= 65 && percentage < 75) {
            batteryIconRes = R.mipmap.battery7;
        } else if (percentage >= 75 && percentage < 85) {
            batteryIconRes = R.mipmap.battery8;
        } else if (percentage >= 85 && percentage < 95) {
            batteryIconRes = R.mipmap.battery9;
        } else if (percentage >= 95 && percentage <= 100) {
            batteryIconRes = R.mipmap.battery10;
        }

        updateBatteryIcon();
    }

    /** Called when battery state changes from error to normal or vice versa */
    @Override
    public void onBatteryConnectionStateChange(ConnectionState status) {
        if (status != ConnectionState.NORMAL) {
            batteryIconErrorRes = R.mipmap.battery_error;
        } else {
            batteryIconErrorRes = 0;
        }
        updateBatteryIcon();
    }

    private void updateBatteryIcon() {
        if (batteryIconErrorRes != 0) {
            batteryIcon.setImageResource(batteryIconErrorRes);
        } else {
            batteryIcon.setImageResource(batteryIconRes);
        }
    }
}
