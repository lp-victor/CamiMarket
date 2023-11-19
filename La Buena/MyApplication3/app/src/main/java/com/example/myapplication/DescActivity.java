package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DescActivity extends AppCompatActivity {

    //Button botonAgregar;
    Producto producto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        //botonAgregar = findViewById(R.id.botonAnadirCarrito);
        // RECIBIR INTENTS
        Intent intent = getIntent();
        String productoSeleccionado = intent.getStringExtra(Intent.EXTRA_TEXT);
        Log.i("miness" , productoSeleccionado);

        producto = new Producto(productoSeleccionado);
        ImageView imageView = findViewById(R.id.img_camiseta);
/*
        // Verifica si el intent tiene datos extras y es de tipo texto.
        if (intent != null && intent.getAction() != null) {
            if (intent.getAction().equals(Intent.ACTION_SEND) && "text/plain".equals(intent.getType())) {
                // El intent contiene texto compartido

                if (productoSeleccionado != null) {
                    // Instancio un Procucto para cargar la activity;

                }
            }
        }
*/
        // Cargo la imagen del producto en el imageView de la actividad.

        producto.cargarImagen(this, );
        /*
        botonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anadirProdCarrito();
            }
        });
        */

    }

    // MANDAR INTENTS

    public void anadirProdCarrito(){
        String txt = producto.getNombreProducto();
        // Creo el intent y lo mando a carrito, selecciono el tipo texto plano y le añado le texto extra con el nombre del producto.
        Intent intent = new Intent(DescActivity.this, CarritoActivity.class);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, txt);
    }

}