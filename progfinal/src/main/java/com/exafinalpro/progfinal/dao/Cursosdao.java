package com.exafinalpro.progfinal.dao;

import com.exafinalpro.progfinal.entity.Cursos;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Cursosdao extends CrudRepository<Cursos, Long> {
    Optional<Cursos> findBynombre(String nombre);
}
