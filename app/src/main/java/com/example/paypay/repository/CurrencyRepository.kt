package com.example.paypay.repository

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import com.example.paypay.db.CurrencyDatabase
import com.example.paypay.db.entity.RateEntity
import com.example.paypay.dto.Currencies
import com.example.paypay.service.NetworkHelper
import com.example.paypay.ui.pojo.RateItem
import com.example.paypay.util.API_KEY
import io.reactivex.Single


class CurrencyRepository {
    @SuppressLint("CheckResult")
    fun getCurrencyOnline(): Single<Currencies?> {
        return NetworkHelper.instance.currencylayerService.getCurrencyList(API_KEY)
                .map { it ->
                    it.currencies
                }
    }

    fun getExchangeRateOnline(source: String): Single<List<RateItem>?> {
        return NetworkHelper.instance.currencylayerService.getExchangeRateBaseOn(API_KEY/*, source*/)
                .map { it ->
                    it.quotes
                }.doAfterSuccess { quote ->
                    val rateDao = CurrencyDatabase.getInstance().rateDao()
                    val rateEntity = rateDao.findExistBySourceBase(source)
                    rateEntity?.let {
                        rateDao.update(RateEntity(source, quote!!))
                    } ?: kotlin.run {
                        rateDao.insert(RateEntity(source, quote!!))
                    }
                }
    }

    fun getExchangeRateOffLIne(code: String): LiveData<RateEntity> {
        val rateDao = CurrencyDatabase.getInstance().rateDao()
        return rateDao.findBySourceBaseLiveData(code)
    }

    companion object {
        val instance = CurrencyRepository()
    }
}
