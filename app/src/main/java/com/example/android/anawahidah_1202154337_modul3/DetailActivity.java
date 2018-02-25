package com.example.android.anawahidah_1202154337_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    TextView Title, DetailAir, Volume;
    ImageButton add, remove;
    ImageView gbrMerek, gbrVolume;
    private int minteger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //mengeset button back agar muncul di view
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //menerima value yang dikirimkan dari activity sebelumnya berupa sebuah key value
        String title = getIntent().getStringExtra("title");
        Integer image = getIntent().getIntExtra("image", 0);

        //mendifinisikan TextView dan ImageView dengan id
        TextView txtTitle = findViewById(R.id.title);
        ImageView images = findViewById(R.id.photo);

        //mengeset valuenya
        txtTitle.setText(title);
        images.setImageResource(image);

        //menghubungkan layout dengan java
        Title = (TextView) findViewById(R.id.title);
        DetailAir = (TextView) findViewById(R.id.detailKet);
        Volume = (TextView) findViewById(R.id.tv_liter);
        add = (ImageButton) findViewById(R.id.ib_plus);
        remove = (ImageButton) findViewById(R.id.ib_minus);
        gbrMerek = (ImageView) findViewById(R.id.photo);
        gbrVolume = (ImageView) findViewById(R.id.batere);
    }

    // method button plus
    public void plus(View view) {
        minteger = minteger + 1;
        display(minteger);
        if (minteger==4){
            add.setEnabled(false);
        }
        switch (minteger){
            case(1):
                gbrVolume.setImageResource(R.drawable.ic_battery);
                Toast.makeText(getApplicationContext(), "Air Sedikit", Toast.LENGTH_SHORT).show();
                break;
            case(2):
                gbrVolume.setImageResource(R.drawable.ic_battery_50);
                break;
            case(3):
                gbrVolume.setImageResource(R.drawable.ic_battery_80);
                break;
            case(4):
                gbrVolume.setImageResource(R.drawable.ic_battery_full);
                Toast.makeText(getApplicationContext(), "Air Sudah Full", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    // method button minus
    public void minus(View view) {
        minteger = minteger - 1;
        display(minteger);
        if (minteger==0){
            remove.setEnabled(false);
        }

        switch (minteger){
            case(1):
                gbrVolume.setImageResource(R.drawable.ic_battery);
                Toast.makeText(getApplicationContext(), "Air Sedikit", Toast.LENGTH_SHORT).show();
                break;
            case(2):
                gbrVolume.setImageResource(R.drawable.ic_battery_50);
                break;
            case(3):
                gbrVolume.setImageResource(R.drawable.ic_battery_80);
                break;
            case(4):
                gbrVolume.setImageResource(R.drawable.ic_battery_full);
                Toast.makeText(getApplicationContext(), "Air Sudah Full", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById((R.id.tv_liter));
        displayInteger.setText("" + number +" L");

    }

}
