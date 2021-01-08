package com.e.daedo.network

import com.e.daedo.data.request.LoginBody
import com.e.daedo.data.request.RegisterBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface Service {

    //로그인
    @POST("/auth/login")
    fun login(@Body loginBody: LoginBody):Call<LoginBody>

//    //회원가입
//    @POST("/auth/sign-up")
//    fun requestSignUp(
//        //INPUT 정의
//        @Body signUpBody:
//    ) : Call<RegisterBody> //OUTPUT 정의
}