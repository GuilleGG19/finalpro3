package com.exafinalpro.progfinal.service;

import com.exafinalpro.progfinal.entity.Cursos;

import java.util.List;
import java.util.Optional;

public interface CursosService {
    public List<Cursos> findByall();
    public Optional <Cursos> findById(Long id);

    public void crearcurso(Cursos cursos);
    public void modificarcursos(Long id, Cursos cursos);
    public void eliminarcurso(Long id);
}
