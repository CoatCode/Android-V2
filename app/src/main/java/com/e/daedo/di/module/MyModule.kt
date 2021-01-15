package com.e.daedo.di.module

import com.e.daedo.viewModel.*
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val MyModule = module{
    viewModel { AuthManagerViewModel() }
    viewModel { LoginViewModel() }
    viewModel { SignProfileViewModel() }
    viewModel { SignUpViewModel() }
    viewModel { TotalAuthViewModel() }
}