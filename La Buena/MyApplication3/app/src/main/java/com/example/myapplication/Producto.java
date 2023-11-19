package com.example.myapplication;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;

public class Producto {

    private String nombreProducto;
    private String talla;
    private int idImagenCamiseta;

    public Producto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
        setIdImagen();
    }

    public Producto(String nombreProducto, String talla) {
        this.nombreProducto = nombreProducto;
        this.talla = talla;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void cargarImagen(Context context, ImageView imageView) {
        // Obtiene el ID del recurso de imagen correspondiente
        int idRecurso = context.getResources().getIdentifier(nombreProducto, "drawable", context.getPackageName());

        if (idRecurso != 0) {
            // Carga la imagen en el ImageView
            imageView.setImageResource(idRecurso);
        }
    }

    public void setIdImagen(){
        switch (nombreProducto){
            case ("gooddev"):
                this.idImagenCamiseta = 1;
                break;
            case ("hateprog"):
                this.idImagenCamiseta = 2;
                break;
            case ("programer"):
                this.idImagenCamiseta = 3;
                break;
            case ("programming"):
                this.idImagenCamiseta = 4;
                break;
            case ("softwaredeveloper"):
                this.idImagenCamiseta = 5;
                break;
            case ("whileloop"):
                this.idImagenCamiseta = 6;
                break;
            default:
                Toast.makeText(null, "Error al establecer la imagen.", Toast.LENGTH_SHORT).show();
        }
    }
}
