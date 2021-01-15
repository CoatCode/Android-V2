package com.e.daedo.network

import com.e.daedo.di.applications.MyApplication
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private var instance: Retrofit?= null
    private var API: Service?= null

    fun getInstance(): Retrofit {
        if (instance == null) {
            instance = Retrofit.Builder()
                .baseUrl(MyApplication.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return instance!!
    }

    fun getService() : Service?{
        if(API == null){
            API = instance?.create(Service::class.java)
        }
        return API
    }
}