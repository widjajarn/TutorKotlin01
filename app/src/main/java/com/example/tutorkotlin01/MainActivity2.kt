package com.example.tutorkotlin01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    var angka = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        angka = intent.getIntExtra("angka", 0)
        t1.setText(angka.toString())

        var node : ClsBarang = ClsBarang("pensil",
            9000, 5)
    }
}