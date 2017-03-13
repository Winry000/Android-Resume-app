package com.example.winryxie.myresume;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Main_Fragment extends Fragment {


    public Main_Fragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private ArrayList<User> data;
    private DataAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//         Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        final Context context = getActivity().getApplicationContext();
        final ArrayList<User> userList = User.getUserFromFile("recipes.json", getActivity().getApplicationContext());
        data = userList;
        adapter = new DataAdapter(data);
        recyclerView.setAdapter(adapter);
//      textView = (TextView)getView().findViewById(R.id.);
        return view;

    }

}
