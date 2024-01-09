package com.example.profileapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.profileapplication.R;

public class GrideAdapter extends RecyclerView.Adapter<GrideAdapter.GrideViewHolder>{
    Context context;

    @NonNull
    @Override
    public GrideViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.gride_item_file, parent, false);
        return new GrideViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GrideViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 9;
    }

    public class GrideViewHolder extends RecyclerView.ViewHolder {
        public GrideViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
