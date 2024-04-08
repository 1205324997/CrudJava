package com.prueba1.prueba1.model.entity;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;;

@Repository
public interface repository extends JpaRepository<pelicula, Long> {
}
