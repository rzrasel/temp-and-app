package com.shift.kidslearning.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.shift.kidslearning.R

class ActivitySplash : AppCompatActivity() {
    private lateinit var activity: Activity
    private lateinit var context: Context
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //
        activity = this
        context = this
        //
        handler = Handler(Looper.myLooper()!!)
        handler.postDelayed({
            val intent = Intent(context, ActivityDashboard::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

    private fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}