package com.ronasit.ui.location.detail.ui

import com.ronasit.feature.rickandmorty_api.model.Character
import com.ronasit.feature.rickandmorty_api.model.LocationDetail

data class LocationDetailState(
    val isLoading: Boolean = false,
    val error: String = "",
    val id: Int = 0,
    val locationDetail: LocationDetail? = null,
    val residentList: List<Character>? = null
)
