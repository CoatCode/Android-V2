package com.e.daedo.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.e.daedo.R
import com.e.daedo.base.BaseFragment
import com.e.daedo.databinding.FragmentLoginBinding
import com.e.daedo.viewModel.AuthManagerViewModel
import com.e.daedo.viewModel.LoginViewModel
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : BaseFragment<FragmentLoginBinding,LoginViewModel>() {
    override var viewModel: LoginViewModel = LoginViewModel()
    override val layoutRes: Int = R.layout.fragment_login
    override fun init() {

    }

    override fun observerViewModel() {
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
            login_btn.setOnClickListener {
                viewModel.getAccount()
                Log.d("출타","출타")
        }
    }
}