package com.miappspringjpa.springjpa.service;

import java.util.List;

import com.miappspringjpa.springjpa.model.Persona;

public interface IPersonaService {

    //Método para traer las personas
    public List<Persona> getPersonas();
    
    //Método para dar de alta una persona
    public void savePersona(Persona perso);

    //Método para borrar una persona
    public void deletePersona(Long id);

    //Método para encontra una personas
    public Persona findPersona(Long id);
}
