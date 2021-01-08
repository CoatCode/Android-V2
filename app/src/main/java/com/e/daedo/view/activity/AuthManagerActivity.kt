package com.e.daedo.view.activity

import com.e.daedo.R
import com.e.daedo.base.BaseActivity
import com.e.daedo.databinding.ActivityAuthManagerBinding
import com.e.daedo.viewModel.AuthManagerViewModel

class AuthManagerActivity : BaseActivity<ActivityAuthManagerBinding, AuthManagerViewModel>() {

    override val viewModel: AuthManagerViewModel
        get() = AuthManagerViewModel()

    override val layoutRes: Int
        get() = R.layout.activity_auth_manager

    override fun init() {
    }

    override fun observerViewModel() {
    }


}