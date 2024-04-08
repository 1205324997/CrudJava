package com.prueba1.prueba1.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba1.prueba1.model.entity.pelicula;
import com.prueba1.prueba1.service.PeliculaService;

@RestController
@RequestMapping("/api/peliculas")
public class controllers {
    
    @Autowired
    private PeliculaService peliculaService;

    @PostMapping("/")
    public ResponseEntity<pelicula> crearPelicula(@RequestBody pelicula pelicula) {
        pelicula nuevaPelicula = peliculaService.guardarpelicula(pelicula);
        return ResponseEntity.ok().body(nuevaPelicula);
    }

    @GetMapping("/{id}")
    public ResponseEntity<pelicula> obtenerPeliculaPorId(@PathVariable Long id) {
        pelicula pelicula = peliculaService.obtenerpeliculaPorId(id);
        if (pelicula != null) {
            return ResponseEntity.ok().body(pelicula);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
