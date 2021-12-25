package com.example.roomscreen;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {


    // ArrayList for person names
    ArrayList personNames = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7"));
    ArrayList personimagess = new ArrayList<>(Arrays.asList(R.drawable.imgcolour, R.drawable.imgcolour, R.drawable.imgcolour, R.drawable.imgcolour, R.drawable.imgcolour, R.drawable.imgcolour, R.drawable.imgcolour));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_m);
        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_21);
        // set a LinearLayoutManager with default vertical orientation
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
//        recyclerView.setLayoutManager(linearLayoutManager);
//        //  call the constructor of CustomAdapter to send the reference and data to Adapter
//
//        RecyclerAdapter customAdapter = new RecyclerAdapter(MainActivity.this, personNames,personimagess);
//        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView


        ///$$$$$$$$ user either of two layoutmanger$$$$$$$$$$$$$$$$$$$$ ////


       GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
      //  StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
      gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
          @Override
          public int getSpanSize(int position) {
              return (position%3==0?2:1);
          }
      });


        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerAdapter customAdapter = new RecyclerAdapter(MainActivity.this, personNames,personimagess);
        recyclerView.setAdapter(customAdapter);

    }

}

// getSupportFragmentManager().beginTransaction().add(R.id.fram_layout,new BlankFragment()).commit();

