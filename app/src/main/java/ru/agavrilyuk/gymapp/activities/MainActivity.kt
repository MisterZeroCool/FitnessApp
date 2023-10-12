package ru.agavrilyuk.gymapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.agavrilyuk.gymapp.R
import ru.agavrilyuk.gymapp.databinding.ActivityMainBinding
import ru.agavrilyuk.gymapp.fragments.DaysFragment
import ru.agavrilyuk.gymapp.utils.FragmentManager

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        FragmentManager.setFragment(DaysFragment.newInstance(), this)

    }
}