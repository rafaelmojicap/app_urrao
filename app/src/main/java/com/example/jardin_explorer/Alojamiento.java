package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alojamiento extends AppCompatActivity {

    Button botonVerHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alojamiento);

        botonVerHoteles = findViewById(R.id.btnVerHoteles);
        botonVerHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alojamiento.this, listaHoteles.class);
                startActivity(intent);
            }
        });
    }
}