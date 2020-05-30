package com.example.androidarchitecturecomponents

import android.app.Application
import com.example.androidarchitecturecomponents.base.startDI

class ArchitectureApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startDI(this)
    }
}