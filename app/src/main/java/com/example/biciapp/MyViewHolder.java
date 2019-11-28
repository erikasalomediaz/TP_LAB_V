package com.example.biciapp;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView tvNombre;
    TextView tvBarrio;
    TextView tvDireccion;
    TextView tvBiciDispo;
    TextView tvDocksDispo;
    int posicion;
    View v;
    public MyViewHolder(@NonNull View itemView, EstacionesActivity estActivity) {
        super(itemView);
        this.v = itemView;
        ListenerRv listenerRv = new ListenerRv(this, estActivity);
        this.tvNombre = itemView.findViewById(R.id.tvNombre);
        this.tvDireccion = itemView.findViewById(R.id.tvDireccion);
        this.tvBarrio = itemView.findViewById(R.id.tvBarrio);
        itemView.setOnClickListener(listenerRv);
    }
}
