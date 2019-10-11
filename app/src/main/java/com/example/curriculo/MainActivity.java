package com.example.curriculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    //Links Estáticos
    public static final String lgithub =   "https://github.com/F4NT0";
    public static final String llinkedin = "https://br.linkedin.com/in/gabriel-fanto-stundner-b19723164";
    public static final String ltwitter =  "https://twitter.com/GABRIELFANTO";
    public static final String lsite =     "https://f4nt0.github.io/PR0GR4M1NG/";

    //Contexto
    final Context context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Inicia o Layout do .xml chamado activity_main(/layout/activity_main)

        ImageButton github = findViewById(R.id.githubButton);
        github.setOnClickListener(this);

        ImageButton linkedin = findViewById(R.id.linkedinButton);
        linkedin.setOnClickListener(this);

        ImageButton twitter = findViewById(R.id.twitterButton);
        twitter.setOnClickListener(this);

        ImageButton site = findViewById(R.id.siteButton);
        site.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.githubButton:
                    Intent intent = new Intent(context,WebviewGeneric.class);
                    intent.putExtra("URL",lgithub);
                    startActivity(intent);
                    break;
                case R.id.linkedinButton:
                    Intent intent2 = new Intent(context,WebviewGeneric.class);
                    intent2.putExtra("URL",llinkedin);
                    startActivity(intent2);
                    break;
                case R.id.siteButton:
                    Intent intent3 = new Intent(context,WebviewGeneric.class);
                    intent3.putExtra("URL",lsite);
                    startActivity(intent3);
                    break;
                case R.id.twitterButton:
                    Intent intent4 = new Intent(context,WebviewGeneric.class);
                    intent4.putExtra("URL",ltwitter);
                    startActivity(intent4);
                    break;
            }
    }
}
