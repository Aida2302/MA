package com.google.firebase.quickstart.database.kotlin.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.quickstart.database.R
import com.google.firebase.quickstart.database.kotlin.models.Post
import kotlinx.android.synthetic.main.include_post_author.view.*
import kotlinx.android.synthetic.main.include_post_text.view.*
import kotlinx.android.synthetic.main.item_post.view.*

class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

  fun bindToPost(post: Post, starClickListener: View.OnClickListener) {
    itemView.postTitle.text = post.title
    itemView.postAuthor.text = post.author
    itemView.postNumStars.text = post.starCount.toString()
    itemView.postBody.text = post.body

    itemView.star.setOnClickListener(starClickListener)
  }

  fun setLikedState(liked: Boolean) {
    if (liked) {
      itemView.star.setImageResource(R.drawable.ic_toggle_star_24)
    } else {
      itemView.star.setImageResource(R.drawable.ic_toggle_star_outline_24)
    }
  }
}
