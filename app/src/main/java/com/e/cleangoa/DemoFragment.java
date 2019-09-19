package com.e.cleangoa;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DemoFragment extends Fragment {
public TextView textView;
int pos;
    public DemoFragment(int pos) {
        this.pos=pos;
    }
    public int getpos()
    {
        return pos;
    }
//public static final String ARG_SECTION_NUMBER="section_number";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_demo, container, false);
//        textView=view.findViewById(R.id.txt_display);
//       int val=getArguments().getInt(ARG_SECTION_NUMBER);
//        textView.setText(getArguments().getString("message"));
        return view;
    }

}
