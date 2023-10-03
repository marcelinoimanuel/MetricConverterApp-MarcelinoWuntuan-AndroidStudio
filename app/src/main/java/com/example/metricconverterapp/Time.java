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

public class Time extends AppCompatActivity {

    EditText timetext;
    Button button;
    TextView time_result;
    ImageView kg, km, temp;
    static int userInputNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        timetext = findViewById(R.id.timetext);
        button = findViewById(R.id.time_converter);
        kg = findViewById(R.id.kg);
        km = findViewById(R.id.km);
        temp = findViewById(R.id.temp);
        time_result = findViewById(R.id.time_result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userInputNumber = Integer.parseInt(timetext.getText().toString());
                int hitung = userInputNumber*3600;
                time_result.setText("Result: " + userInputNumber + " Hour is equal to  " + hitung + " Second");
                timetext.setText("");
            }
        });


        kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Time.this,Mass.class);
                startActivity(intent);
            }
        });

        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Time.this,Length.class);
                startActivity(intent);
            }
        });

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Time.this,Temp.class);
                startActivity(intent);
            }
        });

    }
}