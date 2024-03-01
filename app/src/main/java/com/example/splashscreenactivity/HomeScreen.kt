package com.example.splashscreenactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen) // Ensure this matches your layout file name



        val textView = findViewById<TextView>(R.id.textView)

        findViewById<Button>(R.id.button).setOnClickListener {
            textView.text = getString(R.string.hello_world)
        }

        findViewById<Button>(R.id.button1).setOnClickListener {
            textView.text = getString(R.string.hello_world_italian)
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            textView.text = getString(R.string.hello_world_spanish)
        }

        findViewById<Button>(R.id.button4).setOnClickListener {
            textView.text = getString(R.string.hello_world_tamil)
        }

        findViewById<Button>(R.id.button5).setOnClickListener {
            textView.text = getString(R.string.hello_world_french)
        }

        // Ensure you have a unique ID for each button.
        // If you have another button for German, it should not have the same ID as the French button.
        findViewById<Button>(R.id.button6).setOnClickListener {
            textView.text = getString(R.string.hello_world_german)
        }
    }
}










