package com.enigmata.myapplication.dataModels

import java.util.*

data class Customer(
    // customer info
    val customer_id : Int = 0,
    val customer_name : String = "",
    // pickup and drop location info
    val customer_pick_long : Int = 0,
    val customer_pick_lat : Int = 0,
    val customer_drop_long : Int = 0,
    val customer_drop_lat : Int = 0,
    // pickup time
    val pickup_time : Int = 0
)
