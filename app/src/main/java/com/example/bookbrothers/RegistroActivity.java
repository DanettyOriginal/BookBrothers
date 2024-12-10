package com.example.bookbrothers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_registro);

        Button aceptarIniciarSesion = findViewById(R.id.btn_aceptarRegistro);
        aceptarIniciarSesion.setOnClickListener(v -> {
            Intent intent = new Intent(RegistroActivity.this, PrincipalActivity.class);
            startActivity(intent);
        });


        Button volverInicio = findViewById(R.id.btn_VolverRegistro);
        volverInicio.setOnClickListener(v -> {
            Intent intent = new Intent(RegistroActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}