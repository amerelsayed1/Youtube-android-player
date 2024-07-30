package me.amermahsoub.youtube_player.features.player

import android.content.res.Resources
import me.amermahsoub.youtube_player.R


object HtmlDataPreparer {

    fun prepareHtmlData(
        resources: Resources,
        videoId: String,
        showControls: Int,
        width: Int,
        height: Int
    ): String {
        val rawHtml = readRawTextFile(resources, R.raw.youtube_frame)
        return rawHtml
            .replace("VIDEO_ID_PLACEHOLDER", videoId)
            .replace("PLAYER_HEIGHT", if (height == 0) "100%" else height.toString())
            .replace("PLAYER_WIDTH", if (width == 0) "100%" else width.toString())
            .replace("SHOW_CONTROLS", showControls.toString())
    }

    private fun readRawTextFile(resources: Resources, resId: Int): String {
        return resources.openRawResource(resId).bufferedReader().use { it.readText() }
    }
}
