package com.example.insta

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.posts.view.*
import model.Post


class PostsRecyclerAdapter (val context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<Post> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PostsViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.posts,parent,false),context
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is PostsViewHolder ->{
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    fun submitList(blogList: List<Post>) {
        items = blogList
    }
    class PostsViewHolder constructor(
        itemView: View, val context: Context
    ) : RecyclerView.ViewHolder(itemView) {
        val accImage=itemView.acc_img
        val accName=itemView.post_name
        val postImage=itemView.post_img
        val liked=itemView.likes
        var bottomName=itemView.acc_name_bottom

        fun bind(Post:Post){
            accName.setText(Post.acc_name)
            liked.setText(Post.Likes)
            bottomName.setText(Post.acc_name_bottom)

            Glide.with(context)
                .load(Post.acc_logo).into(accImage)
            Glide.with(context)
                .load(Post.img).into(postImage)
        }
    }
}