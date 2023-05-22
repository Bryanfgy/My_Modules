package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView C203, C206, C218, C235, C346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        C203 = findViewById(R.id.moduleC203);
        C206 = findViewById(R.id.moduleC206);
        C218 = findViewById(R.id.moduleC218);
        C235 = findViewById(R.id.moduleC235);
        C346 = findViewById(R.id.moduleC346);

        C203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, DisplayActivity.class);
                act.putExtra("modCode", "C203");
                act.putExtra("modName", "Web AppIn Development in php");
                act.putExtra("acdYr", "2023");
                act.putExtra("Sem", "1");
                act.putExtra("modCred", "4");
                act.putExtra("modVenue", "E36A");
                startActivity(act);
            }
        });

        C206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, DisplayActivity.class);
                act.putExtra("modCode", "C206");
                act.putExtra("modName", "Software Development Process");
                act.putExtra("acdYr", "2023");
                act.putExtra("Sem", "1");
                act.putExtra("modCred", "4");
                act.putExtra("modVenue", "W64N");
                startActivity(act);
            }
        });

        C218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, DisplayActivity.class);
                act.putExtra("modCode", "C218");
                act.putExtra("modName", "UI/UX Design for Apps");
                act.putExtra("acdYr", "2023");
                act.putExtra("Sem", "1");
                act.putExtra("modCred", "4");
                act.putExtra("modVenue", "W64N");
                startActivity(act);
            }
        });

        C235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, DisplayActivity.class);
                act.putExtra("modCode", "C235");
                act.putExtra("modName", "IT Security and Management");
                act.putExtra("acdYr", "2023");
                act.putExtra("Sem", "1");
                act.putExtra("modCred", "4");
                act.putExtra("modVenue", "W64N");
                startActivity(act);
            }
        });

        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, DisplayActivity.class);
                act.putExtra("modCode", "C346");
                act.putExtra("modName", "Mobile App Development");
                act.putExtra("acdYr", "2023");
                act.putExtra("Sem", "1");
                act.putExtra("modCred", "4");
                act.putExtra("modVenue", "W64N");
                startActivity(act);
            }
        });
    }
}