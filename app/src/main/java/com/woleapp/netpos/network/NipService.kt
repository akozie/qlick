package com.woleapp.netpos.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NipService {
    @GET("api/nip-notifications")
    fun getEndOfDayNotifications(
        @Query("terminalId") terminalId: String,
        @Query("from") from: String,
        @Query("to") to: String
    ): Single<Any>

    @GET("api/nip-notifications")
    fun getLastTwoTransfers(@Query("terminalId") terminalId: String): Single<Any>

    @GET("api/nip-notifications")
    fun getNotificationByReference(@Query("referenceNo") referenceNo: String): Single<Any>
}