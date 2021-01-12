package com.e.daedo.viewModel

import android.util.Patterns
import androidx.lifecycle.MutableLiveData
import com.e.daedo.base.BaseViewModel
import com.e.daedo.data.response.StatusInfo
import com.e.daedo.network.Service
import com.e.daedo.widget.SingleLiveEvent
import okhttp3.Response
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import java.util.regex.Matcher
import java.util.regex.Pattern

class SignUpViewModel : BaseViewModel() {

    val btn = SingleLiveEvent<Unit>()

    //    var image = MutableLiveData<>()
    val email = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val username = MutableLiveData<String>()

    var status = MutableLiveData<String>()

    var checkEmail: Boolean = false
    var checkPassword: Boolean = false

    lateinit var myAPI: Service
    lateinit var retrofit: Retrofit

    //중복을 체크하는 api
    fun checkOverlap() {

    }


//    fun signUp() {
//        myAPI = retrofit.create(Service::class.java)
//        myAPI.requestSignUp(
////            SignBody(
////                username = username.value.toString(),
////                email = email.value.toString(),
////                password = password.value.toString(),
////                image =
////            )
//        )
//            .enqueue(object : Callback<StatusInfo> {
//                override fun onFailure(call: Call<StatusInfo>, t: Throwable) {
//                    status.value = "400"
//                }
//
//                override fun onResponse(call: Call<StatusInfo>, response: Response<StatusInfo>) {
//                    status.value = response.code().toString()
//                }
//            })
//    }

    //이메일 형식 체크
    fun isEmail(email: String): Boolean {
        var returnValue = false
        val pattern = Patterns.EMAIL_ADDRESS
        val m: Matcher = pattern.matcher(email)
        if (m.matches()) {
            returnValue = true
        }
        return returnValue
    }

    fun isPassword(password: String): Boolean {
        var returnValue = false
        if (!Pattern.matches("^[a-zA-Z0-9]{10,15}\$", password)) {
            return returnValue
        } else {
            returnValue = true
            return returnValue
        }
    }

    fun btnClick() {
        btn.call()
    }


}