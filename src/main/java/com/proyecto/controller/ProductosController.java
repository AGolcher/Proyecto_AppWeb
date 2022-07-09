/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.proyecto.controller;

import com.proyecto.entity.Productos2;
import com.proyecto.service.IProductos2Service;
import com.proyecto.service.Productos2Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Golcher
 */
@Controller
public class ProductosController {
    @Autowired
    private IProductos2Service productos2Service;

    @GetMapping("/productos")
    public String index(Model model) {
        List<Productos2> listaProductos2 = productos2Service.getAllProductos2();
        model.addAttribute("titulo", "Tabla Productos2");
        model.addAttribute("computadoresdataset", listaProductos2);
        return "computadoras";
    }
     
    @GetMapping("/productoN")
    public String crearProductos2(Model model) {
        List<Productos2> listaProductos2 = productos2Service.getAllProductos2();
        model.addAttribute("computadorescreardataset", new Productos2());
        return "crear"; 
    }
    
     @PostMapping("/save")
    public String saveProductos2(@ModelAttribute Productos2 productos2) {
        productos2Service.saveProductos2(productos2);
        return "redirect:/productos"; 
    }
    
    @GetMapping("/editProducto2/{id}")
    public String editarProductos2(@PathVariable("id") Long id, Model model) {
        Productos2 productos2 = productos2Service.getProductos2ById(id);
        List<Productos2> listaProductos2 = productos2Service.getAllProductos2();
        model.addAttribute("computadorescreardataset", productos2);
        return "crear";
    }

    @GetMapping("/delete/{id}") //eliminar elemento
    public String eliminarPersona(@PathVariable("id") Long id) {
        productos2Service.delete(id);
        return "redirect:/productos";
    }
}

