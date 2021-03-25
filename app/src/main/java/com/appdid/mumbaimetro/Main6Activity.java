package com.appdid.mumbaimetro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Main6Activity extends AppCompatActivity {

    ProgressBar mprob;
    WebView mwebv;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        mprob=findViewById(R.id.progress_bar1);
        mwebv=findViewById(R.id.web_view1);


        mprob.setMax(100);
        mwebv.setWebViewClient(new Main6Activity.HelpClient());
        mwebv.setWebChromeClient(new WebChromeClient()
                               {

                                   @Override
                                   public void onProgressChanged(WebView view, int newProgress) {

                                       mprob.setProgress(newProgress);

                                       setTitle("Loading...");

                                       if (newProgress == 100) {
                                           setTitle("Recharge");

                                           mprob.setProgress(0);
                                       }
                                       super.onProgressChanged(view, newProgress);

                                   }
                               }
        );

        WebSettings mWebsetting = mwebv.getSettings();
        mWebsetting.setJavaScriptEnabled(true);
        mWebsetting.setBuiltInZoomControls(true);
        mwebv.loadUrl("https://ridlr.in/checkbalance");
    }
    private class HelpClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}
