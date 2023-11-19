package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CarritoActivity extends AppCompatActivity {


        private ListView listView;
        private ArrayList<Producto> objetos = new ArrayList<>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_carrito);

            listView = findViewById(R.id.listView);

            // Agrega objetos a la lista
            objetos.add(new Producto("Persona 1", "25"));
            objetos.add(new Producto("Persona 2", "30"));

            com.example.myapplication.MiAdaptador adaptador = new com.example.myapplication.MiAdaptador(this, objetos);
            listView.setAdapter(adaptador);
        }

}