package com.example.liceuapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this,CursoActivity.class);
        startActivity(intent);
        Intent intent1 = new Intent(MainActivity.this,ComunicadosActivity.class);
        startActivity(intent);
        Intent intent2 = new Intent(MainActivity.this,SobreActivity.class);
        startActivity(intent);

        ImageButton Cursos = (ImageButton) findViewById(R.id.Cursos);

        Cursos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ListaCursosActivity.class);
                startActivity(it);
            }
        });


    }
}
