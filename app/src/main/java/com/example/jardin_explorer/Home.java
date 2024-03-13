package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //atributos para referenciar elementos gráficos
    // qué tengo en el xml que quiero controlar

    Button botonComenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //asociar las variables creadas con los ID de los elementos que vienen desde XML

        botonComenzar = findViewById(R.id.btnComenzar);

        //escuchar eventos = dar clic en los botones
        botonComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //acá escribo lo que quiero hacer cuando presionen el botón
                Toast.makeText(Home.this, "", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Home.this, Opciones.class);
                startActivity(intent);
            }
        });
    }
}