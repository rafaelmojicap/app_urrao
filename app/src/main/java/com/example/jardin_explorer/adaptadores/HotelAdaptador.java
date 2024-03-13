package com.example.jardin_explorer.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jardin_explorer.HotelesAmpliados;
import com.example.jardin_explorer.R;
import com.example.jardin_explorer.RestaurantesAmpliados;
import com.example.jardin_explorer.moldes.Hotel;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class HotelAdaptador extends RecyclerView.Adapter<HotelAdaptador.viewHolder> {

    //atributos de la clase

    public ArrayList<Hotel> listaHoteles;

    //constructor vacío

    public HotelAdaptador() {
    }

    //constructor lleno

    public HotelAdaptador(ArrayList<Hotel> listaHoteles) {this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public HotelAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel, null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdaptador.viewHolder holder, int position) {
        holder.pintarMolde(listaHoteles.get(position));

    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        //asocio los elementos de xml del molde
        ShapeableImageView fotomoldehotel;
        TextView nombrehotelmolde;
        TextView calificacionhotelmolde;
        TextView preciohotelmolde;
        TextView preciohotelmolde2;
        TextView preciohotelmolde3;
        Button btnVerMas;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotomoldehotel = itemView.findViewById(R.id.fotomoldehotel);
            nombrehotelmolde = itemView.findViewById(R.id.nombrehotelmolde);
            calificacionhotelmolde = itemView.findViewById(R.id.calificacionhotelmolde);
            preciohotelmolde = itemView.findViewById(R.id.preciohotelmolde);
            btnVerMas = itemView.findViewById(R.id.btnVerMas3);
        }

        public void pintarMolde(Hotel hotel) {
            fotomoldehotel.setImageResource(hotel.getFotografia());
            nombrehotelmolde.setText(hotel.getNombre());
            calificacionhotelmolde.setText(hotel.getCalificacion());
            preciohotelmolde.setText(hotel.getPrecio());
            btnVerMas.setBottom(hotel.getBoton());

            //escuchar click en cada uno de los elementos de la lista

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), HotelesAmpliados.class);
                    intent.putExtra("datoshotel", hotel);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
