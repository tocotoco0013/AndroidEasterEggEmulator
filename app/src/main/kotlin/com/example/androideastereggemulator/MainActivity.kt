package com.example.androideastereggemulator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.androideastereggemulator.ui.theme.AndroidEasterEggEmulatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidEasterEggEmulatorTheme {
                // A surface container using the 'background' color from the theme
            }
        }
    }
}