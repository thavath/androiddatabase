package com.example.ckcc.androiddatabase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.ckcc.androiddatabase.model.User

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var firstname = findViewById<TextView>(R.id.tvFirsName)
        var lastname = findViewById<TextView>(R.id.tvLastName)
        var email = findViewById<TextView>(R.id.tvEmail)

        var data = intent.getSerializableExtra("user") as User

        if(data != null){
            firstname.text = data.firstName
            lastname.text = data.lastName
            email.text = data.Email
        }
    }
}
