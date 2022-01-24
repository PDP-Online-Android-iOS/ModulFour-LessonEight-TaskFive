package dev.ogabek.java.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.ogabek.java.R;
import dev.ogabek.java.activity.MainActivity;
import dev.ogabek.java.adapter.ContactAdapter;
import dev.ogabek.java.adapter.UserAdapter;

public class UserFragment extends Fragment {

    MainActivity mainActivity = new MainActivity();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.rv_user);

        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));

        recyclerView.setAdapter(new UserAdapter(mainActivity.prepareUserList()));

    }

}