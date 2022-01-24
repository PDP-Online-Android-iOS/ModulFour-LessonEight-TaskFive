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
import dev.ogabek.java.model.User;

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User user = users.get(position);

        if (holder instanceof UserViewHolder) {
            ((UserViewHolder) holder).photo.setImageResource(user.getPhoto());
            ((UserViewHolder) holder).name.setText(user.getName());
            ((UserViewHolder) holder).username.setText(user.getUsername());
        }
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    private class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView photo;
        TextView name, username;
        public UserViewHolder(View view) {
            super(view);

            photo = view.findViewById(R.id.iv_user);
            name = view.findViewById(R.id.tv_user_name);
            username = view.findViewById(R.id.tv_user_username);
        }
    }
}
