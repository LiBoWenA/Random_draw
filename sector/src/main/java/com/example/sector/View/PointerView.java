package com.example.sector.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class PointerView extends View {

    float[] mAngles;
    RectF rectF;
    Paint mPaint;
    float mStartAngle = 0;

    public PointerView(Context context) {
        super(context);
        init();
    }

    public PointerView(Context context,AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void setData(float[] angles){
        mAngles = angles;
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(10);
        mPaint.setTextSize(60);
        mPaint.setStyle(Paint.Style.FILL);

        rectF = new RectF();
        rectF.top = 100;
        rectF.bottom = 400;
        rectF.right = 550;
        rectF.left = 250;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for(int i = 0; i  <  mAngles.length; i++){
            if(i % 2 == 0 ){
                mPaint.setColor(Color.BLUE);
            }else{
                mPaint.setColor(Color.GREEN);
            }
            canvas.drawArc(rectF, mStartAngle, mAngles[i], true, mPaint);
            mStartAngle += mAngles[i];
        }
    }
}
