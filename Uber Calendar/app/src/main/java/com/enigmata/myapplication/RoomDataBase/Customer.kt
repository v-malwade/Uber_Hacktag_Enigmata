package com.enigmata.myapplication.RoomDataBase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("Customers_table")
data class Customer(
    @PrimaryKey(autoGenerate = true)
    val CustomerId : Int,
    val name : String
)
