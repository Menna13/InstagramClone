package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("gB5SGiB3JuXL3cb60SAOcPXNPAN0At1lC8FgWJWe")
            .clientKey("LI0RLx5rxRBVq2XjeVUWuNhEO9fSY5uq959ppdOa")
            .server("https://parseapi.back4app.com")
            .build()
        );
    }
}
