package com.example.biciapp;

import android.util.Log;
import android.view.View;

public class ListenerRv implements View.OnClickListener {

    MyViewHolder mvh;
    EstacionesActivity estAct;

    public ListenerRv(MyViewHolder mvh,EstacionesActivity ev){
this.mvh = mvh;
this.estAct = ev;

    }

    @Override
    public void onClick(View v) {
        //aca puedo llamar al metodo dentro del main
        Log.d("se toco", "ahora");
    }
}
