package com.e.daedo.di.applications

import android.app.Application
import com.e.daedo.di.module.MyModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    companion object{
        const val baseUrl: String= "https://coatcode.herokuapp.com"
    }

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@MyApplication)
            modules(
                MyModule
            )
        }
    }
}