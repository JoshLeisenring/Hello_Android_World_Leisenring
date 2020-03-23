package com.example.hello_android_world_leisenring

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Added code to make buttons on MainActivity link to other activities for full-sized images.
//Tested buttons in my personal Android phone (Google Pixel XL), as well as emulators; work fine.
        val button1 = findViewById<ImageButton>(R.id.spottedSalamanderButton)
            button1.setOnClickListener {
                val intent = Intent(this, Main2Activity::class.java)
                startActivity(intent)
            }
        val button2 = findViewById<ImageButton>(R.id.troutLiliesButton)
            button2.setOnClickListener {
                val intent = Intent(this, Main3Activity::class.java)
                startActivity(intent)
            }
        val button3 = findViewById<ImageButton>(R.id.barnaclesButton)
            button3.setOnClickListener {
                val intent = Intent(this, Main4Activity::class.java)
                startActivity(intent)
            }
        val button4 = findViewById<ImageButton>(R.id.ribbonSnakeButton)
            button4.setOnClickListener {
                val intent = Intent(this, Main5Activity::class.java)
                startActivity(intent)
            }
        val button5 = findViewById<ImageButton>(R.id.violetsButton)
            button5.setOnClickListener {
                val intent = Intent(this, Main6Activity::class.java)
                startActivity(intent)
            }
        val button6 = findViewById<ImageButton>(R.id.lizardButton)
            button6.setOnClickListener {
                val intent = Intent(this, Main7Activity::class.java)
                startActivity(intent)
            }
    }
}