package com.ronasit.feature.rickandmorty_impl.repository_impl

import com.ronasit.feature.rickandmorty_api.model.LocationPager
import com.ronasit.feature.rickandmorty_api.repository.LocationRepository
import com.ronasit.feature.rickandmorty_impl.RickAndMortyService
import com.ronasit.feature.rickandmorty_impl.data_models.toDomain

class LocationRepositoryImpl(private val rickAndMortyService: RickAndMortyService) : LocationRepository {
    override suspend fun getLocations(page: Int, name: String): LocationPager {
        return rickAndMortyService.getAllLocations(page, name).toDomain()
    }
}