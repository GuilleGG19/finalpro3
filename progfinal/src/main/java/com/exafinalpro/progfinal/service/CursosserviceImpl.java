package com.exafinalpro.progfinal.service;

import com.exafinalpro.progfinal.dao.Cursosdao;
import com.exafinalpro.progfinal.entity.Cursos;
import com.exafinalpro.progfinal.exception.Notfoundexception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursosserviceImpl implements CursosService{
    @Autowired
    private Cursosdao cursosdao;



    @Override
    public List<Cursos> findByall() {
        return (List<Cursos>)cursosdao.findAll();
    }

    @Override
    public Optional<Cursos> findById(Long id) {
        Optional<Cursos> cursos = cursosdao.findById(id);
        if (cursos.isEmpty()){
            throw new Notfoundexception(" "+ id);
        }
        return cursos;
    }

    @Override
    public void crearcurso(Cursos cursos) {
        cursosdao.save(cursos);

    }

    @Override
    public void modificarcursos(Long id, Cursos cursos) {
        if (cursosdao.existsById(id)){
            cursos.setId(id);
            cursosdao.save(cursos);

        }

    }

    @Override
    public void eliminarcurso(Long id) {
        if (cursosdao.existsById(id)){
            cursosdao.deleteById(id);
        }

    }
}
