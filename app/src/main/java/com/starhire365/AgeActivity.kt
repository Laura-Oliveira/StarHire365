package com.starhire365

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.starhire365.controller.PersonController
import com.starhire365.model.Person
import java.time.LocalDate

class AgeActivity : AppCompatActivity()
{
    private lateinit var name:EditText;
    private lateinit var year:EditText;

    private var txt_name:String = "";
    private var txt_year:String = "";
    lateinit var person: Person;
    lateinit var personController:PersonController;

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)

        name = findViewById(R.id.input_name_screen_age_edit_text);
        year = findViewById(R.id.input_year_screen_age_edit_text);
        person = Person();
        personController = PersonController(person);
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

        person.name = txt_name;
        person.birthYear = yearInt;


        if( (txt_name.isNotEmpty() && txt_year.isNotEmpty()) && (actualYear >= yearInt))
        {
            var age = personController.calculateAgeYear();
            Toast.makeText(this, "${person.name} sua idade é $age", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Ano de nascimento precisa ser menor que o ano atual", Toast.LENGTH_LONG).show();
        }

        if(txt_name.isNotEmpty())
        {
            name.setError("Campo obrigatório");
            name.requestFocus();
        }

        if(txt_year.isNotEmpty())
        {
            year.setError("Campo obrigatório");
            year.requestFocus();
        }
    }

}