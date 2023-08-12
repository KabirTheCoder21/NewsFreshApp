package com.example.newsfresh.mappers

import com.example.newsfresh.data.model.ArticleDTO
import com.example.newsfresh.domain.model.Article


fun List<ArticleDTO>.toDomain():List<Article>{
    return map{
        Article(
            content = it.content?:"",
            description = it.description?:"",
            title = it.title?:"",
            urlToImage = it.urlToImage?:""
        )
    }
}