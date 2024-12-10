package com.example.bookbrothers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

public class ClubLecturaPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_clublecturaprincipal); // Vincula el diseño

        // Configurar el SearchView
        SearchView searchView = findViewById(R.id.buscador_clubLecturaPrincipal);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                // Acción al presionar Enter
                Intent intent = new Intent(ClubLecturaPrincipalActivity.this, GrupoDeLecturaActivity.class);
                intent.putExtra("query", query); // Pasar el texto de búsqueda a PrincipalActivity
                startActivity(intent);
                return true; // Indica que el evento fue manejado
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Acción opcional mientras el usuario escribe
                return false;
            }
        });

        // Configurar el botón "Buscar"
        Button btnBuscar = findViewById(R.id.btn_BuscarClubLecturaPrincipal);
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a GrupoDeLecturaActivity
                Intent intent = new Intent(ClubLecturaPrincipalActivity.this, VerGrupoLecturaActivity.class);
                startActivity(intent);
            }
        });

        // Configurar el botón "Crear"
        Button btnCrear = findViewById(R.id.btn_CrearGrupoLectura);
        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a CrearGrupoDeLecturaActivity
                Intent intent = new Intent(ClubLecturaPrincipalActivity.this, CrearGRupoDeLecturaActivity.class);
                startActivity(intent);
            }
        });
    }

    // Método para la imagen "home"
    public void goToPaginaPrincipalClubLectura(android.view.View view) {
        Intent intent = new Intent(ClubLecturaPrincipalActivity.this, PrincipalActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "perfil"
    public void goToPaginaPerfilLectura(android.view.View view) {
        Intent intent = new Intent(ClubLecturaPrincipalActivity.this, PerfilActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "notificaciones"
    public void goToPaginaNotificacionesLectura(android.view.View view) {
        Intent intent = new Intent(ClubLecturaPrincipalActivity.this, ComodinActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "amigos"
    public void goToPaginaAmigosLectura(android.view.View view) {
        Intent intent = new Intent(ClubLecturaPrincipalActivity.this, ComodinActivity.class);
        startActivity(intent);
    }
}
