package com.example.appmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityEmail extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }


    public void enviar (View view){

        EditText correo = findViewById(R.id.editEmail);
        EditText asunto = findViewById(R.id.editAsunto);
        EditText mensaje = findViewById(R.id.editTextTextMultiLine);

        String enviarcorreo = correo.getText().toString();
        String enviarasunto = asunto.getText().toString();
        String enviarmensaje = mensaje.getText().toString();

        // Defino mi Intent y hago uso del objeto ACTION_SEND
        Intent intent = new Intent(Intent.ACTION_SEND);

        // Defino los Strings Email, Asunto y Mensaje con la función putExtra
        intent.putExtra(Intent.EXTRA_EMAIL,
                new String[] { enviarcorreo });
        intent.putExtra(Intent.EXTRA_SUBJECT, enviarasunto);
        intent.putExtra(Intent.EXTRA_TEXT, enviarmensaje);

        // Establezco el tipo de Intent
        intent.setType("message/rfc822");

        // Lanzo el selector de cliente de Correo
        startActivity( Intent.createChooser(intent,"Enviar:"));
    }
}
