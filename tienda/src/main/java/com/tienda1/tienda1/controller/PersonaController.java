/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda1.tienda1.controller;


import com.tienda1.tienda1.entity.Pais;
import com.tienda1.tienda1.entity.Persona;
import com.tienda1.tienda1.service.IPaisService;
import com.tienda1.tienda1.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ricar_t6uqtj3
 */
public class PersonaController {
    
    @Autowired
    private IPersonaService personaService;
    
    private IPaisService paisService;
    
    @GetMapping("/persona")
    public String index (Model model){
      List<Persona> listaPersona = personaService.getAllPersona();
      model.addAttribute("titulo","Tabla Personas");
      model.addAttribute("personas",listaPersona);
      return "personas";
    }
    
    @GetMapping("/personaN")
    public String crearPersona(Model model){
        List<Pais> listaPaises =paisService.listCountry();
        model.addAttribute("persona", new Persona());
        model.addAttribute("paises",listaPaises);
        return "crear";
    }
    
    
}
