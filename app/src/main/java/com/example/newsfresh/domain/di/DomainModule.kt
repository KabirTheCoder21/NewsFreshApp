package com.example.newsfresh.domain.di

import com.example.newsfresh.data.network.ApiService
import com.example.newsfresh.data.repository.GetNewsRepoArticleImplementation
import com.example.newsfresh.domain.repository.GetNewsArticle
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent :: class)
@Module
object DomainModule {

    @Provides
    fun provideGetNewsRepo(apiService: ApiService): GetNewsArticle{
        return GetNewsRepoArticleImplementation(apiService = apiService)
    }
}