package com.enigmata.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.enigmata.myapplication.databinding.FragmentScheduleBinding
import com.enigmata.myapplication.recyclerview.ride_rv_adapter
import com.enigmata.myapplication.recyclerview.ride_rv_dc

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ScheduleFragment : Fragment() {

    private lateinit var binding: FragmentScheduleBinding

    private lateinit var adapter : ride_rv_adapter
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_schedule, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    init()
        binding.backBtn.setOnClickListener {
            findNavController().navigate(R.id.action_scheduleFragment_to_loginFragment)
        }
        binding.addRide.setOnClickListener {
            findNavController().navigate(R.id.action_scheduleFragment_to_bookRideFragment)
        }
    }
    private fun init(){
        adapter= ride_rv_adapter()
        val rv = requireView().findViewById<RecyclerView>(R.id.myRidesRv)
        rv.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)
        rv.adapter = adapter
//        addData()
        Log.d("CLF","This screen is ok")
    }
}