package dev.ogabek.java.model;

public class User {
    String name, username;
    int photo;

    public User(int photo, String name, String username) {
        this.photo = photo;
        this.name = name;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }

    public String getUsername() {
        return username;
    }
}