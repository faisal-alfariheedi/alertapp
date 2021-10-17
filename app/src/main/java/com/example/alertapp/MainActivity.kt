package com.example.alertapp

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var b: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b=findViewById(R.id.button)
        b.setOnClickListener{
            alert()
        }


    }
    fun alert(){
        val dialogBuilder = AlertDialog.Builder(this)
        val input= EditText(this)
        val but=Button(this)
        val tv= TextView(this)
        but.setOnClickListener{
            if(input.text.isNotEmpty())
                tv.text=input.text
        }
        dialogBuilder.setCancelable(false)
        dialogBuilder.setPositiveButton("ADD", DialogInterface.OnClickListener {
                dialog, id ->  startActivities(arrayOf(Intent(this, ac2::class.java)))
        })
            .setNegativeButton("No", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })
        val alert = dialogBuilder.create()
        alert.setTitle("Enter subreddit name")
        alert.setView(input)
        alert.setView(but)
        alert.setView(tv)
        alert.show()

    }
}