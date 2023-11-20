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

    public Producto(int idImagenCamiseta) {
        this.idImagenCamiseta = idImagenCamiseta;
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

    public void setTalla (String talla){
        this.talla = talla;
    }

    public double getPrecio (){
        return this.precio;
    }

    public void setInfoProducto(){
        if (idImagenCamiseta == R.drawable.gooddev){
            setNombreProducto("Camiseta GoodDev");
        } else if (idImagenCamiseta == R.drawable.hateprog) {
            setNombreProducto("Camiseta Hate/Love Programming");
        } else if (idImagenCamiseta == R.drawable.programer) {
            setNombreProducto("Camiseta Programer");
        } else if (idImagenCamiseta == R.drawable.programming) {
            setNombreProducto("Camiseta Programming");
        } else if (idImagenCamiseta == R.drawable.softwaredeveloper) {
            setNombreProducto("Camiseta Software Developer");
        } else if (idImagenCamiseta == R.drawable.whileloop) {
            setNombreProducto("Camiseta While Loop");
        }

    }
}
