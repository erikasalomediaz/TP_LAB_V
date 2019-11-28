package com.example.biciapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
static String estaciones;
    ArrayList<Estacion> estacionesa;
    EstacionesActivity ea;
    MiHilo miHilo = new MiHilo();

    //primero traerme en el constructor la lista que voy a cargar en el recyclerView
    MyAdapter(EstacionesActivity ea){
        this.ea = ea;
        miHilo.start();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        estacionesa = Parseador.parser(estaciones);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //aca le paso el item, lo convierto en una view y se lo paso al mvh para que lo genere
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyViewHolder mvh = new MyViewHolder(v, ea);

        return mvh;
    }

    @Override
    public void onBindViewHolder (@NonNull MyViewHolder holder, int position) {

        holder.posicion = position;

         String d = estacionesa.get(position).getBarrio();
          holder.tvNombre.setText(estacionesa.get(position).getNombre());
        holder.tvBarrio.setText(estacionesa.get(position).getBarrio());
        holder.tvDireccion.setText(estacionesa.get(position).getDireccion());

    }

    @Override
    public int getItemCount() {
        return estacionesa.size();
    }

}
