package com.erena.springdemo.model.dao;

import com.erena.springdemo.model.entities.Trabajador;
import org.springframework.data.repository.CrudRepository;

public interface TrabajadorDAO extends CrudRepository<Trabajador, Long> {
}
