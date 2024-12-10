package com.example.bookbrothers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class CrearGRupoDeLecturaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_crear_grupo_lectura); // Vincula el diseño
    }

    // Método para el botón "volver"
    public void volver(View view) {
        // Aquí puedes definir qué hacer al presionar "Volver"
        // Usualmente solo se regresa a la actividad anterior
        Intent intent = new Intent(CrearGRupoDeLecturaActivity.this, ClubLecturaPrincipalActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "home"
    public void goToPaginaPrincipalCrearGrupo(View view) {
        Intent intent = new Intent(CrearGRupoDeLecturaActivity.this, PrincipalActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "perfil"
    public void goToPaginaPerfilCrearGrupo(View view) {
        Intent intent = new Intent(CrearGRupoDeLecturaActivity.this, PerfilActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "notificaciones"
    public void goToPaginaNotificacionesCrearGrupo(View view) {
        Intent intent = new Intent(CrearGRupoDeLecturaActivity.this, ComodinActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "amigos"
    public void goToPaginaAmigosCrearGrupo(View view) {
        Intent intent = new Intent(CrearGRupoDeLecturaActivity.this, ComodinActivity.class);
        startActivity(intent);
    }
}
