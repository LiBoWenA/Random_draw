package com.example.sector.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CircleInsid extends View {

    Paint mPaint;
    public CircleInsid(Context context) {
        super(context);
        init();
    }

    public CircleInsid(Context context,AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(10);
        mPaint.setTextSize(30);
        mPaint.setStyle(Paint.Style.FILL);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF();
        rectF.top = 30;
        rectF.bottom = 300;
        rectF.right = 400;
        rectF.left = 220;

        mPaint.setColor(Color.BLACK);
        canvas.drawArc(rectF, 60, 60, true, mPaint);
        mPaint.setColor(Color.RED);
        canvas.drawCircle(300, 300, 100, mPaint);
        mPaint.setColor(Color.BLACK);
        canvas.drawText("开始", 280, 300, mPaint);
    }
}
