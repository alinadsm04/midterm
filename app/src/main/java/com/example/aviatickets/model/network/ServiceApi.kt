package com.example.aviatickets.model.network

import com.example.aviatickets.model.entity.Offer
import retrofit2.http.GET

interface ServiceApi {
    @GET("offer_list")
    suspend fun getData(): List<Offer>
}