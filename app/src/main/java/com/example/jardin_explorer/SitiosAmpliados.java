package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jardin_explorer.moldes.Hotel;
import com.example.jardin_explorer.moldes.Sitio;
import com.google.android.material.imageview.ShapeableImageView;

public class SitiosAmpliados extends AppCompatActivity {

    Sitio datossitio;
    ShapeableImageView fotoSitio;
    TextView nombreSitio;
    TextView calificacionSitio;
    TextView descripcionSitio;
    TextView numeroSitio;
    Button botonSitio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_ampliados);

        fotoSitio=findViewById(R.id.fotositioampliado);
        nombreSitio=findViewById(R.id.nombresitioampliado);
        calificacionSitio=findViewById(R.id.calificacionsitioampliado);
        descripcionSitio=findViewById(R.id.descripcionsitioampliado);
        numeroSitio=findViewById(R.id.numerositioampliado);
        botonSitio=findViewById(R.id.btnVerMas1);

        datossitio=(Sitio)getIntent().getSerializableExtra("datossitio");
        //Toast.makeText(this, datossitio.getNombre(), Toast.LENGTH_SHORT).show();

        fotoSitio.setImageResource(datossitio.getFotografia());
        nombreSitio.setText(datossitio.getNombre());
        calificacionSitio.setText(datossitio.getCalificacion());
        descripcionSitio.setText(datossitio.getDescripcion());
        numeroSitio.setText(datossitio.getTelefono());
        botonSitio.setBottom(datossitio.getBoton());
    }
}