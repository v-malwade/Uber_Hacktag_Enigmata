package com.enigmata.myapplication.dataModels

data class Ride (
    // id
    val ride_id : Int = 0,
    val driver_id : Int = 0,
    val customer_id : Int = 0,
    // Ride times
    val ride_duration : Int = 0,
    val ride_start_time : Int = 0,
    // Ride locations
    val ride_start_loc_x : Int = 0,
    val ride_start_loc_y : Int = 0,
    val ride_end_loc_x : Int = 0,
    val ride_end_loc_y : Int =0
)