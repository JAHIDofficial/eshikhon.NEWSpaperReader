package com.course.newspaperreader;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    WebView webView;
    String url;
    final Activity activity= this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getSupportActionBar().hide();
        setContentView( R.layout.activity_web_view );

        Bundle data =getIntent().getExtras();
        if (data.containsKey( "BN1" )){
            url = data.getString( "BN1" );
        }
        if (data.containsKey( "BN2" )){
            url = data.getString( "BN2" );
        }
        if (data.containsKey( "BN3" )){
            url = data.getString( "BN3" );
        }
        if (data.containsKey( "BN4" )){
            url = data.getString( "BN4" );
        }
        if (data.containsKey( "ON5" )){
            url = data.getString( "BN5" );
        }
        if (data.containsKey( "BN1" )){
            url = data.getString( "ON1" );
        }
        if (data.containsKey( "ON2" )){
            url = data.getString( "ON2" );
        }
        if (data.containsKey( "ON3" )){
            url = data.getString( "ON3" );
        }
        if (data.containsKey( "ON4" )){
            url = data.getString( "ON4" );
        }
        if (data.containsKey( "ON5" )){
            url = data.getString( "ON5" );
        }
        if (data.containsKey( "LN1" )){
            url = data.getString( "LN1" );
        }
        if (data.containsKey( "LN2" )){
            url = data.getString( "LN2" );
        }
        if (data.containsKey( "LN3" )){
            url = data.getString( "LN3" );
        }
        if (data.containsKey( "LN4" )){
            url = data.getString( "LN4" );
        }
        if (data.containsKey( "LN5" )){
            url = data.getString( "LN5" );
        }
        if (data.containsKey( "IN1" )){
            url = data.getString( "IN1" );
        }
        if (data.containsKey( "IN2" )){
            url = data.getString( "IN2" );
        }
        if (data.containsKey( "IN3" )){
            url = data.getString( "IN3" );
        }
        if (data.containsKey( "SN1" )){
            url = data.getString( "SN1" );
        }


        webView= findViewById( R.id.webview );
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(true);
//        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
//        webView.getSettings().setPluginsEnabled(true);
//        webView.setWebViewClient(new HelloWebViewClient());

        webView.setWebChromeClient( new WebChromeClient(){
            public void onProgressChanged(WebView view, int progress){
                activity.setTitle( "Loading..." );
                activity.setProgress( progress=100 );

                if (progress==100)
                    activity.setTitle( R.string.app_name );
            }
        } );

        webView.setWebViewClient( new WebViewClient(){
            public void onRecieverError(WebView view, int errorCode, String description, String failingUrl){
               //Handle the error
            }

            public boolean shouldOverrideUrlLoading(WebView view, String url){
               view.loadUrl( url );
               return true;
            }
        } );

        webView.loadUrl(url);
    }
}
