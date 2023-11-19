package com.example.myapplication;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Producto extends AppCompatActivity {

    private String nombreProducto;
    private String talla = "M";
    private int idImagenCamiseta;

    public double precio = 19.99;

    public Producto(int idImagenCamiseta, String talla) {
        this.idImagenCamiseta = idImagenCamiseta;
        this.talla = talla;
        setInfoProducto();
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTalla() {
        return talla;
    }

    public double getPrecio (){
        return this.precio;
    }

    public void setInfoProducto(){
        if (idImagenCamiseta == R.drawable.gooddev){

        } else if (idImagenCamiseta == R.drawable.hateprog) {

        } else if (idImagenCamiseta == R.drawable.programer) {

        } else if (idImagenCamiseta == R.drawable.programming) {

        } else if (idImagenCamiseta == R.drawable.softwaredeveloper) {

        } else if (idImagenCamiseta == R.drawable.whileloop) {

        }

    }
}
