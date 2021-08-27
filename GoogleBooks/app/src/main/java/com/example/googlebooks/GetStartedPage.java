package com.example.googlebooks;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.googlebooks.Fragments.BooksFragment;
import com.example.googlebooks.Fragments.LibraryFragment;
import com.example.googlebooks.Fragments.ShopFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class GetStartedPage extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    RecyclerView mRecycleView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started_page);
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout,new BooksFragment()).commit();

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.notificationbottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment temp = null;
                switch (item.getItemId()){
                    case R.id.Shop: temp = new ShopFragment();
                        break;
                    case R.id.Library: temp = new LibraryFragment();
                        break;
                    case R.id.Profile: temp= new BooksFragment();
                        break;

                }

                assert temp != null;
                getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout,temp).commit();


                return true;
            }
        });
    }




}