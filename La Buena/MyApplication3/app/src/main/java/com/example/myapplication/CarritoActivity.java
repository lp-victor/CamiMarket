package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CarritoActivity extends AppCompatActivity {


        private ListView listView;
        private TextView total;
        private double totalprec = 0;
        private TextView totalprecio;
        private static ArrayList<Producto> carro = DescActivity.carrito;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_carrito);

            listView = findViewById(R.id.listView);

            // Agrega objetos a la lista
            //carrito.add(new Producto("Persona 1", "25"));
            //carrito.add(new Producto("Persona 2", "30"));
            for (Producto producto: carro) {
                carro.add(producto);
            }

            com.example.myapplication.MiAdaptador adaptador = new com.example.myapplication.MiAdaptador(this, carro);
            listView.setAdapter(adaptador);

            totalprecio = findViewById(R.id.preciototal);
            total = findViewById(R.id.productostotal);

            total.setText(carro.size());
            for (Producto producto: carro) {
                totalprec = totalprec + producto.getPrecio();
            }

        }

}