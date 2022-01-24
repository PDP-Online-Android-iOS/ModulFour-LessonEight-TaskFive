package dev.ogabek.java.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.Post;

public class PostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Post> posts;

    public PostAdapter(List<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Post post = posts.get(position);

        if (holder instanceof PostViewHolder) {
            ((PostViewHolder) holder).profile.setImageResource(post.getPhoto());
            ((PostViewHolder) holder).name.setText(post.getName());
            ((PostViewHolder) holder).location.setText(post.getLocation());
            ((PostViewHolder) holder).post.setImageResource(post.getPost());
        }
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    private class PostViewHolder extends RecyclerView.ViewHolder {

        ImageView profile, post;
        TextView name, location;

        public PostViewHolder(View view) {
            super(view);

            profile = view.findViewById(R.id.iv_poster_photo);
            post = view.findViewById(R.id.posters_post);
            name = view.findViewById(R.id.tv_poster_name);
            location = view.findViewById(R.id.tv_poster_location);

        }
    }
}
