package com.e.daedo.view.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.Navigator
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.e.daedo.R
import com.e.daedo.base.BaseFragment
import com.e.daedo.databinding.FragmentAuthManagerBinding
import com.e.daedo.databinding.FragmentSignUpBinding
import com.e.daedo.viewModel.AuthManagerViewModel
import com.e.daedo.viewModel.SignUpViewModel
import kotlinx.android.synthetic.main.fragment_auth_manager.*
import kotlinx.android.synthetic.main.fragment_auth_manager.view.*
import kotlinx.android.synthetic.main.fragment_login.*

class AuthManagerFragment : BaseFragment<FragmentAuthManagerBinding, AuthManagerViewModel>() {
    override val viewModel: AuthManagerViewModel = AuthManagerViewModel()
    override val layoutRes: Int = R.layout.fragment_auth_manager

    override fun init() {

    }

    override fun observerViewModel() {
        email_btn.setOnClickListener {
            findNavController().navigate(R.id.action_authManagerFragment_to_loginFragment)
        }
        register_btn.setOnClickListener {
            findNavController().navigate(R.id.action_authManagerFragment_to_signUpFragment)
        }
    }
}
