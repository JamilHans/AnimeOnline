package com.example.animeonline.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animeonline.R
import com.example.animeonline.adapter.AnimeAdapter
import com.example.animeonline.data.Anime
import com.example.animeonline.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpAnimes()
    }

    private fun setUpAnimes() {
        val animes = listOf(
            Anime(
                1,
                "https://media.kitsu.io/anime/poster_images/1/small.jpg",
                "anime",
                "Cowboy Bebop",
            ),
            Anime(
                1,
                "https://media.kitsu.io/anime/poster_images/2/medium.jpg",
                "anime",
                "Cowboy Bebop",
            ),
            Anime(
                1,
                "https://media.kitsu.io/anime/poster_images/1/small.jpg",
                "anime",
                "Cowboy Bebop",
            ),
            Anime(
                1,
                "https://media.kitsu.io/anime/poster_images/1/small.jpg",
                "anime",
                "Cowboy Bebop",
            ),
            Anime(
                1,
                "https://media.kitsu.io/anime/poster_images/1/small.jpg",
                "anime",
                "Cowboy Bebop",
            ),
            Anime(
                1,
                "https://media.kitsu.io/anime/poster_images/2/medium.jpg",
                "anime",
                "Cowboy Bebop",
            ),
            Anime(
                1,
                "https://media.kitsu.io/anime/poster_images/1/small.jpg",
                "anime",
                "Cowboy Bebop",
            ),
            Anime(
                1,
                "https://media.kitsu.io/anime/poster_images/1/small.jpg",
                "anime",
                "Cowboy Bebop",
            )
        )
        val adapter = AnimeAdapter(animes)
        binding.recyclerViewAnimeList.adapter = adapter
    }
}