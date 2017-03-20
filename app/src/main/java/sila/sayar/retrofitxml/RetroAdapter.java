package sila.sayar.retrofitxml;

/**
 * Created by zisan on 18.03.2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class RetroAdapter extends RecyclerView.Adapter<RetroAdapter.PostViewHolder> {

    private List<Article> posts;
    private int rowLayout;
    private Context context;


    public static class PostViewHolder extends RecyclerView.ViewHolder {
        LinearLayout postsLayout;
        TextView movieTitle;
        TextView movieDescription;
        TextView rating;


        public PostViewHolder(View v) {
            super(v);
            postsLayout = (LinearLayout) v.findViewById(R.id.posts_layout);
            movieTitle = (TextView) v.findViewById(R.id.title);
            movieDescription = (TextView) v.findViewById(R.id.description);
            rating = (TextView) v.findViewById(R.id.rating);
        }
    }

    public RetroAdapter(List<Article> movies, int rowLayout, Context context) {
        this.posts = movies;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public RetroAdapter.PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new PostViewHolder(view);
    }


    @Override
    public void onBindViewHolder(PostViewHolder holder, final int position) {
        holder.movieTitle.setText(posts.get(position).getTitle());
        holder.movieDescription.setText(posts.get(position).getLink());
        holder.rating.setText("8.1");
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}

