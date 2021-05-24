package com.example.insta

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.messages.view.*
import model.Message
import model.story


class MsgRecyclerAdapter (val context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<Message> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MsgRecyclerAdapter.MsgViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.messages, parent, false), context
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is MsgRecyclerAdapter.MsgViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

        override fun getItemCount(): Int {
            return items.size
        }

        fun submitList(blogList: List<Message>) {
            items = blogList
        }


        class MsgViewHolder constructor(
            itemView: View, val context: Context
        ) : RecyclerView.ViewHolder(itemView) {
            val msgImage = itemView.msg_img
            val msgName = itemView.msg_name
            val msg = itemView.msg

            fun bind(message: Message) {
                msgName.setText(message.msg_name)
                msg.setText(message.msg)


                Glide.with(context)
                    .load(message.msg_image)
                    .into(msgImage)
            }
        }
}