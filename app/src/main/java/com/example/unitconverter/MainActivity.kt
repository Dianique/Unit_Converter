package com.example.unitconverter


import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonConvert =
            findViewById<Button>(R.id.btnConvert) //Created variable buttonConvert and assigns a 'search' for ViewID based on ResourceID.
        val buttonReset: Button =
            findViewById(R.id.btnReset) //Created variable buttonReset and assigns a 'search' for ViewID based on ResourceID.
        //var welcome: TextView = findViewById(R.id.txtView2)
        // val instruct: TextView = findViewById(R.id.txtView3)
        val userInputTempFar: EditText =
            findViewById(R.id.txtTempFar) //Created variable userInputTempFar and assigns a 'search' for ViewID based on ResourceID.
        val userInputTempCel: EditText =
            findViewById(R.id.txtTempCel) //Created variable userInputTempCel and assigns a 'search' for ViewID based on ResourceID.

        buttonConvert.setOnClickListener {  //Use setOnClickListener on variable buttonConvert - to illicit a result from the user's action/event.


            if (userInputTempFar.text.toString().isEmpty()) { //Use conditional statement to 

                var usersCel = (userInputTempCel.text.toString().toFloat() * 9 / 5) + 32
                // Log.i("UnitConverterApp", "User inputted Temp Cel")
                userInputTempFar.setText(usersCel.toString())

            } else {
                var usersFar = (userInputTempFar.text.toString().toFloat() - 32) * 5 / 9
                // Log.i("UnitConverterApp", "User inputted Temp Far")
                userInputTempCel.setText(usersFar.toString())
            }


        }
        buttonReset.setOnClickListener {
            userInputTempFar.text.clear()
            userInputTempCel.text.clear()

        }


    }

}














