package me.amermahsoub.youtube_player.features.player

import android.content.Context
import android.content.Intent
import me.amermahsoub.youtube_player.utils.Constants
import me.amermahsoub.youtube_player.utils.convertToInt

object IntentManager {

    fun createIntent(
        context: Context,
        videoId: String,
        showControls: Boolean = false,
        width: Int = 0,
        height: Int = 0
    ): Intent {
        return Intent(context, YoutubePlayerActivity::class.java).apply {
            putExtra(Constants.VIDEO_ID, videoId)
            putExtra(Constants.SHOW_CONTROLS, showControls.convertToInt())
            putExtra(Constants.WIDTH, width)
            putExtra(Constants.HEIGHT, height)
        }
    }

    fun getVideoId(intent: Intent): String = intent.getStringExtra(Constants.VIDEO_ID) ?: ""

    fun getShowControls(intent: Intent): Int = intent.getIntExtra(Constants.SHOW_CONTROLS, 0)

    fun getWidth(intent: Intent): Int = intent.getIntExtra(Constants.WIDTH, 0)

    fun getHeight(intent: Intent): Int = intent.getIntExtra(Constants.HEIGHT, 0)
}
