package com.enigmata.myapplication.RoomDataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.lang.NullPointerException

@Database(entities = [Customer :: class], version = 1, exportSchema = false  )
abstract class CustomerDataBase : RoomDatabase() {

    abstract fun CustomerDao(): CustomerDao

    companion object{
        @Volatile
        private var INSTANCE: CustomerDataBase? = null

        fun getDataBase(context: Context): CustomerDataBase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }else{
                synchronized(this){
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        CustomerDataBase::class.java,
                    "Customer_database"
                    ).build()
                    INSTANCE = instance
                    return instance
                }
            }

        }
    }
}