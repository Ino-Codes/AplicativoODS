package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btntela,btntela2,btntela3,btntela4,btntela5,btntela6,btntela7,btntela8,btntela9,btntela10,btntela11,btntela12,btntela13,btntela14,btntela15,btntela16,btntela17, btnsair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Troca de tela
        // localizar o elemento pelo ID e atribuir os valores ao atributo
        btntela = findViewById(R.id.btntela);
        //configurando o botao com a opção de click
        btntela.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela2 = new Intent( getApplicationContext(), Tela2Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela2);
        });

        btntela2 = findViewById(R.id.btntela2);
        //configurando o botao com a opção de click
        btntela2.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela3 = new Intent( getApplicationContext(), Tela3Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela3);
        });

        btntela3 = findViewById(R.id.btntela3);
        //configurando o botao com a opção de click
        btntela3.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela4 = new Intent( getApplicationContext(), Tela4Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela4);
        });

        btntela4 = findViewById(R.id.btntela4);
        //configurando o botao com a opção de click
        btntela4.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela5 = new Intent( getApplicationContext(), Tela5Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela5);
        });

        btntela5 = findViewById(R.id.btntela5);
        //configurando o botao com a opção de click
        btntela5.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela6 = new Intent( getApplicationContext(), Tela6Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela6);
        });

        btntela6 = findViewById(R.id.btntela6);
        //configurando o botao com a opção de click
        btntela6.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela7 = new Intent( getApplicationContext(), Tela7Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela7);
        });

        btntela7 = findViewById(R.id.btntela7);
        //configurando o botao com a opção de click
        btntela7.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela8 = new Intent( getApplicationContext(), Tela8Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela8);
        });

        btntela8 = findViewById(R.id.btntela8);
        //configurando o botao com a opção de click
        btntela8.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela9 = new Intent( getApplicationContext(), Tela9Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela9);
        });

        btntela9 = findViewById(R.id.btntela9);
        //configurando o botao com a opção de click
        btntela9.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela10 = new Intent( getApplicationContext(), Tela10Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela10);
        });

        btntela10 = findViewById(R.id.btntela10);
        //configurando o botao com a opção de click
        btntela10.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela11 = new Intent( getApplicationContext(), Tela11Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela11);
        });

        btntela11 = findViewById(R.id.btntela11);
        //configurando o botao com a opção de click
        btntela11.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela12 = new Intent( getApplicationContext(), Tela12Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela12);
        });

        btntela12 = findViewById(R.id.btntela12);
        //configurando o botao com a opção de click
        btntela12.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela13 = new Intent( getApplicationContext(), Tela13Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela13);
        });

        btntela13 = findViewById(R.id.btntela13);
        //configurando o botao com a opção de click
        btntela13.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela14 = new Intent( getApplicationContext(), Tela14Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela14);
        });

        btntela14 = findViewById(R.id.btntela14);
        //configurando o botao com a opção de click
        btntela14.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela15 = new Intent( getApplicationContext(), Tela15Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela15);
        });

        btntela15 = findViewById(R.id.btntela15);
        //configurando o botao com a opção de click
        btntela15.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela16 = new Intent( getApplicationContext(), Tela16Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela16);
        });

        btntela16 = findViewById(R.id.btntela16);
        //configurando o botao com a opção de click
        btntela16.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela17 = new Intent( getApplicationContext(), Tela17Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela17);
        });

        btntela17 = findViewById(R.id.btntela17);
        //configurando o botao com a opção de click
        btntela17.setOnClickListener(view -> {
            //instanciando a tela / activity - na tela arquivo java Ex: Tela2.class
            Intent tela18 = new Intent( getApplicationContext(), Tela18Activity.class);
            //inicia a intent = tela2 = Activity
            startActivity(tela18);
        });

        btnsair = findViewById(R.id.btnsair);
        btnsair.setOnClickListener(view -> {
            finish();
            finishAffinity();
        });
    }
}