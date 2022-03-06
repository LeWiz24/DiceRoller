package com.olivares.foundations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and initiating button to be found by roll_button button
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.count_up)
        countButton.setOnClickListener { countUp() }

    }

        // Adding click handler to display toast when the button is pressed
        private fun rollDice(){
            val randomInt = (1..6).random()
            val resultText: TextView = findViewById(R.id.result_text)
            resultText.text = randomInt.toString()
            Toast.makeText(this, "I love you, Squishy!!!", Toast.LENGTH_SHORT).show()


        }

        private fun countUp(){
            // Tells function the ID of textview to edit
            val resultText: TextView = findViewById(R.id.result_text)
            // Condition statement
            if (resultText.text == "Hello World!") {
                resultText.text = "1"
            }else{
                var resultInt = resultText.text.toString().toInt()
                if(resultInt<100) {
                    resultInt ++
                    resultText.text = resultInt.toString()



                }

            }
            Toast.makeText(this, "I love you, Squishy!!!", Toast.LENGTH_SHORT).show()

        }
    }
