package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("NfdOMkbWkeSCHH7kF4twWoGWs4YoAyFxp92AL5vU")
                .clientKey("rSXpGvh2WdQxgnThAUAxR4aPbOTbMtvduIOf7aaA")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
