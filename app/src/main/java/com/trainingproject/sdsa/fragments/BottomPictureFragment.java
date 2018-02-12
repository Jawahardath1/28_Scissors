package com.trainingproject.sdsa.fragments;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment{

    private static TextView topMemetext;
    private static TextView bottomMemetext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment,container,false);
        topMemetext = view.findViewById(R.id.topMemetext);
        bottomMemetext = view.findViewById(R.id.bottomMemetext);
        return view;
    }

    public void setMemeText(String top, String bottom) {
        topMemetext.setText(top);
        bottomMemetext.setText(bottom);
    }
}
