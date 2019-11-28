package com.example.biciapp;

import android.util.Xml;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.StringReader;
import java.util.ArrayList;

public class Parseador {
    public static ArrayList<Estacion> parser(String s){
        ArrayList<Estacion> arrayEst = new ArrayList<Estacion>();
        try {

            JSONObject jsonObject = new JSONObject(s);
            //JSONArray estaciones = jsonObject.getJSONArray("station");
            JSONObject jsonObject1 = jsonObject.getJSONObject("data");
            JSONArray estaciones = jsonObject1.getJSONArray("stations");

            for (int i = 0; i < estaciones.length(); i++) {
                JSONObject objEst = estaciones.getJSONObject(i);
                Estacion estacion = new Estacion();

                estacion.setId(objEst.getInt("station_id"));
                estacion.setBarrio(objEst.getString("groups"));
                estacion.setNombre(objEst.getString("name"));
                estacion.setDireccion(objEst.getString("address"));

                arrayEst.add(estacion);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

return arrayEst;

    }


}

