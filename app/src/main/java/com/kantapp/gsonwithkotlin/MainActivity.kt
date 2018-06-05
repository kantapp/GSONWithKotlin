package com.kantapp.gsonwithkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val javabtn=findViewById<Button>(R.id.java)
        val kotlinbtn=findViewById<Button>(R.id.kotlin)

        javabtn.setOnClickListener {
            startActivity(Intent(this, com.kantapp.gsonwithkotlin.Java.GSON::class.java))
        }

        kotlinbtn.setOnClickListener {
            startActivity(Intent(this, com.kantapp.gsonwithkotlin.Kotlin.GSON::class.java))
        }
    }
}
