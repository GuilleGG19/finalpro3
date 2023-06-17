package com.exafinalpro.progfinal.controller;


import com.exafinalpro.progfinal.entity.Cursos;
import com.exafinalpro.progfinal.service.CursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/cursos")
public class Cursoscontroller {
    @Autowired
    CursosService cursosService;
    @GetMapping
    public List<Cursos> MostrarCursos(){
        return cursosService.findByall();
    }
    @GetMapping("/id")
    public Optional<Cursos> findById(Long id){
        return cursosService.findById(id);
    }
    @PostMapping
    public void crearCursos(Cursos cursos){
        cursosService.crearcurso(cursos);

    }
    @PutMapping(value = "/{id}")
    public void modificarCurso(Long id, Cursos cursos){
        cursosService.modificarcursos(id, cursos);
    }


    @DeleteMapping(value = "/{id}")
    public void borrarCurso(@PathVariable Long id) {
        cursosService.eliminarcurso(id);
    }



}
