package com.test.mvvmwithretrofit.api

import com.test.mvvmwithretrofit.model.Jokes
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/get_memes")
    suspend fun getJokes(): Response<Jokes>
}