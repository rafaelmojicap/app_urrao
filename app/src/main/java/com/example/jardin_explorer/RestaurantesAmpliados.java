package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.jardin_explorer.moldes.Restaurante;
import com.google.android.material.imageview.ShapeableImageView;

public class RestaurantesAmpliados extends AppCompatActivity {

    Restaurante datosrestaurante;
    TextView nombreRestaurante;
    ShapeableImageView fotoRestaurante;
    TextView calificacionRestaurante;
    TextView descripcionRestaurante;
    TextView direccionRestaurante;
    Button botonRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_ampliados);

        fotoRestaurante=findViewById(R.id.fotorestauranteampliado);
        nombreRestaurante=findViewById(R.id.nombrerestauranteampliado);
        calificacionRestaurante=findViewById(R.id.calificacionrestauranteampliado);
        descripcionRestaurante=findViewById(R.id.descripcionrestauranteampliado);
        direccionRestaurante=findViewById(R.id.direccionrestauranteampliado);
        botonRestaurante=findViewById(R.id.btnVerMas2);

        //datosrestaurante = (Restaurantes)getIntent().getSerializableExtra("datosrestaurante");
        datosrestaurante=(Restaurante)getIntent().getSerializableExtra("datosrestaurante");


        fotoRestaurante.setImageResource(datosrestaurante.getFotografia());
        nombreRestaurante.setText(datosrestaurante.getNombre());
        calificacionRestaurante.setText(datosrestaurante.getCalificacion());
        descripcionRestaurante.setText(datosrestaurante.getDescripcion());
        direccionRestaurante.setText(datosrestaurante.getDireccion());
        botonRestaurante.setBottom(datosrestaurante.getBoton());

    }
}