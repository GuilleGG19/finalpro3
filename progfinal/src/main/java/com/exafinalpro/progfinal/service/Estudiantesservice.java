package com.exafinalpro.progfinal.service;

import com.exafinalpro.progfinal.entity.Estudiantes;

import java.util.List;
import java.util.Optional;

public interface Estudiantesservice {
    public List<Estudiantes> findAll();
    public Optional <Estudiantes> findById(Long id);

    public void crearestudiante(Estudiantes estudiantes);
    public void modificarestudiante(Long id, Estudiantes estudiantes);
    public void eliminarestudiante(Long id);
}
