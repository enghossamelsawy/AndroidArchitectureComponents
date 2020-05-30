package com.example.androidarchitecturecomponents.base.remote

import com.example.androidarchitecturecomponents.BuildConfig
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val remoteModule = module {
    single { HttpLoggingInterceptor().level = HttpLoggingInterceptor.Level.BODY }
    single {
        val httpClient = OkHttpClient.Builder()
        httpClient.readTimeout(6, TimeUnit.SECONDS)
        httpClient.writeTimeout(6, TimeUnit.SECONDS)
        httpClient.connectTimeout(6, TimeUnit.SECONDS)
        httpClient.addInterceptor(get<HttpLoggingInterceptor>())
        if (BuildConfig.DEBUG) {
            httpClient.addInterceptor(get<HttpLoggingInterceptor>())
        }
        httpClient.build()
    }

    single { GsonBuilder().create() }

    single {
        Retrofit.Builder().baseUrl(BuildConfig.BaseUrl)
            .addConverterFactory(GsonConverterFactory.create(get()))
            .client(get())
            .build()
    }
}




