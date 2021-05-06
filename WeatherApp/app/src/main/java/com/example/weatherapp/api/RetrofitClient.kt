package com.example.weatherapp.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    @Volatile
    private var RETROFIT_INSTANCE: Retrofit? = null
    const val BASE_URL = "https://private-anon-f2c3f7961f-allweather.apiary-mock.com/"

    fun getClient() : Retrofit {
        return RETROFIT_INSTANCE ?: synchronized(this) {
            val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
//            val builder = OkHttpClient.Builder()
//            builder.addInterceptor(interceptor)
            val client = OkHttpClient.Builder()
//                    .addInterceptor(interceptor)
                    .build()
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
            RETROFIT_INSTANCE = retrofit
            retrofit
        }
    }

    fun<T> getWeatherApi(service: Class<T>): T {
        return getClient().create(service)
    }


}