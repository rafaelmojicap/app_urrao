package com.example.jardin_explorer.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jardin_explorer.R;
import com.example.jardin_explorer.RestaurantesAmpliados;
import com.example.jardin_explorer.moldes.Restaurante;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class RestauranteAdaptador extends RecyclerView.Adapter<RestauranteAdaptador.viewHolder> {

    public ArrayList<Restaurante> listaRestaurantes;

    public RestauranteAdaptador() {
    }

    public RestauranteAdaptador(ArrayList<Restaurante> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public RestauranteAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante, null, false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteAdaptador.viewHolder holder, int position) {
        holder.pintarMolde(listaRestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView fotomolderestaurante;
        TextView nombrerestaurantemolde;
        TextView calificacionrestaurantemolde;
        TextView descripcionrestaurantemolde;
        Button btnVerMas;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotomolderestaurante = itemView.findViewById(R.id.fotomolderestaurante);
            nombrerestaurantemolde = itemView.findViewById(R.id.nombrerestaurantemolde);
            calificacionrestaurantemolde = itemView.findViewById(R.id.calificacionrestaurantemolde);
            descripcionrestaurantemolde = itemView.findViewById(R.id.descripcionrestaurantemolde);
            btnVerMas = itemView.findViewById(R.id.btnVerMas2);
        }

        public void pintarMolde(Restaurante restaurante) {
            fotomolderestaurante.setImageResource(restaurante.getFotografia());
            nombrerestaurantemolde.setText(restaurante.getNombre());
            calificacionrestaurantemolde.setText(restaurante.getCalificacion());
            descripcionrestaurantemolde.setText(restaurante.getDescripcion());
            btnVerMas.setBottom(restaurante.getBoton());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), RestaurantesAmpliados.class);
                    intent.putExtra("datosrestaurante", restaurante);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}