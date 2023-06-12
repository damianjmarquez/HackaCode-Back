package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.Modelos.Empleado;
import com.app.web.Modelos.Estudiante;
import com.app.web.Repositorio.EstudianteRepositorio;
import com.app.web.Repositorio.IEmpleadoRepositorio;

@SpringBootApplication
public class ParkeKesoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ParkeKesoApplication.class, args);
	}
	
	@Autowired
	private IEmpleadoRepositorio repositorio;
	
	

	@Override
	public void run(String... args) throws Exception {
		/*
		Estudiante estudiante1 = new Estudiante("Damian" , "Marquez" , "damian@gmail.com");
		repositorio.save(estudiante1);
		Estudiante estudiante2 = new Estudiante("jose" , "Montes" , "jose@gmail.com");
		repositorio.save(estudiante2);
		*/
		
		
		/*
		Empleado empleado1 = new Empleado("Damian","123456");
		repositorio.save(empleado1);
		
		Empleado empleado2 = new Empleado("Natalia","12345678");
		repositorio.save(empleado2);
		*/
	}
 
}
