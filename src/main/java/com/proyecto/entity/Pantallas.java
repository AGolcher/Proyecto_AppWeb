/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Golcher
 */
@Entity
@Table(name = "pantallas")

public class Pantallas implements Serializable {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre_Pantallas;
    private String descripcion_Pantallas;
    private double precio_Pantallas;
    private int cantidad_Pantallas;
    private String imagen_pantallas;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre_Pantallas() {
        return nombre_Pantallas;
    }

    public void setNombre_Pantallas(String nombre_Pantallas) {
        this.nombre_Pantallas = nombre_Pantallas;
    }

    public String getDescripcion_Pantallas() {
        return descripcion_Pantallas;
    }

    public void setDescripcion_Pantallas(String descripcion_Pantallas) {
        this.descripcion_Pantallas = descripcion_Pantallas;
    }

    public double getPrecio_Pantallas() {
        return precio_Pantallas;
    }

    public void setPrecio_Pantallas(double precio_Pantallas) {
        this.precio_Pantallas = precio_Pantallas;
    }

    public int getCantidad_Pantallas() {
        return cantidad_Pantallas;
    }

    public void setCantidad_Pantallas(int cantidad_Pantallas) {
        this.cantidad_Pantallas = cantidad_Pantallas;
    }

    public String getImagen_pantallas() {
        return imagen_pantallas;
    }

    public void setImagen_pantallas(String imagen_pantallas) {
        this.imagen_pantallas = imagen_pantallas;
    }

}
