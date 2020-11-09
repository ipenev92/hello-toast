package com.fbmoll.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button countButton = findViewById(R.id.countButton);
        countButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                TextView tv1 = (TextView) findViewById(R.id.numberText);
                String input = tv1.getText().toString();
                String number = Integer.toString(Integer.parseInt(input) + 1);
                tv1.setText(number);
                System.out.println(String.format("%s %s", "HERE ", input));
            }
        });
    }
}