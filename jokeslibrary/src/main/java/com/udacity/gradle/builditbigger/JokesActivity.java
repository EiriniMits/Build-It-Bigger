package com.udacity.gradle.builditbigger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by eirinimitsopoulou on 06/06/2018.
 */

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new JokesActivityFragment()).commit();
        }
    }
}
