package ru.agavrilyuk.gymapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ru.agavrilyuk.gymapp.R
import ru.agavrilyuk.gymapp.adapters.DayModel
import ru.agavrilyuk.gymapp.adapters.DaysAdapter
import ru.agavrilyuk.gymapp.databinding.ExerciseListFragmentBinding
import ru.agavrilyuk.gymapp.databinding.FragmentDaysBinding

class ExerciseListFragment : Fragment() {
    private lateinit var binding: ExerciseListFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ExerciseListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        @JvmStatic
        fun newInstance() = ExerciseListFragment()
    }
}