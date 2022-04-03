package com.enigmata.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.enigmata.myapplication.databinding.FragmentLoginBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.animationViewCar.setMinFrame(10)
        binding.animationViewCar.playAnimation()
        binding.loginCus.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_enterUserNameFragment)
        }
        binding.loginDr.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_scheduleDriverFragment)
        }
    }
}