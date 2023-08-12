package com.example.newsfresh.data.repository

import com.example.newsfresh.data.network.ApiService
import com.example.newsfresh.domain.model.Article
import com.example.newsfresh.domain.repository.GetNewsArticle
import com.example.newsfresh.mappers.toDomain
import com.example.newsfresh.utils.SafeApiRequest
import javax.inject.Inject

class GetNewsRepoArticleImplementation @Inject constructor(private val apiService: ApiService):
    GetNewsArticle,SafeApiRequest(){

    override suspend fun getNewsArticle(): List<Article> {
        val response = safeApiRequest {
            apiService.getNewsArticles()
        }
        return response?.articles?.toDomain()!!
    }
}
