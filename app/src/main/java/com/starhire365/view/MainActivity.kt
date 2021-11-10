package com.starhire365.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.starhire365.R

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val high:Double = 1.70
        var age:Int = 27
        var occupation:String = "Software Engineering"

        Log.d("SplashScreen", "Executing on-create: Occupation: $occupation [Debug]")
        Log.i("SplashScreen", "Executing on-create: Occupation: $occupation [Information]")
        Log.v("SplashScreen", "Executing on-create: Occupation: $high [Verbose]")
        Log.w("SplashScreen", "Executing on-create: Occupation: $age [Warning]")
        Log.e("SplashScreen", "Executing on-create: Occupation: $age [Error]")
    }
}





