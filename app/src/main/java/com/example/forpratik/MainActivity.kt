package com.example.forpratik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val fm = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    frag(FirstFragment())

        first.setOnClickListener {
            frag(FirstFragment())
        }
        second.setOnClickListener {
            frag(SecondFragment())
        }
        third.setOnClickListener {
            frag(thirdFragment())
        }

    }
    fun frag( frag:Fragment){
        val ft = fm.beginTransaction()
        ft.replace(R.id.container,frag)
        ft.commit()
    }
}