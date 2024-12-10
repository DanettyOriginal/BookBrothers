package com.example.bookbrothers;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class GrupoDeLecturaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_libro_detalles); // Vincula el diseño
    }

    // Método para la imagen "home"
    public void goToPaginaPrincipalGrupoBuscado(android.view.View view) {
        Intent intent = new Intent(GrupoDeLecturaActivity.this, PrincipalActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "perfil"
    public void goToPaginaPerfilGrupoBuscado(android.view.View view) {
        Intent intent = new Intent(GrupoDeLecturaActivity.this, ComodinActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "notificaciones"
    public void goToPaginaNotificacionesGrupoBuscado(android.view.View view) {
        Intent intent = new Intent(GrupoDeLecturaActivity.this, ComodinActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "amigos"
    public void goToPaginaAmigosGrupoBuscado(android.view.View view) {
        Intent intent = new Intent(GrupoDeLecturaActivity.this, ComodinActivity.class);
        startActivity(intent);
    }
}
