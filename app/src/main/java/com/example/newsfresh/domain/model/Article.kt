package com.example.newsfresh.domain.model

import com.example.newsfresh.data.model.SourceDTO

data class Article(
    val content: String,
    val description: String,
    val title: String,
    val urlToImage: String
)
