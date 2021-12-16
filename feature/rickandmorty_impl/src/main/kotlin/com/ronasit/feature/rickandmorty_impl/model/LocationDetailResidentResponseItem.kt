package com.ronasit.feature.rickandmorty_impl.model

import com.ronasit.feature.rickandmorty_api.model.Character
import kotlinx.serialization.Serializable

@Serializable
data class LocationDetailResidentResponseItem(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)

fun LocationDetailResidentResponseItem.toDomain(): Character {
    return Character(id = id, name = name, imageUrl = image)
}
