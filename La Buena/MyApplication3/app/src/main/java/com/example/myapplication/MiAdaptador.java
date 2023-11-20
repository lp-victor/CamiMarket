package com.example.myapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MiAdaptador extends ArrayAdapter<Producto> {
    private Context context;
    private ArrayList<Producto> carrito;

    public MiAdaptador(Context context, ArrayList<Producto> objetos) {
        super(context, R.layout.item_layout, objetos);
        this.context = context;
        this.carrito = objetos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_layout, null);
        }

        Producto producto = carrito.get(position);

        if (producto != null) {
            TextView nombreTextView = view.findViewById(R.id.Nombre);
            TextView precioTextView = view.findViewById(R.id.precio);
            TextView tallaTextView = view.findViewById(R.id.Talla);

            if (nombreTextView != null) {
                nombreTextView.setText(producto.getNombreProducto());
            }
            if (tallaTextView != null) {
                tallaTextView.setText(String.valueOf(producto.getTalla()));
            }if (precioTextView != null) {
                precioTextView.setText(String.valueOf(producto.getPrecio());
            }

        }

        return view;
    }
}
