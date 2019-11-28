package com.example.biciapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListenerVE listenerVE = new ListenerVE(this);
        Button btn = (Button) findViewById(R.id.btnEstaciones);
        btn.setOnClickListener(listenerVE);

    }

    public void verEstaciones(){

        Intent i = new Intent(this, EstacionesActivity.class);
        startActivity(i);
    }
}
