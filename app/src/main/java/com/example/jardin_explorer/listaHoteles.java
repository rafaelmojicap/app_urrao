package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.jardin_explorer.adaptadores.HotelAdaptador;
import com.example.jardin_explorer.moldes.Hotel;

import java.util.ArrayList;

public class listaHoteles extends AppCompatActivity {

    ArrayList<Hotel> listaHoteles = new ArrayList<>();
    RecyclerView recyclerViewHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerViewHoteles = findViewById(R.id.listadinamicahoteles);
        recyclerViewHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        HotelAdaptador adaptador = new HotelAdaptador(listaHoteles);
        recyclerViewHoteles.setAdapter(adaptador);
    }
    public void crearListaHoteles(){
        listaHoteles.add(new Hotel("Hotel Colonial", "Precios a partir de\nCOP 200.000\npor noche", "Confortables habitaciones, incluye comida por persona, piscina, etc.", "Tel: 3164052415", "Cr 40 No. 58 - 21", "★★★★", R.drawable.gulupaecolodge, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Finca Hotel las Araucarias", "Precios a partir de\nCOP 210.000\npor noche", "Confortables habitaciones, incluye comida por persona, piscina, etc.", "Tel: 3005986213", "Calle 19B Sur No. 45 - 21", "★★★★★", R.drawable.hotelplantacion, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Hotel Flores del Paraiso", "Precios a partir de\nCOP 215.000\npor noche", "Confortables habitaciones, incluye comida por persona, piscina, etc.", "Tel: 3154087695", "Cr 41 No. 12 - 71B", "★★★★★", R.drawable.kantarrana, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Finca Hotel Paraiso Urrao", "Precios a partir de\nCOP 218.000\npor noche", "Confortables habitaciones, incluye comida por persona, piscina, etc.", "Tel: 3162056987", "Cra. 6 No. 10 - 57", "★★★★★", R.drawable.kantarranaurbana, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Hotel Valle del Penderiso", "Precios a partir de\nCOP 240.000\npor noche", "Confortables habitaciones, incluye comida por persona, piscina, etc.", "Tel: 3212067812", "Calle 17A Norte No. 45 - 12", "★★★★", R.drawable.hosteriaelparaiso, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Finca Hotel Riomanso", "Precios a partir de\nCOP 245.000\npor noche", "Confortables habitaciones, incluye comida por persona, piscina, etc.", "Tel: 3202368541", "Cr 45A Sur No. 67 - 19", "★★★★", R.drawable.patiobonito, R.id.btnVerMas3));
    }
}