package dev.ogabek.java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.adapter.ViewPagerAdapter;
import dev.ogabek.java.fragment.ContactFragment;
import dev.ogabek.java.fragment.PostFragment;
import dev.ogabek.java.fragment.UserFragment;
import dev.ogabek.java.model.Contact;
import dev.ogabek.java.model.Post;
import dev.ogabek.java.model.User;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private PagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        viewPager = findViewById(R.id.viewpager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());


        ((ViewPagerAdapter) viewPagerAdapter).add(new ContactFragment(), "Contacts");
        ((ViewPagerAdapter) viewPagerAdapter).add(new UserFragment(), "Users");
        ((ViewPagerAdapter) viewPagerAdapter).add(new PostFragment(), "Posts");


        viewPager.setAdapter(viewPagerAdapter);

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    public List<Contact> prepareContactList() {
        List<Contact> contacts = new ArrayList<>();
        for (int i = 0; i < 25; i++)
            contacts.add(new Contact(R.drawable.user, "Ogabek Matyakubov", "+998 93 203 73 13"));
        return contacts;
    }

    public List<User> prepareUserList() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 25; i++)
            users.add(new User(R.drawable.user, "Ogabek Matyakubov", "@OgabekDev"));
        return users;
    }

    public List<Post> preparePostList() {
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < 25; i++)
            posts.add(new Post(R.drawable.man, "ogabekdev", "MFaktor", R.drawable.man));
        return posts;
    }

}