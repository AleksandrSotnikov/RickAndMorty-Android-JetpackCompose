package com.ronasit.feature.rickandmorty_impl

import com.ronasit.feature.rickandmorty_api.repository.CharacterRepository
import com.ronasit.feature.rickandmorty_api.repository.EpisodeRepository
import com.ronasit.feature.rickandmorty_api.repository.LocationRepository
import com.ronasit.feature.rickandmorty_api.usecase.*
import com.ronasit.feature.rickandmorty_impl.network.*
import com.ronasit.feature.rickandmorty_impl.repository.*
import com.ronasit.feature.rickandmorty_impl.repository.LocationRepositoryImpl
import kotlinx.serialization.ExperimentalSerializationApi
import org.koin.dsl.module

@ExperimentalSerializationApi
val rickAndMortyModule = module {
    single { getRickAndMortyService() }
    single { GetCharactersUseCase(get()) }
    single { GetLocationsUseCase(get()) }
    single { GetCharacterDetailUseCase(get()) }
    single { GetLocationUseCase(get()) }
    single { GetEpisodeListUseCase(get()) }

    single<LocationRepository> {
        LocationRepositoryImpl(get())
    }

    single<CharacterRepository> {
        CharacterRepositoryImpl(get())
    }

    single<EpisodeRepository> {
        EpisodeRepositoryImpl(get())
    }
}
