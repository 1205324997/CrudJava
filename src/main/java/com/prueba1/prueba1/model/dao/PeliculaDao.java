package com.prueba1.prueba1.model.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.prueba1.prueba1.model.entity.pelicula;

public interface PeliculaDao extends CrudRepository<pelicula, Long> {

    int countBySalaId(Long idSala);


    List<pelicula> findByNombreAndSalaId(String nombre, Long idSala);
  
}
