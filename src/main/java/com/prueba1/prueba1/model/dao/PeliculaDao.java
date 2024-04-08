package com.prueba1.prueba1.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.prueba1.prueba1.model.entity.pelicula;

public interface PeliculaDao extends CrudRepository<pelicula, Long> {
  
}
