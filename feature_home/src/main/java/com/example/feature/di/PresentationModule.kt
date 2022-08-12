package com.example.feature.di

import androidx.lifecycle.SavedStateHandle
import com.example.feature.presentation.details.view_model.DetailViewModel
import com.example.feature.presentation.home.view_model.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val detailScreenViewModel = module {
    viewModel { (handle: SavedStateHandle) ->
        DetailViewModel(savedStateHandle = get())
    }
}

val homeViewModel = module {
    viewModel { (handle: SavedStateHandle) ->
        HomeViewModel(
            fetchDataUseCase = get(),
            saveSortTypeUseCase = get(),
            saveFilterUseCase = get(),
            fetchFilterUseCase = get(),
            fetchSortTypeUseCase = get(),
            state = get()
        )
    }
}
