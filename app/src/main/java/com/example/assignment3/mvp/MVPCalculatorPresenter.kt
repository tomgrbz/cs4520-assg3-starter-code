package com.example.assignment3.mvp

class MVPCalculatorPresenter(private val view: Contract.View) : Contract.Presenter {

    private var model = MVPCalculatorModel()
    override fun calculate(num1: Double, num2: Double, operator: String) {
        val result = when (operator) {
            "add" -> model.add(num1, num2)
            "sub" -> model.subtract(num1, num2)
            "mul" -> model.multiply(num1, num2)
            "div" -> if (num2 != 0.0) model.divide(num1, num2) else {
                view.displayToast("Can't divide by 0'")
                return
            }
            else -> 0.0
        }
        view.showResult(result)
    }
}
