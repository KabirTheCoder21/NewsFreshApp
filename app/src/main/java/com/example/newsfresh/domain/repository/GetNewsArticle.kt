package com.example.newsfresh.domain.repository

import com.example.newsfresh.domain.model.Article

interface GetNewsArticle {
    suspend fun getNewsArticle() : List<Article>
}