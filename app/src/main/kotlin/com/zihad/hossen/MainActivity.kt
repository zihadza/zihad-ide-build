package com.zihad.hossen
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity
class MainActivity : Activity() {
    override fun onCreate(s: Bundle?) { super.onCreate(s)
        val tv = TextView(this).apply {
            text = "Hello from Nzsjx"; textSize = 24f
            setTextColor(0xFFFFFFFF.toInt()); setBackgroundColor(0xFF0F172A.toInt())
            gravity = Gravity.CENTER
        }
        setContentView(tv)
    }
}