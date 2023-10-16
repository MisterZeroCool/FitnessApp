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
import ru.agavrilyuk.gymapp.databinding.FragmentDaysBinding
import ru.agavrilyuk.gymapp.utils.FragmentManager

class DaysFragment : Fragment(), DaysAdapter.Listener {
    private lateinit var binding: FragmentDaysBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDaysBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding){
        val adapter = DaysAdapter(this@DaysFragment)
        rcViewDays.layoutManager = LinearLayoutManager(activity as AppCompatActivity)
        rcViewDays.adapter = adapter
        adapter.submitList(fillDaysArray())
    }

    private fun fillDaysArray(): ArrayList<DayModel>{
        val tempArray = ArrayList<DayModel>()
        resources.getStringArray(R.array.day_exercises).forEach {
            tempArray.add(DayModel(it, false))
        }
        return  tempArray
    }

    companion object {
        @JvmStatic
        fun newInstance() = DaysFragment()
    }

    override fun onClick(day: DayModel) {
        FragmentManager.setFragment(ExerciseListFragment.newInstance(), activity as AppCompatActivity)
    }
}