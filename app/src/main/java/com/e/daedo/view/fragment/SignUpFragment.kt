package com.e.daedo.view.fragment

import android.util.Log
import androidx.appcompat.app.ActionBar
import com.e.daedo.R
import com.e.daedo.base.BaseFragment
import com.e.daedo.databinding.FragmentSignUpBinding
import com.e.daedo.network.RetrofitClient
import com.e.daedo.viewModel.SignUpViewModel
import kotlinx.android.synthetic.main.fragment_sign_up.*

class SignUpFragment : BaseFragment<FragmentSignUpBinding, SignUpViewModel>() {
    override val viewModel: SignUpViewModel = SignUpViewModel()

    override val layoutRes: Int get() = R.layout.fragment_sign_up

    override fun init() {
        //엑션바 숨기기
//        supportActionBar?.hide()
        viewModel.retrofit = RetrofitClient.getInstance()
    }

    override fun observerViewModel() {
        with(viewModel){

        }
    }

    private fun checkEmail(){
        if(viewModel.isEmail(EmailAddress_Et.text.toString())){
            check_email_text.text = "올바른 이메일 형식입니다."
            check_email_text.setTextColor(resources.getColor(R.color.colorBlue))
            viewModel.checkEmail = true
//            checkButton(checkEmail, checkPassword)
        }else{
            check_email_text.text = "올바르지 않은 이메일 형식입니다."
            check_email_text.setTextColor(resources.getColor(R.color.colorRed))
            viewModel.checkEmail = false
//            checkButton(checkEmail, checkPassword)
        }
    }

    private fun checkPassword(){
        if(viewModel.isPassword(Password_Et.text.toString())){
            check_password_text.text = "올바른 비밀번호입니다."
            check_email_text.setTextColor(resources.getColor(R.color.colorBlue))
            viewModel.checkPassword = true
        }else{
            check_password_text.text = "비밀번호의 형식이 틀렸습니다."
            check_password_text.setTextColor(resources.getColor(R.color.colorRed))
            viewModel.checkPassword = false
        }
    }
}