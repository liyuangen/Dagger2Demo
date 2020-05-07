package com.li.dagger2demo

import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import javax.inject.Inject

class MainViewModel @Inject constructor(gson: Gson) : ViewModel() {
}