package com.example.sevillaracing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
         nombre = (EditText)findViewById(R.id.nombre);
    }
    public void Registrar(View view) {
        Intent i = new Intent(this, registrocompleto.class);
        i.putExtra("dato", nombre.getText().toString());
        startActivity(i);
    }
}
