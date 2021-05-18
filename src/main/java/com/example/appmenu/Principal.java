package com.example.appmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.net.URI;

public class Principal extends AppCompatActivity {

    // creo la contante del resultado
    public  static final String EXTRA_MESSAGE = "com.example.principal.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_foto:
                // llamo a la camara
                Intent intentFoto = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                // lanzo la camara con retorno le pongo 1 para que solo haga una foto
                startActivityForResult(intentFoto, 1);
                return true;
            case  R.id.menu_email:
                Intent intentEmail = new Intent(this, ActivityEmail.class);
                startActivity(intentEmail);

                return true;
            case  R.id.menu_maps:
                Intent map = new Intent(this, ActivityMaps.class);
                startActivity(map);
                return true;
            case  R.id.menu_telefono:
                // meto el resultado como un mensaje que se envia a la ActivityResultado para que muestre el resultado
                Intent intentLlamar = new Intent(this, ActivityLlamar.class);
                startActivity(intentLlamar);
                return true;
            case R.id.menuAcercaDe:
                // meto el resultado como un mensaje que se envia a la ActivityResultado para que muestre el resultado
                Intent i = new Intent(this, ActivityAcercaDe.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void clicVer (View view){
        // meto el resultado como un mensaje que se envia a la ActivityResultado para que muestre el resultado
        Intent intent = new Intent(this, ActivityWeb.class);

        EditText editText = findViewById(R.id.editUrl);
        String url= editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, url);
        startActivity(intent);
    }
/**
    private boolean safeCameraOpen(int id) {
        boolean qOpened = false;

        try {
            releaseCameraAndPreview();
            camera = Camera.open(id);
            qOpened = (camera != null);
        } catch (Exception e) {
            Log.e(getString(R.string.app_name), "failed to open Camera");
            e.printStackTrace();
        }

        return qOpened;
    }

    private void releaseCameraAndPreview() {
        preview.setCamera(null);
        if (camera != null) {
            camera.release();
            camera = null;
        }
    }
**/
}