package com.example.mutata;

import java.io.Serializable;

public class Actividad implements Serializable {

    int fotoActividad;
    String tituloActividad;
    String descripcionActividad;
    String descripcionCultura;


    public Actividad(int fotoActividad, String tituloActividad, String descripcionActividad, String descripcionCultura) {
        this.fotoActividad = fotoActividad;
        this.tituloActividad = tituloActividad;
        this.descripcionActividad = descripcionActividad;
        this.descripcionCultura = descripcionCultura;

    }

    public int getFotoActividad() {
        return fotoActividad;
    }

    public void setFotoActividad(int fotoActividad) {
        this.fotoActividad = fotoActividad;
    }

    public String getTituloActividad() {
        return tituloActividad;
    }

    public void setTituloActividad(String tituloActividad) {
        this.tituloActividad = tituloActividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public String getDescripcionCultura() {
        return descripcionCultura;
    }

    public void setDescripcionCultura(String descripcionCultura) {
        this.descripcionCultura = descripcionCultura;
    }

}
