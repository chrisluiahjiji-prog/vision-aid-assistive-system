package com.jk.kukuapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_start_session).setOnClickListener {
            startActivity(Intent(this, StartSession::class.java))
        }

        findViewById<Button>(R.id.btn_manage_faces).setOnClickListener {
            startActivity(Intent(this, ManageFaces::class.java))
        }
    }
}
