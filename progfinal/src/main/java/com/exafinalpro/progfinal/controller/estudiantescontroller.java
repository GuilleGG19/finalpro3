package com.exafinalpro.progfinal.controller;

import com.exafinalpro.progfinal.entity.Estudiantes;
import com.exafinalpro.progfinal.service.Estudiantesservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/estudiantes")
public class estudiantescontroller {
    @Autowired
    Estudiantesservice estudiantesservice;
    @GetMapping
    public List<Estudiantes> MostrarEstudiantes(){
        return estudiantesservice.findAll();
    }
    @GetMapping("/id")
    public Optional<Estudiantes> findById(Long id){
        return estudiantesservice.findById(id);
    }

    @PostMapping
    public void crearEstudiante(Estudiantes estudiantes){
        estudiantesservice.crearestudiante(estudiantes);
    }


    @PutMapping(value = "/{id}")
    public void modificarEstudiante(Long id, Estudiantes estudiantes) {
        estudiantesservice.modificarestudiante(id, estudiantes);

    }

    @DeleteMapping(value = "/{id}")
    public void borrarEstudiantes(@PathVariable Long id) {
        estudiantesservice.eliminarestudiante(id);

    }

}
