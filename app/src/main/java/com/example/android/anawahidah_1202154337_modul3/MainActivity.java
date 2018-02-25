package com.example.android.anawahidah_1202154337_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Title;
    private ArrayList<String> Desk;
    private ArrayList<Integer> Gambar;
    //Daftar Title
    private String[] title = {"Aqua", "Pristine", "LeMinerale", "Cleo",
            "Club", "Equil", "Ades", "Amidis", "Evian", "Nestle", "Vit"};
    //Daftar Deskripsi
    private String[] desk = {"Air mineral merek Aqua", "Air mineral merek Pristine",
            "Air mineral merek LeMinerale", "Air mineral merek Cleo",
            "Air mineral merek Club", "Air mineral merek Equil",
            "Air mineral merek Ades", "Air mineral merek Amidis",
            "Air mineral merek Evian", "Air mineral merek Nestle", "Air mineral merek Vit"};
    //Daftar Gambar
    private int[] image = {R.drawable.aqua, R.drawable.pristine, R.drawable.leminerale, R.drawable.cleo, R.drawable.club,
            R.drawable.equil, R.drawable.ades, R.drawable.amidis, R.drawable.evian, R.drawable.nestle, R.drawable.vit};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Title = new ArrayList<>();
        Desk = new ArrayList<>();
        Gambar = new ArrayList<>();

        recyclerView= findViewById(R.id.recycler);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new MenuAdapter(this, Title,Desk, Gambar);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);

        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        }else {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }
    private void DaftarItem() {
        for (int w=0; w<title.length; w++){
            Gambar.add(image[w]);
            Title.add(title[w]);
            Desk.add(desk[w]);
        }
    }
}
