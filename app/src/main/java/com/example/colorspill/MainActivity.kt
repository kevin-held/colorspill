package com.example.colorspill

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.colorspill.ui.theme.ColorSpillTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView (R.layout.activity_main)

        val playButton = findViewById<Button>(R.id.playButton)
        val leaderboardButton = findViewById<Button>(R.id.leaderboardButton)
        val settingsButton = findViewById<Button>(R.id.settingsButton)

        playButton.setOnClickListener {
            val intent = Intent(this, LevelsActivity::class.java)
            startActivity(intent)
        }

        leaderboardButton.setOnClickListener {
            // Handle Leaderboard button click
            // Navigate to the leaderboard activity or display a leaderboard
        }

        settingsButton.setOnClickListener {
            // Handle Settings button click
            // Navigate to the settings activity or display settings options
        }
    }
}