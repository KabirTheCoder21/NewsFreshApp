package com.example.newsfresh.presentation.Screens

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberImagePainter
import com.example.newsfresh.domain.model.Article
import com.example.newsfresh.presentation.viewModel.NewsViewModel

@Composable
fun HomeScreen(viewModel : NewsViewModel = hiltViewModel()){
    val res = viewModel.articles.value
    if(res.isLoading)
    {
        Box(modifier = Modifier.fillMaxSize()){
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
    if(res.error.isNotBlank())
    {
        Box(modifier = Modifier.fillMaxSize())
        {
            Text(text = res.error, modifier = Modifier.align(Alignment.Center))
        }
    }
    res.data?.let {
        LazyColumn{
            items(it){
                ArticleItem(it)
            }
        }
    }
}

@Composable
fun ArticleItem(it: Article) {
Column(modifier = Modifier) {
    Image(painter = rememberImagePainter(data = it.urlToImage), contentDescription = null,
    modifier = Modifier
        .height(300.dp)
        .fillMaxWidth(),
    contentScale = ContentScale.Crop)
    Text(text = it.title, style = TextStyle(color = Color.Gray, fontWeight = FontWeight.SemiBold
    , fontSize = 20.sp),
    modifier = Modifier.padding(12.dp))
}

}
