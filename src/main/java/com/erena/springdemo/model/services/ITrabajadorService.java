package com.erena.springdemo.model.services;

import com.erena.springdemo.model.entities.Trabajador;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ITrabajadorService {
    List<Trabajador> getTrabajadores();
    ResponseEntity<Trabajador> insertarTrabajador(@RequestBody Trabajador trabajador);
}
