package com.example.apna_bazar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.apna_bazar.adaptors.ContactsAdaptor;
import com.example.apna_bazar.modals.Contacts;

import java.util.ArrayList;

public class Buylist extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_buylist);

        recyclerView =findViewById(R.id.recyclerView);

        ArrayList<Contacts> list =new ArrayList<>();
        list.add(new Contacts(R.drawable.notes1,"Notes"));
        list.add(new Contacts(R.drawable.books3,"Books"));
        list.add(new Contacts(R.drawable.art,"Art n Craft"));
        list.add(new Contacts(R.drawable.notes1,"Notes"));
        list.add(new Contacts(R.drawable.notes1,"Notes"));
        list.add(new Contacts(R.drawable.notes1,"Notes"));
        list.add(new Contacts(R.drawable.notes1,"Notes"));
        list.add(new Contacts(R.drawable.notes1,"Notes"));
        list.add(new Contacts(R.drawable.notes1,"Notes"));

        ContactsAdaptor adaptor= new ContactsAdaptor(list ,this);
        recyclerView.setAdapter(adaptor);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}