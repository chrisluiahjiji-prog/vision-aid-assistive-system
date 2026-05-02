package com.jk.kukuapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class StartSession : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_session)

        findViewById<Button>(R.id.btn_start_stream).setOnClickListener {
            startAIAssistance()
        }

        findViewById<Button>(R.id.btn_stop_stream).setOnClickListener {
            finish()
        }
    }

    private fun startAIAssistance() {
        CoroutineScope(Dispatchers.Main).launch {
            Toast.makeText(this@StartSession, 
                "Connecting to Vision Aid AI...\nFace Recognition + Gemini Active", 
                Toast.LENGTH_LONG).show()
            
            // Real implementation would:
            // 1. Capture frames
            // 2. Send to /face/detect
            // 3. Send to /agent/query
            // 4. Speak response using TextToSpeech
        }
    }
}
