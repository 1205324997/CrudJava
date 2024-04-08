package com.prueba1.prueba1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba1.prueba1.model.dao.PeliculaDao;
import com.prueba1.prueba1.model.entity.pelicula;

@Service
public class PeliculaServiceImpl implements PeliculaService {
    
    @Autowired
    private PeliculaDao peliculaDao;

    @Override
    public List<pelicula> obtenerTodasLaspeliculas() {
        return (List<pelicula>) peliculaDao.findAll();
    }

    @Override
    public pelicula obtenerpeliculaPorId(Long id) {
        return peliculaDao.findById(id).orElse(null);
    }


    @Override
    public pelicula actualizarpelicula(pelicula pelicula) {
        return peliculaDao.save(pelicula);
    }

    @Override
    public void eliminarpelicula(Long id) {
        peliculaDao.deleteById(id);
    }

    @Override
    public List<pelicula> buscarPorNombreYIdSala(String nombre, Long idSala) {
        return peliculaDao.findByNombreAndSalaId(nombre, idSala);
    }


    @Override
    public String estadoSalaCine(Long idSala) {
        int cantidadPeliculas = peliculaDao.countBySalaId(idSala);
        if (cantidadPeliculas < 3) {
            return "Sala casi Vacía";
        } else if (cantidadPeliculas >= 3 && cantidadPeliculas <= 5) {
            return "Sala casi Llena";
        } else {
            return "Sala Llena";
        }
    }

    @Override
    public List<pelicula> buscarPorFechaPublicacion(java.sql.Date fecha) {
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorFechaPublicacion'");
    }
}
