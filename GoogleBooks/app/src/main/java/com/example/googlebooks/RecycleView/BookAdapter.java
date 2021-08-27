package com.example.googlebooks.RecycleView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.googlebooks.R;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookViewHolder> {
    private ArrayList<BookInfo> bookList;
    ItemClickListener itemClickListener;

    public BookAdapter(ArrayList<BookInfo> bookList,ItemClickListener itemClickListener){
        this.bookList = bookList;
        this.itemClickListener = itemClickListener;

    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meet_item_layout,parent,false);
        return new BookViewHolder(view,itemClickListener);
    }


    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        BookInfo bookInfo = bookList.get(position);
        holder.setData(bookInfo);
    }


    @Override
    public int getItemCount() {
        Log.d("Shubham",bookList.size()+"");
        return bookList.size();
    }
}
