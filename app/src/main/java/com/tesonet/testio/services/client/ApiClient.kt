package com.tesonet.testio.services.client

import com.tesonet.testio.services.data.server.Server
import com.tesonet.testio.services.data.token.Token
import com.tesonet.testio.services.data.user.RequestUser
import io.reactivex.Single
import retrofit2.http.*

interface ApiClient {

    @Headers(CONTENT_TYPE)
    @POST("v1/tokens")
    fun requestUserToken(@Body requestUser: RequestUser): Single<Token>

    @GET("v1/servers")
    fun fetchServers(@Header("Authorization") token: String): Single<List<Server>>

    companion object {
        private const val CONTENT_TYPE: String = "Content-Type: application/json"
    }
}