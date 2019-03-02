package com.example.paypay.ui.currencylist

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.paypay.R
import com.example.paypay.base.BaseFragment
import com.example.paypay.ui.CurrencyListViewModel
import kotlinx.android.synthetic.main.fragment_currency_list.*

class CurrencyListFragment : BaseFragment<CurrencyListViewModel>() {
    lateinit var currencyListAdapter: CurrencyListAdapter
    override fun getInflateView() = R.layout.fragment_currency_list

    override fun getViewModel() = ViewModelProviders.of(this).get(CurrencyListViewModel::class.java)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_currency_list, container, false)
    }

    override fun bindViews() {
        dialog.show()
        currencyListAdapter = CurrencyListAdapter(activity!!) {
            val navController = Navigation.findNavController(activity!!, R.id.nav_host_fragment)
            val directions = CurrencyListFragmentDirections.actionCurrencyListFragmentToRateDetailFragment(it.code)
            navController.navigate(directions)
        }
        tvSelectCurrency.setOnClickListener {

        }
        rvCurrency.adapter = currencyListAdapter
    }



    override fun bindModel() {
        getViewModel().getCurrencyOnline()
        getViewModel().currencyList.observe(this, Observer {
            dialog.dismiss()
            when (it) {
                CurrencyListViewModel.CurrencyState.SUCCESS -> {
                    it.currencyList?.let {
                        currencyListAdapter.updateItems(it)
                    }
                }
                CurrencyListViewModel.CurrencyState.ERROR -> {
                    Toast.makeText(activity, it.error, Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
}