package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Created by eirinimitsopoulou on 06/06/2018.
 */

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void onPostExecute() throws Exception {
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.execute(mActivityTestRule.getActivity());
        Thread.sleep(5000);
        assertTrue(task.get() != null);
    }
}

