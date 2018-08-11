package com.theironyard.frameanimation.frameanimation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private AnimationDrawable batAnimation;
    private ImageView batImage;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        batImage = (ImageView) findViewById(R.id.batID);
    }
}
