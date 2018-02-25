package com.example.abdallahsarayrah.fragcomproh

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RadioButtonFragment.interfaceColor {
    override fun setColor(index: Int) {
        when (index) {
            1 -> mainActivity.setBackgroundColor(Color.RED)
            2 -> mainActivity.setBackgroundColor(Color.GREEN)
            3 -> mainActivity.setBackgroundColor(Color.BLUE)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var transaction = fragmentManager.beginTransaction()
        var fragmentObject = RadioButtonFragment()
        transaction.replace(R.id.fragmentContainer, fragmentObject)
        transaction.commit()
    }
}
