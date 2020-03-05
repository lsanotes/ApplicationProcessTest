package net.lsanotes.applicationone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.lsanotes.shared.SharedService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Intent(this, SharedService::class.java).also { intent ->
            startService(intent)
        }

        Intent(this, PrivateService::class.java).also {
            startService(it)
        }

    }
}