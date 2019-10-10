package com.example.curriculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    //Pegando o ImageButtons
    private ImageButton github = findViewById(R.id.githubButton);
    private ImageButton linkedin = findViewById(R.id.linkedinButton);
    private ImageButton site = findViewById(R.id.siteButton);
    private ImageButton twitter = findViewById(R.id.twitterButton);

    //Iniciando o Webview
    WebView web = findViewById(R.id.webview);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        github.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                web.loadUrl("https://github.com/F4NT0");
            }
        });
    }





    // Criando os Links quando se clica



    @Override
    public void onClick(View v) {

    }
}
