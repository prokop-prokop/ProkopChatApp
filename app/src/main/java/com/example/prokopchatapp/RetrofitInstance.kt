package com.example.prokopchatapp

import com.example.prokopchatapp.Constants.Constants
import com.example.prokopchatapp.`interface`.NotifacationApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitInstance {
    companion object{
        private val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val api by lazy {
            retrofit.create(NotifacationApi::class.java)
        }
    }
}