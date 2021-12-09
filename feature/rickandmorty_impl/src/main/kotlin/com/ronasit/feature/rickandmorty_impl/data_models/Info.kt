package com.ronasit.feature.rickandmorty_impl.data_models

import kotlinx.serialization.Serializable

@Serializable
data class Info(
    val count: Int,
    val next: String?,
    val pages: Int,
    val prev: String?
)
