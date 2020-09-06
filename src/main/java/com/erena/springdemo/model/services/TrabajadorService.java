package com.erena.springdemo.model.services;

import com.erena.springdemo.model.dao.TrabajadorDAO;
import com.erena.springdemo.model.entities.Trabajador;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrabajadorService implements ITrabajadorService {
    private final TrabajadorDAO trabajadorDAO;

    public TrabajadorService(TrabajadorDAO trabajadorDAO) {
        this.trabajadorDAO = trabajadorDAO;
    }

    @Override
    public List<Trabajador> getTrabajadores() {
        List<Trabajador> trabajadores = new ArrayList<>();
        trabajadorDAO.findAll().forEach(trabajador -> trabajadores.add(trabajador));
        return trabajadores;
    }

    @Override
    public ResponseEntity<Trabajador> insertarTrabajador(@RequestBody Trabajador trabajador) {
        return ResponseEntity.ok(trabajadorDAO.save(trabajador));
    }
}
