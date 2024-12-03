package com.example.konyvtar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<Books> books;
    private Context context;

    public MyAdapter(List<Books> books, Context context) {
        this.books = books;
        this.context = context;
    }

    @Override
    public int getCount(){
        return books.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewgroup) {
        view = LayoutInflater.from(context).inflate(R.layout.list_item, viewgroup,false);

        TextView nameTextV = view.findViewById(R.id.TextVName);
        TextView titleTextv = view.findViewById(R.id.TextVTitle);
        TextView pageNumberTextv = view.findViewById(R.id.TextVPageNumber);

        nameTextV.setText(books.get(i).getAuthor());
        titleTextv.setText(books.get(i).getTitle());
        pageNumberTextv.setText(books.get(i).getPageInteger());
        return view;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }
}
