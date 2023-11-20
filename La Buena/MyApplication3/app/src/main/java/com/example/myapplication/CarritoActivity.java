package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CarritoActivity extends AppCompatActivity {

        private ListView listView;
        private TextView total;
        private double totalprec = 0;
        private TextView totalprecio;
        private static ArrayList<Producto> carro = new ArrayList<>();
        Button btnPaypal;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_carrito);
            carro = Carrito.carrito;
            initComponents();
            clicks();
            com.example.myapplication.MiAdaptador adaptador = new com.example.myapplication.MiAdaptador(this, carro);
            listView.setAdapter(adaptador);
            total.setText(String.valueOf(carro.size()));
            for (Producto producto: carro) {
                totalprec = totalprec + producto.getPrecio();
            }
            totalprecio.setText(String.valueOf(totalprec));



        }

        private void clicks(){
        btnPaypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paypal.com/es/signin"));
                startActivity(i);
            }
        });
        }

        private void initComponents(){
            listView = findViewById(R.id.listView);
            btnPaypal = findViewById(R.id.botoncomprar);
            totalprecio = findViewById(R.id.preciototal);
            total = findViewById(R.id.productostotal);
        }

}