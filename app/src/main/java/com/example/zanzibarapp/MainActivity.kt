package com.example.zanzibarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton1: Button = findViewById(R.id.button1)
        rollButton1.text = getString(R.string.Roll)
        val rollButton2: Button = findViewById(R.id.button2)
        rollButton1.text = getString(R.string.Roll)
        rollButton1.text = getString(R.string.Roll)


        rollButton1.setOnClickListener{
            rollDice1()
            rollDice2()
        }
        rollButton2.setOnClickListener{
            rollDice1()
            rollDice2()
        }
        diceImage1=findViewById(R.id.dice_image1)
        diceImage2=findViewById(R.id.dice_image2)

    }
    private fun  rollDice1(){
        val randomInt = java.util.Random().nextInt(6)+1
        val drawableResource = when(randomInt){
            1->R.drawable.ic__one
            2->R.drawable.ic__two
            3->R.drawable.ic__three
            4->R.drawable.ic__four
            5->R.drawable.ic__five
            else -> R.drawable.ic__six
        }

        diceImage1.setImageResource(drawableResource)

    }
    private fun  rollDice2(){
        val randomInt = java.util.Random().nextInt(6)+1
        val drawableResource = when(randomInt){
            1->R.drawable.ic__one
            2->R.drawable.ic__two
            3->R.drawable.ic__three
            4->R.drawable.ic__four
            5->R.drawable.ic__five
            else -> R.drawable.ic__six
        }
        diceImage2.setImageResource(drawableResource)
    }
}