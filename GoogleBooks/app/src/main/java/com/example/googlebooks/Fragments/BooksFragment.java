package com.example.googlebooks.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.googlebooks.R;
import com.example.googlebooks.RecycleView.BookAdapter;
import com.example.googlebooks.RecycleView.BookInfo;
import com.example.googlebooks.RecycleView.ItemClickListener;
import com.google.android.gms.common.internal.Objects;

import java.util.ArrayList;


public class BooksFragment extends Fragment implements ItemClickListener{

    RecyclerView mRecyclerView;
    RecyclerView mRecycleViewMeet2;
    RecyclerView mRecycleViewMeet3;
    ArrayList<BookInfo> bookList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meet, container, false);
        mRecyclerView = view.findViewById(R.id.recycleViewMeet);
        mRecycleViewMeet2 = view.findViewById(R.id.recycleViewMeet2);
        mRecycleViewMeet3 = view.findViewById(R.id.recycleViewMeet3);
        setRecycleView();
        setRecycleView2();
        setRecycleView3();


        return view;

    }

    private void setRecycleView3() {

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                bookList.add(new BookInfo("Batman", "Kumar khaWant", "12/07/2002",
                        2122, R.drawable.frank));
            }
            if (i %  3== 0) {
                bookList.add(new BookInfo("Wonder women", "Nation Livo", "22/03/2012",
                        1132, R.drawable.tes));
            }
            if (i % 2 == 0) {
                bookList.add(new BookInfo("Business and stat", "Kumar shubham", "12/07/2002",
                        2122, R.drawable.train));
            }
            if (i % 4 == 0) {
                bookList.add(new BookInfo("Wonder women", "Brad rap", "22/03/2012",
                        1132, R.drawable.blog));
            }

        }

        BookAdapter bookAdapter = new BookAdapter(bookList,this);
     GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getContext(),2);
        mRecycleViewMeet2.setAdapter(bookAdapter);
        mRecycleViewMeet2.setLayoutManager(gridLayoutManager );

    }

    private void setRecycleView2() {

                for (int i = 0; i < 20; i++) {
                    if (i % 2 == 1) {
                        bookList.add(new BookInfo("Batman", "Kumar khaWant", "12/07/2002",
                                2122, R.drawable.frank));
                    }
                    if (i %  3== 0) {
                        bookList.add(new BookInfo("Wonder women", "Nation Livo", "22/03/2012",
                                1132, R.drawable.tes));
                    }
                    if (i % 2 == 0) {
                        bookList.add(new BookInfo("Business and stat", "Kumar shubham", "12/07/2002",
                                2122, R.drawable.train));
                    }
                    if (i % 4 == 0) {
                        bookList.add(new BookInfo("Wonder women", "Brad rap", "22/03/2012",
                                1132, R.drawable.blog));
                    }

        }

        BookAdapter bookAdapter = new BookAdapter(bookList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext(),
                RecyclerView.HORIZONTAL, false);
        mRecycleViewMeet2.setAdapter(bookAdapter);
        mRecycleViewMeet2.setLayoutManager(linearLayoutManager );

    }


    private void setRecycleView() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                bookList.add(new BookInfo("Batman", "Kumar khaWant", "12/07/2002",
                        2122, R.drawable.bookji));
            }
            if (i %  3== 0) {
                bookList.add(new BookInfo("Wonder women", "Nation Livo", "22/03/2012",
                        1132, R.drawable.bookpink));
            }
            if (i % 2 == 0) {
                bookList.add(new BookInfo("Business and stat", "Kumar shubham", "12/07/2002",
                        2122, R.drawable.edi));
            }
            if (i % 4 == 0) {
                bookList.add(new BookInfo("Wonder women", "Brad rap", "22/03/2012",
                        1132, R.drawable.frank));
            }

            BookAdapter bookAdapter = new BookAdapter(bookList,this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext(),
                    RecyclerView.HORIZONTAL, false);
            mRecyclerView.setAdapter(bookAdapter);
            mRecyclerView.setLayoutManager(linearLayoutManager);

        }
    }



    @Override
    public void onItemClick(int position) {
        Toast.makeText(this.getContext(), "item added to library", Toast.LENGTH_SHORT).show();


    }
}




