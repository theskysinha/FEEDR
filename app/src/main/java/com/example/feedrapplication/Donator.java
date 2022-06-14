package com.example.feedrapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Donator extends AppCompatActivity {

    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donator);
        EditText f = findViewById(R.id.food);
        EditText amt = findViewById(R.id.amount);
        Button yesBtn = findViewById(R.id.yesBtn);
        Button noBtn = findViewById(R.id.noBtn);
        back = findViewById(R.id.backbtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Donator.this, Donator2.class);
                startActivity(i);
            }
        });
        yesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String food = f.getText().toString();
                String amount = amt.getText().toString();
                FoodObject foodObject = new FoodObject(food, amount, FirebaseAuth.getInstance().getCurrentUser().getEmail().split("@")[0]);
                FirebaseDatabase.getInstance().getReference("Food Details").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(foodObject);
                Toast.makeText(Donator.this, "Donation Registered..", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Donator.this, HumanShelters.class);
                startActivity(i);
                finish();
            }
        });
        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String food = f.getText().toString();
                String amount = amt.getText().toString();
                FoodObject foodObject = new FoodObject(food, amount, FirebaseAuth.getInstance().getCurrentUser().getEmail().split("@")[0]);
                FirebaseDatabase.getInstance().getReference("Food Details").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(foodObject);
                Toast.makeText(Donator.this, "Donation Registered..", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Donator.this, AnimalShelters.class);
                startActivity(i);
                finish();
            }
        });
    }
}
