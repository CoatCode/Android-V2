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
import kotlinx.android.synthetic.main.fragment_auth_manager.*
import kotlinx.android.synthetic.main.fragment_auth_manager.view.*

class AuthManagerFragment : BaseFragment {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_auth_manager, container, false)
        view.email_btn.setOnClickListener {
            Log.d("애미","애미")
            findNavController().navigate(R.id.action_authManageFragment_to_loginFragment)
        }
        return view
    }
}