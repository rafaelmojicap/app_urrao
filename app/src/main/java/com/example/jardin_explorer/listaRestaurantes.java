package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.jardin_explorer.adaptadores.HotelAdaptador;
import com.example.jardin_explorer.adaptadores.RestauranteAdaptador;
import com.example.jardin_explorer.moldes.Hotel;
import com.example.jardin_explorer.moldes.Restaurante;
import com.example.jardin_explorer.moldes.Sitio;

import java.util.ArrayList;

public class listaRestaurantes extends AppCompatActivity {

    ArrayList<Restaurante> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerViewRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerViewRestaurantes = findViewById(R.id.listadinamicarestaurantes);
        recyclerViewRestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaRestaurantes();
        RestauranteAdaptador adaptador = new RestauranteAdaptador(listaRestaurantes);
        recyclerViewRestaurantes.setAdapter(adaptador);
    }
    public void crearListaRestaurantes(){
        listaRestaurantes.add(new Restaurante(R.drawable.bonappetit, "Restaurante Colonial", "★★★★★", "Ofrecemos todo tipo de comidas, tipicas, etc.", "Dirección: Calle 20 No. 45 - 21A", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.aromasdelcafe, "Antojitos la Bombonera", "★★★★★", "Ofrecemos todo tipo de comidas, tipicas, etc.", "Dirección: Calle 9 Sur No. 56 - 21", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.antojitosdelvalle, "Restaurante el Pedrero", "★★★★☆", "Ofrecemos todo tipo de comidas, tipicas, etc.", "Dirección: Avenida del Rigo 25 - 21A", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.rinconserrano, "La Barrita Gourmet", "★★★★★", "Ofrecemos todo tipo de comidas, tipicas, etc.", "Dirección: Cr 56B Norte No. 56 - 52", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.lafogata, "Restaurante las palmas", "★★★★☆", "Ofrecemos todo tipo de comidas, tipicas, etc.", "Dirección: Cr 41A Sur No. 45 - 21", R.id.btnVerMas2));
    }

}