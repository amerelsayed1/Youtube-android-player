package com.amer.android_youtube_player

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import me.amermahsoub.youtube_player.features.player.YoutubePlayerActivityBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = YoutubePlayerActivityBuilder(this)
            .setVideoId("x91MPoITQ3I")
            .setShowControls(true)
            .build()


        findViewById<Button>(R.id.btnOpenYoutube).setOnClickListener {
            startActivity(intent)
        }

    }


}