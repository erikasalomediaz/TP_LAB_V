package com.example.biciapp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpManager {


    public String traerEstaciones() throws IOException {
        byte[] resultado;
        try {
            URL url = new URL("https://apitransporte.buenosaires.gob.ar/ecobici/gbfs/stationInformation?client_id=272d7be9dcda40b6ae084cbb6e9e105f&client_secret=c8C79D585d1F4C6998C84Bb636eC4c8A");
            //   URL url2 = new URL("http://www.lslutnfra.com/alumnos/practicas/ubuntu-logo.png");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();


            //la informacion va entre medio de estas dos lineas
            //aca van los timeout
            //metodos que vamos a llamar
            connection.connect();

            if (connection.getResponseCode() == 200) { //osea si conectò bien
                InputStream is = connection.getInputStream();
                //para procesar la info uso un buffer o un  byte que nos deja la info en un array de bytes
                ByteArrayOutputStream bat = new ByteArrayOutputStream();
                byte[] buffer = new byte[1000];
                int cant = 0;
               // while ((cant = is.read(buffer, 0, 1000)) > -1) {
                while ((cant = is.read(buffer)) > -1) {
                    bat.write(buffer, 0, cant);
                }
                resultado = bat.toByteArray();
                is.close();
                return new String(resultado,"UTF-8");


            }
        }catch (MalformedURLException e) {
                e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }


        return null;
    }


    public String traerEstados() throws IOException {
        byte[] resultado;
        try {
            URL url = new URL("https://apitransporte.buenosaires.gob.ar/ecobici/gbfs/stationStatus?client_id=272d7be9dcda40b6ae084cbb6e9e105f&client_secret=c8C79D585d1F4C6998C84Bb636eC4c8A");
            //   URL url2 = new URL("http://www.lslutnfra.com/alumnos/practicas/ubuntu-logo.png");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();


            //la informacion va entre medio de estas dos lineas
            //aca van los timeout
            //metodos que vamos a llamar
            connection.connect();

            if (connection.getResponseCode() == 200) { //osea si conectò bien
                InputStream is = connection.getInputStream();
                //para procesar la info uso un buffer o un  byte que nos deja la info en un array de bytes
                ByteArrayOutputStream bat = new ByteArrayOutputStream();
                byte[] buffer = new byte[1000];
                int cant = 0;
                // while ((cant = is.read(buffer, 0, 1000)) > -1) {
                while ((cant = is.read(buffer)) > -1) {
                    bat.write(buffer, 0, cant);
                }
                resultado = bat.toByteArray();
                is.close();
                return new String(resultado,"UTF-8");


            }
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
