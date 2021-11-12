package com.example.animeonline.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.animeonline.data.Anime
import com.example.animeonline.databinding.ItemAnimeBinding

class AnimeAdapter(val animeList: List<Anime>) : RecyclerView.Adapter<AnimeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAnimeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(animeList[position])
    }

    override fun getItemCount(): Int = animeList.size

    class ViewHolder(val itemAnime: ItemAnimeBinding) : RecyclerView.ViewHolder(itemAnime.root) {
        fun bind(anime: Anime) {
            Glide.with(itemView)
                .load(anime.urlImage)
                .transform(RoundedCorners(20))
                .into(itemAnime.imageViewAnimeImage)
            itemAnime.textViewAnimeTitle.text = anime.title
            itemAnime.textViewAnimeType.text = anime.type
        }
    }
}