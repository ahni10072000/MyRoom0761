package com.myroom.app.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.myroom.app.R
import com.myroom.app.databinding.ActivityAuthBinding
import com.myroom.app.databinding.ActivityMainBinding
import com.myroom.app.ui.auth.AuthActivity
import com.myroom.app.ui.auth.MyRoomAuth

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.button.setOnClickListener{
            MyRoomAuth.logout(this){
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}