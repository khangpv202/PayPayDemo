package com.example.paypay.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.paypay.ui.pojo.RateItem

@Entity
data class RateEntity (@PrimaryKey var sourceBase: String, var list: List<RateItem> )
