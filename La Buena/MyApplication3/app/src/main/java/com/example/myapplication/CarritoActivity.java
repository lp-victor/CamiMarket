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
        private static ArrayList<Producto> carro = new ArrayList<>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_carrito);
            carro = Carrito.carrito;
            listView = findViewById(R.id.listView);
            // Agrega objetos a la lista
            //arro.add(new Producto(R.drawable.gooddev));
            //carro.add(new Producto(R.drawable.programer));
            //for (Producto producto: carro) {
            //    carro.add(producto);
            //}

            com.example.myapplication.MiAdaptador adaptador = new com.example.myapplication.MiAdaptador(this, carro);
            listView.setAdapter(adaptador);
            totalprecio = findViewById(R.id.preciototal);
            total = findViewById(R.id.productostotal);
            int tamanoCarro = carro.size();
            total.setText(String.valueOf(tamanoCarro));
            for (Producto producto: carro) {
                totalprec = totalprec + producto.getPrecio();
            }
            totalprecio.setText(String.valueOf(totalprec));
        }

}