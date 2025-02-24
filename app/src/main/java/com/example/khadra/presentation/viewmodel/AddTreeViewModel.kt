package com.example.khadra.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.khadra.domain.usecase.AddTreeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class AddTreeViewModel @Inject constructor(private val addTreeUseCase: AddTreeUseCase) : ViewModel() {

    //TODO: Add the viewModel logic to add a tree
}
