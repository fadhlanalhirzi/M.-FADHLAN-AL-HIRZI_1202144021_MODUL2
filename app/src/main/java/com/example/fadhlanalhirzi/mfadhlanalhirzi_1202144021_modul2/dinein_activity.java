package com.example.fadhlanalhirzi.mfadhlanalhirzi_1202144021_modul2;

/**
 * Created by User on 18/02/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class dinein_activity extends AppCompatActivity {
    Spinner nomej;

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate (savedInstanceState);
        setContentView (R.layout.dinein);
        setTitle ("Dine In");
        nomej = findViewById(R.id.nomeja);
    }

    public void liatmenu (View view) {

        Toast.makeText(dinein_activity.this, nomej.getSelectedItem().toString() + "dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent (dinein_activity.this, daftarmenu_activity.class));
        finish();
    }
}
