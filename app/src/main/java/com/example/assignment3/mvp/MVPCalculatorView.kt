package com.example.assignment3.mvp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.cs4520.assignment3.databinding.HomeFragmentBinding
import com.cs4520.assignment3.databinding.MvpCalculatorViewBinding

class MVPCalculatorView: Fragment(), Contract.View {

    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var resultTextView: TextView

    private lateinit var presenter: Contract.Presenter
    private lateinit var calculatorViewBinding: MvpCalculatorViewBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        calculatorViewBinding = MvpCalculatorViewBinding.inflate(inflater, container, false)
        val view = calculatorViewBinding.root
        return view
    }

    override fun showResult(result: Double) {
        TODO("Not yet implemented")
    }

    override fun showErrorMessage(message: String) {
        TODO("Not yet implemented")
    }

}