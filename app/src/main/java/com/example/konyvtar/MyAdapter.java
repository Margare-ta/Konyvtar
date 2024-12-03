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
        view = LayoutInflater.from(context).inflate(R.layout.books_list_item, viewgroup,false);

        TextView emailTextView = view.findViewById(R.id.emailTextView);
        TextView passwordTextView = view.findViewById(R.id.passwordTextView);

        emailTextView.setText(books.get(i).getEmail());
        passwordTextView.setText(books.get(i).getPassword());
        return view;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }
}
