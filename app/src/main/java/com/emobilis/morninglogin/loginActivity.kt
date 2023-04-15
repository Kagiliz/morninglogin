package com.emobilis.morninglogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class loginActivity : AppCompatActivity() {
    lateinit var texttoregister: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        texttoregister=findViewById(R.id.Txt_gotoregister)
        texttoregister.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)git 
            startActivity(intent)
        }
    }
}