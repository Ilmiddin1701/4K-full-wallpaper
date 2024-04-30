package com.example.a4kfullwallpaper

import android.graphics.Color
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.a4kfullwallpaper.databinding.ActivityMainBinding
import com.example.a4kfullwallpaper.utils.MyData

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val btnMenu = findViewById<ImageView>(R.id.btn_menu)
        btnMenu.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        window.statusBarColor = Color.TRANSPARENT

        binding.myNav.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> MyData.actionLive.postValue(0)
                R.id.menu_popular -> MyData.actionLive.postValue(1)
                R.id.menu_random -> MyData.actionLive.postValue(2)
                R.id.menu_liked -> MyData.actionLive.postValue(3)
                R.id.menu_history -> MyData.actionLive.postValue(4)
                R.id.menu_about -> MyData.actionLive.postValue(5)
            }

            binding.drawerLayout.closeDrawer(GravityCompat.START)
            true
        }

        binding.drawerLayout.setScrimColor(getResources().getColor(android.R.color.transparent))
    }
}