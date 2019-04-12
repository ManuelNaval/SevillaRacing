package com.example.sevillaracing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    private EditText nombre, apellidos, email;
    private CheckBox cb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre = (EditText) findViewById(R.id.nombre);
        apellidos = (EditText) findViewById(R.id.apellidos);
        email = (EditText) findViewById(R.id.email);
        cb1 = (CheckBox) findViewById(R.id.politica);
    }

    public void Registrar(View view) {

        if (nombre.length() == 0 || apellidos.length() == 0 || email.length() == 0) {
            if (nombre.length() == 0)
                Toast.makeText(this, "Debe introducir un nombre", Toast.LENGTH_SHORT).show();
            if (apellidos.length() == 0)
                Toast.makeText(this, "Debe introducir sus apellidos", Toast.LENGTH_SHORT).show();
            if (email.length() == 0)
                Toast.makeText(this, "Debe introducir un email", Toast.LENGTH_SHORT).show();
        } else if (!cb1.isChecked()) {
            Toast.makeText(this, "Debe aceptar la política de privacidad", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(this, registrocompleto.class);
            i.putExtra("dato", nombre.getText().toString());
            startActivity(i);
        }
    }
}
