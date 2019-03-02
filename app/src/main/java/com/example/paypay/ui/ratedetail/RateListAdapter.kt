package com.example.paypay.ui.ratedetail

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.paypay.R
import com.example.paypay.ui.pojo.CurrencyItem
import com.example.paypay.ui.pojo.RateItem
import kotlinx.android.synthetic.main.item_fragment_rate_detail.view.*

class RateListAdapter(val context: Context) : RecyclerView.Adapter<RateListAdapter.CurrencyHolder>() {
    var list = listOf<RateItem>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_fragment_rate_detail, parent, false)
        return CurrencyHolder(view)
    }

    override fun onBindViewHolder(holder: CurrencyHolder, position: Int) {
        val currencyItem = list[position]
        holder.tvRateCode.text = currencyItem.code.toUpperCase()
        holder.tvRateValue.text = currencyItem.value.toString()
//        holder.wholeView.setOnClickListener {
//        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun updateItems(newList: List<RateItem>) {
        this.list = newList
        notifyDataSetChanged()
    }

    class CurrencyHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvRateCode = view.tvRateCode
        val tvRateValue = view.tvRateValue
        val wholeView = view
    }
}