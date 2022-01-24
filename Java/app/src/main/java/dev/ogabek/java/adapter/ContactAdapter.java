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
import dev.ogabek.java.model.Contact;

public class ContactAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Contact> contacts;

    public ContactAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Contact contact = contacts.get(position);

        if (holder instanceof ContactViewHolder) {
            ((ContactViewHolder) holder).photo.setImageResource(contact.getPhoto());
            ((ContactViewHolder) holder).name.setText(contact.getName());
            ((ContactViewHolder) holder).number.setText(contact.getNumber());
        }
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    private class ContactViewHolder extends RecyclerView.ViewHolder {
        ImageView photo;
        TextView name, number;
        public ContactViewHolder(View view) {
            super(view);
            photo = view.findViewById(R.id.iv_contact);
            name = view.findViewById(R.id.tv_contact_name);
            number = view.findViewById(R.id.tv_contact_number);
        }
    }
}
