package com.exafinalpro.progfinal.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "estudian")
public class Estudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String nombre;
    public long carnet;
    public long punteo;

    @Column (name = "fecha")
    @Temporal(TemporalType.DATE)
    public Date fecha;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCarnet() {
        return carnet;
    }

    public void setCarnet(long carnet) {
        this.carnet = carnet;
    }

    public long getPunteo() {
        return punteo;
    }

    public void setPunteo(long punteo) {
        this.punteo = punteo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
