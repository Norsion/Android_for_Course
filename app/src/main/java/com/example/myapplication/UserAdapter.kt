package com.example.myapplication

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class UserAdapter(var users: List<User>) : RecyclerView.Adapter<UserAdapter.UserHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val inflatedView = parent.inflate(R.layout.activity_main, false)
        return UserHolder(inflatedView)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: RecyclerView, position: Int) {
        var imageUrl = users[position]
        holder?.updateWithUrl(imageUrl)
    }

    class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {


        private val myImageView: ImageView = itemView.findViewById(R.id.imageView)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(itemView: View) {

        }


        fun updateWithUrl(url: String) {
            Picasso.with(itemView.context).load(url).into(myImageView)

        }

    }
}