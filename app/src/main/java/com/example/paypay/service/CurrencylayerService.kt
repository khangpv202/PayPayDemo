package com.example.paypay.service

import android.database.Observable
import com.example.paypay.dto.CurrenciesResponse
import com.example.paypay.dto.RateResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencylayerService {
    @GET("list?")
    fun getCurrencyList(@Query("access_key") access_key: String): Single<CurrenciesResponse>

    @GET("live?")
    fun getExchangeRateBaseOn(@Query("access_key") access_key: String/*, @Query("source") source: String*/): Single<RateResponse>
}