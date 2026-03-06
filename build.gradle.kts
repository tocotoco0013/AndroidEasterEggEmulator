plugins { 
    id("com.android.application") 
    kotlin("android") 
}

android { 
    compileSdk = 34

    defaultConfig { 
        applicationId = "com.example.androideastereggemulator" 
        minSdk = 28 
        targetSdk = 34 
        versionCode = 1 
        versionName = "1.0" 
    }

    buildFeatures { 
        compose = true 
    }

    composeOptions { 
        kotlinCompilerExtensionVersion = "1.3.2" 
    }
}

dependencies { 
    implementation("androidx.core:core-ktx:1.10.1") 
    implementation("com.google.android.material:material:1.9.0") 
    implementation("androidx.compose.ui:ui:1.5.0") 
    implementation("androidx.compose.material3:material3:1.2.0") 
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.0") 
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1") 
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3") 
    testImplementation("junit:junit:4.13.2") 
    androidTestImplementation("androidx.test.ext:junit:1.1.5") 
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1") 
}