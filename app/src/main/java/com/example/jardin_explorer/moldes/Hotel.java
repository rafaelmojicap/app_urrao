package com.example.jardin_explorer.moldes;

import android.widget.Button;

import java.io.Serializable;

public class Hotel implements Serializable {
    private String nombre;
    private String precio;
    private String descripcion;
    private String telefono;
    private String direccion;
    private String calificacion;
    private Integer fotografia;
    private Integer boton;

    public Hotel() {
    }

    public Hotel(String nombre, String precio, String descripcion, String telefono, String direccion, String calificacion, Integer fotografia, Integer boton) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.calificacion = calificacion;
        this.fotografia = fotografia;
        this.boton = boton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getFotografia() {
        return fotografia;
    }

    public void setFotografia(Integer fotografia) {
        this.fotografia = fotografia;
    }

    public Integer getBoton() {
        return boton;
    }

    public void setBoton(Integer boton) {
        this.boton = boton;
    }
}