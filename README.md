
# Youtube Android Player

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

Youtube Android Player is an Android library that provides a simple way to integrate YouTube video playback into your Android applications. This library leverages WebView to display YouTube videos and provides options to customize the playback experience.

## Features

- **Easy Integration**: Quickly add YouTube video playback to your app.
- **Customizable UI**: Control the visibility of player controls, set custom dimensions, and more.
- **Lightweight**: Minimal overhead for seamless integration.

## Getting Started

### Installation

To include the Youtube Android Player in your project, add the following to your `build.gradle` file:

**Using GitHub Packages:**

1. Add the GitHub Packages repository to your project:

   ```kotlin
   repositories {
       maven {
           url = uri("https://maven.pkg.github.com/amerelsayed1/Youtube-android-player")
           credentials {
               username = System.getenv("GITHUB_USER")
               password = System.getenv("GITHUB_TOKEN")
           }
       }
   }
   ```

2. Add the dependency:

   ```kotlin
   dependencies {
       implementation("com.amer.youtube_player:youtube_player:0.0.1-alpha")
   }
   ```

### Usage

#### 1. Initialize the Player

To start a video, use the `YoutubePlayerActivityBuilder`:

```kotlin
val intent = YoutubePlayerActivityBuilder(this)
    .setVideoId("your_video_id")
    .setShowControls(true)
    .setWidth(640)
    .setHeight(360)
    .build()

startActivity(intent)
```

- **`videoId`**: The ID of the YouTube video to play.
- **`showControls`**: Boolean to show or hide player controls.
- **`width`** and **`height`**: Custom dimensions for the player.

#### 2. Customization

You can customize the player further using the provided methods in the builder.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request with your improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For questions or suggestions, feel free to open an issue or contact the project maintainer:

- GitHub: [amerelsayed1](https://github.com/amerelsayed1)
