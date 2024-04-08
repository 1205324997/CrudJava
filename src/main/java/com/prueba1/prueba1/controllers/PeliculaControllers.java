package com.prueba1.prueba1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.prueba1.prueba1.model.entity.pelicula;
import com.prueba1.prueba1.model.entity.repository;
import com.prueba1.prueba1.service.PeliculaService;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaControllers {
    
    @Autowired
    private PeliculaService PeliculaService;

    @SuppressWarnings("unused")
    @Autowired
    private repository Repository;

    @PostMapping("/")
    public ResponseEntity<pelicula> crearpelicula(@RequestBody pelicula pelicula) {
        pelicula nuevapelicula = PeliculaService.actualizarpelicula(pelicula);
        return ResponseEntity.ok().body(nuevapelicula);
    }

    @GetMapping("/{id}")
    public ResponseEntity<pelicula> obtenerpeliculaPorId(@PathVariable Long id) {
        pelicula pelicula = PeliculaService.obtenerpeliculaPorId(id);
        if (pelicula != null) {
            return ResponseEntity.ok().body(pelicula);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
