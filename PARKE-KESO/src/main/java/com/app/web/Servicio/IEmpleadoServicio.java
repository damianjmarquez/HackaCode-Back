package com.app.web.Servicio;

import java.util.List;

import com.app.web.Modelos.Empleado;

public interface IEmpleadoServicio {

	public List<Empleado> listaEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado obtenerEmpleadoPorId(int id);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(int id);
}
