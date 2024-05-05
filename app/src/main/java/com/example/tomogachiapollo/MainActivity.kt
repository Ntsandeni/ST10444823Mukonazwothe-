package com.example.tomogachiapollo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //Declaring Variables used in the first page
        val txtH1 = findViewById<TextView>(R.id.txtH1)                                               //(IIE,2024)
        val ImageView4 = findViewById<ImageView>(R.id.imageView4)
        val txtApollo = findViewById<TextView>(R.id.txtApollo)
        val btnPlay = findViewById<Button>(R.id.btnPlay)

        //set click listener for play/start button
        btnPlay.setOnClickListener {                                                         //(IIE,2024)
            val intent = Intent(this, SecondActivity::class.java)                      //(see How to Open a New Activity With a Button in Android Studio [Kotlin 2020] -CodeWithMazn)
            startActivity(intent)
        }


    }
}