package com.test.mvvmwithretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.test.mvvmwithretrofit.api.ApiInterface
import com.test.mvvmwithretrofit.api.ApiUtilities
import com.test.mvvmwithretrofit.repository.MemesRepository
import com.test.mvvmwithretrofit.viewmodel.MemesViewModel
import com.test.mvvmwithretrofit.viewmodel.MemesViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var memesViewModel: MemesViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiInterface = ApiUtilities.getInstance().create(ApiInterface::class.java)
        val memesRepository = MemesRepository(apiInterface)

        memesViewModel = ViewModelProvider(this,MemesViewModelFactory(memesRepository)).get(MemesViewModel::class.java)
        memesViewModel.memes.observe(this) {
//            it.data.memes?.iterator()?.forEach {
//                Log.d("Test", "name : ${it.name}\nimage : ${it.url}")
//            }
            Log.d("Test","onCreate : ${it.toString()}")
        }
    }
}