package com.example.curriculo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
 /**
 *  Classe de inicializacao do Webview
 */

public class WebViewFragment extends Fragment implements View.OnClickListener {

    //Iniciando um WebView
    private WebView page;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.webview,container,false); // Iniciado a view
        page = view.findViewById(R.id.pageWeb); //Pega o .xml criado para existir o Webview(layout/webview.xml)
        page.setWebViewClient(new WebViewClient()); // Iniciado o Cliente

        ImageButton github = view.findViewById(R.id.githubButton);
        ImageButton linkedin = view.findViewById(R.id.linkedinButton);
        ImageButton site = view.findViewById(R.id.siteButton);
        ImageButton twitter = view.findViewById(R.id.twitterButton);

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page.loadUrl(MainActivity.github);
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page.loadUrl(MainActivity.linkedin);
            }
        });

        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page.loadUrl(MainActivity.site);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page.loadUrl(MainActivity.twitter);
            }
        });



        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
