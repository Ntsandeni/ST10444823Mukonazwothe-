package com.example.tomogachiapollo

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second2)

        //declaration of the default image
        val imageHome = findViewById<ImageView>(R.id.imageHome)                                       //(IIE,2024)

        //declaration of other variables for the happy functions
        val txtHappy = findViewById<TextView>(R.id.txtHappy)                                          //(IIE,2024)
        val btnHappy = findViewById<Button>(R.id.btnHappy)
        val pbHappy = findViewById<ProgressBar>(R.id.pbHappy)

        //declaration of other variables for the full functions
        val txtFull = findViewById<TextView>(R.id.txtFull)
        val btnFull = findViewById<Button>(R.id.btnFull)
        val pbFull = findViewById<ProgressBar>(R.id.pbFull)

        //declaration of other variables for the clean functions                                      //(IIE,2024)
        val txtClean = findViewById<TextView>(R.id.txtClean)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val pbClean = findViewById<ProgressBar>(R.id.pbClean)


        btnHappy.setOnClickListener {

            pbHappy.progress += 10                                                                    //(Progress Bar in Android Studio - Mastering Android Course #34 - Master Coding,2024)
                                                                                                      //(openAi,2024)
                                                                                                      //(IIE,2024)
            // Check if the progress bar is full
            if (pbHappy.progress >= pbHappy.max) {
                // Change image when progress bar is full
                imageHome.setImageResource(R.drawable.happyapollo123)
            } else {
                // Change image when Happy button is clicked
                imageHome.setImageResource(R.drawable.playingapollo)
            }
        }

        // Set click listener for the Full button                                                    //(Progress Bar in Android Studio - Mastering Android Course #34 - Master Coding,2024)
                                                                                                     //(openAi,2024)
                                                                                                     //(IIE,2024)
        btnFull.setOnClickListener {
            // Increment progress by 10 for the Full progress bar
            pbFull.progress += 10

            // Check if the progress bar is full
            if (pbFull.progress >= pbFull.max) {
                // Change image when progress bar is full
                imageHome.setImageResource(R.drawable.happyapollo123)
            } else {
                // Change image when Full button is clicked
                imageHome.setImageResource(R.drawable.apolloeating)
            }
        }

        // Set click listener for the Clean button                                                      //(Progress Bar in Android Studio - Mastering Android Course #34 - Master Coding,2024)
                                                                                                        //(openAi,2024)
                                                                                                        //(IIE,2024)
        btnClean.setOnClickListener {
            // Increment progress by 10 for the Clean progress bar
            pbClean.progress += 10

            // Check if the progress bar is full
            if (pbClean.progress >= pbClean.max) {
                // Change image when progress bar is full
                imageHome.setImageResource(R.drawable.happyapollo123)
            } else {
                // Change image when Clean button is clicked
                imageHome.setImageResource(R.drawable.apollobath)
            }
        }


    }
}