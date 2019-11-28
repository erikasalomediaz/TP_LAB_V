package com.example.biciapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class EstacionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estaciones);

        RecyclerView rv;
        MyAdapter adapter;



        rv = (RecyclerView) this.findViewById(R.id.rvListado);
        adapter = new MyAdapter(this);
        rv.setAdapter(adapter);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        //lm.setOrientation(LinearLayoutManager.HORIZONTAL);
        //GridLayoutManager lm = new GridLayoutManager(this, 2);
        rv.setLayoutManager(lm);
    }
}
