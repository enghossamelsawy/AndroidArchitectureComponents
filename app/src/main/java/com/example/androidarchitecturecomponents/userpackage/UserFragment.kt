package com.example.androidarchitecturecomponents.userpackage


import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.androidarchitecturecomponents.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserFragment : Fragment(R.layout.user_fragment) {

    private val viewModel: UserViewModel by viewModel()

    companion object {
        fun newInstance() = UserFragment()
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }

}