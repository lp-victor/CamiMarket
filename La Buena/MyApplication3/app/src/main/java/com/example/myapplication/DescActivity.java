package com.example.myapplication;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.Format;
import java.util.ArrayList;

public class DescActivity extends AppCompatActivity {

    Button [] tallas;
    Button botonAgregar;
    Producto producto;

    public static ArrayList<Producto> carrito = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        botonAgregar = findViewById(R.id.botonAnadirCarrito);
        tallas = new Button[] {(findViewById(R.id.botonS)),findViewById(R.id.botonM),findViewById(R.id.botonL), findViewById(R.id.botonXL)};

        Intent intent = getIntent();
        int id = intent.getIntExtra(MainActivity.IMG_ID,0);
        ImageView imageView = findViewById(R.id.img_camiseta);
        imageView.setImageResource(id);


        producto = new Producto(id);
        clicksTalla();
        botonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast productoAnanido = Toast.makeText(DescActivity.this, R.string.producto_a_adido_al_carrito, Toast.LENGTH_SHORT);
                productoAnanido.show();
                anadirProdCarrito();
            }});
    }

    public void clicksTalla(){
        View.OnClickListener tallaButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button talla: tallas) {
                    if (v == talla){
                        producto.setTalla((String)talla.getText());
                    }
                }
            }};
    }


    public void anadirProdCarrito(){
        Carrito.carrito.add(producto);
    }

}