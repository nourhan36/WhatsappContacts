package com.example.whatsappcontacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

public class WhatsAppContacts extends AppCompatActivity {

    RecyclerView rv;
    ContactsRecyclerAdapter adapter;
    List<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app_contacts);
        rv = findViewById(R.id.rv_contacts);
        createContactsList();
        adapter = new ContactsRecyclerAdapter(contactList);
        rv.setAdapter(adapter);
    }

    private void createContactsList() {
        contactList = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            contactList.add(new Contact(i, "Contact num" + i, "status" + i, R.drawable.profile));
        }
    }
}