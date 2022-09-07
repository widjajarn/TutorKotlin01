package com.example.tutorkotlin01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener(View.OnClickListener {
            t1.setText("")
            t2.setText("")
            Toast.makeText(this, "Clearing all", Toast.LENGTH_SHORT).show()
            println("hello")
        })
    }

    fun hitung(v: View) {
//        var n1 = Integer.parseInt(t1.text.toString())
        var n1 = t1.text.toString().toInt()
        var n2 = n1 * 10
        t2.setText(Integer.toString(n2))

        val intent = Intent(baseContext, MainActivity2::class.java)
        intent.putExtra("angka", 10)
        startActivity(intent)
    }
}