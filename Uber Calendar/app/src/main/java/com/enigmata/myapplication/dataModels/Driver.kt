package com.enigmata.myapplication.dataModels

data class Driver (
    // driver info
    var driver_id : Int = 0,
    var car_name : Int = 0,
    var car_no : String = "0",
    var driver_ph_no : Int = 0,

    // customer info
    var driver_booked_rides_id: ArrayList<Int>,
    var customer_name : String = "",
    // pickup and drop location info
    var customer_pick_long : Int = 0,
    var customer_pick_lat : Int = 0,
    var customer_drop_long : Int = 0,
    var customer_drop_lat : Int = 0,
    // pickup time
    var pickup_time : Int = 0
    )