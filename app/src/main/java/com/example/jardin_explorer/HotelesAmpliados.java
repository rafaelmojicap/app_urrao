package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.jardin_explorer.moldes.Hotel;
import com.google.android.material.imageview.ShapeableImageView;

public class HotelesAmpliados extends AppCompatActivity {

    Hotel datoshotel;
    TextView nombreHotel;
    ShapeableImageView fotoHotel;
    TextView calificacionHotel;
    TextView descripcionHotel;
    TextView precioHotel;
    TextView numeroHotel;
    TextView direccionHotel;
    Button botonHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_ampliados);

        fotoHotel=findViewById(R.id.fotohotelampliado);
        nombreHotel=findViewById(R.id.nombrehotelampliado);
        calificacionHotel=findViewById(R.id.calificacionhotelampliado);
        descripcionHotel=findViewById(R.id.descripcionhotelampliado);
        precioHotel=findViewById(R.id.preciohotelampliado);
        numeroHotel=findViewById(R.id.numerohotelampliado);
        direccionHotel=findViewById(R.id.direccionhotelampliado);
        botonHotel=findViewById(R.id.btnVerMas3);

        datoshotel=(Hotel)getIntent().getSerializableExtra("datoshotel");

        fotoHotel.setImageResource(datoshotel.getFotografia());
        nombreHotel.setText(datoshotel.getNombre());
        calificacionHotel.setText(datoshotel.getCalificacion());
        descripcionHotel.setText(datoshotel.getDescripcion());
        precioHotel.setText(datoshotel.getPrecio());
        numeroHotel.setText(datoshotel.getTelefono());
        direccionHotel.setText(datoshotel.getDireccion());
        botonHotel.setBottom(datoshotel.getBoton());
    }
}