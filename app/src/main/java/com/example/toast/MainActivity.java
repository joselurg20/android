package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText metNombre;

    private EditText metEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Este es el mensaje del Toast", Toast.LENGTH_SHORT).show();

        metNombre = (EditText) findViewById(R.id.txtName);
        metEdad = (EditText) findViewById(R.id.txtEdad);
    }
    public void Siguiente(View view){
        Intent i = new Intent(this, Pantalla2.class);
        startActivity(i);

    }

  public void Enviar (View view){
        Intent i = new Intent(this,MainActivity.class);

      i.putExtra("Nombre", metNombre.getText().toString());
      i.putExtra("Edad", metEdad.getText().toString());
        startActivity(i);
    }
/*
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "Ya estamos en el onStar", Toast.LENGTH_SHORT).show();
    }

    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "Ya estamos en el onResume", Toast.LENGTH_SHORT).show();

    }
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "Ya estamos en el onRestart", Toast.LENGTH_SHORT).show();

    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "Ya estamos en el onPause", Toast.LENGTH_SHORT).show();

    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Ya estamos en el onStop", Toast.LENGTH_SHORT).show();

    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Ya estamos en el onDestroy", Toast.LENGTH_SHORT).show();

    }*/



}