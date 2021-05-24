package com.example.betterbuy;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

    public interface TweeterApi {
        @GET("search/tweets.json?")
        Call<TweeterTweetSearchResponse> getTweets(
                @Query("result_type") String result_type
//                @Query("term") String term
        );
    }


