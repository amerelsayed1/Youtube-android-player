package com.amer.youtube_player.features.player

import android.webkit.WebView
import com.amer.youtube_player.utils.CustomClient

object WebViewSetupHelper {

    fun setupWebView(webView: WebView, htmlData: String) {
        with(webView.settings) {
            javaScriptEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true
        }
        webView.webViewClient = CustomClient()
        webView.loadDataWithBaseURL(
            "https://www.youtube.com",
            htmlData,
            "text/html",
            "UTF-8",
            null
        )
    }
}
