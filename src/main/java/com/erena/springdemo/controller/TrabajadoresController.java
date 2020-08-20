package com.erena.springdemo.controller;

import com.erena.springdemo.model.entities.Trabajador;
import com.erena.springdemo.model.services.ITrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/trabajadores")
public class TrabajadoresController {
    @Autowired private ITrabajadorService service;

    @GetMapping(value = "/all")
    public List<Trabajador> getTrabajadores() {
        return service.getTrabajadores();
    }

    @PostMapping(value = "/insertar")
    public ResponseEntity<Trabajador> insertar(@RequestBody Trabajador trabajador){
        return service.insertarTrabajador(trabajador);
    }
}
