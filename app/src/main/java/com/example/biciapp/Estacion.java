package com.example.biciapp;

public class Estacion {
    private int id;
    private String nombre;
    private String barrio;
    private String direccion;
    private double lat;
    private double lon;
    private int capacidad;
    private int biDis;

    public Estacion(){};
    public Estacion(int id, String nombre, String barrio, String direccion ){
        this.id = id;
        this.nombre = nombre;
        this.barrio = barrio;
        this.direccion = direccion;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getBiDis() {
        return biDis;
    }

    public void setBiDis(Integer biDis) {
        this.biDis = biDis;
    }

    public int getBiNoDis() {
        return biNoDis;
    }

    public void setBiNoDis(int biNoDis) {
        this.biNoDis = biNoDis;
    }

    private int biNoDis;

}
