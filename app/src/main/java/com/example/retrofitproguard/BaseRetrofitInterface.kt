package com.example.retrofitproguard

import retrofit2.Response
import retrofit2.http.GET

interface BaseRetrofitInterface {

    suspend fun fetchData(): Response<Fact>

}

interface RandomRetrofitInterface: BaseRetrofitInterface {

    @GET("jokes/random")
    override suspend fun fetchData(): Response<Fact>

}

interface AnimalRetrofitInterface: BaseRetrofitInterface {

    @GET("jokes/random?category=animal")
    override suspend fun fetchData(): Response<Fact>

}