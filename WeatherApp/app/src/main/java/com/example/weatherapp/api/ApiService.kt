package com.example.weatherapp.api

import com.example.weatherapp.searchModel.Search
import com.example.weatherapp.weatherModel.Root
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    //    @GET("movie/top_rated/{user}")
    //    Observable<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey, (@Path("user") String user);
    //
    //    @GET("movie/{id}")
    //    Observable<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
    // @GET("198f29ec5114a3ec3460/raw/8dd19a88f9b8d24c23d9960f3300d0c917a4f07c/cake.json")
    // suspend fun getCakeslist(): Response<List<Cake_model>>

    //():Response<Call<Root>>
    @GET("/cities")
    fun getSearch(
    @Query(" search")
    search:String? = null,
    @Query("pageCount")
    pageCount : String? = null,
    @Query("pageNumber")
    pageNumber:String? = null): Response<Search>

@GET("cities/cityID")
suspend fun getCity(): Response<Root>



}