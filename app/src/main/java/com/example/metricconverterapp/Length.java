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

public class Length extends AppCompatActivity {

    EditText kmtext;
    Button button;
    TextView km_result;
    ImageView kg, temp, time;
    static int userInputNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        kmtext = (EditText) findViewById(R.id.kmtext);
        button = findViewById(R.id.km_converter);
        kg = findViewById(R.id.kg);
        temp = findViewById(R.id.temp);
        time = findViewById(R.id.time);
        km_result = findViewById(R.id.km_result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userInputNumber = Integer.parseInt(kmtext.getText().toString());
                km_result.setText("Result: " + userInputNumber + " Km is equal to  " + userInputNumber*1000 + " Meter");
                kmtext.setText("");
            }
        });


        kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Length.this,Mass.class);
                startActivity(intent);
            }
        });

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Length.this,Temp.class);
                startActivity(intent);
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Length.this,Time.class);
                startActivity(intent);
            }
        });

    }
}