package com.example.hw_1

import android.content.Context
import android.widget.Toast

class Presenter {
    var model = CounterModel()
    lateinit var  view: CounterView

    fun incrementCount() {
        model.increment()
        view.updateText(model.count.toString())
    }
    fun dicremantCount() {
        model.decrement()
        view.updateText(model.count.toString())

    }

    fun attachView(view: CounterView) {
        this.view = view
    }
    fun checkCount(context: Context) {
        if (model.count == 15) {
            makeToast(context)
        } else if (model.count == 15 ) {
            view.makeGreenText(true)
        } else {
            view.makeGreenText(false)
        }
    }

    fun makeToast(context: Context ) {
        Toast.makeText(context, "Поздроляем!" , Toast.LENGTH_SHORT).show()
    }

}