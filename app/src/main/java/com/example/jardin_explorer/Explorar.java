package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explorar extends AppCompatActivity {

    Button botonVerSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explorar);

        botonVerSitios = findViewById(R.id.btnVerPlanes);
        botonVerSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explorar.this, listaSitios.class);
                startActivity(intent);
            }
        });
    }
}