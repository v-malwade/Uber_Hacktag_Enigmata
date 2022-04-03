package com.enigmata.myapplication


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.common.api.Status
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.enigmata.myapplication.databinding.FragmentBookRideBinding


class BookRideFragment : Fragment() {

    private lateinit var binding: FragmentBookRideBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Places.initialize(requireActivity().applicationContext, "AIzaSyAiq0VdBI3DsKZpexeKtYS7vS_J9dAyp88")
//        val placesClient = Places.createClient(requireActivity())
//        val autocompleteFragmentFrom =
//            childFragmentManager.findFragmentById(R.id.autocomplete_fragment_from) as AutocompleteSupportFragment?
//
//        autocompleteFragmentFrom?.setCountry("IN")
//        // Specify the types of place data to return.
//        autocompleteFragmentFrom?.setPlaceFields(listOf(ID, NAME))
//
//        // Set up a PlaceSelectionListener to handle the response.
//        autocompleteFragmentFrom?.setOnPlaceSelectedListener(object : PlaceSelectionListener {
//            override fun onPlaceSelected(place: Place) {
//                //TODO: Handle place selection for From field.
//                Log.d("Hey", place.toString())
//            }
//
//            override fun onError(status: Status) {
//                // TODO: Handle the error.
//                Log.d("HOY", "An error occurred: ${status.statusCode}")
//            }
//        })
//        val autocompleteFragmentTo =
//            childFragmentManager.findFragmentById(R.id.autocomplete_fragment_to) as AutocompleteSupportFragment?
//
//        autocompleteFragmentTo?.setCountry("IN")
//        // Specify the types of place data to return.
//        autocompleteFragmentTo?.setPlaceFields(listOf(ID, NAME))
//
//        // Set up a PlaceSelectionListener to handle the response.
//        autocompleteFragmentTo?.setOnPlaceSelectedListener(object : PlaceSelectionListener {
//            override fun onPlaceSelected(place: Place) {
//                //TODO: Handle place selection for To field.
//                Log.d("Hey", place.toString())
//            }
//
//            override fun onError(status: Status) {
//                // TODO: Handle the error.
//                Log.d("HOY", "An error occurred: ${status.statusCode}")
//            }
//        })
//
//    }
    }
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            binding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_book_ride, container, false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            binding.dateIcon.setOnClickListener {
                findNavController().navigate(R.id.action_bookRideFragment_to_datePickerFragment)
            }

            binding.timeIconIvBookRide.setOnClickListener {
                findNavController().navigate(R.id.action_bookRideFragment_to_timePickerFragment)
            }

            //Interactive UI:
            binding.sedan.setOnClickListener {
                binding.sedanTextCard.setCardBackgroundColor(getResources().getColor(R.color.uber_blue))
                binding.miniTextCard.setCardBackgroundColor(getResources().getColor(R.color.black))
                binding.suvTextCard.setCardBackgroundColor(getResources().getColor(R.color.black))
            }

            binding.mini.setOnClickListener {
                binding.sedanTextCard.setCardBackgroundColor(getResources().getColor(R.color.black))
                binding.miniTextCard.setCardBackgroundColor(getResources().getColor(R.color.uber_blue))
                binding.suvTextCard.setCardBackgroundColor(getResources().getColor(R.color.black))
            }

            binding.suv.setOnClickListener {
                binding.sedanTextCard.setCardBackgroundColor(getResources().getColor(R.color.black))
                binding.miniTextCard.setCardBackgroundColor(getResources().getColor(R.color.black))
                binding.suvTextCard.setCardBackgroundColor(getResources().getColor(R.color.uber_blue))
            }
        }

}