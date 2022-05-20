package com.example.jadku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class jadwalkelas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwalkelas);
        Button sen = (Button) findViewById(R.id.senin);
        sen.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), senin.class);
            startActivity(i);
        }));
        Button sel = (Button) findViewById(R.id.selasa);
        sel.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), selasa.class);
            startActivity(i);
        }));
        Button rab = (Button) findViewById(R.id.rabu);
        rab.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), rabu.class);
            startActivity(i);
        }));
        Button kam = (Button) findViewById(R.id.kamis);
        kam.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), kamis.class);
            startActivity(i);
        }));
        Button jum = (Button) findViewById(R.id.jumat);
        jum.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), jumat.class);
            startActivity(i);
        }));
    }
}