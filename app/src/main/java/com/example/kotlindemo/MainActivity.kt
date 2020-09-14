package com.example.kotlindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.TextViewCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var textBtn : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textBtn = click

        init()
    }

    fun init() {
        textBtn.setOnClickListener(View.OnClickListener {
//            Toast.makeText(this, "show toast", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, SelectActivity::class.java))
        })
    }

}