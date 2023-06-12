package com.app.web.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.Modelos.Empleado;

@Repository
public interface IEmpleadoRepositorio extends JpaRepository <Empleado, Integer> {

}
