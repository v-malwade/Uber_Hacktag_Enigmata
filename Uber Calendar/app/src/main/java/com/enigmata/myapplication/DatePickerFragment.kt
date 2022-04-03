package com.enigmata.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.enigmata.myapplication.databinding.FragmentDatePickerBinding

class DatePickerFragment : DialogFragment() {

    private lateinit var binding: FragmentDatePickerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_date_picker, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var curr_date: Dt = Dt()

        binding.dtPickButtonBtDtPicker.setOnClickListener {
            curr_date = Dt(
                binding.dtpickerDtpickDatePicker.dayOfMonth.toString(),
                binding.dtpickerDtpickDatePicker.month.toString(),
                binding.dtpickerDtpickDatePicker.year.toString()
            )
            //Yahaa se curr_date le lenaa.
            findNavController().navigateUp()
        }

        binding.cancelbtBtDatePicker.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}