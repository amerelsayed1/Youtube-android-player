
# Youtube Android Player

[![Maven Central](https://img.shields.io/maven-central/v/me.amermahsoub/youtube-player-release)](https://central.sonatype.com/artifact/me.amermahsoub/youtube-player-release/overview)

Youtube Android Player is a simple library to integrate YouTube video playback in your Android application. This library provides a seamless way to play YouTube videos using a native Android experience.

[Watch the demo video](./shoots/Screenrecorder-2024-07-27-11-58-51-26.mp4)

## Features

- Play YouTube videos in your app with minimal effort.
- Customizable video playback controls.
- Lightweight and easy to integrate.

## Installation

Add the following dependency to your `build.gradle` file:

```gradle
dependencies {
    implementation 'me.amermahsoub:youtube-player:0.0.1-alpha'
}
```

Make sure to include the Maven Central repository in your project-level `build.gradle` file:

```gradle
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
```

## Usage

1. **Android Manifest:**

   To use the Youtube Android Player in your project, you need to declare the `YoutubePlayerActivity` in your AndroidManifest.xml file:

   ```xml
   <activity
       android:name="me.amermahsoub.youtube_player.features.player.YoutubePlayerActivity"
       android:exported="true"
       android:screenOrientation="portrait"
       android:theme="@style/Theme.AppCompat.Light.NoActionBar"/>
   ```
2. **Initialize the Player:**

   In your activity or fragment, initialize the player with a YouTube video URL.

   ```kotlin
    val intent = YoutubePlayerActivityBuilder(this)
            .setVideoId("FqtpJbMEN5Q")
            .setShowControls(true)
            .build()
   startActivity(intent)
   ```
## ProGuard Rules

If you are using ProGuard, add the following rules to your `proguard-rules.pro` file:

```
-keep class com.google.android.youtube.player.** { *; }
-dontwarn com.google.android.youtube.player.**
```

## License

This project is licensed under the MIT License. See the [LICENSE](https://github.com/amerelsayed1/Youtube-android-player/blob/publish_to_maven/LICENSE) file for details.

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue.

## Contact

For any questions or suggestions, feel free to reach out at [amer.mahsoub1@gmail.com](mailto:amer.mahsoub1@gmail.com).

Make sure to customize the activity's theme and other attributes as needed for your application.
