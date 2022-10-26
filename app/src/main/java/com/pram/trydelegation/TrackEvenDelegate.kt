package com.pram.trydelegation

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner

interface TrackEvenDelegate {
    fun registerTrackEvent(lifecycle: Lifecycle)
}

class TrackEventDelegateImpl: TrackEvenDelegate, DefaultLifecycleObserver {
    override fun registerTrackEvent(lifecycle: Lifecycle) {
        lifecycle.addObserver(this)
    }

    override fun onStart(owner: LifecycleOwner) {
        trackEvent("onStart")
        super.onStart(owner)
    }

    override fun onResume(owner: LifecycleOwner) {
        trackEvent("onResume")
        super.onResume(owner)
    }

    override fun onStop(owner: LifecycleOwner) {
        trackEvent("onStop")
        super.onStop(owner)
    }

    private fun trackEvent(eventName: String) {
        Log.e("TAG", "trackEvent: $eventName")
    }
}