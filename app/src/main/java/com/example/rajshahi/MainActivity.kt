package com.example.rajshahi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var card1 : CardView
    private lateinit var card2 : CardView
    private lateinit var card3 : CardView
    private lateinit var card4 : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        card1 = findViewById(R.id.card_view1)
        card2 = findViewById(R.id.card_view2)
        card3 = findViewById(R.id.card_view3)
        card4 = findViewById(R.id.card_view4)

        card1.setOnClickListener {
            val message: String = "1"
            val intent = Intent(this, DetailScreen::class.java)
            intent.putExtra("msg", message)
            startActivity(intent)
        }
        card2.setOnClickListener {
            val message: String = "2"
            val intent = Intent(this, DetailScreen::class.java)
            intent.putExtra("msg", message)
            startActivity(intent)
        }
        card3.setOnClickListener {
            val message: String = "3"
            val intent = Intent(this, DetailScreen::class.java)
            intent.putExtra("msg", message)
            startActivity(intent)
        }
        card4.setOnClickListener {
            val message: String = "4"
            val intent = Intent(this, DetailScreen::class.java)
            intent.putExtra("msg", message)
            startActivity(intent)
        }

    }
}
