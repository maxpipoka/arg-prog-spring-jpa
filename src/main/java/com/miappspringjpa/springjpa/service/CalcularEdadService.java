package com.miappspringjpa.springjpa.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Service;

@Service
public class CalcularEdadService implements ICalcularEdadService{
    
    @Override
    public String calcularEdad(int dias, int mes, int año){
        Period edad = Period.between(LocalDate.of(año, mes, dias), LocalDate.now());

        return (String.format("%d años, %d meses y %d días",
        edad.getYears(),
        edad.getMonths(),
        edad.getDays()));
    }
}
