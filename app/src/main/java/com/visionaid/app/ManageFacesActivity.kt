package com.jk.kukuapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class ManageFaces : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_faces)

        // TODO: Implement RecyclerView for registered faces + Add new person button
        findViewById<Button>(R.id.btn_add_person).setOnClickListener {
            Toast.makeText(this, "Add new person flow started", Toast.LENGTH_SHORT).show()
            // Launch camera for registration
        }
    }
}
