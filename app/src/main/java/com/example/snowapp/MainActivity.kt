package com.example.snowapp
 
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
 
class MainActivity : AppCompatActivity() {
 
    private val targetUrl =
        "https://wrk.service-now.com/now/platform-analytics-workspace/dashboards/params/edit/false/sys-id/9d7bc5ecfddc4305788b6c2f712eed53/__state__/b64~eyI5MjNhOTEzYjUzMmMwMTEwYWFiOWRkZWVmZjdiMTI0MyI6eyJsaXN0X2NvbnRyb2xsZXJfMyI6eyJfIjp7InF1ZXJ5Ijoic3lzX2NsYXNzX25hbWU9aW5jaWRlbnRecmVmX2luY2lkZW50LmluY2lkZW50X3N0YXRlIT02XmFzc2lnbm1lbnRfZ3JvdXA9OWEyZDZkNGE0NzM3ZmQ1ODMzZTE5NmU1NTM2ZDQzOTZeYWN0aXZlPXRydWVeTlFhc3NpZ25tZW50X2dyb3VwPTlhMmQ2ZDRhNDczN2ZkNTgzM2UxOTZlNTUzNmQ0Mzk2XnN0YXRlIT02XnN5c19jbGFzc19uYW1lPWNoYW5nZV90YXNrXmFjdGl2ZT10cnVlXk5RYXNzaWdubWVudF9ncm91cD05YTJkNmQ0YTQ3MzdmZDU4MzNlMTk2ZTU1MzZkNDM5Nl5zdGF0ZSE9Nl5zeXNfY2xhc3NfbmFtZT1jaGFuZ2VfcmVxdWVzdF5hY3RpdmU9dHJ1ZSJ9fX19"
 
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
 
        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = WebViewClient()  // keeps navigation inside app
        webView.loadUrl(targetUrl)
 
        setContentView(webView)
    }
 
    override fun onBackPressed() {
        val webView = findViewById<WebView>(android.R.id.content).rootView as WebView
        if (webView.canGoBack()) webView.goBack() else super.onBackPressed()
    }
}
