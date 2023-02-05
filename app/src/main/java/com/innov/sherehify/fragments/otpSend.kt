package com.innov.sherehify.fragments

import android.app.ProgressDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import com.innov.sherehify.R


class otpSend : Fragment() {
    var verification:String? = null
    var auth : FirebaseAuth? = null
    var dialog : ProgressDialog? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog = ProgressDialog.(this@otpSend)
        dialog!!.setMessage("Sending Otp...")
        dialog!!.setCancelable(false)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_otp_send, container, false)
    }

}