package com.example.assignment3.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.IllegalArgumentException

class MVVMCalculatorViewModel: ViewModel() {

    private val _result = MutableLiveData<Double>()
    val result: LiveData<Double> get() = _result

    private var model = MVVMCalculatorModel()
    fun calculate(num1: Double, num2: Double, operator: String) {
        val result = when (operator) {
            "add" -> model.add(num1, num2)
            "sub" -> model.subtract(num1, num2)
            "mul" -> model.multiply(num1, num2)
            "div" -> model.divide(num1, num2)
            else -> Double.NaN
        }
        _result.value = result
    }
}
