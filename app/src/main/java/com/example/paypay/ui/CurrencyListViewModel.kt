package com.example.paypay.ui

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.paypay.base.BaseViewModel
import com.example.paypay.db.entity.RateEntity
import com.example.paypay.dto.Currencies
import com.example.paypay.repository.CurrencyRepository
import com.example.paypay.ui.pojo.CurrencyItem
import com.example.paypay.ui.pojo.RateItem
import com.example.paypay.util.addTo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlin.reflect.full.memberProperties


class CurrencyListViewModel(application: Application) : BaseViewModel(application) {
    val currencyList = MutableLiveData<CurrencyState>()
    val rateList = MutableLiveData<RateState>()

    enum class CurrencyState {
        SUCCESS, ERROR;

        var currencyList: List<CurrencyItem>? = null
        var error: String? = null
    }

    enum class RateState {
        SUCCESS, ERROR;

        var rateList: List<RateItem>? = null
        var error: String? = null
    }

    fun getCurrencyOnline() {
        CurrencyRepository.instance.getCurrencyOnline()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ currency ->
                    currencyList.value = CurrencyState.SUCCESS.apply {
                        val result = mutableListOf<CurrencyItem>()
                        Currencies::class.memberProperties.forEach {
                            val name = it.get(currency!!).toString()
                            result.add(CurrencyItem(it.name, name))
                        }
                        currencyList = result
                    }
                }, {
                    currencyList.value = CurrencyState.ERROR.apply {
                        error = "Feed data error, sorry"
                    }
                }).addTo(this)

    }

    fun getExchangeRateBaseOn(currencyCode: String): LiveData<RateEntity> {
//        getExchangeRateOnlineBaseOn(currencyCode)
        return getExchangeRateOfflineBaseOn(currencyCode)
    }

    fun getExchangeRateOfflineBaseOn(currencyCode: String): LiveData<RateEntity> {
        return CurrencyRepository.instance.getExchangeRateOffLIne(currencyCode)
    }
//worker is called for the first time,so we dont need to call this
    private fun getExchangeRateOnlineBaseOn(currencyCode: String) {
        CurrencyRepository.instance.getExchangeRateOnline(currencyCode)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                }, {
                    rateList.value = RateState.ERROR.apply {
                        error = "Feed data error, sorry"
                    }
                }).addTo(this)
    }

}