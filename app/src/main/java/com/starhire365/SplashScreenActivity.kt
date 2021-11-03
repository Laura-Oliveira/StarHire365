package com.starhire365

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler(Looper.myLooper()!!).postDelayed({
            val intent = Intent(this, AgeActivity::class.java);
            startActivity(intent);
            finish();
        }, 6000);


    }
}