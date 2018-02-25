package com.example.abdallahsarayrah.fragcomproh


import android.app.Activity
import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton


/**
 * A simple [Fragment] subclass.
 */
class RadioButtonFragment : Fragment() {

    var interfaceColorObject: interfaceColor? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view: View = inflater!!.inflate(R.layout.fragment_radio_button, container, false)

        var radioButtonRed = view.findViewById<RadioButton>(R.id.radioButtonRed)
        var radioButtonGreen = view.findViewById<RadioButton>(R.id.radioButtonGreen)
        var radioButtonBlue = view.findViewById<RadioButton>(R.id.radioButtonBlue)

        radioButtonRed.setOnClickListener { interfaceColorObject?.setColor(1) }
        radioButtonGreen.setOnClickListener { interfaceColorObject?.setColor(2) }
        radioButtonBlue.setOnClickListener { interfaceColorObject?.setColor(3) }

        return view
    }

    interface interfaceColor {
        fun setColor(index: Int)
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        interfaceColorObject = activity as interfaceColor
    }

}// Required empty public constructor
