package com.miappspringjpa.springjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miappspringjpa.springjpa.repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository persoRepository;
    
}
