package com.example.assignment3.mvvm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.cs4520.assignment3.databinding.MvpCalculatorViewBinding

class MVVMCalculatorViewFragment: Fragment() {

    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var resultTextView: TextView

    private lateinit var viewModel: MVVMCalculatorViewModel
    private lateinit var calculatorViewBinding: MvpCalculatorViewBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        calculatorViewBinding = MvpCalculatorViewBinding.inflate(inflater, container, false)
        val view = calculatorViewBinding.root
        num1EditText = calculatorViewBinding.editTextNum1
        num2EditText = calculatorViewBinding.editTextNum2
        resultTextView = calculatorViewBinding.textViewResult
        viewModel = ViewModelProvider(this)[MVVMCalculatorViewModel::class.java]

        val addButton = calculatorViewBinding.addButton
        val subButton = calculatorViewBinding.subButton
        val mulButton = calculatorViewBinding.multiplyButton
        val divButton = calculatorViewBinding.divideButton

        addButton.setOnClickListener { calcResult("add") }
        subButton.setOnClickListener { calcResult("sub") }
        mulButton.setOnClickListener { calcResult("mul") }
        divButton.setOnClickListener { calcResult("div") }

        viewModel.result.observe(viewLifecycleOwner, {
            if (result)
        })
        return view
    }

    private fun calcResult(operation: String) {
        val num1Str = num1EditText.text.toString()
        val num2Str = num2EditText.text.toString()

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            displayToast("Invalid/Missing Input")
        }

        var num1 = num1Str.toDouble()
        var num2 = num2Str.toDouble()
        presenter.calculate(num1, num2, operation)
        num1EditText.text.clear()
        num2EditText.text.clear()

    }

    override fun displayToast(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
        return
    }

}