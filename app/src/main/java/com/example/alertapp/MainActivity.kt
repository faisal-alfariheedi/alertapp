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
        lateinit var input: EditText
        dialogBuilder.setCancelable(false)
        dialogBuilder.setPositiveButton("GO", DialogInterface.OnClickListener {
                dialog, id ->  act(input.text.toString())
        })

        val alert = dialogBuilder.create()
        alert.setTitle("enter something")
        val vv=this.layoutInflater.inflate(R.layout.alert,null)
        alert.setView(vv)
        input= vv.findViewById(R.id.inin)
        val but=vv.findViewById<Button>(R.id.but2)
        val tv= vv.findViewById<TextView>(R.id.tv1)
        but.setOnClickListener{
            if(input.text.isNotEmpty())
                tv.text=input.text
        }
        alert.show()

    }
    fun act(text: String) {
        val intent=Intent(this, ac2::class.java)
        intent.putExtra("nn",text)
        startActivity(intent);
    }
}