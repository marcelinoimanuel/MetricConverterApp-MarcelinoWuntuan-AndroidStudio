package com.example.metricconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Temp extends AppCompatActivity {

    EditText temptext;
    Button button;
    TextView temp_result;
    ImageView kg, km, time;
    static int userInputNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        temptext = findViewById(R.id.temptext);
        button = findViewById(R.id.temp_converter);
        kg = findViewById(R.id.kg);
        km = findViewById(R.id.km);
        time = findViewById(R.id.time);
        temp_result = findViewById(R.id.temp_result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userInputNumber = Integer.parseInt(temptext.getText().toString());
                double hitung = 1.8*userInputNumber+32;
                temp_result.setText("Result: " + userInputNumber + " Celsius is equal to  " + hitung + " Fahrenheit");
                temptext.setText("");
            }
        });


        kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Temp.this,Mass.class);
                startActivity(intent);
            }
        });

        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Temp.this,Length.class);
                startActivity(intent);
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Temp.this,Time.class);
                startActivity(intent);
            }
        });

    }
}