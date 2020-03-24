package android.latihan.uts_mobile_1

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.tampil_web.*

class PhoneWebView : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tampil_web)

        //inisialisasi pemanggilan webView
        val myWebView = findViewById<WebView>(R.id.sec_web)
        myWebView.settings.javaScriptEnabled = true
        myWebView.webViewClient = WebViewClient()

//        fungsi yang digunakan untuk menangkap aktifitas pada WebView, atau overRide url click
        myWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        val url_web: String
        url_web = getIntent().getStringExtra("url")
        myWebView.loadUrl(url_web)

    }
}