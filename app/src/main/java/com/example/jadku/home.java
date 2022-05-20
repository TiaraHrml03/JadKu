package com.example.jadku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageButton dafsen = (ImageButton) findViewById(R.id.daftardosen);
        dafsen.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), daftardosen.class);
            startActivity(i);
        }));
        ImageButton matkul = (ImageButton) findViewById(R.id.matkul);
        matkul.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), matakuliah.class);
            startActivity(i);
        }));
        ImageButton jadkel = (ImageButton) findViewById(R.id.jadwalkelas);
        jadkel.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), jadwalkelas.class);
            startActivity(i);
        }));
        ImageButton info = (ImageButton) findViewById(R.id.informasi);
        info.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), Informasi.class);
            startActivity(i);
        }));
    }
}