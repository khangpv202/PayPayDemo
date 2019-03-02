package com.example.paypay

import android.app.Application

class CurrenyApp : Application() {
    companion object {
        private var instance: CurrenyApp? = null
        fun getContext(): CurrenyApp {
            return instance!!
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }


}