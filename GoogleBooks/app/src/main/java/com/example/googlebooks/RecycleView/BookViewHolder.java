package com.example.googlebooks.RecycleView;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.googlebooks.Fragments.BooksFragment;
import com.example.googlebooks.R;

public class BookViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvImage;
    private TextView mTVBookTitle;
    private TextView midTvPublisher;
    private TextView midTVDate;
    LinearLayout linearLayout;
    ItemClickListener itemClickListener;



    public BookViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
      mIvImage = itemView.findViewById(R.id.idIvBook);
      midTVDate = itemView.findViewById(R.id.idTVDate);
      linearLayout = itemView.findViewById(R.id.linearLayout);
      mTVBookTitle = itemView.findViewById(R.id.TVBookTitle);
      midTvPublisher = itemView.findViewById(R.id.idTvPublisher);
    }

    public void setData(BookInfo bookInfo){
        mIvImage.setImageResource(bookInfo.getImage());
        midTvPublisher.setText(bookInfo.getPublisher());
        mTVBookTitle.setText(bookInfo.getTitle());
        midTVDate.setText(bookInfo.getPublishedDate());
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemClickListener.onItemClick(getAdapterPosition());
            }
        });


    }
}
