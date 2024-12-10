package com.example.bookbrothers;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_principal); // Vincula el diseño
    }

    // Método para la imagen "ClubLectura"
    public void goToClubLecturaPrincipal(android.view.View view) {
        Intent intent = new Intent(PrincipalActivity.this, ClubLecturaPrincipalActivity.class); // Cambia a tu actividad de destino
        startActivity(intent);
    }

    // Método para la imagen "MisLibros"
    public void goToMisLibrosPrincipal(android.view.View view) {
        Intent intent = new Intent(PrincipalActivity.this, MisLibrosActivity.class); // Cambia a tu actividad de destino
        startActivity(intent);
    }

    // Método para la imagen "NuevosDescubrimientos"
    public void goToNuevosDescubrimientosPrincipal(android.view.View view) {
        Intent intent = new Intent(PrincipalActivity.this, NuevosDescubrimientosActivity.class); // Cambia a tu actividad de destino
        startActivity(intent);
    }

    // Método para la imagen "BBrothersAfines"
    public void goToBBrothersAfinesPrincipal(android.view.View view) {
        Intent intent = new Intent(PrincipalActivity.this, ComodinActivity.class); // Cambia a tu actividad de destino
        startActivity(intent);
    }

    // Método para la imagen "home"
    public void goToPaginaPrincipalPrincipal(android.view.View view) {
        //Intent intent = new Intent(PrincipalActivity.this, PrincipalActivity.class); // Cambia a tu actividad de destino
        //startActivity(intent);
    }

    // Método para la imagen "perfil"
    public void goToPaginaPerfilPrincipal(android.view.View view) {
        Intent intent = new Intent(PrincipalActivity.this, PerfilActivity.class); // Cambia a tu actividad de destino
        startActivity(intent);
    }

    // Método para la imagen "notificaciones"
    public void goToPaginaNotificacionesPrincipal(android.view.View view) {
        Intent intent = new Intent(PrincipalActivity.this, ComodinActivity.class); // Cambia a tu actividad de destino
        startActivity(intent);
    }

    // Método para la imagen "amigos"
    public void goToPaginaAmigosPrincipal(android.view.View view) {
        Intent intent = new Intent(PrincipalActivity.this, ComodinActivity.class); // Cambia a tu actividad de destino
        startActivity(intent);
    }
}
