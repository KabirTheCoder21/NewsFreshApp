package com.example.newsfresh.domain.use_case

import com.example.newsfresh.domain.model.Article
import com.example.newsfresh.domain.repository.GetNewsArticle
import com.example.newsfresh.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetNewsArticleUseCase @Inject constructor(private val getNewsArticle: GetNewsArticle) {
    operator fun invoke(): Flow<Resource<List<Article>>> = flow{
        emit(Resource.Loading(""))
         try{
            emit(Resource.Success(getNewsArticle.getNewsArticle()))
        }catch (e:Exception){
            emit(Resource.Error(e.message))
        }
    }
}