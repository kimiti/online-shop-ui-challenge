package com.example.onlineshop.viewModel

import androidx.lifecycle.ViewModel
import com.example.onlineshop.repository.MainRepository

class MainViewModel: ViewModel() {
    private val repository = MainRepository()

}