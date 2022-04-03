package com.enigmata.myapplication.RoomDataBase

import androidx.lifecycle.LiveData

class Repository(private val CustomerDao: CustomerDao) {
    val readAllData: LiveData<List<Customer>> = CustomerDao.readAllData()

    suspend fun addCustomer(customer: Customer){
        CustomerDao.addCustomer(customer)
    }
}