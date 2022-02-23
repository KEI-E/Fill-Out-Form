package com.example.filloutform;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //actionbar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Fill Out Form");

    }

    public void fillOutForm(View v) {
        Intent intent = new Intent(this, Summary.class);
        startActivity(intent);
    }

    public void exit(View v)
    {
        System.exit(0);
    }
}