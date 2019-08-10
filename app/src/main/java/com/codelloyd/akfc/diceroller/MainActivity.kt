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

    val countUpButton: Button = findViewById(R.id.countup_button)
    countUpButton.setOnClickListener { countUp() }
  }

  private fun rollDice() {
    val randomInt = Random().nextInt(6) + 1

    val resultText: TextView = findViewById(R.id.result_text)
    resultText.text = randomInt.toString()
  }

  private fun countUp() {
    val resultText: TextView = findViewById(R.id.result_text)

    if (resultText.text == resources.getString(R.string.hello_world)) {
      resultText.text = "1"
    } else {
      var resultInt = resultText.text.toString().toInt()

      if (resultInt < 6) {
        resultInt++
        resultText.text = resultInt.toString()
      }
    }
  }
}
