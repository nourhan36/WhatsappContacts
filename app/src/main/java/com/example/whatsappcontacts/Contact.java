package com.example.whatsappcontacts;

public class Contact {
    int id;
    String name;
    String status;
    int imageId;

    public Contact(int id, String name, String status, int imageId) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.imageId = imageId;
    }
}