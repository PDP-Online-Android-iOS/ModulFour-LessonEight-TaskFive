package dev.ogabek.java.model;

public class Contact {

    String name, number;
    int photo;

    public Contact(int photo, String name, String number) {
        this.photo = photo;
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }

    public String getNumber() {
        return number;
    }
}
