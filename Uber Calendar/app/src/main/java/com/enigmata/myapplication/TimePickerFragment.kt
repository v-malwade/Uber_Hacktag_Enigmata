package com.enigmata.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.enigmata.myapplication.databinding.FragmentDatePickerBinding
import com.enigmata.myapplication.databinding.FragmentTimePickerBinding

class TimePickerFragment : DialogFragment() {

    private lateinit var binding: FragmentTimePickerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_time_picker, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var hour: String = ""
        var minute: String = ""

        binding.cancelbtBtTimePicker.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.timePickButtonBtTimePicker.setOnClickListener {
            hour = binding.timePickTpTimePicker.hour.toString()
            minute = binding.timePickTpTimePicker.minute.toString()
            //Use this hour and minute.
            findNavController().navigateUp()
        }
    }
}