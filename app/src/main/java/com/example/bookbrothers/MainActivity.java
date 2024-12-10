package com.example.bookbrothers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.vista_primera);

        // Ajustar insets para la vista principal
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Pantalla_Principal), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // boton iniciar sesion
        Button iniciarSesion = findViewById(R.id.Bt_IniciarSesion);
        iniciarSesion.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, IniciarSesionActivity.class);
            startActivity(intent);
        });

        Button registrar = findViewById(R.id.Bt_Registro);
        registrar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RegistroActivity.class);
            startActivity(intent);
        });
    }
}