package com.codigoprueba.pruebatrabajo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.codigoprueba.pruebatrabajo.Entity.Persona;

public interface PersonaRepo extends CrudRepository<Persona, Integer> {
    
    
}
