package com.example.chefsito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Favoritos extends AppCompatActivity {

    private Button btnPer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        btnPer = (Button) findViewById(R.id.Boton);

        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Favoritos.this,Perfil.class);
                Bundle bundle = new Bundle();
                startActivity(intent);
            }
        });
    }
}