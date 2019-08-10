package com.codelloyd.akfc.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {
  lateinit var diceImage1: ImageView
  lateinit var diceImage2: ImageView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    diceImage1 = findViewById(R.id.dice_image_1)
    diceImage2 = findViewById(R.id.dice_image_2)

    val rollButton: Button = findViewById(R.id.roll_button)
    rollButton.setOnClickListener { rollDice() }

    val resetButton: Button = findViewById(R.id.reset_button)
    resetButton.setOnClickListener { reset() }

    reset()
  }

  private fun rollDice() {
    diceImage1.setImageResource(getRandomDiceImage())
    diceImage2.setImageResource(getRandomDiceImage())
  }

  private fun reset() {
    diceImage1.setImageResource(R.drawable.empty_dice)
    diceImage2.setImageResource(R.drawable.empty_dice)
  }

  private fun getRandomDiceImage(): Int {
    return when (Random().nextInt(6) + 1) {
      1 -> R.drawable.dice_1
      2 -> R.drawable.dice_2
      3 -> R.drawable.dice_3
      4 -> R.drawable.dice_4
      5 -> R.drawable.dice_5
      else -> R.drawable.dice_6
    }
  }
}
