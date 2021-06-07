package com.example.mutata;

import java.io.Serializable;

public class Actividad implements Serializable {

    String fotoActividad;
    String tituloActividad;
    String descripcionActividad;
    String descripcionCultura;


    public Actividad(String fotoActividad, String tituloActividad, String descripcionActividad, String descripcionCultura) {
        this.fotoActividad = fotoActividad;
        this.tituloActividad = tituloActividad;
        this.descripcionActividad = descripcionActividad;
        this.descripcionCultura = descripcionCultura;

    }

    public String getFotoActividad() {
       return fotoActividad;
    }

    public void setFotoActividad(String fotoActividad) {
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
