package com.example.googlebooks.Fragments;

import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.googlebooks.Acivity.ReadAcivity;
import com.example.googlebooks.R;
import com.example.googlebooks.RecycleView.ItemClickListener;

public class LibraryFragment extends Fragment implements ItemClickListener {

    Button btn1, btn2;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meet, container, false);
        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);


    // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_library, container, false);
    }

    @Override
    public void onItemClick(int position) {

    }
}