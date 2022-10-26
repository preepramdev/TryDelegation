package com.pram.trydelegation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity
    : AppCompatActivity(),
    TrackEvenDelegate by TrackEventDelegateImpl() {

    override fun onCreate(savedInstanceState: Bundle?) {
        registerTrackEvent(lifecycle)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}