package dev.ogabek.java.model;

public class Post {
    int photo, post;
    String name, location;
    public Post(int photo, String name, String location, int post) {
        this.photo = photo;
        this.name = name;
        this.location = location;
        this.post = post;
    }

    public int getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public int getPost() {
        return post;
    }

    public String getLocation() {
        return location;
    }
}
