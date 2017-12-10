package com.bignerbranch.android.normalandroidpermision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class MainActivity extends AppCompatActivity {

    WebView wv1;
    EditText etURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv1 = (WebView) findViewById(R.id.wv1);
        wv1.setWebViewClient(new myWebView());
        wv1.loadUrl("http://alruabye.net/");
        etURL = (EditText)findViewById(R.id.etURL);
    }
    String url;
    public void buGo(View view) {
        LoadURL(etURL.getText().toString());
    }

    public void buBack(View view) {
        wv1.goBack();

    }

    public void buForward(View view) {
        wv1.goForward();
    }

    void LoadURL(String url){
        this.url = url;
        wv1.loadUrl(url);
    }

    private class myWebView extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(url);
            return true;
        }

    }
}
