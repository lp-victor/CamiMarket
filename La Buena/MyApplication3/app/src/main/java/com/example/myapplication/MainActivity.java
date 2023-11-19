package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public static final String IMG_ID = "imgID";
    LinearLayout c1;
    LinearLayout c2;
    LinearLayout c3;
    LinearLayout c4;
    LinearLayout c5;
    LinearLayout c6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.card1);
        c2 = findViewById(R.id.card2);
        c3 = findViewById(R.id.card3);
        c4 = findViewById(R.id.card4);
        c5 = findViewById(R.id.card5);
        c6 = findViewById(R.id.card6);

        clicks();

    }

    private void clicks(){
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarId(R.drawable.gooddev);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarId(R.drawable.hateprog);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarId(R.drawable.programer);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarId(R.drawable.programming);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarId(R.drawable.softwaredeveloper);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarId(R.drawable.whileloop);
            }
        });
    }
    public void enviarId(int id){
        // Creo el intent y lo mando a carrito, selecciono el tipo texto plano y le añado le texto extra con el nombre del producto.
        Intent intent = new Intent(MainActivity.this, DescActivity.class);
        intent.putExtra("imgID", id);
        startActivity(intent);
    }



}