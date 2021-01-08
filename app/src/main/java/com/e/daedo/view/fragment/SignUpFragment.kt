package com.e.daedo.view.fragment

import com.e.daedo.R
import com.e.daedo.base.BaseFragment
import com.e.daedo.databinding.FragmentSignUpBinding
import com.e.daedo.viewModel.SignUpViewModel

class SignUpFragment : BaseFragment<FragmentSignUpBinding, SignUpViewModel>() {
    override val viewModel : SignUpViewModel = SignUpViewModel()

    override val layoutRes: Int get() = R.layout.fragment_sign_up

    override fun init() {
        with(viewModel){
        }
    }

    override fun observerViewModel() {

    }
}