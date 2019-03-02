package com.example.paypay.ui.pojo

import java.math.BigDecimal

data class CurrencyItem(val code: String, val name: String)

data class RateItem(val code: String, val value: BigDecimal)