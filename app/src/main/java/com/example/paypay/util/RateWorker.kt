package com.example.paypay.util

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.paypay.repository.CurrencyRepository

class RateWorker(context: Context, params: WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {
        Log.e("worker", "worker====")
        val sourceBase = inputData.getString("sourceBase")
        sourceBase?.let {
            Log.e("worker", "data: $it")
            CurrencyRepository.instance.getExchangeRateOnline(it)
                    .subscribe({
                        Log.e("worker", "sucessr====")
                    }, {
                        Log.e("worker", "error ====")
                    })

        }
        return Result.retry()
    }
}