package com.example.averyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //initializing your widget

    lateinit var textname: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // reference the textview to give it an action


        textname =findViewById(R.id.click)
        // set an onclick listener
        textname.setOnClickListener(View.OnClickListener {

            // concept of intent

            val intents = Intent(this, MainActivity2::class.java)
            startActivity(intents)

        })
    }
}