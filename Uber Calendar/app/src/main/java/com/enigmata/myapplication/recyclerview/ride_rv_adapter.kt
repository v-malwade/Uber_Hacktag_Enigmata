package com.enigmata.myapplication.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.enigmata.myapplication.R
import java.util.ArrayList


class ride_rv_adapter() : RecyclerView.Adapter<RideViewHolder>() {

    var myRides = ArrayList<ride_rv_dc>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RideViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,parent,false)
        Log.d("CLF","RV code is ok")
        return RideViewHolder(view)
    }

    override fun onBindViewHolder(holder: RideViewHolder, position: Int) {
        var ride = myRides[position]
        Log.d("CLF","RV code is ok")
        holder.rideName.text = ride.rideName

//        val action = CategoryListFragmentDirections.actionCategoryListFragmentToCategoryExpenseFragment(category.categoryName)
//        holder.category_cv.setOnClickListener {
//            holder.itemView.findNavController().navigate(action)
//        }
        holder.parent.setOnClickListener {
            holder.itemView.findNavController().navigate(R.id.action_scheduleFragment_to_myRideFragment)
        }
    }

    override fun getItemCount(): Int {
        myRides = arrayListOf(
           ride_rv_dc("My ride 1"),
            ride_rv_dc("My ride 2"),
            ride_rv_dc("My ride 3"),
            ride_rv_dc("My ride 4"),
            ride_rv_dc("My ride 5"),
            ride_rv_dc("My ride 6"),
            ride_rv_dc("My ride 7"),
            ride_rv_dc("My ride 8"),
            ride_rv_dc("My ride 9"),
            ride_rv_dc("My ride 10"),
            ride_rv_dc("My ride 11"),
            ride_rv_dc("My ride 12")
        )
//        Log.d("CLF","getItemCount is ok ${categories.size}")
        return myRides.size
    }


    //This function can be used to update data of recycler view after any change in DB
    fun updateRV(myRides: ArrayList<ride_rv_dc>) {
        Log.d("CLF","update is called")
        myRides.clear()
        myRides.addAll(myRides)
        notifyDataSetChanged()
    }

}
class RideViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val rideName = itemView.findViewById<TextView>(R.id.rideName)
    val parent = itemView.findViewById<CardView>(R.id.parentCardRv)
}
