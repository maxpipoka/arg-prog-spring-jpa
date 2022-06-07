package com.miappspringjpa.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.miappspringjpa.springjpa.service.ITemperaturaService;

@RestController
public class TemperaturaController {

    @Autowired
    private ITemperaturaService temperaturaServ;

    @GetMapping("/convertiracelsius/{grados}")
    public Long devolverCelsius(@PathVariable Long grados){
        return temperaturaServ.devolverCelsius(grados)
    }
    
}
