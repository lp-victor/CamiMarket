package com.example.camimarket;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.myapplication.Producto;

import java.util.ArrayList;

public class MiAdaptador extends ArrayAdapter<Producto> {
    private Context context;
    private ArrayList<Producto> carrito;

    public MiAdaptador(Context context, ArrayList<Producto> objetos) {
        super(context, R.layout.item_layout, objetos);
        this.context = context;
        this.carrito = carrito;
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
            TextView nombreTextView = view.findViewById(R.id.nombreTextView);
            TextView edadTextView = view.findViewById(R.id.edadTextView);

            if (nombreTextView != null) {
                nombreTextView.setText(producto.getNombreProducto());
            }
            if (edadTextView != null) {
                edadTextView.setText(String.valueOf(producto.getTalla()));
            }

        }

        return view;
    }
}
