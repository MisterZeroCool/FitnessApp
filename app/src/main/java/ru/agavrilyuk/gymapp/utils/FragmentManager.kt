package ru.agavrilyuk.gymapp.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import ru.agavrilyuk.gymapp.R

object FragmentManager {
    fun setFragment(newFragment: Fragment, act: AppCompatActivity){
        val transaction = act.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.placeHolder, newFragment)
        transaction.commit()
    }
}