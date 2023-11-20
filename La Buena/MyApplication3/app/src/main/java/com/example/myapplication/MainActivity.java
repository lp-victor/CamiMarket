package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.RouteListingPreference;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    public static final String IMG_ID = "imgID";
    LinearLayout c1;
    LinearLayout c2;
    LinearLayout c3;
    LinearLayout c4;
    LinearLayout c5;
    LinearLayout c6;
    FloatingActionButton fBtn;

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
        fBtn = findViewById(R.id.irACarrito);

        clicks();
    }

    private void clicks(){
        fBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CarritoActivity.class);

                startActivity(i);
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarId(R.drawable.gooddev);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarId(R.drawable.hateprog);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarId(R.drawable.programer);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarId(R.drawable.programming);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarId(R.drawable.softwaredeveloper);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarId(R.drawable.whileloop);
            }
        });
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.toolbar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.modoBoton) {
            toggleNightMode();
            return true;
        }
        if (item.getItemId() == R.id.salirBoton) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void toggleNightMode() {
        int currentNightMode = getResources().getConfiguration().uiMode
                & Configuration.UI_MODE_NIGHT_MASK;

        // Cambia entre los modos diurno y nocturno
        if (currentNightMode == Configuration.UI_MODE_NIGHT_NO) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

        recreate(); // Reinicia la actividad para aplicar el nuevo modo
    }

    public void enviarId(int id){
        // Creo el intent y lo mando a carrito, selecciono el tipo texto plano y le añado le texto extra con el nombre del producto.
        Intent intent = new Intent(MainActivity.this, DescActivity.class);
        intent.putExtra("imgID", id);
        startActivity(intent);
    }



}