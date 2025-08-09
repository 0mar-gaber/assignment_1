package com.example.assignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    List<String> userNames;
    LayoutInflater inflater;


    RecyclerViewAdapter(List<String> userNames,Context context){
        this.inflater = LayoutInflater.from(context);
        this.userNames = userNames;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = inflater.inflate(R.layout.post_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.userName.setText(userNames.get(position));

    }

    @Override
    public int getItemCount() {
        return userNames.size();
    }
}


class MyViewHolder extends RecyclerView.ViewHolder {

    TextView userName;
    MyViewHolder(@NonNull View itemView) {
        super(itemView);

        userName =itemView.findViewById(R.id.userName);
    }
}