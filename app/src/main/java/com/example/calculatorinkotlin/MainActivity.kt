package com.example.calculatorinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import androidx.core.view.GravityCompat
import com.example.calculatorinkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    var str = String()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        drawingLayout()
    }

    //drawLayout control method
    fun drawingLayout() {
        binding.drawImage.setOnClickListener {
            if (binding.drawLayout.isDrawerOpen(binding.navView)) {
                binding.drawLayout.closeDrawer(binding.navView)
            } else {
                binding.drawLayout.openDrawer(binding.navView)
            }
        }
    }



}