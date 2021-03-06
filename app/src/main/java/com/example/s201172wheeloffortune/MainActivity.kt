package com.example.s201172wheeloffortune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// get reference to button
        val btnClickMe = findViewById(R.id.button) as Button
        val myWrittenText = findViewById(R.id.WrittenText) as TextView
        val myTextView = findViewById(R.id.textView) as TextView

        // var timesClicked = 0
// set on-click listener
        // execute what is in the brackets
        // toast quick msg on screen of user
        /*  btnClickMe.setOnClickListener {
             // timesClicked = timesClicked+1
              timesClicked += 1
              myWrittenText.text = timesClicked.toString()
              Toast.makeText(this@MainActivity, "Spinning the wheel.", Toast.LENGTH_SHORT).show()
          }*/
        btnClickMe.setOnClickListener { spinWheel() }

    }

    private fun spinWheel() {
        val wheel = Wheel(8)
        val wheelSpin = wheel.roll()
        val resultTextView: TextView = findViewById(R.id.WrittenText)
        resultTextView.text = wheelSpin.toString()

          when(wheelSpin){
            1-> println("works")
            2-> println("works")
            3-> println("works")
            4-> println("no  points")
            5-> println("points")
            6-> println("have fun")
            7-> println("loose")
            8-> println("uwin")
                  val resultTextView: TextView = findViewById(R.id.WrittenText)
              resultTextView.text = wheelSpin.toString()

    }

    }




    class Wheel(val wheelSpin: Int) {
        fun roll(): Int {
            return (1..wheelSpin).random()
        }
    }

/*
fun gameTheory(){

    }
}
*/


    fun livesLeft() {
        var life = 4
        if (life >= 1) {
            println("spin the wheel of furtune you lucky human")
        }

    }

    fun userInput() {
        val stringInput = readLine()!!
        println("Guess a Letter or word: $stringInput")

    }

}

