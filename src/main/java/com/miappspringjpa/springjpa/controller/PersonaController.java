package com.miappspringjpa.springjpa.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miappspringjpa.springjpa.model.Persona;
import com.miappspringjpa.springjpa.service.IPersonaService;

@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;

    @GetMapping("/personas/traer")
    public List<Persona> getPersonas() {
        List<Persona> personas = interPersona.getPersonas(); 
        return personas;
    }

    @PostMapping("/personas/crear")
    public String crearPersona(@RequestBody Persona person){
        interPersona.savePersona(person);
        return "Persona creada correctamente";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String borrarPersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        return "Persona borrada";
    }

    @PutMapping("/personas/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("apellido") String nuevoApellido,
                                @RequestParam ("edad") int nuevaEdad){
        Persona personaAEditar = interPersona.findPersona(id);

        personaAEditar.setNombre(nuevoNombre);
        personaAEditar.setApellido(nuevoApellido);
        personaAEditar.setEdad(nuevaEdad);

        interPersona.savePersona(personaAEditar);

        return personaAEditar;
        
    }
}
