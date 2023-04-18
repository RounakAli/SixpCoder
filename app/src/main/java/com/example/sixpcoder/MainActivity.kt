package com.example.sixpcoder

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val web=findViewById<WebView>(R.id.webView)
        webViewSetUp(web)

    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(web: WebView) {

        web.webViewClient = WebViewClient()

        web.apply {

            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("http://sixpcoder.000webhostapp.com/")


        }
    }
}