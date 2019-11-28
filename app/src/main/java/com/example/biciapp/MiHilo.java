package com.example.biciapp;

import android.os.Message;

import java.io.IOException;

import static com.example.biciapp.MyAdapter.estaciones;

public class MiHilo extends Thread{

    @Override
    public void run() {

        // for(int i= 0; i < 4; i++) {/ comento por nuevo1
        /*
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //Message men = new Message();

        HttpManager tp = new HttpManager();
        try {
            estaciones  = tp.traerEstaciones();//esto nuevo1
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }

