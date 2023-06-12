package com.app.web.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.Modelos.Empleado;
import com.app.web.Repositorio.IEmpleadoRepositorio;
import com.app.web.Servicio.IEmpleadoServicio;




@Controller
public class EmpleadoControlador {
	
	@Autowired
	private IEmpleadoServicio servicio;
	
	 @GetMapping ("/empleados")
	    public String listaEmpleados(Model modelo) {
	        modelo.addAttribute("empleados", servicio.listaEmpleados() );
	        return "empleados";
	    }
	 
	 
	 
	 
	 @GetMapping ("/empleados/nuevo")
	 public String mostrarEmpleadoFormulario(Model modelo) {
		 Empleado empleado = new Empleado();
		 modelo.addAttribute("empleado", empleado);
		 return"crear_empleado";
		 
	 }
	 
	 @PostMapping ("/empleados")
	 public String guardarEmpleado(@ModelAttribute("empleado") Empleado empleado) {
		 servicio.guardarEmpleado(empleado);
		 return"redirect:/empleados";
		 
	 }
	 
	 @GetMapping ("/empleados/editar/{id}")
	 public String mostrarFormularioEditar(@PathVariable int id, Model modelo) {
		 modelo.addAttribute("empleado", servicio.obtenerEmpleadoPorId(id));
		 return "editar_empleado";
	 }
	 
	 @PostMapping ("/empleados/{id}")
	 public String actualizarEmpleado(@PathVariable int id, @ModelAttribute ("empleado") Empleado empleado, Model modelo) {
		 Empleado empleadoExistente = servicio.obtenerEmpleadoPorId(id);
		 empleadoExistente.setId(id);
		 empleadoExistente.setUsuario(empleado.getUsuario());
		 empleadoExistente.setPassword(empleado.getPassword());
		 
		 servicio.actualizarEmpleado(empleadoExistente);
		 return"redirect:/empleados";
		 
	 }
	 
	 @GetMapping ("/empleados/{id}")
	 public String eliminarEmpleado(@PathVariable int id) {
		 servicio.eliminarEmpleado(id);
		 return"redirect:/empleados";
	 }
	 
	 
	 
	 
	 
	 
}
