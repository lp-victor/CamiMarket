package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class DescActivity extends AppCompatActivity {

    Button botonAgregar;
    Button botonTalla;
    Producto producto;

    public static ArrayList<Producto> carrito = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        botonAgregar = findViewById(R.id.botonAnadirCarrito);


        Intent intent = getIntent();
        int id = intent.getIntExtra(MainActivity.IMG_ID,0);
        ImageView imageView = findViewById(R.id.img_camiseta);
        imageView.setImageResource(id);


        botonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anadirProdCarrito();
            }});
    }


    public void anadirProdCarrito(){
        String txt = producto.getNombreProducto();
        // Creo el intent y lo mando a carrito, selecciono el tipo texto plano y le añado le texto extra con el nombre del producto.
        Intent intent = new Intent(DescActivity.this, CarritoActivity.class);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, txt);
    }

}