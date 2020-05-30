package com.example.androidarchitecturecomponents.userpackage.di

import com.example.androidarchitecturecomponents.userpackage.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val userModule = module {

    viewModel { UserViewModel() }
}