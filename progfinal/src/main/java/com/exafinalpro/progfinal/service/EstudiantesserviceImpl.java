package com.exafinalpro.progfinal.service;

import com.exafinalpro.progfinal.dao.Estudiantesdao;
import com.exafinalpro.progfinal.entity.Estudiantes;
import com.exafinalpro.progfinal.exception.Notfoundexception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudiantesserviceImpl implements Estudiantesservice{
    @Autowired
    private Estudiantesdao estudiantesdao;


    @Override
    public List<Estudiantes> findAll() {
        return (List<Estudiantes>)estudiantesdao.findAll();
    }

    @Override
    public Optional<Estudiantes> findById(Long id) {
        Optional<Estudiantes> estudiantes = estudiantesdao.findById(id);
        if(estudiantes.isEmpty()) {
            throw new Notfoundexception(" " + id);
        }
        return estudiantes;
    }

    @Override
    public void crearestudiante(Estudiantes estudiantes) {
        estudiantesdao.save(estudiantes);

    }

    @Override
    public void modificarestudiante(Long id, Estudiantes estudiantes) {
        if (estudiantesdao.existsById(id)){
            estudiantes.setId(id);
            estudiantesdao.save(estudiantes);
        }

    }

    @Override
    public void eliminarestudiante(Long id) {
        if (estudiantesdao.existsById(id)){
            estudiantesdao.deleteById(id);
        }

    }
}
