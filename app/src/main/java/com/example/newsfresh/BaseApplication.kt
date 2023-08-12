package com.example.newsfresh

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//Annotating our Application class with this to automatically generate the necessary Dagger components.
@HiltAndroidApp
class BaseApplication : Application() {
}