import org.jetbrains.kotlin.load.java.setMethodName

plugins {
    alias(libs.plugins.android.library)
    id("maven-publish")
}
buildscript {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
}
android {

    namespace = "com.nmssalman.android_demo"
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
            consumerProguardFiles("proguard-rules.pro")
            consumerProguardFiles("consumer-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }





}
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)        // << --- ADD This
    }
}


java {
    sourceCompatibility = JavaVersion.VERSION_17            // << --- ADD This
    targetCompatibility = JavaVersion.VERSION_17
}
publishing {
    repositories {               // << --- ADD This
        mavenLocal()
    }
    publications {
        create<MavenPublication>("maven")
        {
            groupId = "com.github.nmssalman"
            artifactId = "jitpack_example"
            version = "5.0"
            pom {
                description = "DESCRIPTION"
            }
        }
    }

}


dependencies {
    implementation("androidx.viewpager:viewpager:1.0.0")
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}