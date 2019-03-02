package com.example.paypay.base

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.paypay.R

abstract class BaseFragment<T> : Fragment() {
    abstract fun getViewModel(): T
    abstract fun getInflateView(): Int
    abstract fun bindViews()
    abstract fun bindModel()
    lateinit var dialog: Dialog
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createDialog()
        bindViews()
        bindModel()
    }

    private fun createDialog() {
        dialog = Dialog(activity!!)
        val resId = dialog.context.resources.getIdentifier("android:id/titleDivider", null, null)
        dialog.findViewById<View>(resId)?.visibility = View.GONE
        dialog.setContentView(R.layout.dialog_loading)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setCancelable(false)
    }

}