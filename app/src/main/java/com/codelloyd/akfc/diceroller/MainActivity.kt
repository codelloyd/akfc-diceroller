package com.codelloyd.akfc.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val rollButton: Button = findViewById(R.id.roll_button)
    rollButton.setOnClickListener { rollDice() }

    val resetButton: Button = findViewById(R.id.reset_button)
    resetButton.setOnClickListener { reset() }

    reset()
  }

  private fun rollDice() {
    val randomInt = Random().nextInt(6) + 1

    val resultText: TextView = findViewById(R.id.result_text)
    resultText.text = randomInt.toString()
  }

  private fun reset() {
    val resultText: TextView = findViewById(R.id.result_text)
    val resetValue = 0
    resultText.text = resetValue.toString()
  }
}
