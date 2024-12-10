package com.example.bookbrothers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class PerfilLibroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_libro_detalles); // Vincula el diseño
    }

    // Método para la imagen "home"
    public void goToPaginaPrincipalLibroDetalles(android.view.View view) {
        Intent intent = new Intent(PerfilLibroActivity.this, PrincipalActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "perfil"
    public void goToPaginaPerfilLibroDetalles(android.view.View view) {
        //Intent intent = new Intent(PerfilLibroActivity.this, PerfilActivity.class);
        //startActivity(intent);
    }

    // Método para la imagen "notificaciones"
    public void goToPaginaNotificacionesLibroDetalles(android.view.View view) {
        Intent intent = new Intent(PerfilLibroActivity.this, ComodinActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "amigos"
    public void goToPaginaAmigosLibroDetalles(android.view.View view) {
        Intent intent = new Intent(PerfilLibroActivity.this, ComodinActivity.class);
        startActivity(intent);
    }
}
