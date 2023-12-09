package com.example.belajarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var edittext: EditText
    private lateinit var  button: Button
    private lateinit var  buttontextview: TextView

    private fun initComponents(){
        edittext = findViewById(R.id.edittext)
        button = findViewById(R.id.buttonedit)
        buttontextview = findViewById(R.id.buttontextview)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        initComponents()

        buttontextview.text = resources.getString(R.string.app_name)

        button.setOnClickListener{
            val name = edittext.text.toString()
            buttontextview.text = resources.getString(R.string.buttontextview, name)

            resources.getStringArray(R.array.names).forEach {
                Log.i("pzn",it)
            }

        }
    }
}