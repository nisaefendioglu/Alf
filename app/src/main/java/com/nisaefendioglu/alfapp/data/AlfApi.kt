package com.nisaefendioglu.alfapp.data

import retrofit2.http.GET

interface AlfApi {

    @GET("/randomalf")
    suspend fun getRandomAlf(): Alf

    companion object {
        const val BASE_URL = "http://192.168.1.33:8100"
    }
}