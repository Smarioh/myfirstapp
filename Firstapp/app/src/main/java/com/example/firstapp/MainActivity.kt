package com.example.firstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.nio.file.WatchEvent.Modifier
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayText = findViewById<TextView>(R.id.displayText)
        val myName = "Mario"
        displayText.text = "Hi, my name is $myName"
        displayText.setBackgroundColor(Color.CYAN)
    }
}

