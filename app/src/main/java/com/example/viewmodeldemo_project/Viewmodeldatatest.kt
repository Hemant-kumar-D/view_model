package com.example.viewmodeldemo_project

import androidx.lifecycle.ViewModel

   class Viewmodeldatatest:ViewModel() {
    var count:Int=0
    fun totalcount(){
         count++
    }

}