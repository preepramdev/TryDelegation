package com.pram.trydelegation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pram.trydelegation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), TrackEvenDelegate by TrackEventDelegateImpl() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        registerTrackEvent(lifecycle)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}