/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda1.tienda1.service;

import com.tienda1.tienda1.entity.Persona;
import java.util.List;

/**
 *
 * @author ricar_t6uqtj3
 */
/*En esta clase interface solo se crean los metodos mas no explica como funcionan*/
public interface IPersonaService {
    public List<Persona> getAllPersona();
    public Persona getPersonaById(long id);
    public void savePersona(Persona persona);
    public void delete(long id);
    
}
