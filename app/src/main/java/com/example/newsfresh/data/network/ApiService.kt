package com.example.newsfresh.data.network

import com.example.newsfresh.data.model.NewsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.nio.channels.spi.AbstractSelectionKey

interface ApiService {
    //https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=104d3905eeac4a939943f8c67ac0fd61
    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country : String = "us",
        @Query("apiKey") apiKey: String = "104d3905eeac4a939943f8c67ac0fd61"
    ) : Response<NewsDTO>
}