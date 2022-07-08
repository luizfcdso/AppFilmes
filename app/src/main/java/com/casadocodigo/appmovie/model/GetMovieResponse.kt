package com.casadocodigo.appmovie.model

import com.google.gson.annotations.SerializedName

data class GetMovieResponse(
    val page: Int,
    @SerializedName("results") val movies: List<Movie>,
    @SerializedName("total_pages") val pages: Int
)
