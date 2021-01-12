package com.e.daedo.di

import com.e.daedo.viewModel.*
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val MyModule = module {
    viewModel { LoginViewModel() }
    viewModel { AuthManagerViewModel() }
    viewModel { SignProfileViewModel() }
    viewModel { SignUpViewModel() }
    viewModel { TotalAuthViewModel() }
}