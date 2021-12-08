package com.ronasit.feature.rickandmorty_impl.data_models

import com.ronasit.feature.rickandmorty_api.models.LocationPager
import kotlinx.serialization.Serializable

@Serializable
data class LocationResponse(
    val info: Info,
    val results: List<LocationResult>
)

fun LocationResponse.toDomain(): LocationPager {
    return LocationPager(location = results.map { item -> item.toDomain() }, countPage = info.count)
}

