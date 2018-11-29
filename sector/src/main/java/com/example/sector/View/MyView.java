package com.example.sector.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
    //画笔
    Paint mPaint;
    //扇形的瓣数
    int mCircleCount = 6;
    //开始的角度
    float mStart = 0;
    //文字角度
    int textAngle = 5;

    RectF rectF;

    //颜色的数组
    private int[] colors=new int[]{Color.parseColor("#8EE5EE"), Color.parseColor("#FFD700"), Color.parseColor("#FFD39B"), Color.parseColor("#FF8247"), Color.parseColor("#FF34B3"), Color.parseColor("#F0E68C")};
    //奖品名称
    private String[] str=new String[]{"一等奖","二等奖","三等奖","四等奖","特等奖","谢谢参与奖"};

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private void init(){
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(10);
        mPaint.setColor(Color.BLUE);

        rectF = new RectF();
        rectF.top = 100;
        rectF.bottom = 500;
        rectF.left = 100;
        rectF.right = 500;

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
        for (int i = 0; i < mCircleCount; i++) {
            //设置扇形颜色
            mPaint.setColor(colors[i]);
            //设置扇形
            canvas.drawArc(rectF,mStart,60,true,mPaint);
            //设置字体颜色
            mPaint.setColor(Color.BLACK);
            //设置字体大小
            mPaint.setTextSize(24);
            Path path = new Path();
            path.addArc(rectF,textAngle,60);
            canvas.drawTextOnPath(str[i],path,60,60,mPaint);
            mStart += 60;
            textAngle+=60;
        }
         mPaint.setColor(Color.BLACK);

    }
}
