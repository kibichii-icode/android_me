package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by kibichii on 4/11/2018.
 */

public class BodyPartFragment extends Fragment {
    //mandatory constructor for instatiating the fragment
    public BodyPartFragment() {

    }

    /**
     * inflates the fragment Layout and sets any image resources
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //inflate the android-me fragment
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        //Get the reference to the Imageview in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        //set the image resource to display
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        //return root view
        return rootView;
    }
}
