package dev.ogabek.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.adapter.ViewPagerAdapter
import dev.ogabek.kotlin.fragment.ContactListFragment
import dev.ogabek.kotlin.fragment.PostListFragment
import dev.ogabek.kotlin.fragment.UserListFragment
import dev.ogabek.kotlin.model.Contact
import dev.ogabek.kotlin.model.Post
import dev.ogabek.kotlin.model.User

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var viewPagerAdapter: PagerAdapter
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        viewPager = findViewById(R.id.viewpager)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)


        (viewPagerAdapter as ViewPagerAdapter).add(ContactListFragment(), "Contacts")
        (viewPagerAdapter as ViewPagerAdapter).add(UserListFragment(), "Users")
        (viewPagerAdapter as ViewPagerAdapter).add(PostListFragment(), "Posts")


        viewPager.adapter = viewPagerAdapter

        tabLayout = findViewById(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)
    }

    fun call(number: String) {

    }

    fun prepareContactList(): List<Contact> {
        val contacts: ArrayList<Contact> = ArrayList()
        for (i in 0..25) contacts.add(Contact(R.drawable.user_48, "Ogabek Matyakubov", "+998 93 203 73 13"))
        return contacts
    }

    fun prepareUserList(): List<User> {
        val users: ArrayList<User> = ArrayList()
        for (i in 0..25) users.add(User(R.drawable.user_48, "Ogabek Matyakubov", "@OgabekDev"))
        return users
    }

    fun preparePostList(): List<Post> {
        val posts: ArrayList<Post> = ArrayList()
        for (i in 0..25) posts.add(Post(R.drawable.man, "ogabekdev", "MFaktor", R.drawable.man))
        return posts
    }

}