package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView tvAns;
    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        menu = findViewById(R.id.ResetButton);
        tvAns = findViewById(R.id.display);
        Intent intentRecived = getIntent();
        String modCode = intentRecived.getStringExtra("modCode");
        String modName = intentRecived.getStringExtra("modName");
        String acdYr = intentRecived.getStringExtra("acdYr");
        String Sem = intentRecived.getStringExtra("Sem");
        String modCred = intentRecived.getStringExtra("modCred");
        String modVenue = intentRecived.getStringExtra("modVenue");
        tvAns.setText("Module Code: "+modCode+"\nModule Name: "+modName+
                "\nAcademic Year: "+acdYr+"\nSemester: "+Sem+"\nModule Credit: "
        +modCred+"\nVenue: "+modVenue);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(DisplayActivity.this, MainActivity.class);
                startActivity(back);
            }
        });

    }
}