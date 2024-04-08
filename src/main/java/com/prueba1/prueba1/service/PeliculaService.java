package com.prueba1.prueba1.service;

import java.sql.Date;
import java.util.List;

import com.prueba1.prueba1.model.entity.pelicula;

public interface PeliculaService {
    
    List<pelicula> obtenerTodasLaspeliculas();
    
    pelicula obtenerpeliculaPorId(Long id);
    
    pelicula guardarpelicula(pelicula pelicula);
    
    pelicula actualizarpelicula(pelicula pelicula);
    
    void eliminarpelicula(Long id);
    
    List<pelicula> buscarPorNombreYIdSala(String nombre, Long idSala);
    
    List<pelicula> buscarPorFechaPublicacion(Date fecha);
    
    String estadoSalaCine(Long idSala);
}

