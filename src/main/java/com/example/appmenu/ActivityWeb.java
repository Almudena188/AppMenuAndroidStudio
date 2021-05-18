package com.example.appmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();
        String url = intent.getStringExtra(Principal.EXTRA_MESSAGE);
        WebView miVisorWeb = findViewById(R.id.wb1);
        WebSettings webSettings = miVisorWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        miVisorWeb.setWebViewClient(new WebViewClient());
        miVisorWeb.loadUrl(url);


    }
}