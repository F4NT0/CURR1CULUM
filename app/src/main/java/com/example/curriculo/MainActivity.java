package com.example.curriculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    /*

     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /*
      ==================================
      MÉTODOS PARA ABRIR OS LINKS NA WEB
      ==================================
     */

    public void linkgithub(View v) {
        Intent github = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/F4NT0"));
        startActivity(github);
    }
    public void linkLinkedin(View v){
        Intent linkedin = new Intent(Intent.ACTION_VIEW, Uri.parse("https://br.linkedin.com/in/gabriel-fanto-stundner-b19723164"));
        startActivity(linkedin);
    }
    public void linkTwitter(View v){
        Intent twitter = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/GABRIELFANTO"));
        startActivity(twitter);
    }
    public void linkSite(View v){
        Intent site = new Intent(Intent.ACTION_VIEW, Uri.parse("https://f4nt0.github.io/PR0GR4M1NG/"));
        startActivity(site);
    }
}
