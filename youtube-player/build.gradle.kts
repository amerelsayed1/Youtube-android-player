import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("com.vanniktech.maven.publish")
    id("com.gradleup.nmcp")
}

android {
    namespace = "me.amermahsoub.youtube_player"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}


mavenPublishing {
    coordinates("me.amermahsoub", "youtube-player-release", "0.0.1-alpha")

    pom {
        name.set("YouTube Player Library")
        description.set("This library provides a customizable YouTube player for Android.")
        url.set("https://github.com/amerelsayed1/Youtube-android-player")
        licenses {
            license {
                name.set("MIT License")
                url.set("https://github.com/GeofriendTech/AndroidUtils/blob/main/LICENSE")
            }
        }
        developers {
            developer {
                id.set("AmerMahsoub")
                name.set("amer elsayed")
                email.set("amer.mahsoub1@gmail.com")
            }
        }
        scm {
            connection.set("scm:git@github.com:amerelsayed1/Youtube-android-player.git")
            developerConnection.set("scm:git@github.com:amerelsayed1/Youtube-android-player.git")
            url.set("https://github.com/amerelsayed1/Youtube-android-player")
        }
    }

    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
}