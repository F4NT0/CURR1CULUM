package com.example.curriculo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewGeneric extends Activity {

    private WebView page;

    /**
     * Iniciado a classe do Webview
     * @param savedInstanceState
     */
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview); //Página do Layout do Webview Encontrado no /layout/webview

        String url = getIntent().getStringExtra("URL"); // Para definir a URL na hora de chamar os Botões


        page = (WebView) findViewById(R.id.pageWeb); // A tag do PageView dentro da view Webview
        page.setWebViewClient(new WebViewClient()); //Para Fazer a Página abrir dentro do Próprio Aplicativo
        page.loadUrl(url);

        //Configurações das Páginas
        WebSettings config = page.getSettings();

        config.setJavaScriptEnabled(true); //Iniciar o Javascript das Páginas



    }

    /**
     * MÉTODO PARA FAZER O WEBVIEW VOLTAR PARA O APLICATIVO
     */
    @Override
    public void onBackPressed() {
        if(page.canGoBack()){ //Se a pagina pode voltar, ele vair poder voltar no app
            page.goBack();
        }else {
            super.onBackPressed(); //se não puder ele fecha o App
        }
    }

}