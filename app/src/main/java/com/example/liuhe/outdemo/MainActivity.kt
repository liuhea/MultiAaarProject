package com.example.liuhe.outdemo

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.liba.showLibAFromA

class MainActivity : AppCompatActivity() {

    private lateinit var mBtnToast: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBtnToast = this.findViewById(R.id.btn_main)

        mBtnToast.setOnClickListener {
            toast(this@MainActivity, showLibAFromA())
        }
    }
}

fun toast(context: Context, msg: String) {
    Toast.makeText(context.applicationContext, msg, Toast.LENGTH_SHORT).show()
}