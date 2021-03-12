package com.example.submisisionandroidpemula

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_list_singer.view.*

class SingerAdapter (private val list: ArrayList<Singer>) : RecyclerView.Adapter<SingerAdapter.SingerViewHolder>() {
    private lateinit var imgView : ImageView
    private var onItemClickCallback : OnItemClickCallback? = null

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class SingerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(singer: Singer) {
            with(itemView){
                imgView = itemView.findViewById(R.id.img_singer)
                Picasso.get().load(singer.images).into(imgView)
                tv_singer.text = singer.singer
                tv_genre.text = singer.genre
                tv_active.text = singer.active
                tv_description.text = singer.desc

                itemView.setOnClickListener {
                    onItemClickCallback?.onItemClicked(singer)
                }
            }
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_list_singer,parent,false)
        return SingerViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: SingerViewHolder, position: Int) {
        holder.bind(list[position])
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Singer)
    }
}