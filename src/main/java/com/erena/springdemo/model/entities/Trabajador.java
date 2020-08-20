package com.erena.springdemo.model.entities;

import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Trabajadores")
@Data
public class Trabajador implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
    private String nombre;
    private String apellidos;
    private String dni;

    public Trabajador(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    public Trabajador () {}
}
