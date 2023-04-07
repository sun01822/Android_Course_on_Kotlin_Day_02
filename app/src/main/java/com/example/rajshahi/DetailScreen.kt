package com.example.rajshahi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class DetailScreen : AppCompatActivity() {
    lateinit var pic: ImageView
    lateinit var textV1 : TextView
    lateinit var textV2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_screen)
        textV1 = findViewById(R.id.textView)
        textV2 = findViewById(R.id.detailInfo)
        pic = findViewById(R.id.imageView)
        val identity = intent.getStringExtra("msg")
        if(identity == "1"){
            val myString = getString(R.string.heading1)
            val information = getString(R.string.details1)
            textV1.text = myString
            textV2.text = information
            pic.setImageResource(R.drawable.city)
        }
        else if(identity == "2"){
            val myString = getString(R.string.heading2)
            val information = getString(R.string.details2)
            textV1.text = myString
            textV2.text = information
            pic.setImageResource(R.drawable.college)
        }
        else if(identity == "3"){
            val myString = getString(R.string.heading3)
            val information = getString(R.string.details3)
            textV1.text = myString
            textV2.text = information
            pic.setImageResource(R.drawable.university)
        }
        else if(identity == "4"){
            val myString = getString(R.string.heading4)
            val information = getString(R.string.details4)
            textV1.text = myString
            textV2.text = information
            pic.setImageResource(R.drawable.museum)
        }
    }
}
