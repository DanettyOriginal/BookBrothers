package com.example.bookbrothers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IniciarSesionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_iniciarsesion);


        Button registrarInciarSesion = findViewById(R.id.btn_RegistrarseIniciarSesion);
        registrarInciarSesion.setOnClickListener(v -> {
            Intent intent = new Intent(IniciarSesionActivity.this, RegistroActivity.class);
            startActivity(intent);
        });

        Button aceptarIniciarSesion = findViewById(R.id.btn_aceptarIniciarSesion);
        aceptarIniciarSesion.setOnClickListener(v -> {
            Intent intent = new Intent(IniciarSesionActivity.this, PrincipalActivity.class);
            startActivity(intent);
        });
    }
}
