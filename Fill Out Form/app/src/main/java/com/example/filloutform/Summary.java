package com.example.filloutform;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //actionbar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Fill Out Form");

        //EditText
        EditText nameF = findViewById(R.id.name);
        EditText genderF = findViewById(R.id.gender);
        EditText phoneN = findViewById(R.id.phoneNum);
        EditText program = findViewById(R.id.program);
        EditText city = findViewById(R.id.city);
        EditText country = findViewById(R.id.country);
        EditText address = findViewById(R.id.address);
        EditText bdate = findViewById(R.id.bday);
        EditText school = findViewById(R.id.school);

        //Button
        Button btnSave = findViewById(R.id.btnSave);
        Button btnBack = findViewById(R.id.btnBack);

        //Button click listener
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get data from EditText
                String name = nameF.getText().toString();
                String genderP = genderF.getText().toString();
                String phone = phoneN.getText().toString();
                String programP = program.getText().toString();
                String cityP = city.getText().toString();
                String countryP = country.getText().toString();
                String addressP = address.getText().toString();
                String birthD = bdate.getText().toString();
                String schoolP = school.getText().toString();

                //activity intent (explicit)
                Intent i = new Intent(Summary.this, Second_Activity.class);
                i.putExtra("Name", name);
                i.putExtra("Gender", genderP);
                i.putExtra("Phone Number", phone);
                i.putExtra("Program", programP);
                i.putExtra("City", cityP);
                i.putExtra("Country", countryP);
                i.putExtra("Address", addressP);
                i.putExtra("Birth Date", birthD);
                i.putExtra("School", schoolP);
                startActivity(i);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = getIntent();
                finish();
            }
        });
    }
}