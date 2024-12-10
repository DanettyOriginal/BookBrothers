package com.example.bookbrothers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NuevosDescubrimientosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_nuevos_descubrimientos); // Vincula el diseño

        // Inicializa y configura el botón dentro de onCreate
        Button otraRecomendacion = findViewById(R.id.btn_other_recommendation);
        otraRecomendacion.setOnClickListener(v -> {
            Intent intent = new Intent(NuevosDescubrimientosActivity.this, NuevosDescubrimientosActivity.class);
            startActivity(intent);
        });
    }

    // Método para la imagen "home"
    public void goToPaginaPrincipalNuevosDescubrimientos(android.view.View view) {
        Intent intent = new Intent(NuevosDescubrimientosActivity.this, PrincipalActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "perfil"
    public void goToPaginaPerfilNuevosDescubrimientos(android.view.View view) {
        Intent intent = new Intent(NuevosDescubrimientosActivity.this, PerfilActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "notificaciones"
    public void goToPaginaNotificacionesNuevosDescubrimientos(android.view.View view) {
        Intent intent = new Intent(NuevosDescubrimientosActivity.this, ComodinActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "amigos"
    public void goToPaginaAmigosNuevosDescubrimientos(android.view.View view) {
        Intent intent = new Intent(NuevosDescubrimientosActivity.this, ComodinActivity.class);
        startActivity(intent);
    }
}
