package com.codepath.instagram;

import android.app.Application;

import com.codepath.instagram.model.Post;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        final Parse.Configuration configuration = new Parse.Configuration.Builder(this)
                .applicationId("elana-hummel")
                .clientKey("elana-hummel-master-key")
                .server("http://codepath-instagram-e.herokuapp.com/parse")
                .build();
        Parse.initialize(configuration);
    }
}
