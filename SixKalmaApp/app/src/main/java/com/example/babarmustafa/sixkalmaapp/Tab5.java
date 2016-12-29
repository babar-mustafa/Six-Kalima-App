package com.example.babarmustafa.sixkalmaapp;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab5 extends Fragment {
    Button forplay,forstop;
    MediaPlayer mediaPlayer;

    public Tab5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mediaPlayer = MediaPlayer.create(getActivity(),R.raw.fourthk);
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_tab5, container, false);
        forplay = (Button) view.findViewById(R.id.play_button);

        forstop = (Button) view.findViewById(R.id.stop_button);


        forplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });



        forstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });

        return view;
    }

}
