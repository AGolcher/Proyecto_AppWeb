/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.repository;

import com.proyecto.entity.Pantallas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/** 
 *
 * @author Golcher
 */
@Repository
public interface PantallasRepository extends CrudRepository<Pantallas, Long> {


}
