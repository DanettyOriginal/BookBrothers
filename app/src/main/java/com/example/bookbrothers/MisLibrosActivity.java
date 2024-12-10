package com.example.bookbrothers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MisLibrosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_mis_libros); // Vincula el diseño
    }

    // Método para el botón "crear grupo"
    public void goToPaginaAnterior(View view) {
        // Aquí deberías añadir el código para crear un grupo
        // Por ejemplo, recoger los datos de los EditText y luego hacer algo con ellos
        // Después de eso, redirigir a otra actividad si lo deseas
        Intent intent = new Intent(MisLibrosActivity.this, MisLibrosActivity.class);
        startActivity(intent);
    }

    // Método para el botón "crear grupo"
    public void goToPaginaSiguiente(View view) {
        // Aquí deberías añadir el código para crear un grupo
        // Por ejemplo, recoger los datos de los EditText y luego hacer algo con ellos
        // Después de eso, redirigir a otra actividad si lo deseas
        Intent intent = new Intent(MisLibrosActivity.this, MisLibrosActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "home"
    public void goToPaginaPrincipalMisLibros(android.view.View view) {
        Intent intent = new Intent(MisLibrosActivity.this, PrincipalActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "perfil"
    public void goToPaginaPerfilMisLibros(android.view.View view) {
        Intent intent = new Intent(MisLibrosActivity.this, PerfilActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "notificaciones"
    public void goToPaginaNotificacionesMisLibros(android.view.View view) {
        Intent intent = new Intent(MisLibrosActivity.this, ComodinActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "amigos"
    public void goToPaginaAmigosMisLibros(android.view.View view) {
        Intent intent = new Intent(MisLibrosActivity.this, ComodinActivity.class);
        startActivity(intent);
    }

    // Método para la imagen "amigos"
    public void goToLibroDetallesMisLibros(android.view.View view) {
        Intent intent = new Intent(MisLibrosActivity.this, PerfilLibroActivity.class);
        startActivity(intent);
    }

}
