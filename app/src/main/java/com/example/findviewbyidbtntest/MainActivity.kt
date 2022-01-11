package com.example.findviewbyidbtntest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button//added
import android.widget.TextView//added

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)//added
        val textView: TextView = findViewById(R.id.textView)//added
        button.setOnClickListener {
            textView.setText("bye, world")
        }

    }
}