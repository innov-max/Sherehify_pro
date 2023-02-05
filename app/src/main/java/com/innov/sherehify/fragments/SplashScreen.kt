package com.innov.sherehify.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.innov.sherehify.R


class SplashScreen : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        arguments?.let {



        }




    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        var mAuth: FirebaseAuth?
        mAuth = FirebaseAuth.getInstance();
        val currentUser = mAuth.currentUser
        if(currentUser !=null){
            findNavController().navigate(R.id.action_splashScreen_to_verification)

        }else{

        }


        return inflater.inflate(R.layout.fragment_splash_screen, container, false)
    }








}