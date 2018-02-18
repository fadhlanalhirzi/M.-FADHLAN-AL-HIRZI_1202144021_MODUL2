package com.example.fadhlanalhirzi.mfadhlanalhirzi_1202144021_modul2;

/**
 * Created by User on 18/02/2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MenuAwal extends AppCompatActivity {
    RadioGroup radiogr;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuutama);
        radiogr = findViewById(R.id.radiogr);
    }

    public void menujumenu (View view){
        int id = radiogr.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        String pilih = rb.getText().toString();
        switch (pilih) {
            case "Take Away":
                startActivity(new Intent(MenuAwal.this, takeaway_activity.class));
                Toast.makeText(MenuAwal.this, "Take Away", Toast.LENGTH_SHORT).show();
                break;

            case "Dine In":
                startActivity(new Intent(MenuAwal.this, takeaway_activity.class));
                Toast.makeText(MenuAwal.this, "Dine In", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
