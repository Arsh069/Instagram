package com.example.insta
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.stories.view.*
import model.story
class StoryRecyclerAdapter (val context:Context):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<story> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return StoryViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.stories, parent, false),context
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is StoryViewHolder ->{
                holder.bind(items.get(position))
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    fun submitList(blogList: List<story>) {
        items = blogList
    }
    class StoryViewHolder constructor(
        itemView: View,val context: Context
    ) : RecyclerView.ViewHolder(itemView) {

        val storyImage = itemView.story_img //these are the id's inside the layout
        val storyName = itemView.story_name

        fun bind(story: story) {
            storyName.setText(story.story_name)


            Glide.with(context)
                .load(story.story_image)
                .into(storyImage)

        }
    }
}