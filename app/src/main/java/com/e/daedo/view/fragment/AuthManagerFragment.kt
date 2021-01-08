package com.e.daedo.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.e.daedo.R
import com.e.daedo.base.BaseFragment
import com.e.daedo.databinding.FragmentSignUpBinding
import com.e.daedo.viewModel.AuthManagerViewModel
import com.e.daedo.viewModel.SignUpViewModel
import kotlinx.android.synthetic.main.fragment_auth_manager.*
import kotlinx.android.synthetic.main.fragment_auth_manager.view.*

class AuthManagerFragment : BaseFragment<FragmentSignUpBinding, AuthManagerViewModel>() {
    override val viewModel: AuthManagerViewModel = AuthManagerViewModel()
    override val layoutRes: Int = R.layout.fragment_auth_manager
    override fun init() {
        TODO("Not yet implemented")
    }

    override fun observerViewModel() {
        TODO("Not yet implemented")
    }

}