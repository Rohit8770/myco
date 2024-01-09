package com.example.profileapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.profileapplication.R;
import com.example.profileapplication.Response.Contact;

import java.util.List;

public class MyTeamAdapter extends RecyclerView.Adapter<MyTeamAdapter.TeamViewHolder>{

    Context context;
    private List<Contact.ProfileListResponse> profileListResponses;



    public MyTeamAdapter(Context context, List<Contact.ProfileListResponse> profileListResponses) {
        this.context = context;
        this.profileListResponses = profileListResponses;
    }


    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.my_team_item_file, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class TeamViewHolder extends RecyclerView.ViewHolder {
        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
