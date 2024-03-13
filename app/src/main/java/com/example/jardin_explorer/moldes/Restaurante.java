package com.example.jardin_explorer.moldes;

import java.io.Serializable;

public class Restaurante implements Serializable {
    private Integer fotografia;
    private String nombre;
    private String calificacion;
    private String descripcion;
    private String direccion;
    private Integer boton;

    public Restaurante() {
    }

    public Restaurante(Integer fotografia, String nombre, String calificacion, String descripcion, String direccion, Integer boton) {
        this.fotografia = fotografia;
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.boton = boton;
    }

    public Integer getFotografia() {
        return fotografia;
    }

    public void setFotografia(Integer fotografia) {
        this.fotografia = fotografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getBoton() {
        return boton;
    }

    public void setBoton(Integer boton) {
        this.boton = boton;
    }
}


