package com.enigmata.myapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.enigmata.myapplication.RoomDataBase.Customer
import com.enigmata.myapplication.RoomDataBase.CustomerDao
import com.enigmata.myapplication.RoomDataBase.CustomerDataBase
import com.enigmata.myapplication.RoomDataBase.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CustomerViewModel(application: Application) : AndroidViewModel(application){

    private val readAllData: LiveData<List<Customer>>
    private val repository: Repository

    init {
        val customerDao = CustomerDataBase.getDataBase(application).CustomerDao()
        repository = Repository(customerDao)
        readAllData = repository.readAllData
    }

    fun addCustomer(customer : Customer){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addCustomer(customer)
        }
    }

}