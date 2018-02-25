package com.example.android.anawahidah_1202154337_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //menghubungkan layout dengan java
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }

    public void login(View view) {
        //membuat username sesuai ketentuan
        if (username.getText().toString().equals("EAD") && password.getText().toString().equals("MOBILE")) {
            //toast ketika login berhasil
            Toast.makeText(this,
                    "Selamat, Anda berhasil login", Toast.LENGTH_LONG).show();
            //setelah berhasil akan ke aktivity selanjutnya
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            //jalankan intent
            startActivity(intent);
        } else {
            //toast ketika login tidak berhasil
            Toast.makeText(this,
                    "Maaf, Anda tidak berhasil login", Toast.LENGTH_LONG).show();
        }

    }

}