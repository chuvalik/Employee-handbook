package com.example.feature.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.core.core.ConnectivityObserver
import com.example.core_data.repository.HomeRepository
import com.example.core_preferences.UserPreferences
import javax.inject.Inject
import javax.inject.Provider

class HomeViewModelFactory @Inject constructor(
    private val repository: Provider<HomeRepository>,
    private val preferences: Provider<UserPreferences>,
    private val connectivityObserver: Provider<ConnectivityObserver>
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        require(modelClass == HomeViewModel::class.java)
        return HomeViewModel(repository.get(), preferences.get(), connectivityObserver.get()) as T
    }
}
