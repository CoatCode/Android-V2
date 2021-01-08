package com.e.daedo.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.e.daedo.R
import com.e.daedo.base.BaseFragment
import com.e.daedo.databinding.FragmentLoginBinding
import com.e.daedo.viewModel.AuthManagerViewModel
import com.e.daedo.viewModel.LoginViewModel

class LoginFragment : BaseFragment<FragmentLoginBinding,LoginViewModel>() {
    override val viewModel: LoginViewModel = LoginViewModel()
    override val layoutRes: Int = R.layout.fragment_login
    override fun init() {

    }

    override fun observerViewModel() {

    }
}