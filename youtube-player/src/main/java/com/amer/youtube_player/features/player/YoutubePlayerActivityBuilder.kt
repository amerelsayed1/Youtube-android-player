package com.amer.youtube_player.features.player


import android.content.Context
import android.content.Intent
import com.amer.youtube_player.utils.Constants

class YoutubePlayerActivityBuilder(private val context: Context) {

    private var videoId: String = ""
    private var showControls: Boolean = false
    private var width: Int = 0
    private var height: Int = 0

    fun setVideoId(videoId: String) = apply { this.videoId = videoId }

    fun setShowControls(showControls: Boolean) = apply { this.showControls = showControls }

    fun setWidth(width: Int) = apply { this.width = width }

    fun setHeight(height: Int) = apply { this.height = height }

    fun build(): Intent {
        return Intent(context, YoutubePlayerActivity::class.java).apply {
            putExtra(Constants.VIDEO_ID, videoId)
            putExtra(Constants.SHOW_CONTROLS, showControls.convertToInt())
            putExtra(Constants.WIDTH, width)
            putExtra(Constants.HEIGHT, height)
        }
    }

    private fun Boolean.convertToInt(): Int = if (this) 1 else 0
}
