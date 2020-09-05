package dev.jahir.blueprint.data.requests

import dev.jahir.blueprint.data.models.LithiumResponse
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST


interface LithiumService {
    @Headers("Content-Type: application/json;charset=UTF-8", "Accept: application/json", "User-Agent: ayushm/icon-request")
    @POST("/lithium/requests")
    suspend fun uploadRequest(
        @Header("X-API-KEY") apiKey: String,
        @Body apps: String
    ): LithiumResponse
}