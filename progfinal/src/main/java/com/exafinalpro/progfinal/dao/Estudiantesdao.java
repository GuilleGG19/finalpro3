package com.exafinalpro.progfinal.dao;

import com.exafinalpro.progfinal.entity.Estudiantes;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Estudiantesdao extends CrudRepository<Estudiantes, Long> {
    Optional<Estudiantes> findBynombre(String nombre);

}
