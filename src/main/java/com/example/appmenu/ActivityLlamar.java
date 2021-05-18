package com.example.appmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityLlamar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamar);
    }

    public void irContactos (View view){
        Intent intentContactos = new Intent(Intent.ACTION_DIAL);
        startActivity(intentContactos);
    }

    public void llamar (View view){
        EditText phone = findViewById(R.id.numTelf);
        String num =  phone.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", num, null));
        startActivity(intent);
    }
}