package com.example.assignment3.mvp

interface Contract {
    interface View {
        fun showResult(result: Double)
        fun displayToast(message: String)
    }

    interface Presenter {
        fun calculate(num1: Double, num2: Double, operator: String)
    }
    interface Model {
        fun add(num1: Double, num2: Double): Double
        fun subtract(num1: Double, num2: Double): Double
        fun divide(num1: Double, num2: Double): Double
        fun multiply(num1: Double, num2: Double): Double
    }
}
