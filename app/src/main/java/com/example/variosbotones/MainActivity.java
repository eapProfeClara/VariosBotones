package com.example.variosbotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAceptar = findViewById(R.id.btAceptar);
        // Haciéndolo así, no es necesario poner onClick en el recurso botón
        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeText(getBaseContext(), "Has pulsado aceptar", LENGTH_SHORT).show();
            }
        });

        // Del boton cancelar no hace falta recoger su referencia de la forma en que lo hemos hecho
        // en el botón se ha puesto la propiedad onClick al método clickCancelar

        Button btUno = findViewById(R.id.bt1);
        Button btDos = findViewById(R.id.bt2);
        Button btTres= findViewById(R.id.bt3);

        // Los ponemos a escuchar eventos para cuando sean pulsados
        // Necesito poner lo de abajo para añadir los onclicklistener por programa:
        // public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        btUno.setOnClickListener(this);
        btDos.setOnClickListener(this);
        btTres.setOnClickListener(this);
    }

    // atendemos onClick en el recurso botón Cancelar
    public void clickCancelar(View v) {
        makeText(getBaseContext(), "Has pulsado cancelar", LENGTH_SHORT).show();
    }

    // Los botones a los que se añadió el listener de onClick, vienen por aquí:
    @Override
    public void onClick(View v) {
        String s = new String();
        // tenemos que resolver cuál es el botón pulsado
        switch (v.getId()){
            case R.id.bt1: s="Botón 1"; break;
            case R.id.bt2: s="Botón 2"; break;
            case R.id.bt3: s="Botón 3"; break;
        }
        makeText(getBaseContext(), s, LENGTH_SHORT).show();
        /*
        Toast notification = Toast.makeText(this, s, Toast.LENGTH_LONG);
        notification.show();
        */

    }
}
