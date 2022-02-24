package com.example.apna_bazar.adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apna_bazar.R;
import com.example.apna_bazar.modals.Contacts;

import java.util.ArrayList;

public class ContactsAdaptor extends RecyclerView.Adapter<ContactsAdaptor.viewHolder> {
    ArrayList<Contacts>list;
    Context context;

    public ContactsAdaptor(ArrayList<Contacts> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview, parent, false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Contacts contact =list.get(position);
        holder.imageView.setImageResource(contact.getPic());
        holder.textView.setText(contact.getText());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            imageView = itemView.findViewById(R.id.textView);
        }
    }
}
