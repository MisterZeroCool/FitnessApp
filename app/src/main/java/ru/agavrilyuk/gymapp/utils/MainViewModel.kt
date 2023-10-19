package ru.agavrilyuk.gymapp.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.agavrilyuk.gymapp.activities.ExerciseModel

class MainViewModel : ViewModel() {
    var mutableLiveExercise = MutableLiveData<ArrayList<ExerciseModel>>()
}