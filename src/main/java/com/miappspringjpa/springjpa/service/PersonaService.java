package com.miappspringjpa.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miappspringjpa.springjpa.model.Persona;
import com.miappspringjpa.springjpa.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<Persona> getPersonas(){
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }
    
    @Override
    public void savePersona(Persona perso){
        persoRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id){
        persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id){
        Persona personaEncontrada = persoRepository.findById(id).orElse(null);
        return personaEncontrada;

    }
    
}
