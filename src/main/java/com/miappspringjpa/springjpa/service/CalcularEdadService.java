package com.miappspringjpa.springjpa.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class CalcularEdadService implements ICalcularEdadService{
    
    @Override
    public String calcularEdad(Date fNacimiento){
        int edad = 0;
        return "La persona tiene " + edad + " años."; 
    }
}
