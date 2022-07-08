package com.casadocodigo.appmovie.model

import com.google.gson.annotations.SerializedName

data class Movie(

    //SerializedName é uma anotação para pegar como o nome está registrado no json da API
    @SerializedName("id") val id: Long,
    @SerializedName("title") val title: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("poster_path") val posterPath: String,
    @SerializedName("backdrop_path") val backdropPath: String,
    @SerializedName("vote_average") val rating: Float,
    @SerializedName("release_date") val releaseDate: String

)
