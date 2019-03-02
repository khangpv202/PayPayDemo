package com.example.paypay.ui.currencylist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.paypay.R
import com.example.paypay.ui.pojo.CurrencyItem
import kotlinx.android.synthetic.main.item_fragment_currency_list.view.*

class CurrencyListAdapter(val context: Context, val itemClick: (CurrencyItem) -> Unit) : RecyclerView.Adapter<CurrencyListAdapter.CurrencyHolder>() {
    var list = listOf<CurrencyItem>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_fragment_currency_list, parent, false)
        return CurrencyHolder(view)
    }

    override fun onBindViewHolder(holder: CurrencyHolder, position: Int) {
        val currencyItem = list[position]
        holder.tvCurrencyCode.text = currencyItem.code.toUpperCase()
        holder.tvDetail.text = currencyItem.name
        holder.wholeView.setOnClickListener {
            itemClick.invoke(currencyItem)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun updateItems(newList: List<CurrencyItem>) {
        this.list = newList
        notifyDataSetChanged()
    }

    class CurrencyHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvCurrencyCode = view.tvCurrencyCode
        val tvDetail = view.tvDetail
        val wholeView = view
    }
}