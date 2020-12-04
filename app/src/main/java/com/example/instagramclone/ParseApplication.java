package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("gB5SGiB3JuXL3cb60SAOcPXNPAN0At1lC8FgWJWe")
            .clientKey("LI0RLx5rxRBVq2XjeVUWuNhEO9fSY5uq959ppdOa")
            .server("https://parseapi.back4app.com")
            .build()
        );
    }
}
