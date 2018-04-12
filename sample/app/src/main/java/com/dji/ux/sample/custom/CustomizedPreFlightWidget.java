package com.dji.ux.sample.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

/**
 * Override PreFlightStatusWidget with custom appearance
 */
public class CustomizedPreFlightWidget extends dji.ux.widget.PreFlightStatusWidget {

    //region Properties
    private Paint borderPaint;
    private Paint indicatorPaint;
    private static final int STROKE_WIDTH = 5;
    private int width;
    private int height;
    //endregion

    //region Constructors
    public CustomizedPreFlightWidget(Context context) {
        this(context, null, 0);
    }

    public CustomizedPreFlightWidget(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomizedPreFlightWidget(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    //endregion

    //region Override methods
    /** Inflate custom layout for this widget */
    @Override
    public void initView(Context context, AttributeSet attrs, int defStyleAttr) {
        borderPaint = new Paint();
        borderPaint.setStyle(Paint.Style.STROKE);
        borderPaint.setColor(Color.BLACK);
        borderPaint.setAlpha(255);
        borderPaint.setStrokeWidth(5);
        borderPaint.setAntiAlias(true);

        indicatorPaint = new Paint();
        indicatorPaint.setStyle(Paint.Style.FILL);
        indicatorPaint.setColor(Color.RED);
        indicatorPaint.setAlpha(255);
        indicatorPaint.setAntiAlias(true);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        width = MeasureSpec.getSize(widthMeasureSpec) / 2;
        height = MeasureSpec.getSize(heightMeasureSpec) / 2;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(width, height, width - STROKE_WIDTH, indicatorPaint);
        canvas.drawCircle(width, height, width - STROKE_WIDTH, borderPaint);
    }

    /** Called when connection status changes */
    @Override
    public void onStatusChange(String status, StatusType type, boolean blink) {
        if (type != StatusType.OFFLINE) {
            indicatorPaint.setColor(Color.GREEN);
        } else {
            indicatorPaint.setColor(Color.RED);
        }
    }
    //endregion
}
