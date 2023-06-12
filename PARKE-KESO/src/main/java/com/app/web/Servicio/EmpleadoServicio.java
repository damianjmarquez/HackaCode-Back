package com.app.web.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.Modelos.Empleado;
import com.app.web.Repositorio.IEmpleadoRepositorio;


@Service
public class EmpleadoServicio implements IEmpleadoServicio {
	
	@Autowired
	private IEmpleadoRepositorio repositorio;

	@Override
	public List<Empleado> listaEmpleados() {
		
		return repositorio.findAll() ;
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return repositorio.save(empleado);
	}

	@Override
	public Empleado obtenerEmpleadoPorId(int id) {
		
		return repositorio.findById(id).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return repositorio.save(empleado);
	}

	@Override
	public void eliminarEmpleado(int id) {
		repositorio.deleteById(id);
		
	}

	

	
	
	

}
