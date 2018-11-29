package com.example.sector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;

import com.example.sector.View.MyView;
import com.example.sector.View.PointerView;

public class MainActivity extends AppCompatActivity {

    MyView myView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        myView = findViewById(R.id.custom);
        findViewById(R.id.custom_inside).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float degrees =  (float)(720 + Math.random() * 1000);

                RotateAnimation rotateAnimation = new RotateAnimation(0, -degrees, 300, 300);
                rotateAnimation.setDuration(5000);
                rotateAnimation.setFillAfter(true);
                myView.startAnimation(rotateAnimation);
            }
        });

    }
}
