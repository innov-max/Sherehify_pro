package com.innov.sherehify.actiivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

import androidx.navigation.findNavController


import com.innov.sherehify.R

import com.innov.sherehify.fragments.SplashScreen
import com.innov.sherehify.fragments.Verification


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(android.R.id.content, SplashScreen()).commit()

        }
    }

}