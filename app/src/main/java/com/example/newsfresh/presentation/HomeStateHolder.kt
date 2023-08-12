package com.example.newsfresh.presentation

import com.example.newsfresh.domain.model.Article

data class HomeStateHolder(
    val isLoading : Boolean = false,
    val data : List<Article>?=null,
    val error : String = ""
)
