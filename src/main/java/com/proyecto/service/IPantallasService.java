/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Pantallas;
import java.util.List;

/**
 *
 * @author Golcher
 */
public interface IPantallasService {

    public List<Pantallas> getAllPantallas();

    public Pantallas getPantallasById(long id);

    public void savePantallas(Pantallas pantallas);

    public void delete(long id);

}
