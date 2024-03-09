package com.example.aviatickets.model.network

import android.util.Log
import com.example.aviatickets.model.entity.Offer
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://my-json-server.typicode.com/estharossa/fake-api-demo/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    /**
     * think about performing network request
     */

    suspend fun performRequest(): List<Offer>{
        val api = retrofit.create(ServiceApi::class.java)
        val res = api.getData()
        Log.e("TEST", res.toString())
        return res
    }
}