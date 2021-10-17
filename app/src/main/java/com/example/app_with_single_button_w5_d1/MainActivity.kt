package com.example.app_with_single_button_w5_d1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tv: TextView = findViewById(R.id.tv)
        val button: Button = findViewById(R.id.button)
        val et: EditText = findViewById(R.id.et)

        
        button.setOnClickListener {
             tv.text = et.text.toString()
        }

    }
}

/*
Create a Button, an Edit Text, and a Text View

Whatever is entered in the Edit Text should be displayed in the Text View when the Button is pressed
* */