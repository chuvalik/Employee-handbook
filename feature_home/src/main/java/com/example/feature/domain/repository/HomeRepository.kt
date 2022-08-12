package com.example.feature.domain.repository

import com.example.core.utils.Resource
import com.example.feature.domain.model.DomainDataSource
import com.example.feature.presentation.home.view_model.SortType
import kotlinx.coroutines.flow.Flow

interface HomeRepository {

    fun fetchUsers(
        department: String,
        sortType: SortType,
        searchQuery: String,
        refreshData: Boolean
    ): Flow<Resource<List<DomainDataSource>>>

    fun fetchFilter(): String

    fun fetchSortType(): SortType

    fun updateSortType(sortType: SortType)

    fun updateFilter(departmentFilter: String)
}