package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class Pantalla2 extends AppCompatActivity {

    private TextView mtv_Mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

      /*  mtv_Mensaje = (TextView) findViewById(R.id.ctv_Mensaje);*/

        mtv_Mensaje.setText("Tu nombre es: "
                + getIntent().getStringExtra("Nombre")
                + "y tu edad es "+ getIntent().getStringExtra("Edad"));

    }

    public void Anterior(View view){
        Intent i = new Intent(this, Pantalla2.class);
        startActivity(i);

    }
}