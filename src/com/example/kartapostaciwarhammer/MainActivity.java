package com.example.kartapostaciwarhammer;


import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;


import android.webkit.*;


public class MainActivity extends Activity {

	int i=0;
	@SuppressLint("SetJavaScriptEnabled") @Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
 
WebView myWebView = (WebView) findViewById(R.id.webView1);
myWebView.getSettings().setJavaScriptEnabled(true);
myWebView.setWebViewClient(new WebViewClient());
myWebView.setWebChromeClient(new WebChromeClient());
myWebView.getSettings().setBuiltInZoomControls(true);
myWebView.getSettings().setLoadWithOverviewMode(true);
myWebView.getSettings().setDatabaseEnabled(true);
myWebView.getSettings().setDomStorageEnabled(true);
myWebView.getSettings().setAppCacheMaxSize( 10 * 1024 * 1024 );
myWebView.getSettings().setAppCachePath( getApplicationContext().getCacheDir().getAbsolutePath() );
myWebView.getSettings().setAllowFileAccess( true );
myWebView.getSettings().setAppCacheEnabled( true );
//myWebView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
String databasePath = this.getApplicationContext().getDir("database", Context.MODE_PRIVATE).getPath(); 
myWebView.getSettings().setDatabasePath(databasePath);
//myWebView.getSettings().setCacheMode( WebSettings.LOAD_DEFAULT );
myWebView.getSettings().setCacheMode( WebSettings.LOAD_CACHE_ELSE_NETWORK );
myWebView.loadUrl("https://39e7b3652cb182fa00a34ecd3f4728cdcb16a8b5.googledrive.com/host/0B0X4q9BJ1KhFVjVZX2diM2l3Z28/karta.html");
 
 
}
 
 
}