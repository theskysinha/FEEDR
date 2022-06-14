package com.example.feedrapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AnimalShelters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_shelters);
        Button AnidonatebtnA = findViewById(R.id.AnidonateA);
        Button AnidonatebtnB = findViewById(R.id.AnidonateB);
        Button AnidonatebtnC = findViewById(R.id.AnidonateC);

        AnidonatebtnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AnimalShelters.this, ThankYou.class);
                startActivity(i);
                finish();
            }
        });
        AnidonatebtnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AnimalShelters.this, ThankYou.class);
                startActivity(i);
                finish();
            }
        });
        AnidonatebtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AnimalShelters.this, ThankYou.class);
                startActivity(i);
                finish();
            }
        });
    }
}