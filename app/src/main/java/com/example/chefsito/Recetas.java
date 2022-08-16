package com.example.chefsito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recetas extends AppCompatActivity {
    private Button btnInicio,btnFav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);

        btnInicio = (Button) findViewById(R.id.Boton);
        btnFav = (Button) findViewById(R.id.registrar);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Recetas.this,Perfil.class);
                Bundle bundle = new Bundle();
                startActivity(intent);
            }
        });
        btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Recetas.this,Perfil.class);
                Bundle bundle = new Bundle();
                startActivity(intent);
            }
        });
    }
}