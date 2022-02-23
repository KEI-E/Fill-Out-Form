package com.example.filloutform;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);

        //actionbar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Summary of the Form");

        //intent to get the datas
        Intent i = getIntent();
        String name = i.getStringExtra("Name");
        String gender = i.getStringExtra("Gender");
        String phone = i.getStringExtra("Phone Number");
        String program = i.getStringExtra("Program");
        String city = i.getStringExtra("City");
        String country = i.getStringExtra("Country");
        String address = i.getStringExtra("Address");
        String birthday = i.getStringExtra("Birth Date");
        String school = i.getStringExtra("School");

        //TextView
        TextView resultTv = findViewById(R.id.resultTv);

        //setText
        resultTv.setText("Name: " +name+ "\nGender: " +gender+ "\nPhone Number: " +phone+ "\nProgram: " +program+ "\nCity: " +city+ "\nCountry: " +country+ "\nAddress: " +address+ "\nBirthday: " +birthday+ "\nSchool: " +school);
    }

    public void backBtn(View v)
    {
        Intent i = getIntent();
        finish();
    }
}