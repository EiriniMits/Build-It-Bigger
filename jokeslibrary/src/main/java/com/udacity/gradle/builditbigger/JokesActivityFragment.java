package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by eirinimitsopoulou on 06/06/2018.
 */

public class JokesActivityFragment extends Fragment {


    public JokesActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_jokes_fragment, container, false);
        Intent i = getActivity().getIntent();

        String joke = getActivity().getIntent().getStringExtra("joke");
        TextView gce_result_show = (TextView) v.findViewById(R.id.jokes);
        gce_result_show.setText(joke);

        return v;
    }
}
