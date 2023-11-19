package com.example.camimarket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class descActivity {

    Button botonAgregar = findViewById(R.id.botonAnadirCarrito);
    Producto producto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        // RECIBIR INTENTS
        Intent intent = getIntent();
        // Verifica si el intent tiene datos extras y es de tipo texto.
        if (intent != null && intent.getAction() != null) {
            if (intent.getAction().equals(Intent.ACTION_SEND) && "text/plain".equals(intent.getType())) {
                // El intent contiene texto compartido
                String productoSeleccionado = intent.getStringExtra(Intent.EXTRA_TEXT);
                if (productoSeleccionado != null) {
                    // Instancio un Procucto para cargar la activity;
                    producto = new Producto(productoSeleccionado);
                }
            }
        }
        // Cargo la imagen del producto en el imageView de la actividad.
        producto.cargarImagen(this, findViewById(R.id.img_camiseta));
        botonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anadirProdCarrito();
            }
        });

    }

    // MANDAR INTENTS
    public void anadirProdCarrito(){
        String txt = producto.getNombreProducto();

        // Creo el intent y lo mando a carrito, selecciono el tipo texto plano y le añado le texto extra con el nombre del producto.
        Intent intent = new Intent(descActivity.this, carritoActivity.class);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, txt);
    }

}
