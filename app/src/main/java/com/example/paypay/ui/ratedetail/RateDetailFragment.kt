package com.example.paypay.ui.ratedetail

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.work.Data
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequest
import androidx.work.WorkManager
import com.example.paypay.R
import com.example.paypay.base.BaseFragment
import com.example.paypay.ui.CurrencyListViewModel
import com.example.paypay.util.RateWorker
import kotlinx.android.synthetic.main.fragment_rate_detail.*
import java.util.*
import java.util.concurrent.TimeUnit

class RateDetailFragment : BaseFragment<CurrencyListViewModel>() {
    lateinit var currencyCode: String
    lateinit var rateListAdapter: RateListAdapter
    lateinit var workerId: UUID
    companion object {
        const val WORKER_TAG = "rateWorker"
    }

    override fun getViewModel(): CurrencyListViewModel {
        return ViewModelProviders.of(activity!!).get(CurrencyListViewModel::class.java)

    }

    override fun getInflateView() = R.layout.fragment_rate_detail

    override fun bindViews() {
        dialog.show()
        arguments?.let {
            currencyCode = RateDetailFragmentArgs.fromBundle(it).currentcyCode
        }
        rateToolBar.setNavigationOnClickListener {
            activity?.onBackPressed()
        }

        rateToolBar.title = getString(R.string.fragment_rate_detail_header, currencyCode.toUpperCase())

        rateListAdapter = RateListAdapter(activity!!)
        rvRate.adapter = rateListAdapter
        WorkManager.getInstance().cancelAllWorkByTag(WORKER_TAG)
        val data = Data.Builder().putString("sourceBase", currencyCode).build()
        val rateRequestWorker = PeriodicWorkRequest.Builder(RateWorker::class.java, 10, TimeUnit.SECONDS)
                .addTag(WORKER_TAG)
                .setInputData(data)
                .build()

        workerId = rateRequestWorker.id
        WorkManager.getInstance().enqueueUniquePeriodicWork(workerId.toString(), ExistingPeriodicWorkPolicy.KEEP, rateRequestWorker)
    }

    override fun bindModel() {
        WorkManager.getInstance().getWorkInfoByIdLiveData(workerId).observe(this, Observer {
            it?.let {
                Toast.makeText(activity, "Reload data with $currencyCode", Toast.LENGTH_LONG).show()
            }
        })
        getViewModel().getExchangeRateBaseOn(currencyCode).observe(this, Observer {
            dialog.dismiss()
            it?.let {
                rateListAdapter.updateItems(it.list)
            }
        })
        getViewModel().rateList.observe(this, Observer {
            dialog.dismiss()
            when (it) {
                CurrencyListViewModel.RateState.ERROR -> {
                    Toast.makeText(activity, it.error, Toast.LENGTH_LONG).show()
                }
            }

        })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_rate_detail, container, false)
    }

    override fun onDestroy() {
        WorkManager.getInstance().cancelWorkById(workerId)
        super.onDestroy()
    }
}