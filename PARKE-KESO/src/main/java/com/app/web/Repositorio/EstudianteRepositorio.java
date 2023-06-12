package com.app.web.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.Modelos.Estudiante;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {

}
