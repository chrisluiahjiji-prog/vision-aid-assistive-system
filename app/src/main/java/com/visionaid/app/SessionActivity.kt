package com.jk.kukuapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import kotlinx.coroutines.*

class StartSession : AppCompatActivity() {

    private val backendUrl = "http://10.0.2.2:8000"   // Change for real device

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_session)

        findViewById<Button>(R.id.btn_start_stream).setOnClickListener {
            startRealTimeSession()
        }
    }

    private fun startRealTimeSession() {
        // TODO: Integrate MJPEG stream + send frames to backend
        Toast.makeText(this, "Starting real-time session with Gemini + Face Recognition...", Toast.LENGTH_LONG).show()
        
        // In real implementation: Use MjpegStreamHandler + Retrofit/FastAPI calls
    }
}
