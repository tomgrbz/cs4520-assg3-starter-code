package com.example.assignment3.mvp

class MVPCalculatorModel: Contract.Model {
    override fun add(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    override fun subtract(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    override fun divide(num1: Double, num2: Double): Double {
        return num1 / num2
    }

    override fun multiply(num1: Double, num2: Double): Double {
        return num1 * num2
    }

}