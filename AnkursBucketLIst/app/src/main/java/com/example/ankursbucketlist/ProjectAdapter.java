package com.example.ankursbucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {

    private com.example.ankursbucketlist.Project[] projects;

    public ProjectAdapter(com.example.ankursbucketlist.Project[] projects) {
        this.projects = projects;
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(projects[position],position);
    }


    static class ProjectViewHolder extends RecyclerView.ViewHolder {
        private ImageView icon;
        private TextView title;
        private TextView description;
        private RatingBar rating;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.image_view_main_image);
            title = itemView.findViewById(R.id.text_view_title);
            description = itemView.findViewById(R.id.text_view_description);
            rating = itemView.findViewById(R.id.rating_bar);
        }

        public void bind(com.example.ankursbucketlist.Project projects,int pos) {
            String numTitle = ++pos +". "+projects.title;
            title.setText(numTitle);
            description.setText(projects.description);
            icon.setImageResource(projects.image);
            rating.setRating(projects.rating);

        }
    }
}
