package com.example.appmenu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;

public class ActivityMaps extends AppCompatActivity {

    // implements OnMapReadyCallback
    private MapView mapView;
    private GoogleMap gmap;
    private static final String MAP_VIEW_BUNDLE_KEY = "MapViewBundleKey";
    private Bundle mapBiewBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

    }

    public void irBtn (View view){
        EditText x = findViewById(R.id.coordenadaX);
        EditText y = findViewById(R.id.coordenadaY);
        EditText z = findViewById(R.id.coordenadaZ);
        String latitud = x.getText().toString();
        String longitud = y.getText().toString();
        String altitud = z.getText().toString();
        String url = "https://www.google.com/maps/@"+latitud+","+longitud+","+altitud;
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}

