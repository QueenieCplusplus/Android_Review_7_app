package com.katepatty.katesalert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn.setOnClickListener { alerter() }

    }

    fun alerter(){

        var txt = timer.text

        //產生Builder物件
        val builder = AlertDialog.Builder(this)
        //呼叫setMessage方法設定顯示文字
        builder.setTitle("Cool Alerter")
        builder.setMessage("Hi! Mr.Alarm will be called at $txt")
        builder.setIcon(R.drawable.ic_gray_alarm)
        //顯示對話框
        builder.show()
    }
}