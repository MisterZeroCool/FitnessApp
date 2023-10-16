package ru.agavrilyuk.gymapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.agavrilyuk.gymapp.R
import ru.agavrilyuk.gymapp.fragments.DaysFragment
import ru.agavrilyuk.gymapp.utils.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FragmentManager.setFragment(DaysFragment.newInstance(), this)
    }

    override fun onBackPressed() {
        if (FragmentManager.currentFragment is DaysFragment)
        super.getOnBackPressedDispatcher().onBackPressed()
        else FragmentManager.setFragment(DaysFragment.newInstance(), this)
    }
}