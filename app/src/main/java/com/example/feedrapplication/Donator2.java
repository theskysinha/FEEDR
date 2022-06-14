package com.example.feedrapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Donator2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donator2);
        Button a = findViewById(R.id.donatef);
        Button b = findViewById(R.id.stats);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Donator2.this, Donator.class);
                startActivity(i);
                finish();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Donator2.this, Bar_Chart.class);
                startActivity(i);
                finish();
            }
        });
    }
}