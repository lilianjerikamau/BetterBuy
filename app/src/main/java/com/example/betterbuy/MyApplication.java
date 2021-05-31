package com.example.betterbuy;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;

public class MyApplication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my_application);


        //initiate Twitter config
        TwitterConfig config = new TwitterConfig.Builder(this)
                .logger(new DefaultLogger(Log.DEBUG))
                .twitterAuthConfig(new TwitterAuthConfig("r0bCRah6RVZk6mo0ZcpFdyRuI", "AFHGXt9WUhCNBuHrnd5T1PlYd5xJ4d1ck2wzZ1OKUd2omfF9Ag"))//pass Twitter API Key and Secret
                .debug(true)
                .build();
        Twitter.initialize(config);

        setContentView(R.layout.activity_my_application);

    }
}