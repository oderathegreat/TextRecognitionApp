package com.chat.app.barikibinti;

import android.app.VoiceInteractor;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chat.app.barikibinti.adapter.RestaurantAdapter;
import com.chat.app.barikibinti.model.Restaurant;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView mRestRecycler;
    private RestaurantAdapter mAdapter;
    private ArrayList<Restaurant> mRestlistcollection;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();


    }

    private void init() {


        mRestRecycler = findViewById(R.id.restRecycler);
        mRestRecycler.setLayoutManager(new LinearLayoutManager(this));
        mRestRecycler.setHasFixedSize(true);

        mRestlistcollection = new ArrayList<>();
        mAdapter = new RestaurantAdapter(mRestlistcollection, this);
        mRestRecycler.setAdapter(mAdapter);

    }


    //async task

    public void FetchData() {
//do background processing here





    }



}
