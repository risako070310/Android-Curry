package com.risako070310.curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val people = arrayOf("ぽちゃっこ", "たきしーどさむ", "けろけろけろっぴ", "はんぎょどん")
    val food = arrayOf("カレー", "味噌汁", "チャーハン", "エビチリ", "ラーメン", "おにぎり")
    val choice = arrayOf("よそえました^^", "よそえませんでしたTT")
    val textsize = arrayOf(30f, 18f)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            serveFood()
        }
    }
    private fun serveFood(){
        val verbIndex = Random.nextInt(2)
        nameTextView.text = people[Random.nextInt(4)] + "に"
        foodTextView.text = food[Random.nextInt(4)] + "を"
        verbTextView.text = choice[verbIndex]
        verbTextView.textSize = textsize[verbIndex]
    }
}