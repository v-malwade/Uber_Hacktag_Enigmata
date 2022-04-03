package com.enigmata.myapplication.RoomDataBase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CustomerDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addCustomer(customer : Customer)

    @Query("SELECT * FROM Customers_table ORDER BY CustomerId ASC")
    fun readAllData() : LiveData<List<Customer>>
}