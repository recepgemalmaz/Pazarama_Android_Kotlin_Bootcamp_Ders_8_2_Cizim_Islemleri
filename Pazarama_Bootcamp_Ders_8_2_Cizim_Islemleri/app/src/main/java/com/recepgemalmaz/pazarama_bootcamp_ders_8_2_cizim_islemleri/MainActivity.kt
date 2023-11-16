package com.recepgemalmaz.pazarama_bootcamp_ders_8_2_cizim_islemleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(CustomView(this))
    }
}