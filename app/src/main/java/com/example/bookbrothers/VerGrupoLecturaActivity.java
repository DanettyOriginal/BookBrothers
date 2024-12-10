package com.example.bookbrothers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class VerGrupoLecturaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_grupo_delectura); // Vincula el diseño

        // Inicializar el botón y asignar el evento de clic
        Button anadir_comentario = findViewById(R.id.btn_agregar_comentario);
        anadir_comentario.setOnClickListener(v -> {
            Intent intent = new Intent(VerGrupoLecturaActivity.this, ComodinActivity.class);
            startActivity(intent);
        });
    }

    // Método para la imagen "home"
    public void goToPaginaPrincipalVerGrupo(android.view.View view) {
        Intent intent = new Intent(VerGrupoLecturaActivity.this, PrincipalActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "perfil"
    public void goToPaginaPerfilVerGrupo(android.view.View view) {
        Intent intent = new Intent(VerGrupoLecturaActivity.this, PerfilActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "notificaciones"
    public void goToPaginaNotificacionesVerGrupo(android.view.View view) {
        Intent intent = new Intent(VerGrupoLecturaActivity.this, ComodinActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "amigos"
    public void goToPaginaAmigosVerGrupo(android.view.View view) {
        Intent intent = new Intent(VerGrupoLecturaActivity.this, ComodinActivity.class);
        startActivity(intent);
    }
}
