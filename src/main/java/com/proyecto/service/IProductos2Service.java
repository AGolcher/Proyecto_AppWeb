/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Productos2;
import java.util.List;

/**
 *
 * @author Golcher
 */
public interface IProductos2Service {

    public List<Productos2> getAllProductos2();

    public Productos2 getProductos2ById(long ID_PRODUCTOS2);

    public void saveProductos2(Productos2 productos2);

    public void delete(long ID_PRODUCTOS2);

}
