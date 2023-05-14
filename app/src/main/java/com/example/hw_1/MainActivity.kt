package com.example.hw_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() ,CounterView {
    lateinit var binding: ActivityMainBinding
    var presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.iflate(layoutInflater)
        setContextView(binding.root)
        presenter.attachView(this)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            btnIncrement.setOnClickListeber {
                presenter.incrementCount()
            }
            btnDecrement.setOnClickListener {
                presenter.decrementCount()
            }
        }
    }

    override fun updateText(count: String) {
        binding.tvCount.setTextColor(ContextCompat.getColor(this, R.color.green))
    }

    override fun makeGreenText(green: Boolean) {
    } else {
        binding.tvCount.setTextColor(ContextCompat.getColor(this, R.color.black))
     }
   }
}
}