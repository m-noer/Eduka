package com.mnoer.eduka.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.mnoer.eduka.R;

public class SplashActivity extends AppCompatActivity {

    private ImageView logo;
    private static int splashTimeOut=2000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logo=(ImageView)findViewById(R.id.logoo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this,OnBoardActivity.class);
                startActivity(i);
                finish();
            }
        },splashTimeOut);

        Animation myamin = AnimationUtils.loadAnimation(this,R.anim.mysplashanimation);
        logo.startAnimation(myamin);
    }
}
