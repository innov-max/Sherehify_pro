package com.innov.sherehify.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.innov.sherehify.R
import kotlinx.android.synthetic.main.fragment_verification.*


class Verification : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        editextNumber.requestFocus()
        btnContinue.setOnClickListener {
            val Otpsend = otpSend()
            val args = Bundle()
            args.putString("phoneNumber",editextNumber.text.toString())
            Otpsend.arguments = args
            findNavController().navigate(R.id.action_verification_to_otpSend)
            
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_verification, container, false)
    }


}