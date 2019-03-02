package com.example.paypay.base

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel(val context: Application) : AndroidViewModel(context) {
    private val compositeDisposable = CompositeDisposable()

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }

    fun getDispose(): CompositeDisposable {
        return compositeDisposable
    }
}