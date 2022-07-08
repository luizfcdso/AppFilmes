package com.casadocodigo.appmovie.model


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIview {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "0ead691c9cbc0a7771698c0e7dd8a553",
        @Query("page") page: Int
    ): Call<GetMovieResponse>

    @GET("movie/top_rated")
    fun getTopRated(
        @Query("api_key") apiKey: String = "0ead691c9cbc0a7771698c0e7dd8a553",
        @Query("page") page: Int
    ): Call<GetMovieResponse>

    @GET("movie/upcoming")
    fun getUpcoming(
        @Query("api_key") apiKey: String = "0ead691c9cbc0a7771698c0e7dd8a553",
        @Query("page") page: Int
    ): Call<GetMovieResponse>
}