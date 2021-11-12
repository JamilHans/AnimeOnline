package com.example.animeonline.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.animeonline.adapter.AnimeAdapter
import com.example.animeonline.api.AnimeResponse
import com.example.animeonline.api.DataResponse
import com.example.animeonline.api.Retrofit2ApiManager
import com.example.animeonline.data.Anime
import com.example.animeonline.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpAnimes()
        //getAnimes()
    }

    private fun getAnimes() {

        try {
            Retrofit2ApiManager.getApi().getAnimes().enqueue(object : Callback<AnimeResponse> {
                override fun onResponse(
                    call: Call<AnimeResponse?>?,
                    response: Response<AnimeResponse?>
                ) {

                }

                override fun onFailure(call: Call<AnimeResponse?>?, t: Throwable?) {

                }
            })
        } catch (e: Exception) {
            Toast.makeText(applicationContext, e.toString(), Toast.LENGTH_SHORT).show()
        }
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
                2,
                "https://media.kitsu.io/anime/poster_images/2/medium.jpg",
                "anime",
                "Cowboy Bebop: The Movie",
            ),
            Anime(
                3,
                "https://media.kitsu.io/anime/poster_images/3/small.jpg",
                "anime",
                "Trigun",
            ),
            Anime(
                4,
                "https://media.kitsu.io/anime/poster_images/4/small.jpg",
                "anime",
                "Witch Hunter Robin",
            ),
            Anime(
                5,
                "https://media.kitsu.io/anime/poster_images/5/small.jpg",
                "anime",
                "Beet the Vandel Buster",
            ),
            Anime(
                6,
                "https://media.kitsu.io/anime/poster_images/6/small.jpg",
                "anime",
                "Eyeshield 21",
            ),
            Anime(
                7,
                "https://media.kitsu.io/anime/poster_images/7/small.jpg",
                "anime",
                "Honey and Clover",
            ),
            Anime(
                8,
                "https://media.kitsu.io/anime/poster_images/8/small.jpg",
                "anime",
                "Hungry Heart: Wild Striker",
            ),
            Anime(
                9,
                "https://media.kitsu.io/anime/poster_images/9/small.jpg",
                "anime",
                "Initial D Fourth Stage",
            ),
            Anime(
                10,
                "https://media.kitsu.io/anime/poster_images/10/small.jpg",
                "anime",
                "Monster",
            )


        )
        val adapter = AnimeAdapter(animes)
        binding.recyclerViewAnimeList.adapter = adapter
    }

}