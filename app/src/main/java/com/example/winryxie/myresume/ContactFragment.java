package com.example.winryxie.myresume;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {


    public ContactFragment() {
        // Required empty public constructor

    }

    private TextView textView;
    private ImageView imgView;
    private Layout layout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     //   View view=inflater.inflate(R.layout.fragment_contact, container, false);
        View view=inflater.inflate(R.layout.fragment_main, container, false);
        textView = (TextView) view.findViewById(R.id.tv_item1);
        textView = (TextView) view.findViewById(R.id.tv_item2);
        textView = (TextView) view.findViewById(R.id.tv_item3);
        textView = (TextView) view.findViewById(R.id.tv_item4);
        imgView = (ImageView) view.findViewById(R.id.imageView3);
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }



}
