/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Pantallas;
import com.proyecto.repository.PantallasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Golcher
 */
@Service
public class PantallasService implements IPantallasService {

    @Autowired
    private PantallasRepository pantallasRepository;

    @Override
    public List<Pantallas> getAllPantallas() {
        return (List<Pantallas>) pantallasRepository.findAll();
    }

    @Override
    public Pantallas getPantallasById(long id) {
        return pantallasRepository.findById(id).orElse(null);
    }

    @Override
    public void savePantallas(Pantallas pantallas) {
        pantallasRepository.save(pantallas);
    }

    @Override
    public void delete(long id) {
        pantallasRepository.deleteById(id);
    }

}
