package com.shubham.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Refine_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine_page);


        Spinner spinner = findViewById(R.id.spinner);


        spinner.setOnItemSelectedListener(this);


        List<String>  categories = new ArrayList<>();
        categories.add("Available | Hey Let Us Connect");
        categories.add("Away | Stay Discrete And Watch");
        categories.add("Busy | Do Not Disturb | Will Catch Up Later");
        categories.add("SOS | Emergency! Need Assistance! HELP");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);


        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
            String item = parent.getItemAtPosition(position).toString();

            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }












    }
}