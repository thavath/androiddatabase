package com.example.ckcc.androiddatabase

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnLang = findViewById<Button>(R.id.btnChangLang)


        btnLang.setOnClickListener {

            var config = Configuration(resources.configuration)
            config.setLocale(Locale("km"))
            createConfigurationContext(config)
        }

    }
}
