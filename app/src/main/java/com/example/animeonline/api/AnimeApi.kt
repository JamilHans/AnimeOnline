package com.example.animeonline.api

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface AnimeApi {
    @GET("edge/anime")
    fun getAnimes(): Call<AnimeResponse>
}

object Retrofit2ApiManager {
    fun getApi(): AnimeApi {
        return Retrofit.Builder()
            .baseUrl("https://kitsu.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AnimeApi::class.java)
    }
}