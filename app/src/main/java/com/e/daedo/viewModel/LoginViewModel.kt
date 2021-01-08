package com.e.daedo.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.e.daedo.base.BaseViewModel

class LoginViewModel : BaseViewModel() {
    var email : String = ""
    var password : String = ""

    fun getAccount(){
        Log.d("사발",",,,,,,,")
    }
}