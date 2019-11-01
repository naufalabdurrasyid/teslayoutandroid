package com.example.minigrosir2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        btnmasuk.setOnClickListener {
            val intent = Intent(this, HubungiAgen::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
