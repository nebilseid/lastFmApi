package com.example.lastfmapi.home

import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lastfmapi.R
import com.example.lastfmapi.model.Track
import com.example.lastfmapi.model.TrackMatches
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.track_item.view.*


class TrackAdapter : RecyclerView.Adapter<TrackAdapter.TrackViewHolder>() {


    private val data = arrayListOf<Track>()


    fun setData (items: List<Track>){
        data.clear()
        data.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackViewHolder {
        val rootView = LayoutInflater.from(parent.context)
            .inflate(R.layout.track_item, parent,false)
        return TrackViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(viewHolder:TrackViewHolder, position: Int) {
        viewHolder.bind(data[position])

    }



    class TrackViewHolder (val view: View): RecyclerView.ViewHolder(view){
        fun bind (response: Track){

            view.tvArtist.text = response.artist
            view.tvName.text = response.name

            val thumbnail: String? = response.image[1]?.text.toString()
           // Picasso.get().load(thumbnail).into(view.ivTrack)

           // Picasso.get().load(response.image.component1().text).into(view.ivTrack)

        }
    }}