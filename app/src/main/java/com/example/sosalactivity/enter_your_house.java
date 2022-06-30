package com.example.sosalactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class enter_your_house extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_your_house);
    }
    public void knopka3(View n) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void knopka5(View n) {
        Intent intent = new Intent(this,select.class);
        startActivity(intent);
    }
}