package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


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
                abrirProducto(new Producto("gooddev"));
                Intent i = new Intent(MainActivity.this, DescActivity.class);
                startActivity(i);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirProducto(new Producto("hateprog"));
                Intent i = new Intent(MainActivity.this, DescActivity.class);
                startActivity(i);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirProducto(new Producto("programer"));
                Intent i = new Intent(MainActivity.this, DescActivity.class);
                startActivity(i);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirProducto(new Producto("programming"));
                Intent i = new Intent(MainActivity.this, DescActivity.class);
                startActivity(i);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirProducto(new Producto("softwaredeveloper"));
                Intent i = new Intent(MainActivity.this, DescActivity.class);
                startActivity(i);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirProducto(new Producto("whileloop"));
                Intent i = new Intent(MainActivity.this, DescActivity.class);
                startActivity(i);
            }
        });
    }
    public void abrirProducto(Producto producto_e){
        String txt = producto_e.getNombreProducto();
        // Creo el intent y lo mando a carrito, selecciono el tipo texto plano y le añado le texto extra con el nombre del producto.
        Intent intent = new Intent(MainActivity.this, DescActivity.class);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, txt);
    }



}