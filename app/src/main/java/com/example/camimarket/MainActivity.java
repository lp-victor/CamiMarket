package com.example.camimarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView c1 = findViewById(R.id.card1);
    //CardView c2 = findViewById(R.id.card2);
    //CardView c3 = findViewById(R.id.card3);
    //CardView c4 = findViewById(R.id.card4);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirProducto(new Producto(""));
            }
        });/*c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
*/
    }

    public void abrirProducto(Producto producto_e){
        String txt = producto_e.getNombreProducto();
        // Creo el intent y lo mando a carrito, selecciono el tipo texto plano y le añado le texto extra con el nombre del producto.
        Intent intent = new Intent(this, dscActivity.class);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, txt);
    }
}