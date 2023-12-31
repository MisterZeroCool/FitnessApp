package ru.agavrilyuk.gymapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.agavrilyuk.gymapp.R
import ru.agavrilyuk.gymapp.databinding.ActivityMainBinding
import ru.agavrilyuk.gymapp.fragments.DaysFragment
import ru.agavrilyuk.gymapp.utils.FragmentManager

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        FragmentManager.setFragment(DaysFragment.newInstance(), this)

    }

    override fun onBackPressed() {
        if (FragmentManager.currentFragment is DaysFragment)
            super.onBackPressedDispatcher.onBackPressed()
        else FragmentManager.setFragment(DaysFragment.newInstance(), this)
    }
}