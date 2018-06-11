package com.udacity.gradle.builditbigger;

import java.util.Random;

/**
 * Created by eirinimitsopoulou on 06/06/2018.
 */

public class MyJokes {
    private String[] jokes;
    private Random random;

    public MyJokes() {

        jokes = new String[5];
        jokes[0] = "Doctor: I'm sorry but you suffer from a terminal illness and have only 10 to live." + "\n" + "Patient: What do you mean, 10? 10 what? Months? Weeks?!" + "\n" + "Doctor: Nine.";
        jokes[1] = "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.";
        jokes[2] = "My wife suffers from a drinking problem." + "\n" + "Oh is she an alcoholic?" + "\n" + "No, I am, but she’s the one who suffers.";
        jokes[3] = "Coco Chanel once said that you should put perfume on places where you want to be kissed by a man. But hell does that burn!";
        jokes[4] = "Patient: Oh doctor, I’m just so nervous. This is my first operation." + "\n" + "Doctor: Don't worry. Mine too.";
        random = new Random();
    }

    public String getJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
