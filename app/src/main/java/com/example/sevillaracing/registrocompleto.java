package com.example.sevillaracing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class registrocompleto extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrocompleto);

        tv1 = (TextView)findViewById(R.id.completo);

        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Se ha registrado correctamente , " + dato);
    }
    public void Volver(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
