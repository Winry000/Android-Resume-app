package com.example.winryxie.myresume;

/**
 * Created by winryxie on 3/12/17.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<User> android;

    public DataAdapter(ArrayList<User> android) {
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detain_content_main, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_detail.setText(android.get(i).getName());
        viewHolder.tv_item.setText(android.get(i).getVer());
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_detail, tv_item, tv_api_level;

        public ViewHolder(View view) {
            super(view);

            tv_detail = (TextView) view.findViewById(R.id.tv_detail);
            tv_item = (TextView) view.findViewById(R.id.tv_item);
           // tv_api_level = (TextView)view.findViewById(R.id.tv_api_level);
        }
    }
}