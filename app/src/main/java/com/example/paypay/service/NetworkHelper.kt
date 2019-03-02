package com.example.paypay.service

import android.content.Context
import com.example.paypay.R
import com.example.paypay.util.API_KEY
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import com.google.gson.FieldNamingPolicy
import com.example.paypay.dto.RateResponse
import com.example.paypay.ui.pojo.RateItem
import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonToken
import com.google.gson.stream.JsonWriter
import java.math.BigDecimal


const val BASE_URL = "http://apilayer.net/api/"

class NetworkHelper() {

    var currencylayerService: CurrencylayerService

    init {
        val create = GsonConverterFactory.create(createGson())
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(create)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        currencylayerService = retrofit.create(CurrencylayerService::class.java)
    }

    companion object {
        val instance = NetworkHelper()
        fun createGson(): Gson {
            return GsonBuilder()
                    .registerTypeAdapter(RateResponse::class.java, RateItemTypeAdapter())
                    .enableComplexMapKeySerialization()
                    .serializeNulls()
                    .setPrettyPrinting()
                    .create()
        }
    }
}

class RateItemTypeAdapter : TypeAdapter<RateResponse>() {
    override fun write(out: JsonWriter, value: RateResponse) {
        out.beginObject()
        out.name("success").value(value.success)
        out.name("source").value(value.source)
        out.name("quotes").value(value.quotes.toString())
        out.endObject()
    }

    override fun read(reader: JsonReader): RateResponse {
        val rateResponse = RateResponse()
        reader.beginObject()
        val quotes = mutableListOf<RateItem>()
        while (reader.hasNext()) {
            val name = reader.nextName()
            when (name) {
                "success" -> rateResponse.success = reader.nextBoolean()
                "source" -> rateResponse.source = reader.nextString()
                "quotes" -> {
                    reader.beginObject()
                    while (reader.hasNext()) {
                        val field = reader.nextName()
                        val value = reader.nextString()
                        quotes.add(RateItem(field, BigDecimal(value)))
                    }
                    reader.endObject()
                    rateResponse.quotes = quotes
                }
                else -> reader.skipValue()
            }
        }
        reader.endObject()
        return rateResponse
    }

}
