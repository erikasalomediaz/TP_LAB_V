package com.example.biciapp;

import android.content.Intent;
import android.util.Log;
import android.view.View;


public class ListenerVE implements View.OnClickListener {

    MainActivity ma;
    public ListenerVE(MainActivity ma){
      this.ma = ma;
    }
    @Override
    public void onClick(View v) {
        Log.d(
                "olaa", "espero q ande"
        );
        ma.verEstaciones();

    }


}
