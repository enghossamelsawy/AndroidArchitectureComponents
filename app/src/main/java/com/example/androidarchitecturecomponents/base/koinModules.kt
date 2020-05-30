package com.example.androidarchitecturecomponents.base

import android.app.Application
import com.example.androidarchitecturecomponents.base.remote.remoteModule
import com.example.androidarchitecturecomponents.userpackage.di.userModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * fun to start dependency injection using koin
 * */

fun startDI(application: Application) {
    startKoin {
        androidContext(application)
        printLogger()
        modules(listOf(remoteModule, userModule))

    }
}