package com.example.curriculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    public static final String github =   "https://github.com/F4NT0";
    public static final String linkedin = "https://br.linkedin.com/in/gabriel-fanto-stundner-b19723164";
    public static final String twitter =  "https://twitter.com/GABRIELFANTO";
    public static final String site =     "https://f4nt0.github.io/PR0GR4M1NG/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Criando e iniciando os Links nas Paginas
    public void loadWebPage(View v){
        WebViewFragment webViewFragment = new WebViewFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.pageWeb,webViewFragment).commit();
    }
}
