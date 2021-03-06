package com.miappspringjpa.springjpa.controller;

import java.sql.Date;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.miappspringjpa.springjpa.service.ICalcularEdadService;

@RestController
public class CalcularEdadController {

    @Autowired
    private ICalcularEdadService calcularEdadService;

    @GetMapping("/calcularedad/{dia}/{mes}/{año}")
    public String calculoDeEdad(@PathVariable int dia,
                                @PathVariable int mes,
                                @PathVariable int año){
        return calcularEdadService.calcularEdad(dia, mes, año);
    }
    
}
