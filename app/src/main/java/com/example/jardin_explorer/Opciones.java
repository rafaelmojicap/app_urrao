package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Opciones extends AppCompatActivity {

    //atributos para referenciar elementos gráficos
    // qué tengo en el xml que quiero controlar

    Button botonExplorar;
    Button botonRestaurantes;
    Button botonAlojamiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        //asociar las variables creadas con los ID de los elementos que vienen desde XML

        botonExplorar = findViewById(R.id.btnExplorar);
        botonRestaurantes = findViewById(R.id.btnRestaurantes);
        botonAlojamiento = findViewById(R.id.btnAlojamiento);

        //escuchar eventos = dar clic en los botones
        botonExplorar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //acá escribo lo que quiero hacer cuando presionen el botón
                Toast.makeText(Opciones.this, "", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Opciones.this, Explorar.class);
                startActivity(intent);
            }
        });
        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //acá escribo lo que quiero hacer cuando presionen el botón
                Toast.makeText(Opciones.this, "", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Opciones.this, Restaurantes.class);
                startActivity(intent);
            }
        });
        botonAlojamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //acá escribo lo que quiero hacer cuando presionen el botón
                Toast.makeText(Opciones.this, "", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Opciones.this, Alojamiento.class);
                startActivity(intent);
            }
        });

    }
    //cargar el menú de opción deseado
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    //qué hago en cada opción del menú
    public boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado = item.getItemId();

        if(itemSeleccionado==R.id.opcion1){
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        } else if (itemSeleccionado==R.id.opcion2) {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        } else if (itemSeleccionado==R.id.opcion3) {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        } else if (itemSeleccionado==R.id.opcion4) {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        } else if (itemSeleccionado==R.id.opcion5) {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}