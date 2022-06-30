package com.example.sosalactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

    }
    public void knopka1(View v) {
        Intent intent = new Intent(this,select.class);
        startActivity(intent);

    }
    public void knopka2(View w) {
        Intent intent = new Intent (this,enter_your_house.class);
        startActivity(intent);
    }
}