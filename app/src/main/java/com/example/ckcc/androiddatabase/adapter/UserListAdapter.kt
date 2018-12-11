package com.example.ckcc.androiddatabase.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.ckcc.androiddatabase.ProfileActivity
import com.example.ckcc.androiddatabase.R
import com.example.ckcc.androiddatabase.adapter.UserListAdapter.ViewHolder
import com.example.ckcc.androiddatabase.model.User
import java.io.Serializable

class UserListAdapter(private val list: ArrayList<User>, private val context: Context) : RecyclerView.Adapter<ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {

        var view = LayoutInflater.from(context).inflate(R.layout.user_list_row, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder!!.bindItemView(list[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItemView(user: User){

            var fullname = itemView.findViewById<TextView>(R.id.tvFullName)
            var email = itemView.findViewById<TextView>(R.id.tvEmail)

            fullname.text = "Name : "+ user.lastName + " " + user.firstName
            email.text = "Email : " + user.Email

            itemView.setOnClickListener {

                var intent = Intent(context, ProfileActivity::class.java)
                intent.putExtra("user", user)
                context.startActivity(intent)
            }
        }

    }
}