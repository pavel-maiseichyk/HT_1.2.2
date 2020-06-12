package com.example.ht_122;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        TextView link = findViewById(R.id.link);
        link.setText("http://myfile.org/" + random.nextInt(100));
    }

    public void forwardButtonClick(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @SuppressLint("SetTextI18n")
    public void backButtonClick(View view) {
        finish();
    }
}