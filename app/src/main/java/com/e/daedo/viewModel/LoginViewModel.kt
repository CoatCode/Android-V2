package com.e.daedo.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.e.daedo.base.BaseViewModel

class LoginViewModel : BaseViewModel() {

    fun login(email:String, password:String){
        Log.d("씨발","씨발 : $password")
    }
}