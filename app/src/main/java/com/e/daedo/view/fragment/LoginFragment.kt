package com.e.daedo.view.fragment


import android.util.Log
import com.e.daedo.R
import com.e.daedo.base.BaseFragment
import com.e.daedo.databinding.FragmentLoginBinding
import com.e.daedo.viewModel.LoginViewModel
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : BaseFragment<FragmentLoginBinding,LoginViewModel>() {
    override var viewModel: LoginViewModel = LoginViewModel()
    override val layoutRes: Int = R.layout.fragment_login
    override fun init() {

    }

    override fun observerViewModel() {
            login_btn.setOnClickListener {
                viewModel.login(binding.editTextTextEmailAddress.text.toString(),binding.editTextTextPassword.text.toString())
        }
    }
}