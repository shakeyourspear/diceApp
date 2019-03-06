package com.shakeyourspear.dicee

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView

import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button rollButton = (Button) findViewById(R.id.rollButton)
        val rollButton = findViewById<View>(R.id.rollButton) as Button

        val leftDice = findViewById<View>(R.id.image_leftDice) as ImageView
        val rightDice = findViewById<View>(R.id.image_rightDice) as ImageView

        val diceArry = intArrayOf(R.mipmap.dice1, R.mipmap.dice2, R.mipmap.dice3, R.mipmap.dice4, R.mipmap.dice5, R.mipmap.dice6)

        rollButton.setOnClickListener {
            Log.d("Dice", "This Button has been pressed!")

            val randomNumberGenerator = Random()

            var number = randomNumberGenerator.nextInt(6)

            Log.d("Dice", "The Random number is: $number")

            leftDice.setImageResource(diceArry[number])

            number = randomNumberGenerator.nextInt(6)

            rightDice.setImageResource(diceArry[number])
        }
    }
}
