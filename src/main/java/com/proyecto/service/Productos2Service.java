/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Productos2;
import com.proyecto.repository.Productos2Repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Golcher
 */
@Service
public class Productos2Service implements IProductos2Service {

    @Autowired
    private Productos2Repository productos2Repository;

    @Override
    public List<Productos2> getAllProductos2() {
        return (List<Productos2>) productos2Repository.findAll();
    }

    @Override
    public Productos2 getProductos2ById(long id) {
        return productos2Repository.findById(id).orElse(null);
    }

    @Override
    public void saveProductos2(Productos2 productos2) {
        productos2Repository.save(productos2);
    }

    @Override
    public void delete(long id) {
        productos2Repository.deleteById(id);
    }

}
