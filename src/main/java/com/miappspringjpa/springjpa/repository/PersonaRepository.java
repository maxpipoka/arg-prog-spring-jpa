package com.miappspringjpa.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.miappspringjpa.springjpa.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
