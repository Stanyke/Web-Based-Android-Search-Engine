package com.example.stanyke.webbasedandroidsearchengine;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Bing extends AppCompatActivity {

    //Initialize Webview variable
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bing);

        //Load the webpage
        webview =(WebView)findViewById(R.id.webView);

        //Add a background color before if finishes loading as default kis white, but Bing.com uses black (#000000) as the background
        webview.setBackgroundColor(Color.parseColor("#000000"));

        webview.setVerticalScrollBarEnabled(true);
        webview.setHorizontalScrollBarEnabled(true);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webview.loadUrl("http://www.bing.com");
    }

    //Button To Load Bing WebPage
    public void goToGoogle(View view)
    {
        //Display a small notification at the bottom of the screen, this is called a toast-bar
        Toast.makeText(Bing.this, "Google Loading...", Toast.LENGTH_SHORT).show();

        //Goes Back to Google's Page (Previous Page if there's any..And if there's none, the app will close) before main exit.
        finish();
    }

    //Back Button to go back to Google's Page before main exit
    @Override
    public void onBackPressed()
    {
        //Display a small notification at the bottom of the screen, this is cqalled a toast-bar
        Toast.makeText(Bing.this, "Back To Google's Page...", Toast.LENGTH_SHORT).show();

        //Goes Back to Google's Page before main exit
        finish();
    }
}
