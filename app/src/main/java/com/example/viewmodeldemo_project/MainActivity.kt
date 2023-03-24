package com.example.viewmodeldemo_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
//import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewmodel:Viewmodeldatatest
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewmodel=ViewModelProvider(this).get(Viewmodeldatatest::class.java)

         binding.textSetdata.text=viewmodel.count.toString()
        binding.btnSubmit.setOnClickListener {
            viewmodel.totalcount()

            binding.textSetdata.text=viewmodel.count.toString()

        }

    }
}