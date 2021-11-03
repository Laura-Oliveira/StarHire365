package com.starhire365

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

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

    fun calculateAge(view:android.view.View)
    {
        txt_name = name?.getText().toString();
        txt_year = year?.getText().toString();

        var yearInt = txt_year?.toInt();
        var age = 2021 - yearInt!!;

        Toast.makeText(this, "$txt_name sua idade é $age", Toast.LENGTH_LONG).show();
//        val activity:Intent = Intent(this, ResultAgeActivity::class.java);
//        activity.putExtra("age", age);
//        startActivity(activity);
    }

}