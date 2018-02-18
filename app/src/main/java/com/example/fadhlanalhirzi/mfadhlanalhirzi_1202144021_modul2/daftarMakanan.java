package com.example.fadhlanalhirzi.mfadhlanalhirzi_1202144021_modul2;

/**
 * Created by User on 18/02/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class daftarMakanan extends AppCompatActivity {
    RecyclerView rv;
    mnAdapter adapter;
    List<pilihmakanan> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftarmenu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }

    private void initdata() {
        listmenu.add(new pilihmakanan(R.drawable.rujak1, "Rujak", 15000, "Jambu, Nanas, Acar, Mangga"));
        listmenu.add(new pilihmakanan(R.drawable.gado2, "Gado-Gado", 20000, "Sayur-sayuran, Telur, Lontong, Kerupuk, Saus Kacang"));
        listmenu.add(new pilihmakanan(R.drawable.pecelayam, "Pecel Ayam", 25000, "Nasi, Ayam, Lalapan, Sambal"));
        listmenu.add(new pilihmakanan(R.drawable.seblak, "Seblak", 15000, "Basreng, Batagor, Kerupuk, Ceker"));
        listmenu.add(new pilihmakanan(R.drawable.siomay, "Siomay", 50000, "Siomay dengan saus kacang"));
        adapter = new mnAdapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}