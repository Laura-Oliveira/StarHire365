package com.starhire365

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.util.*

class AgeActivity : AppCompatActivity()
{

    private lateinit var name:EditText;
    private lateinit var year:EditText;

    private var txt_name:String = "";
    private var txt_year:String = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)

        name = findViewById(R.id.input_name_screen_age_edit_text);
        year = findViewById(R.id.input_year_screen_age_edit_text);
    }

    fun clearInputs(view:android.view.View)
    {
        txt_name = name?.getText()?.clear().toString();
        txt_year = year?.getText()?.clear().toString();
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun calculateAge(view:android.view.View)
    {
        txt_name = name?.getText().toString();
        txt_year = year?.getText().toString();

        var yearInt = txt_year?.toInt();
        val actualYear = LocalDate.now().year;
        var age = actualYear - yearInt!!;

        Toast.makeText(this, "$txt_name sua idade é $age", Toast.LENGTH_LONG).show();
//        val activity:Intent = Intent(this, ResultAgeActivity::class.java);
//        activity.putExtra("age", age);
//        startActivity(activity);
    }

}