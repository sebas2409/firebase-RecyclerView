package com.watermelon.realtime_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.watermelon.realtime_recyclerview.databinding.UsersItemBinding

class Adapter(private val userList: ArrayList<User>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: UsersItemBinding= UsersItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvFirstName.text=userList[position].firstName
        holder.binding.tvLastName.text=userList[position].lastName
        holder.binding.tvAge.text=userList[position].age.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder( val binding: UsersItemBinding): RecyclerView.ViewHolder(binding.root){

    }
}