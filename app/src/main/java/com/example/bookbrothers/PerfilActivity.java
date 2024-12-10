package com.example.bookbrothers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_perfil); // Vincula el diseño

        // Configurar el botón "Ver tus listas"
        Button verTusListas = findViewById(R.id.btnVerTusListas);
        verTusListas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a ComodinActivity
                Intent intent = new Intent(PerfilActivity.this, ComodinActivity.class);
                startActivity(intent);
            }
        });

        // Configurar el botón "Ver tus amigos"
        Button verTusAmigos = findViewById(R.id.btnVerTusAmigos);
        verTusAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a ComodinActivity
                Intent intent = new Intent(PerfilActivity.this, ComodinActivity.class);
                startActivity(intent);
            }
        });

        // Configurar el botón "Ver tus grupos de lectura"
        Button verTusGruposLectura = findViewById(R.id.btnVerTusGruposLectura);
        verTusGruposLectura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a ComodinActivity
                Intent intent = new Intent(PerfilActivity.this, ComodinActivity.class);
                startActivity(intent);
            }
        });

        // Configurar el botón "Cambiar ajustes"
        Button cambiarAjustes = findViewById(R.id.btnCambiarAjustes);
        cambiarAjustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a ComodinActivity
                Intent intent = new Intent(PerfilActivity.this, ComodinActivity.class);
                startActivity(intent);
            }
        });
    }

    // Método para la imagen "home"
    public void goToPaginaPrincipalPerfil(android.view.View view) {
        Intent intent = new Intent(PerfilActivity.this, PrincipalActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "perfil"
    public void goToPaginaPerfilPerfil(android.view.View view) {
        //Intent intent = new Intent(PerfilActivity.this, PerfilActivity.class);
        //startActivity(intent);
    }

    // Método para la imagen "notificaciones"
    public void goToPaginaNotificacionesPerfil(android.view.View view) {
        Intent intent = new Intent(PerfilActivity.this, ComodinActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "amigos"
    public void goToPaginaAmigosPerfil(android.view.View view) {
        Intent intent = new Intent(PerfilActivity.this, ComodinActivity.class);
        startActivity(intent);
    }
}
