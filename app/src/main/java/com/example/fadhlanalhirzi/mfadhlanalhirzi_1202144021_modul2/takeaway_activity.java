package com.example.fadhlanalhirzi.mfadhlanalhirzi_1202144021_modul2;

/**
 * Created by User on 18/02/2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class takeaway_activity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate (savedInstanceState);
        setContentView(R.layout.takeaway);

    }

    public void liatmenu(View view) {
        startActivity(new Intent(takeaway_activity.this, daftarMakanan.class));
        finish();
    }

}