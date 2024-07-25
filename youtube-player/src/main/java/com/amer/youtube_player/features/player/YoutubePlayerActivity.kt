package com.amer.youtube_player.features.player

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.webkit.WebSettings
import androidx.appcompat.app.AppCompatActivity
import com.amer.youtube_player.R
import com.amer.youtube_player.databinding.ActivityYoutubePlayerBinding
import com.amer.youtube_player.utils.Constants
import com.amer.youtube_player.utils.CustomClient
import com.amer.youtube_player.utils.convertToInt
import java.io.BufferedReader
import java.io.InputStreamReader

class YoutubePlayerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityYoutubePlayerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubePlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val videoId = IntentManager.getVideoId(intent)
        val showControls = IntentManager.getShowControls(intent)
        val width = IntentManager.getWidth(intent)
        val height = IntentManager.getHeight(intent)

        val htmlData = HtmlDataPreparer.prepareHtmlData(resources, videoId, showControls, width, height)
        WebViewSetupHelper.setupWebView(binding.webView, htmlData)
    }
}

