package com.example.paypay.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import io.reactivex.disposables.CompositeDisposable

public abstract class BaseActivity<T> : AppCompatActivity() {
    abstract fun getViewModel(): T
    abstract fun getInflateView(): Int
    abstract fun bindViews()
    abstract fun bindModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getInflateView())
        bindViews()
        bindModel()
    }
}