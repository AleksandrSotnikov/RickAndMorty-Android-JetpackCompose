package com.ronasit.feature.rickandmorty_impl

import com.ronasit.feature.rickandmorty_api.repository.*
import com.ronasit.feature.rickandmorty_api.usecase.*
import com.ronasit.feature.rickandmorty_impl.network.getRickAndMortyService
import com.ronasit.feature.rickandmorty_impl.repository.*
import kotlinx.serialization.ExperimentalSerializationApi
import org.koin.dsl.module

@ExperimentalSerializationApi
val rickAndMortyModule = module {
    single { getRickAndMortyService() }

    single { GetCharacterDetailUseCase(get()) }
    single { GetCharacterListUseCase(get()) }
    single { GetCharactersUseCase(get()) }

    single { GetLocationsUseCase(get()) }
    single { GetLocationUseCase(get()) }

    single { GetEpisodeDetailUseCase(get()) }
    single { GetEpisodesUseCase(get()) }
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
