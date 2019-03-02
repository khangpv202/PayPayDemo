package com.example.paypay.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.paypay.db.entity.RateEntity
import java.security.CodeSource

@Dao
interface RateDao {
    @Insert
    fun insert(rateEntity: RateEntity)

    @Update
    fun update(rateEntity: RateEntity)

    @Query("select * from rateentity where sourceBase=:source")
    fun findBySourceBaseLiveData(source: String): LiveData<RateEntity>

    @Query("select *  from rateentity where sourceBase=:source")
    fun findExistBySourceBase(source: String): RateEntity?
}