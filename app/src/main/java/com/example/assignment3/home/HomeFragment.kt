package com.example.assignment3.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.cs4520.assignment3.R
import com.cs4520.assignment3.databinding.HomeFragmentBinding

class HomeFragment: Fragment() {

    private lateinit var mvpButton: Button
    private lateinit var mvvmButton: Button

    private lateinit var homeFragmentBinding: HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeFragmentBinding = HomeFragmentBinding.inflate(inflater, container, false)
        val view = homeFragmentBinding.root
        mvpButton = homeFragmentBinding.mvpButton
        mvvmButton = homeFragmentBinding.mvvmButton
        val nav = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)

        mvpButton.setOnClickListener {
            nav.navigate(R.id.action_home_to_mvpFragment)
        }
        mvvmButton.setOnClickListener {
            nav.navigate(R.id.action_home_to_mvvmFragment)
        }
        return view
    }
}