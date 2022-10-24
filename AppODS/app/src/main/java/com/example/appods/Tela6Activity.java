package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Tela6Activity extends AppCompatActivity {

    Button btnvoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);

        btnvoltar = findViewById(R.id.btnvoltar);
        btnvoltar.setOnClickListener(view -> {
            Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(MainActivity);
        });
    }
}