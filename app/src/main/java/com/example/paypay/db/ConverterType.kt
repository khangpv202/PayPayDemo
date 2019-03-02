package com.example.paypay.db

import androidx.room.TypeConverter
import com.example.paypay.ui.pojo.RateItem
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converters {
    companion object {
        val gson = Gson()
    }

    @TypeConverter
    fun fromStringToRateItemList(value: String?): List<RateItem>? {
        val type = object : TypeToken<List<RateItem>>() {}.type
        return value?.let { gson.fromJson(value, type) }
    }

    @TypeConverter
    fun rateItemListToString(value: List<RateItem>): String {
        return gson.toJson(value)
    }
}