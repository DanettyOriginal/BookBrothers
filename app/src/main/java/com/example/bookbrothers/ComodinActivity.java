package com.example.bookbrothers;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ComodinActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_comodin); // Vincula el diseño
    }

    // Método para la imagen "home"
    public void goToPaginaPrincipalComodin(android.view.View view) {
        Intent intent = new Intent(ComodinActivity.this, PrincipalActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "perfil"
    public void goToPaginaPerfilComodin(android.view.View view) {
        Intent intent = new Intent(ComodinActivity.this, PerfilActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "notificaciones"
    public void goToPaginaNotificacionesComodin(android.view.View view) {
        //Intent intent = new Intent(ComodinActivity.this, ComodinActivity.class);
        //startActivity(intent);
    }

    // Método para la imagen "amigos"
    public void goToPaginaAmigosComodin(android.view.View view) {
        //Intent intent = new Intent(ComodinActivity.this, ComodinActivity.class);
        //startActivity(intent);
    }
}
