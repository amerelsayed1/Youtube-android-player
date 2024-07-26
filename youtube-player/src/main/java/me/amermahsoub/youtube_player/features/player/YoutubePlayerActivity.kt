package me.amermahsoub.youtube_player.features.player

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.amermahsoub.youtube_player.databinding.ActivityYoutubePlayerBinding

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

        val htmlData =
            HtmlDataPreparer.prepareHtmlData(resources, videoId, showControls, width, height)
        WebViewSetupHelper.setupWebView(binding.webView, htmlData)
    }
}

