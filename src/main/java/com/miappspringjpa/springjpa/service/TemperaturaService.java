package com.miappspringjpa.springjpa.service;

import org.springframework.stereotype.Service;

@Service
public class TemperaturaService implements ITemperaturaService{
    
    @Override
    public Long devolverCelsius(Long grados){
        double f = (grados - 32) / 1.80000;
        return (long) f;
    }
}
