package com.udacity.gradle.builditbigger.backend;

import com.udacity.gradle.builditbigger.MyJokes;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private String myData;

    public String getData() {

        myData = new MyJokes().getJoke();
        return myData;

    }
}