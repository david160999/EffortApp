plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    //DaggerHilt
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")

    //NAV NAVIGATION
    id("androidx.navigation.safeargs.kotlin")
    
}

android {
    namespace = "com.cursointermedio.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.cursointermedio.myapplication"
        minSdk = 24
        targetSdk = 33
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    val navVersion = "2.7.1"
    val cameraVersion = "1.2.3"
    val room_version = "2.6.1"

    //NavComponent
    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")

    //ViewPager2
    implementation("androidx.viewpager2:viewpager2:1.0.0")

    //Material Design
    implementation ("com.google.android.material:material:1.11.0")


    //DaggerHilt
    implementation("com.google.dagger:hilt-android:2.50")
    kapt("com.google.dagger:hilt-compiler:2.50")

    //Room
    implementation("androidx.room:room-runtime:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    // To use Kotlin annotation processing tool (kapt)
    kapt("androidx.room:room-compiler:$room_version")


    //UnitTesting
    testImplementation("junit:junit:4.13.2")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
    testImplementation("io.mockk:mockk:1.12.3")

    //UITesting
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.test.espresso:espresso-contrib:3.5.1")
    androidTestImplementation("androidx.test.espresso:espresso-intents:3.4.0")
    androidTestImplementation("com.google.dagger:hilt-android-testing:2.48")
    androidTestImplementation("androidx.fragment:fragment-testing:1.6.1")
    //kaptAndroidTest("com.google.dagger:hilt-android-compiler:2.50")

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("androidx.fragment:fragment-ktx:1.6.2")

}