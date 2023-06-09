/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda1.tienda1.service;

import com.tienda1.tienda1.entity.Persona;
import com.tienda1.tienda1.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ricar_t6uqtj3
 */
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public List<Persona> getAllPersona() {
       return (List<Persona>)personaRepository.findAll();   }

    @Override
    public Persona getPersonaById(long id) {
       return personaRepository.findById(id).orElse(null);  }

    @Override
    public void savePersona(Persona persona) {
       personaRepository.save(persona);}

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);  }
    
}
