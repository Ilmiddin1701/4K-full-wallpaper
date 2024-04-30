plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.example.a4kfullwallpaper"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.a4kfullwallpaper"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    viewBinding { enable = true }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //noinspection UseTomlInstead
    implementation("com.intuit.sdp:sdp-android:1.0.6")

    //noinspection UseTomlInstead
    implementation("com.intuit.ssp:ssp-android:1.0.6")


    //noinspection UseTomlInstead
    implementation("com.github.bumptech.glide:glide:4.16.0")
    //noinspection UseTomlInstead
    implementation("jp.wasabeef:glide-transformations:4.3.0")
}