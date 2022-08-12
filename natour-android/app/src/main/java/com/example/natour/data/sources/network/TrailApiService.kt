package com.example.natour.data.sources.network

import com.example.natour.data.dto.TrailDto
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.*

interface TrailApiService {

    @Multipart
    @POST("/trail")
    suspend fun save(
        @Part("idOwner")            idOwner: RequestBody,
        @Part("trailName")          trailName: RequestBody,
        @Part("trailDifficulty")    trailDifficulty: RequestBody,
        @Part("trailDuration")      trailDuration: RequestBody,
        @Part("trailDescription")   trailDescription: RequestBody,
        @Part("routePoints")        routePoints: RequestBody,
        @Part                       image: MultipartBody.Part
    ): Boolean

    @GET("/trail/{page}")
    suspend fun getTrails(@Path("page") page: Int): List<TrailDto>
}