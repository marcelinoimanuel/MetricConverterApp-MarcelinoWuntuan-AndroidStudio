package com.example.metricconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Mass extends AppCompatActivity {

    EditText kgtext;
    Button button;
    TextView kg_result;
    ImageView km, temp, time;
    static int userInputNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        kgtext = (EditText) findViewById(R.id.kgtext);
        button = findViewById(R.id.kg_converter);
        km = findViewById(R.id.km);
        temp = findViewById(R.id.temp);
        time = findViewById(R.id.time);
        kg_result = findViewById(R.id.kg_result);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userInputNumber = Integer.parseInt(kgtext.getText().toString());
                kg_result.setText("Result: " + userInputNumber + " Kg is equal to  " + userInputNumber*1000 + " Gram");
                kgtext.setText("");
            }
        });


        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mass.this,Length.class);
                startActivity(intent);
            }
        });

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mass.this,Temp.class);
                startActivity(intent);
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mass.this,Time.class);
                startActivity(intent);
            }
        });

    }
}