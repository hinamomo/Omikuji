package com.example.omikuji

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getFortune(view: View){

        // おみくじ結果の配列
        val results = listOf("大吉","中吉","小吉","吉","末吉","凶","大凶")
        // おみくじ結果算出
        val random = Random().nextInt(results.count())

        // おみくじ結果表示
        resultText.text = results[random]

        if(random == 0){
            resultText.setTextColor(Color.RED)
        } else {
            resultText.setTextColor(Color.BLACK)
        }

    }


}
