package com.theironyard.frameanimation.frameanimation

import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView

 class MainActivity : AppCompatActivity() {

    private AnimationDrawable batAnimation;
    private ImageView batImage;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        batImage = (ImageView) findViewById(R.id.batID);
        batImage.setBackgroundResource(R.drawable.bat_anim);
        batAnimation = (AnimationDrawable) batImage.getBackground();

    }

     override fun onTouchEvent(event: MotionEvent?): Boolean {
         batAnimation.start();
         return super.onTouchEvent(event)
     }
 }
