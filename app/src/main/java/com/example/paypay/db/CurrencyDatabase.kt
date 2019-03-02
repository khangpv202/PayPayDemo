package com.example.paypay.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.paypay.CurrenyApp
import com.example.paypay.db.dao.RateDao
import com.example.paypay.db.entity.RateEntity

@Database(entities = arrayOf(RateEntity::class), version = 1)
@TypeConverters(Converters::class)
abstract class CurrencyDatabase : RoomDatabase() {
    abstract fun rateDao(): RateDao

    companion object {
        private var instance: CurrencyDatabase? = null
        fun getInstance(): CurrencyDatabase {
            if (instance == null) {
                synchronized(CurrencyDatabase::class) {
                    instance = Room.databaseBuilder(CurrenyApp.getContext().applicationContext, CurrencyDatabase::class.java, "currencyDatabase")
                            .build()
                }
            }
            return instance!!
        }

    }
}