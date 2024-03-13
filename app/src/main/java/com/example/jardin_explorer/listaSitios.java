package com.example.jardin_explorer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jardin_explorer.adaptadores.HotelAdaptador;
import com.example.jardin_explorer.adaptadores.SitiosAdaptador;
import com.example.jardin_explorer.moldes.Hotel;
import com.example.jardin_explorer.moldes.Sitio;

import java.util.ArrayList;

public class listaSitios extends AppCompatActivity {
    ArrayList<Sitio> listaSitios = new ArrayList<>();
    RecyclerView recyclerViewSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);

        recyclerViewSitios = findViewById(R.id.listadinamicasitios);
        recyclerViewSitios.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaSitios();
        SitiosAdaptador adaptador = new SitiosAdaptador(listaSitios);
        recyclerViewSitios.setAdapter(adaptador);
    }
    public void crearListaSitios(){
        listaSitios.add(new Sitio(R.drawable.gallito, "Paramo del Sol", "★★★★", "Está sobre los 4000 metros sobre el nivel del mar, hogar del oso de anteojos. Este lugar es uno de los puntos más altos de Antioquia", "Teléfono: 3154026978", R.id.btnVerMas1));
        listaSitios.add(new Sitio(R.drawable.teatromunicipal, "Parque Nacional de las Orquideas", "★★★★★", "La diversidad de paisajes de este parque provocan diversas formaciones de flora que vuelven mágica cada visita.", "Teléfono: 301568921", R.id.btnVerMas1));
        listaSitios.add(new Sitio(R.drawable.basilica, "Reserva Colibrí del Sol", "★★★★★", "Creada para resguardar y preservar al colibrí del sol, esta reserva se encuentra en la vereda el Chuscal.", "Teléfono: 3126985214", R.id.btnVerMas1));
    }


}

