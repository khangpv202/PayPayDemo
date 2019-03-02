package com.example.paypay.util

import androidx.lifecycle.AndroidViewModel
import com.example.paypay.base.BaseActivity
import com.example.paypay.base.BaseViewModel
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable


fun Disposable.addTo(androidViewModel: BaseViewModel){
    androidViewModel.getDispose().add(this)
}