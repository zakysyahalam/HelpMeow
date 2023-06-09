package com.example.helpmeow

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.helpmeow.Object
import com.example.helpmeow.R
import com.example.helpmeow.databinding.ActivityPostBinding

class PostActivity : AppCompatActivity() {

    private val bottomButtons: BottomButtons = BottomButtons()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        findViewById<ImageButton>(R.id.navigation_home).setOnClickListener(bottomButtons)
        findViewById<ImageButton>(R.id.navigation_breed).setOnClickListener(bottomButtons)
        findViewById<ImageButton>(R.id.navigation_favorite).setOnClickListener(bottomButtons)
        findViewById<ImageButton>(R.id.navigation_profile).setOnClickListener(bottomButtons)
        findViewById<ImageButton>(R.id.navigation_post).setOnClickListener(bottomButtons)
    }

    inner class BottomButtons : View.OnClickListener {
        override fun onClick(view: View) {
            when (view.id) {
                R.id.navigation_home -> {
                    val intent = Intent(this@PostActivity, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                R.id.navigation_breed -> {
                    val intent = Intent(this@PostActivity, BreedActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                R.id.navigation_favorite -> {
                    val intent = Intent(this@PostActivity, FavoriteActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                R.id.navigation_profile -> {
                    val intent = Intent(this@PostActivity, ProfileActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                R.id.navigation_post -> {
                    val intent = Intent(this@PostActivity, PostActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}
